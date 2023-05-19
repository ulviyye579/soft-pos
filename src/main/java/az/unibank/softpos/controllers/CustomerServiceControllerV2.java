package az.unibank.softpos.controllers;

import az.unibank.softpos.dtov2.requests.AccountChanges;
import az.unibank.softpos.dtov2.requests.BranchV2;
import az.unibank.softpos.dtov2.requests.CompanyAttributes;
import az.unibank.softpos.dtov2.requests.POSV2;
import az.unibank.softpos.dtov2.responses.BranchResponse;
import az.unibank.softpos.dtov2.responses.CorpCustomerDetails2;
import az.unibank.softpos.dtov2.responses.SoftResponseV2;
import az.unibank.softpos.dtov2.responses.TerminalResponseV2;
import az.unibank.softpos.service.CustomerCreatorV2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/v2/soft/pos")
@RequiredArgsConstructor
public class CustomerServiceControllerV2 {

    private final CustomerCreatorV2 creatorV2;
    SoftResponseV2 softResponse = new SoftResponseV2();

    CorpCustomerDetails2 responseCustomer = new CorpCustomerDetails2();


    @PostMapping(value = "/corporate-customer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CorpCustomerDetails2> createCustomer(@Valid @RequestBody CompanyAttributes modelCompanyAttributes,
                                                               @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        try{
            responseCustomer= creatorV2.createCustomer(modelCompanyAttributes, headerRequestorInitiatorRid);
            return ResponseEntity.ok(responseCustomer);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @PostMapping(value = "/corporate-customer/subcustomer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BranchResponse> createSubCustomerV2(@Valid @RequestBody BranchV2 branchV2,
                                                              @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        BranchResponse branchResponse ;
        try {
            branchResponse = creatorV2.createSubCustomer(branchV2,headerRequestorInitiatorRid);
            return ResponseEntity.ok(branchResponse);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @PostMapping(value = "/corporate-customer/terminal",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TerminalResponseV2> createTerminalV2(@Valid @RequestBody POSV2 posV2,
                                                               @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid){
        try{
            TerminalResponseV2 terminalResponseV2;
            terminalResponseV2 = creatorV2.createTerminal(posV2, headerRequestorInitiatorRid);
            return ResponseEntity.ok(terminalResponseV2);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @PutMapping(value = "/corporate-customer/subcustomer/terminal/account",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponseV2> changeAccount(@Valid @RequestBody AccountChanges account,
                                                        @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        SoftResponseV2 softResponseV2;
        try {
            softResponseV2 = creatorV2.changeAccountNumber( account, headerRequestorInitiatorRid);
            return ResponseEntity.ok(softResponseV2);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @PutMapping(value = "corporate-customer/subcustomer/terminal/abs-rid/{absRid}/mcc/{mcc}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponseV2> changeMccId(@PathVariable("absRid") String departmentId,
                                                    @PathVariable("mcc") String mcc,
                                                    @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid){
        try {
            softResponse = creatorV2.changeMcc(departmentId, headerRequestorInitiatorRid, mcc);
            return ResponseEntity.ok(softResponse);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

}