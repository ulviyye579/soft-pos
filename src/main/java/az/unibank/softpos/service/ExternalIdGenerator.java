package az.unibank.softpos.service;

import az.unibank.softpos.exceptions.TransAxisException;

import javax.xml.bind.JAXBException;

public interface ExternalIdGenerator {
    String setExternalId(Long clientId, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException;

    String getTerminalRid(String headerRequestorInitiatorRid) throws JAXBException, TransAxisException;
}
