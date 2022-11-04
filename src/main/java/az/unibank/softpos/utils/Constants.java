package az.unibank.softpos.utils;


import javax.xml.namespace.QName;

public class Constants {
    public static final String APPROVED_RESULT = "Approved";
    public static final String OK_RESULT = "Ok";
    public static final String DECLINED_RESULT = "Declined";
    public static final String FAILED = "Failed. ";
    public static final String SUCCESS_CODE_000 = "000";
    public static final String DECLINED_CODE_001 = "001";
    public static final String DECLINED_CODE_002 = "002";
    public static final String DECLINED_CODE_003 = "003";
    public static final String DECLINED_CODE_004 = "004";


    public static final String TYPE_RID_CORPORATE = "Corporation customer";
    public static final String TYPE_RID_DOC = "INN";
    public static final Long COUNTRY_CODE = 31L;
    public static final String TITLE_MERCHANT = "MPOS ";

    public static final Long CCY = 944L;


    public static final String LOG_STR_REQUESTED_URL = "Requested URL: ";
    public static final String LOG_STR_HEADER = "Header : ";
    public static final String LOG_STR_UUID = ", uuid : ";
    public static final String LOG_STR_URL = ", URL : ";
    public static final String LOG_STR_RESPONSE_RECEIVED = ", response received : ";
    public static final String LOG_STR_ERROR_RESPONSE_RECEIVED = ", error response received : ";

    public static final String LIFE_PHASE_SINGLE = "Single";
    public static final String LIFE_PHASE_AUTH = "Auth";
    public static final String LIFE_PHASE_PRESENTMENT = "PRESENTMENT";

    public static final String INITIATOR_RID = "initiatorRid";

    public static final Long BRANCH_ID = 21L;
    public static final Long TYPE_ID =81L;
    public static final String RTP_URL = "RTP_URL";
    public static final String CONTRACT_CCY = "ContractCcy";
    public static final String CONTRACT_AVAIL_BALANCE = "ContractAvailBalance";
    public static final String CONTRACT_LEDGER_BALANCE = "ContractLedgerBalance";

    public static final String TX_DATE_FORMAT = "dd-MM-yyyy'T'HH:mm:ss";
    public static final String EXPIRY_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_WITH_SPACE = "dd-MM-yyyy HH:mm:ss";
    public static final String ALPHA_NUMERIC = "[^a-zA-Z0-9_-]";

    public static final String TERMINAL_ONLINE_DC = "OnlineDC";
    public static final String TERMINAL_CHARGE = "CHARGE";

    public static final String TRAN_KIND_PAYMENT = "Payment";
    public static final String TRAN_KIND_MODIFY_TOKEN = "ModifyToken";
    public static final String TRAN_KIND_MODIFY_SUBJECT = "ModifySubject";
    public static final String TRAN_KIND_PAYMENT_CREDIT = "PaymentCredit";
    public static final String TRAN_KIND_PAYMENT_DEBIT = "PaymentDebit";
    public static final String TRAN_KIND_MODIFY_CONTRACT = "ModifyContract";
    public static final String TRAN_KIND_MODIFY_TERMINAL = "ModifyTerminal";
    public static final String TRAN_KIND_GET_CONTRACT_INFO = "GetContractInfo";
    public static final String TRAN_KIND_CREATE_HOLD = "CreateHold";

    public static final String RESTRICTION_ENABLE = "ENABLE";
    public static final String RESTRICTION_DISABLE = "DISABLE";
    public static final String RESTRICTION_CHANGE = "CHANGE";
    public static final String INVALID_RESTRICTION_ACTION = "Action value must be defined correctly(enable,disable,change)";
    public static final String PAYEE_TYPE_VENDOR = "Vendor";


    public static final String NS_CONTRACTS_NOTIFY = "http://schemas.tranzaxis.com/contracts-notify.xsd";
    public static final String NS_TOKENS_ADMIN = "http://schemas.tranzaxis.com/tokens-admin.xsd";
    public static final String NS_CONTRACTS_ADMIN = "http://schemas.tranzaxis.com/contracts-admin.xsd";
    public static final String NS_COMMON_TYPES = "http://schemas.tranzaxis.com/common-types.xsd";
    public static final String NS_SUBJECTS_ADMIN = "http://schemas.tranzaxis.com/subjects-admin.xsd";
    public static final String NS_RESTRICTING_ADMIN = "http://schemas.tranzaxis.com/restricting-admin.xsd";
    public static final String NS_ACQUIRING_ADMIN = "http://schemas.tranzaxis.com/acquiring-admin.xsd";

    public static final QName NOTIFY_SUBSCRIPTION_LINKED_CONTRACT_TOKEN_EXTRID_QNAME = new QName(NS_CONTRACTS_NOTIFY, "LinkedContractTokenExtRid");
    public static final QName NOTIFY_ADDRESS_QNAME = new QName(NS_CONTRACTS_NOTIFY, "Address");
    public static final QName NS_COMMON_TYPES_QNAME = new QName(NS_COMMON_TYPES, "Val");
    public static final QName NS_EMBOSS_NAME_QNAME = new QName(Constants.NS_TOKENS_ADMIN, "EmbossName");
    public static final QName NS_EXT_RID_QNAME = new QName(Constants.NS_TOKENS_ADMIN, "ExtRid");
    public static final QName NS_EXP_TIME_QNAME = new QName(Constants.NS_TOKENS_ADMIN, "ExpTime");
    public static final QName NS_LIFE_PHASE_ID_QNAME = new QName(Constants.NS_TOKENS_ADMIN, "LifePhaseId");
    public static final QName NS_IN_USE_QNAME = new QName(Constants.NS_RESTRICTING_ADMIN, "InUse");
    public static final QName NS_MAX_VAL_QNAME = new QName(Constants.NS_RESTRICTING_ADMIN, "MaxVal");
    public static final QName NS_SUBJECTS_ADMIN_QNAME = new QName(Constants.NS_SUBJECTS_ADMIN, "SubjectDocuments");




    private Constants() {
    }
}
