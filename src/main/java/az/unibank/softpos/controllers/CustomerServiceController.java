/*
 * Copyright (c) 2021.
 *
 *
 *  @author Ulviyya Musayeva
 *
 */

package az.unibank.softpos.controllers;


import az.unibank.softpos.dto.MiniResponse;
import az.unibank.softpos.dto.requests.Company;
import az.unibank.softpos.dto.requests.CorpCustomer;
import az.unibank.softpos.dto.requests.Device;
import az.unibank.softpos.dto.requests.SubCustomer;
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
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
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
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<MiniResponse> createSubCustomer(@Valid @RequestBody SubCustomer subCustomer,
                                                          @RequestHeader (value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        MiniResponse miniResponse = new MiniResponse();
        try {
            miniResponse = corporateCustomer.createSubCustomer(subCustomer, headerRequestorInitiatorRid);
            return ResponseEntity.ok(miniResponse);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            miniResponse.setCode(Constants.DECLINED_CODE_001);
            miniResponse.setDescription(ex.getLocalizedMessage());
            return ResponseEntity.ok(miniResponse);
        }

    }

    @PostMapping(value = "corporate-customer/terminal",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<MiniResponse> createTerminal(@Valid @RequestBody Device device,
                                                       @RequestHeader (value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        MiniResponse miniResponse = new MiniResponse();

        try {
            miniResponse =  corporateCustomer.createTerminal(device, headerRequestorInitiatorRid);
            return ResponseEntity.ok(miniResponse);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            miniResponse.setCode(Constants.DECLINED_CODE_001);
            miniResponse.setDescription(ex.getLocalizedMessage());
            return ResponseEntity.ok(miniResponse);
        }
    }


    @PutMapping(value = "/corporate-customer/terminal/activation/id/{id}",
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public boolean activateTerminal(@PathVariable("id") String id) {
        return corporateCustomer.activateStatusTerminal(id);
    }


    @PutMapping(value = "/corporate-customer/terminal/deactivation/id/{id}",
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String deactivateTerminal(@PathVariable("id") String id) {
        return corporateCustomer.deactivateStatusTerminal(id);
    }

    @GetMapping(value = "corporate-customer/terminal/status/id/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getStatusTerminal(@PathVariable("id") String id) {
        return corporateCustomer.getStatusTerminal(id);
    }

}