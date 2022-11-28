/*
 * Copyright (c) 2021.
 *
 *
 *  @author Ulviyya Musayeva
 *
 */

package az.unibank.softpos.controllers;


import az.unibank.softpos.dto.MiniResponse;
import az.unibank.softpos.dto.SoftResponse;
import az.unibank.softpos.dto.CustomerResponse;
import az.unibank.softpos.dto.TermStatusResponse;
import az.unibank.softpos.dto.requests.*;
import az.unibank.softpos.service.methods.CorporateCustomer;
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
    private final CorporateCustomer corporateCustomer;



    @PostMapping(value = "corporate-customer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Company> createCustomer(@Valid @RequestBody CorpCustomer corpCustomer,
                                                  @RequestHeader (value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        Company company = new Company();
        try {
            company = corporateCustomer.createCustomer(corpCustomer, headerRequestorInitiatorRid);
            return ResponseEntity.ok(company);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ex.getLocalizedMessage());
            company.setCode(Constants.DECLINED_CODE_001);
            company.setDescription(ex.getLocalizedMessage());
            return ResponseEntity.ok(company);
        }

    }

    @PostMapping(value = "corporate-customer/subcustomer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerResponse> createSubCustomer(@Valid @RequestBody SubCustomer subCustomer,
                                                              @RequestHeader (value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        CustomerResponse subcustomerResponse = new CustomerResponse();
        try {
            subcustomerResponse = corporateCustomer.createSubCustomer(subCustomer, headerRequestorInitiatorRid);
            return ResponseEntity.ok(subcustomerResponse);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            subcustomerResponse.setResult(ex.getLocalizedMessage());
            return ResponseEntity.ok(subcustomerResponse);
        }

    }

    @PostMapping(value = "corporate-customer/terminal",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TerminalResponse> createTerminal(@Valid @RequestBody Term term,
                                                       @RequestHeader (value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        TerminalResponse terminalResponse = new TerminalResponse();
        try {
            terminalResponse =  corporateCustomer.createTerminal(term, headerRequestorInitiatorRid);
            return ResponseEntity.ok(terminalResponse);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            terminalResponse.setCode(Constants.DECLINED_CODE_001);
            terminalResponse.setDescription(ex.getLocalizedMessage());
            return ResponseEntity.ok(terminalResponse);
        }
    }


    @PutMapping(value = "/corporate-customer/terminal/activation/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> activateTerminal(@PathVariable("id") String id,
                                                         @RequestHeader (value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid){
        SoftResponse softResponse = new SoftResponse();

        try {
            softResponse = corporateCustomer.activateStatusTerminal(id, headerRequestorInitiatorRid);
            return ResponseEntity.ok(softResponse);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            softResponse.setResult(String.valueOf(Boolean.FALSE));
            softResponse.setId(Constants.DECLINED_CODE_001);
            softResponse.setMessage(ex.getLocalizedMessage());
            return ResponseEntity.ok(softResponse);
        }

    }


    @PutMapping(value = "/corporate-customer/terminal/deactivation/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> deactivateTerminal(@PathVariable("id") Long id,
                                                           @RequestHeader (value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        SoftResponse softResponse = new SoftResponse();

        try {
            softResponse = corporateCustomer.deactivateStatusTerminal(id, headerRequestorInitiatorRid);
            return ResponseEntity.ok(softResponse);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            softResponse.setResult(String.valueOf(Boolean.FALSE));
            softResponse.setId(Constants.DECLINED_CODE_001);
            softResponse.setMessage(ex.getLocalizedMessage());
            return ResponseEntity.ok(softResponse);
        }
    }

    @GetMapping(value = "corporate-customer/terminal/status/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TermStatusResponse> getStatusTerminal(@PathVariable("id") Long id,
                                                                @RequestHeader (value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        TermStatusResponse terminalDetails = new TermStatusResponse();

        try {
            terminalDetails = corporateCustomer.getStatusTerminal(id, headerRequestorInitiatorRid);
            return ResponseEntity.ok(terminalDetails);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ex.getLocalizedMessage());
            terminalDetails.setCode(Constants.DECLINED_CODE_001);
            return ResponseEntity.ok(terminalDetails);
        }
    }

    @GetMapping(value = "corporate-customer/keyGeneration/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MiniResponse> generateKey(@PathVariable("id") Long id,
                                                                @RequestHeader (value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        MiniResponse miniResponse = new MiniResponse();

        try {
            miniResponse = corporateCustomer.generateKey(id, headerRequestorInitiatorRid);
            return ResponseEntity.ok(miniResponse);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ex.getLocalizedMessage());
            miniResponse.setCode(Constants.DECLINED_CODE_001);
            return ResponseEntity.ok(miniResponse);
        }
    }

}