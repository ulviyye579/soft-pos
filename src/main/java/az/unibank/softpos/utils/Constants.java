package az.unibank.softpos.utils;


import javax.xml.namespace.QName;

public class Constants {
    public static final String APPROVED_RESULT = "Approved";
    public static final String OK_RESULT = "Ok";
    public static final String SUCCESS_CODE_000 = "000";
    public static final String DECLINED_CODE_001 = "001";

    public static final int STANDARD_TIMEOUT = 10000;

    public static final String TYPE_RID_CORPORATE = "Corporation customer";
    public static final String TYPE_RID_DOC = "INN";

    public static final String TRACE_PROFILE = "Warning";
    public static final Long COUNTRY_CODE = 31L;
    public static final String TITLE_MERCHANT = "MPOS ";

    public static final Long CCY = 944L;

    public static final String RTP_URL = "RTP_URL";

    public static final String LIFE_PHASE_SINGLE = "Single";
    public static final String INITIATOR_RID = "initiatorRid";
    public static final String TERMINAL_TYPE = "Pos";
    public static final Long BRANCH_ID = 21L;
    public static final Long CONFIG_ID = 21L;
    public static final Long TYPE_ID = 81L;
    public static final Long RISK_PROFILE_ID = 610L;
    public static final Long TYPE_SETTLEMENT_CONTRACT = 344L;
    public static final Long SETTINGS_ID = 221L;

    public static final String TRAN_KIND_MODIFY_SUBJECT = "ModifySubject";
    public static final String TRAN_KIND_MODIFY_CONTRACT = "ModifyContract";
    public static final String TRAN_KIND_MODIFY_TERMINAL = "ModifyTerminal";

    public static final String NS_CONTRACTS_ADMIN = "http://schemas.tranzaxis.com/contracts-admin.xsd";
    public static final String NS_SUBJECTS_ADMIN = "http://schemas.tranzaxis.com/subjects-admin.xsd";
    public static final String NS_ACQUIRING_ADMIN = "http://schemas.tranzaxis.com/acquiring-admin.xsd";
    public static final QName NS_SUBJECTS_ADMIN_QNAME = new QName(Constants.NS_SUBJECTS_ADMIN, "SubjectDocuments");

    public static final String NS_TRAN_WSDL = "http://schemas.tranzaxis.com/tran.wsdl";
    public static final QName NS_TITLE_QNAME = new QName(Constants.NS_SUBJECTS_ADMIN, "Title");
    public static final QName NS_INST_QNAME = new QName(Constants.NS_SUBJECTS_ADMIN, "InstId");
    public static final QName NS_PARENT_QNAME = new QName(NS_SUBJECTS_ADMIN, "ParentOrgId");
    public static final QName NS_DEPARTMENT_RID = new QName(NS_SUBJECTS_ADMIN, "Rid");
    public static final QName NS_MCC_QNAME = new QName(NS_SUBJECTS_ADMIN, "MccId");
    public static final QName NS_TYPE_QNAME = new QName(NS_CONTRACTS_ADMIN, "TypeId");
    public static final QName NS_BRANCH_QNAME = new QName(NS_CONTRACTS_ADMIN, "BranchId");
    public static final QName NS_EXTERNAL_QNAME = new QName(NS_ACQUIRING_ADMIN, "ExternalRid");
    public static final QName NS_NOTES_QNAME = new QName(NS_ACQUIRING_ADMIN, "Notes");

    public static final QName NS_CONFIG_QNAME = new QName(NS_ACQUIRING_ADMIN, "Config");
    public static final QName NS_CONTRACT_QNAME = new QName(NS_ACQUIRING_ADMIN, "Contract");
    public static final QName NS_RISK_PROFILE_QNAME = new QName(NS_ACQUIRING_ADMIN, "RiskProfile");
    public static final QName NS_SETTINGS_QNAME = new QName(NS_ACQUIRING_ADMIN, "Settings");
    public static final QName NS_TRACE_PROFILE_QNAME = new QName(NS_ACQUIRING_ADMIN, "TraceProfile");
    public static final QName NS_ADDRESS_QNAME = new QName(NS_SUBJECTS_ADMIN, "Address");
    public static final String ACTIVE_STATUS = "A";
    public static final String ROLE_CONTRACT = "Current";
    public static final String DEACTIVATED_STATUS = "C";
    public static final String TERMINAL_NEW_STATUS = "New";
    public static final String TERMINAL_ACTIVE_STATUS = "Active";
    public static final String TERMINAL_BLOCKED_STATUS = "Blocked";
    public static final String TERMINAL_CLOSED_STATUS = "Closed" ;
    private Constants() {
    }
}
