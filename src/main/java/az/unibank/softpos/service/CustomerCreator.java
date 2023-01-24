package az.unibank.softpos.service;

import az.unibank.softpos.dto.requests.AccountChanges;
import az.unibank.softpos.dto.requests.Company;
import az.unibank.softpos.dto.requests.Branch;
import az.unibank.softpos.dto.requests.POS;
import az.unibank.softpos.dto.responses.*;
import az.unibank.softpos.exceptions.TransAxisException;
import com.tranzaxis.schemas.tran.Response;

import javax.xml.bind.JAXBException;

public interface CustomerCreator {
    ResponseCustomer createCustomer(Company company, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    BranchResponse createSubCustomer(Branch branch, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    SubCustomer createSubObject(POS pos, String headerRequestorInitiatorRid) throws Exception;

    Response generateSettlementContractRequest(String departmentId, POS pos, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    Long generateRtpRequestForCommonContract(String departmentId, String contractRid, String headerRequestorInitiatorRid) throws Exception;

    TerminalResponse createTerminal(POS pos, String headerRequestorInitiatorRid) throws Exception;
    TermStatusResponse getStatusTerminal(Long id, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;
    SoftResponse changeStatusTerminal(String id, String headerRequestorInitiatorRid, String status) throws TransAxisException, JAXBException;

    SoftResponse deleteTerminal(String id, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    SoftResponse changeMcc(String id, String headerRequestorInitiatorRid, String mccId) throws JAXBException, TransAxisException;

    SoftResponse changeAccountNumber(AccountChanges account, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;
}
