package v1.az.unibank.softpos.service;

import v1.az.unibank.softpos.dto.requests.Company;
import v1.az.unibank.softpos.dto.requests.Branch;
import v1.az.unibank.softpos.dto.requests.POS;
import v1.az.unibank.softpos.dto.responses.*;
import v1.az.unibank.softpos.exceptions.TransAxisException;

import javax.xml.bind.JAXBException;

public interface CustomerCreator {
    ResponseCustomer createCustomer(Company company, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    SubCustomer createSubCustomer(Branch branch, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    String generateSettlementContractRequest(String departmentId, Branch branch, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    Long generateRtpRequestForCommonContract(String departmentId, String contractRid, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    TerminalResponse createTerminal(POS pos, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;
    TermStatusResponse getStatusTerminal(Long id, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;
    SoftResponse changeStatusTerminal(String id, String headerRequestorInitiatorRid, String status) throws TransAxisException, JAXBException;

    SoftResponse deleteTerminal(String id, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    SoftResponse changeMcc(String id, String headerRequestorInitiatorRid, String mccId) throws JAXBException, TransAxisException;

//    SoftResponse changeAccount(SettlementContractDetails settlementContractDetails, String headerRequestorInitiatorRid) throws JAXBException, TransAxisException;
}
