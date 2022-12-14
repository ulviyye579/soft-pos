package az.unibank.softpos.controllers;

import az.unibank.softpos.dto.requests.*;
import az.unibank.softpos.dto.requests.Company;
import az.unibank.softpos.dto.responses.*;
import az.unibank.softpos.service.CustomerCreator;
import az.unibank.softpos.utils.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/soft/pos")
@RequiredArgsConstructor
public class CustomerServiceController {

    private final CustomerCreator customerCreator;

    @PostMapping(value = "corporate-customer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseCustomer> createCustomer(@Valid @RequestBody Company modelCompany,
                                                           @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        ResponseCustomer responseCustomer = new ResponseCustomer();
        try {
            responseCustomer = customerCreator.createCustomer(modelCompany, headerRequestorInitiatorRid);
            return ResponseEntity.ok(responseCustomer);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ex.getLocalizedMessage());
            responseCustomer.setCode(Constants.DECLINED_CODE_001);
            responseCustomer.setDescription(ex.getLocalizedMessage());
            return ResponseEntity.ok(responseCustomer);
        }

    }

    @PostMapping(value = "corporate-customer/subcustomer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerResponse> createSubCustomer(@Valid @RequestBody Branch branch,
                                                              @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        CustomerResponse subcustomerResponse = new CustomerResponse();
        try {
            subcustomerResponse = customerCreator.createSubCustomer(branch, headerRequestorInitiatorRid);
            return ResponseEntity.ok(subcustomerResponse);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            subcustomerResponse.setResult(ex.getLocalizedMessage());
            return ResponseEntity.ok(subcustomerResponse);
        }

    }

    @PostMapping(value = "corporate-customer/terminal",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TerminalResponse> createTerminal(@Valid @RequestBody POS POS,
                                                           @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        TerminalResponse terminalResponse = new TerminalResponse();
        try {
            terminalResponse = customerCreator.createTerminal(POS, headerRequestorInitiatorRid);
            return ResponseEntity.ok(terminalResponse);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            terminalResponse.setDescription(ex.getLocalizedMessage());
            return ResponseEntity.ok(terminalResponse);
        }
    }


    @PutMapping(value = "/corporate-customer/terminal/activation/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> activateTerminal(@PathVariable("id") String id,
                                                         @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        SoftResponse softResponse = new SoftResponse();

        try {
            softResponse = customerCreator.activateStatusTerminal(id, headerRequestorInitiatorRid);
            return ResponseEntity.ok(softResponse);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            softResponse.setResult(Boolean.FALSE);
            softResponse.setId(Constants.DECLINED_CODE_001);
            softResponse.setMessage(ex.getLocalizedMessage());
            return ResponseEntity.ok(softResponse);
        }

    }


    @PutMapping(value = "/corporate-customer/terminal/deactivation/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> deactivateTerminal(@PathVariable("id") Long id,
                                                           @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        SoftResponse softResponse = new SoftResponse();

        try {
            softResponse = customerCreator.deactivateStatusTerminal(id, headerRequestorInitiatorRid);
            return ResponseEntity.ok(softResponse);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            softResponse.setResult(Boolean.FALSE);
            softResponse.setId(Constants.DECLINED_CODE_001);
            softResponse.setMessage(ex.getLocalizedMessage());
            return ResponseEntity.ok(softResponse);
        }
    }

    @GetMapping(value = "corporate-customer/terminal/status/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TermStatusResponse> getStatusTerminal(@PathVariable("id") Long id,
                                                                @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        TermStatusResponse terminalDetails = new TermStatusResponse();

        try {
            terminalDetails = customerCreator.getStatusTerminal(id, headerRequestorInitiatorRid);
            return ResponseEntity.ok(terminalDetails);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            terminalDetails.setCode(Constants.DECLINED_CODE_001);
            return ResponseEntity.ok(terminalDetails);
        }
    }
}