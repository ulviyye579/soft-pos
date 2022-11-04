package az.unibank.softpos;

public class PayShieldResponse {
    
    public final String header;
    public final String responseCode;
    public final String errorCode;
    public final String body;
    
    public PayShieldResponse (String response, int headerLength) {
        this.header = response.substring(0, headerLength);
        this.responseCode = response.substring(headerLength, headerLength + 2);
        this.errorCode = response.substring(headerLength + 2, headerLength + 4);
        this.body = response.substring(headerLength + 4);
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
