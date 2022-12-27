package az.unibank.softpos.controllers;

import az.unibank.softpos.dto.requests.*;
import az.unibank.softpos.dto.requests.Company;
import az.unibank.softpos.dto.responses.*;
import az.unibank.softpos.exceptions.TransAxisException;
import az.unibank.softpos.service.CustomerCreator;
import az.unibank.softpos.utils.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.bind.JAXBException;

@Slf4j
@RestController
@RequestMapping("/soft/pos")
@RequiredArgsConstructor
public class CustomerServiceController {

    private final CustomerCreator customerCreator;
    SoftResponse softResponse = new SoftResponse();
    ResponseCustomer responseCustomer = new ResponseCustomer();
    SubCustomer subcustomer = new SubCustomer();


    @PostMapping(value = "corporate-customer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseCustomer> createCustomer(@Valid @RequestBody Company modelCompany,
                                                           @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
            responseCustomer = customerCreator.createCustomer(modelCompany, headerRequestorInitiatorRid);
            return ResponseEntity.ok(responseCustomer);
    }

    @PostMapping(value = "corporate-customer/subcustomer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SubCustomer> createSubCustomer(@Valid @RequestBody Branch branch,
                                                         @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {

        subcustomer = customerCreator.createSubCustomer(branch, headerRequestorInitiatorRid);
        return ResponseEntity.ok(subcustomer);

    }

    @PostMapping(value = "corporate-customer/terminal",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TerminalResponse> createTerminal(@Valid @RequestBody POS pos,
                                                           @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
        TerminalResponse terminalResponse ;
            terminalResponse = customerCreator.createTerminal(pos, headerRequestorInitiatorRid);
            return ResponseEntity.ok(terminalResponse);
    }

    @PutMapping(value = "/corporate-customer/terminal/activation/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> activateTerminal(@PathVariable("id") String id,
                                                         @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {

            softResponse = customerCreator.changeStatusTerminal(id, headerRequestorInitiatorRid, Constants.ACTIVE_STATUS);
            return ResponseEntity.ok(softResponse);
    }


    @PutMapping(value = "/corporate-customer/terminal/deactivation/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> deactivateTerminal(@PathVariable("id") String id,
                                                           @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {

            softResponse = customerCreator.changeStatusTerminal(id, headerRequestorInitiatorRid, Constants.DEACTIVATED_STATUS);
            return ResponseEntity.ok(softResponse);
    }

    @GetMapping(value = "corporate-customer/terminal/status/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TermStatusResponse> getStatusTerminal(@PathVariable("id") Long id,
                                                                @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
        TermStatusResponse terminalDetails ;
         terminalDetails = customerCreator.getStatusTerminal(id, headerRequestorInitiatorRid);
            return ResponseEntity.ok(terminalDetails);
    }

    @PutMapping(value = "/corporate-customer/terminal/deletion/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> deleteTerminal(@PathVariable("id") String id,
                                                       @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
            softResponse = customerCreator.deleteTerminal(id, headerRequestorInitiatorRid);
            return ResponseEntity.ok(softResponse);
    }
}