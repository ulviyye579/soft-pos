package v1.az.unibank.softpos.controllers;

import v1.az.unibank.softpos.dto.requests.*;
import v1.az.unibank.softpos.dto.requests.Company;
import v1.az.unibank.softpos.dto.responses.*;
import v1.az.unibank.softpos.dtoV2.requests.AccountChanges;
import v1.az.unibank.softpos.dtoV2.requests.BranchV2;
import v1.az.unibank.softpos.dtoV2.requests.POSV2;
import v1.az.unibank.softpos.dtoV2.responses.BranchResponse;
import v1.az.unibank.softpos.dtoV2.responses.SoftResponseV2;
import v1.az.unibank.softpos.dtoV2.responses.TerminalResponseV2;
import v1.az.unibank.softpos.exceptions.TransAxisException;
import v1.az.unibank.softpos.service.CustomerCreator;
import v1.az.unibank.softpos.service.CustomerCreatorV2;
import v1.az.unibank.softpos.utils.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import javax.xml.bind.JAXBException;

@Slf4j
@RestController
@RequestMapping("/soft/pos")
@RequiredArgsConstructor
public class CustomerServiceController {

    private final CustomerCreator customerCreator;
    private final CustomerCreatorV2 creatorV2;
    SoftResponse softResponse = new SoftResponse();
    ResponseCustomer responseCustomer = new ResponseCustomer();
    SubCustomer subcustomer = new SubCustomer();


    @PostMapping(value = "/v1.1/corporate-customer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseCustomer> createCustomer(@Valid @RequestBody Company modelCompany,
                                                           @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
       try{
           responseCustomer = customerCreator.createCustomer(modelCompany, headerRequestorInitiatorRid);
        return ResponseEntity.ok(responseCustomer);
       } catch (Exception ex) {
           throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
       }
    }


    @Deprecated
    @PostMapping(value = "/v1.1/corporate-customer/subcustomer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SubCustomer> createSubCustomer(@Valid @RequestBody Branch branch,
                                                         @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
        try {
            subcustomer = customerCreator.createSubCustomer(branch, headerRequestorInitiatorRid);
            return ResponseEntity.ok(subcustomer);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @Deprecated
    @PostMapping(value = "/v1.1/corporate-customer/terminal",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TerminalResponse> createTerminal(@Valid @RequestBody POS pos,
                                                           @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
        try{
        TerminalResponse terminalResponse;
        terminalResponse = customerCreator.createTerminal(pos, headerRequestorInitiatorRid);
        return ResponseEntity.ok(terminalResponse);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @PostMapping(value = "/v1.2/corporate-customer/subcustomer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BranchResponse> createSubCustomerV2(@Valid @RequestBody BranchV2 branchV2,
                                                            @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, v1.az.unibank.softpos.exceptionsV2.TransAxisException {
        BranchResponse branchResponse ;
        try {
            branchResponse = creatorV2.createSubCustomer(branchV2,headerRequestorInitiatorRid);
            return ResponseEntity.ok(branchResponse);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @PostMapping(value = "/v1.2/corporate-customer/terminal",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TerminalResponseV2> createTerminalV2(@Valid @RequestBody POSV2 posV2,
                                                             @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, v1.az.unibank.softpos.exceptionsV2.TransAxisException {
        try{
            TerminalResponseV2 terminalResponseV2;
            terminalResponseV2 = creatorV2.createTerminal(posV2, headerRequestorInitiatorRid);
            return ResponseEntity.ok(terminalResponseV2);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @PutMapping(value = "/v1.1/corporate-customer/terminal/activation/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> activateTerminal(@PathVariable("id") String id,
                                                         @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {

       try {
        softResponse = customerCreator.changeStatusTerminal(id, headerRequestorInitiatorRid, Constants.ACTIVE_STATUS);
        return ResponseEntity.ok(softResponse);
       } catch (Exception ex) {
           throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
       }
    }

    @PutMapping(value = "/v1.1/corporate-customer/terminal/deactivation/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> deactivateTerminal(@PathVariable("id") String id,
                                                           @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {

       try{
        softResponse = customerCreator.changeStatusTerminal(id, headerRequestorInitiatorRid, Constants.DEACTIVATED_STATUS);
        return ResponseEntity.ok(softResponse);
       } catch (Exception ex) {
           throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
       }
    }

    @GetMapping(value = "/v1.1/corporate-customer/terminal/status/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TermStatusResponse> getStatusTerminal(@PathVariable("id") Long id,
                                                                @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
       try{
           TermStatusResponse terminalDetails;
        terminalDetails = customerCreator.getStatusTerminal(id, headerRequestorInitiatorRid);
        return ResponseEntity.ok(terminalDetails);
    } catch (Exception ex) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
    }
    }

    @PutMapping(value = "/v1.1/corporate-customer/terminal/deletion/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> deleteTerminal(@PathVariable("id") String id,
                                                       @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
        try {softResponse = customerCreator.deleteTerminal(id, headerRequestorInitiatorRid);
        return ResponseEntity.ok(softResponse);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @PutMapping(value = "/v1.1/corporate-customer/subcustomer/id/{id}/mcc/{mcc}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> changeMccId(@PathVariable("id") String departmentId,
                                                    @PathVariable("mcc") String mcc,
                                                    @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
        try {
            softResponse = customerCreator.changeMcc(departmentId, headerRequestorInitiatorRid, mcc);
        return ResponseEntity.ok(softResponse);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @PutMapping(value = "/v1.2/corporate-customer/subcustomer/account",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponseV2> changeAccount(@Valid @RequestBody AccountChanges account,
                                                        @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid)
            throws JAXBException, TransAxisException {
        SoftResponseV2 softResponseV2;
        try {
            softResponseV2 = creatorV2.changeAccountNumber( account, headerRequestorInitiatorRid);
            return ResponseEntity.ok(softResponseV2);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

}