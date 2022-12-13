package az.unibank.softpos.utils;


import javax.xml.namespace.QName;

public class Constants {
    public static final String APPROVED_RESULT = "Approved";
    public static final String OK_RESULT = "Ok";
    public static final String SUCCESS_CODE_000 = "000";
    public static final String DECLINED_CODE_001 = "001";

    public static final String TYPE_RID_CORPORATE = "Corporation customer";
    public static final String TYPE_RID_DOC = "INN";
    public static final Long COUNTRY_CODE = 31L;
    public static final String TITLE_MERCHANT = "MPOS ";

    public static final Long CCY = 944L;


    public static final String LIFE_PHASE_SINGLE = "Single";
    public static final String INITIATOR_RID = "initiatorRid";

    public static final Long BRANCH_ID = 21L;
    public static final Long TYPE_ID = 81L;
    public static final String RTP_URL = "RTP_URL";

    public static final String TRAN_KIND_MODIFY_SUBJECT = "ModifySubject";
    public static final String TRAN_KIND_MODIFY_CONTRACT = "ModifyContract";
    public static final String TRAN_KIND_MODIFY_TERMINAL = "ModifyTerminal";

    public static final String NS_CONTRACTS_ADMIN = "http://schemas.tranzaxis.com/contracts-admin.xsd";
    public static final String NS_SUBJECTS_ADMIN = "http://schemas.tranzaxis.com/subjects-admin.xsd";
    public static final String NS_ACQUIRING_ADMIN = "http://schemas.tranzaxis.com/acquiring-admin.xsd";
    public static final QName NS_SUBJECTS_ADMIN_QNAME = new QName(Constants.NS_SUBJECTS_ADMIN, "SubjectDocuments");
    public static final String NS_TRAN_WSDL = "http://schemas.tranzaxis.com/tran.wsdl";

    private Constants() {
    }
}
