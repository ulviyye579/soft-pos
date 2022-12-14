package az.unibank.softpos.service;

import az.unibank.softpos.dto.requests.Company;
import az.unibank.softpos.dto.requests.Branch;
import az.unibank.softpos.dto.requests.POS;
import az.unibank.softpos.dto.responses.*;

public interface CustomerCreator {
    ResponseCustomer createCustomer(Company cust, String headerRequestorInitiatorRid) throws Exception;

    CustomerResponse createSubCustomer(Branch subcust, String headerRequestorInitiatorRid) throws Exception;

    String generateSettlementContractRequest(String departmentId, Branch branch, String headerRequestorInitiatorRid) throws Exception;

    Long generateRtpRequestForCommonContract(String departmentId, String contractRid, String headerRequestorInitiatorRid) throws Exception;

    TerminalResponse createTerminal(POS POS, String headerRequestorInitiatorRid) throws Exception;

    SoftResponse activateStatusTerminal(String id, String headerRequestorInitiatorRid) throws Exception;

    SoftResponse deactivateStatusTerminal(Long id, String headerRequestorInitiatorRid) throws Exception;

    TermStatusResponse getStatusTerminal(Long id, String headerRequestorInitiatorRid) throws Exception;
}
