package az.unibank.softpos.service;

import az.unibank.softpos.dtoV2.requests.Company;
import az.unibank.softpos.dtoV2.responses.*;
import az.unibank.softpos.exceptionsV2.TransAxisException;
import az.unibank.softpos.dtoV2.requests.AccountChanges;
import az.unibank.softpos.dtoV2.requests.BranchV2;
import az.unibank.softpos.dtoV2.requests.POSV2;
import com.tranzaxis.schemas.tran.Response;

import javax.xml.bind.JAXBException;

public interface CustomerCreatorV2 {
    ResponseCustomerV2 createCustomer(Company company, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    BranchResponse createSubCustomer(BranchV2 branchV2, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    SubCustomerV2 createSubObject(POSV2 POSV2, String headerRequestorInitiatorRid) throws Exception;

    Response generateSettlementContractRequest(String departmentId, POSV2 POSV2, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    Long generateRtpRequestForCommonContract(String departmentId, String contractRid, String headerRequestorInitiatorRid) throws Exception;

    TerminalResponseV2 createTerminal(POSV2 POSV2, String headerRequestorInitiatorRid) throws Exception;
    TermStatusResponse getStatusTerminal(Long id, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;
    SoftResponseV2 changeStatusTerminal(String id, String headerRequestorInitiatorRid, String status) throws TransAxisException, JAXBException;

    SoftResponseV2 deleteTerminal(String id, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    SoftResponseV2 changeMcc(String id, String headerRequestorInitiatorRid, String mccId) throws JAXBException, TransAxisException;

    SoftResponseV2 changeAccountNumber(AccountChanges account, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;
}
