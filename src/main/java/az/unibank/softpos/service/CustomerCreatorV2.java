package az.unibank.softpos.service;

import az.unibank.softpos.dtov2.requests.CompanyAttributes;
import az.unibank.softpos.dtov2.responses.*;
import az.unibank.softpos.exceptions.TransAxisException;
import az.unibank.softpos.dtov2.requests.AccountChanges;
import az.unibank.softpos.dtov2.requests.BranchV2;
import az.unibank.softpos.dtov2.requests.POSV2;
import com.tranzaxis.schemas.tran.Response;

import javax.xml.bind.JAXBException;

public interface CustomerCreatorV2 {
    CorpCustomerDetails2 createCustomer(CompanyAttributes companyAttributes, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    BranchResponse createSubCustomer(BranchV2 branchV2, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    SubCustomerV2 createSubObject(POSV2 posv2, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    Response generateSettlementContractRequest(String departmentId, POSV2 posv2, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    Long generateRtpRequestForCommonContract(String departmentId, String contractRid, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    TerminalResponseV2 createTerminal(POSV2 posv2, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;
    TermStatusResponseV2 getStatusTerminal(Long id, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;
    SoftResponseV2 changeMcc(String id, String headerRequestorInitiatorRid, String mccId) throws JAXBException, TransAxisException;

    SoftResponseV2 changeAccountNumber(AccountChanges account, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

}
