package v1.az.unibank.softpos.service;

import v1.az.unibank.softpos.exceptionsV2.TransAxisException;

import javax.xml.bind.JAXBException;

public interface ExternalIdGeneratorV2 {
    String setExternalId(Long clientId, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    String getTerminalRid(String headerRequestorInitiatorRid) throws JAXBException, TransAxisException;
}
