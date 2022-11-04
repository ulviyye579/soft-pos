package az.unibank.softpos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class PayShieldClient {
    
    public class PayShieldResponse {
    
        public final String header;
        public final String responseCode;
        public final String errorCode;
        public final String body;

        public PayShieldResponse (String response, int headerLength) {
            this.header = response.substring(0, headerLength);
            this.responseCode = response.substring(headerLength, headerLength + 2);
            this.errorCode = response.substring(headerLength + 2, headerLength + 4);
            if (response.length() > headerLength + 4) {
                this.body = response.substring(headerLength + 4);
            } else {
                this.body = "";
            }
        }

        String toParsedString () {
            String str = "Header: ".concat(this.header).concat("\n")
                    .concat("Response code: ").concat(this.responseCode).concat("\n")
                    .concat("Error code: ").concat(this.errorCode).concat("\n")
                    .concat("Body: ").concat(this.body);
            return str;
        }

        @Override
        public String toString() {
            String str = this.header.concat(this.responseCode)
                    .concat(this.errorCode)
                    .concat(this.body);
            return str;
        }
    }
    
    private final String ip;
    private final int port;
    private final int headerLength;
    private final String lmkId;
    
    private int currentHeader = 0;
    
    // HSM command header is 4 digits (hex??) long
    private final int HEADER_MIN = 0;
    private final int HEADER_MAX = 9999;    
    private final int HEADER_LENGTH = 4;
    private Socket socket;
    
    private final String ERR_INVALID_KEY_SCHEME = "26";
    private final String ERR_INCOMPATABLE_LMK_SCHEMES = "A1";   // wrong LMK ID, fires if keyblock command is executed on Variant LMK
    
    public PayShieldClient (String ip, int port, String lmkId) {
        this(ip, port, lmkId, 4);
    }
    
    public PayShieldClient (String ip, int port, String lmkId, int headerLength) {
        this.ip = ip;
        this.port = port;
        this.lmkId = lmkId;
        this.headerLength = headerLength;
    }
    
    public boolean connect () {
        System.out.println("Connecting to HSM");
        try {
            this.socket = new Socket(ip, port);
        } catch (IOException e) {
            System.err.println("Failed to connect to HSM");
        }
        return true;
    }
    
    public boolean disconnect () {
        try {
            this.socket.close();
        } catch (IOException e) {
            System.err.println("Failed to disconnect HSM: " + e.getMessage());
            return false;
        }
        return true;
    }
    
    public String send (String toHsm) {
        System.out.println("To HSM: " + toHsm);
        String fromHsm = null;
        try {
            OutputStream os = this.socket.getOutputStream();
            DataOutputStream out = new DataOutputStream(os);
            out.writeUTF(toHsm);
            InputStream is = this.socket.getInputStream();
            DataInputStream in = new DataInputStream(is);
            fromHsm = in.readUTF();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        
        System.out.println("From HSM: " + fromHsm);
        return fromHsm;
    }
    
    private String createHeader () {
        StringBuilder sb = new StringBuilder(this.currentHeader);
        for (int i = 0; i < this.headerLength; i++) {
            sb.insert(0, '0');
        }
        System.out.println(">>>> " + sb.toString());
        // drop header to 0 if it is full otherwice injcrement it
        this.currentHeader = (this.currentHeader == HEADER_MAX ? HEADER_MIN : this.currentHeader++);
        return sb.toString();
    }
    
    public boolean echoTest () {
        String toHsm = "0000"
                .concat("NC");
        String fromHsm = send(toHsm);
        
        return false;
    }
    
    public PayShieldResponse generateKeyBlockZmk () {
        String toHsm = "0000"   // header
                .concat("A0")
                .concat("0")    // generate only
                .concat("FFF")  // variant key type filler, current schema is keyblock
                .concat("S")    // keyblock scheme
                .concat("%")    // delimiter
                .concat(lmkId)  // key block LMK is 01
                .concat("#")    // delimiter
                .concat("52")    // key usage ZMK
                .concat("T2")    // algorithm 2DES
                .concat("E")     // mode of use B, D, E, N  (i do not know which do i need)
                .concat("00")    // key version number - 00 to 99
                .concat("E")     // exportability: 
                                 // E - may only be exported in trusted format
                                 // N - no export permitted
                                 // S - all export possibilites are permitted
                .concat("00");   // number of optional blocks: 00 to 08
        PayShieldResponse fromHsm = new PayShieldResponse(send(toHsm), HEADER_LENGTH);
        
        /*
            example of response:
            0000A100S1009652TE00E000149F031C6C8C52849E22F249120AC0DCAD9045B5FBB5B3C9199B71D1AC9A62AB81F4F054280164819717813
            
            0000
            A1
            00
            S1009652TE00E000149F031C6C8C52849E22F249120AC0DCAD9045B5FBB5B3C9199B71D1AC9A62AB81F4F054280164819
            717813
        
            0000 - header
            A1 - response code
            00 - error code (no error)
            <- begin key ->
            S - scheme
            1009652TE00E0001 - keyblock header
            49F031C6C8C52849E22F249120AC0DCAD9045B5FBB5B3C9199B71D1AC9A62AB81F4F054280164819 - key under LMK
            717813 -- KCV
        */
        
        return fromHsm;
    }
    
    public PayShieldResponse generateKeyBlockTpk () {
        String toHsm = "0000"
                .concat("A0")
                .concat("0")    // generate only
                .concat("FFF")  // variant key type filler, current schema is keyblock
                .concat("S")    // keyblock scheme
                .concat("%")    // delimiter
                .concat(lmkId)  // key block LMK is 01
                .concat("#")    // delimiter
                .concat("71")    // key usage TPK
                .concat("T2")    // algorithm 2DES
                .concat("E")     // mode of use B, D, E, N  (i do not know which do i need)
                .concat("00")    // key version number - 00 to 99
                .concat("E")     // exportability: 
                                 // E - may only be exported in trusted format
                                 // N - no export permitted
                                 // S - all export possibilites are permitted
                .concat("00");   // number of optional blocks: 00 to 08
        PayShieldResponse fromHsm = new PayShieldResponse(send(toHsm), HEADER_LENGTH);
        
        /*
            example of response:
            0000A100S1009652TE00E000149F031C6C8C52849E22F249120AC0DCAD9045B5FBB5B3C9199B71D1AC9A62AB81F4F054280164819717813
            
            0000
            A1
            00
            S1009652TE00E000149F031C6C8C52849E22F249120AC0DCAD9045B5FBB5B3C9199B71D1AC9A62AB81F4F054280164819
            717813
        
            0000 - header
            A1 - response code
            00 - error code (no error)
            <- begin key ->
            S - scheme
            1009652TE00E0001 - keyblock header
            49F031C6C8C52849E22F249120AC0DCAD9045B5FBB5B3C9199B71D1AC9A62AB81F4F054280164819 - key under LMK
            717813 -- KCV
        */
        
        return fromHsm;
    }    
    
    public PayShieldResponse exportKeyBlockTpkUnderKeyBlockZmk (String zmk, String tpk) {
        String toHsm = "0000"
                .concat("A8")
                .concat("FFF")
                .concat(zmk)
                .concat(tpk)
                .concat("S")
                .concat("%")
                .concat(lmkId);
        PayShieldResponse fromHsm = new PayShieldResponse(send(toHsm), HEADER_LENGTH);
        System.out.println(fromHsm);
        return fromHsm;
    }
    
    public PayShieldResponse generateAndExportKeyBlockTpkUnderKeyBlockZmk (String zmk) {
        String toHsm = "0000"
                .concat("A0")
                .concat("1")    // generate and export
                .concat("FFF")  // variant key type filler, current schema is keyblock
                .concat("S")    // key scheme LMK
                .concat(zmk)    // ZMK key
                .concat("S")    // key sceheme ZMK
                .concat("%")    // delimiter
                .concat(lmkId)  // value 01 
                .concat("#")    // delimiter
                .concat("71")    // key usage TPK
                .concat("T2")   // aldorithm 2DES
                .concat("B")    // ????? // mode of use B (encryption / decryption), D, E, N  (i do not know which do i need)
                .concat("00")   // key version number
                .concat("E")    // exportability
                .concat("00");   // number of optional blocks
        PayShieldResponse fromHsm = new PayShieldResponse(send(toHsm), HEADER_LENGTH);
        
        /*
            example of response:
            0000
            A1
            00
            S1009671TB00E0001429806D6AE825F3FE6C85448D141A3F55AE036B40F0AF97A1524B4E7CBF75EF9A7F590E5E94C77F0 -- key under LMK
            S0007271TB00E00FF1B1AF2883A479D86CB601AAD65F1E5E28087D40619DF63E84A8728FA -- key under ZMK
            1A0E56 -- KCV
        */
        
        System.out.println("From HSM: " + fromHsm);
        return fromHsm;
    }
    
   
    public static void main (String[] args) {
        PayShieldClient hsm = new PayShieldClient("10.142.0.50", 1600, "01", 0);
        hsm.connect();
        System.out.println("1) Echo test of HSM");
        hsm.echoTest();
        //hsm.generateTpkAndExportUnderZmk("");
        System.out.println("2) Generating key block ZMK1:");
        PayShieldResponse zmk1Resp = hsm.generateKeyBlockZmk();
        String zmk1 = zmk1Resp.body.substring(0, zmk1Resp.body.length() - 6);
        
        System.out.println("3) Generating key block ZMK2:");
        PayShieldResponse zmk2Resp = hsm.generateKeyBlockZmk();
        String zmk2 = zmk2Resp.body.substring(0, zmk2Resp.body.length() - 6);
        
        System.out.println("4) Generating and exporing key block TPK under key block ZMK1");
        PayShieldResponse tpk1Resp = hsm.generateAndExportKeyBlockTpkUnderKeyBlockZmk(zmk1);  //("S1009652TE00E000149F031C6C8C52849E22F249120AC0DCAD9045B5FBB5B3C9199B71D1AC9A62AB81F4F054280164819");
        String tpkLmk = tpk1Resp.body.substring(0, 97);
        String tpk1Zmk = tpk1Resp.body.substring(97);
        
        System.out.println("TPK1 under LMK: " + tpkLmk);
        System.out.println("TPK1 under ZMK: " + tpk1Zmk);
        
        System.out.println("5) Exporting TPK under ZMK2");
        PayShieldResponse tpk2Zmk = hsm.exportKeyBlockTpkUnderKeyBlockZmk(zmk2, tpkLmk);

        hsm.disconnect();
    } 
    
}
