package v1.az.unibank.softpos.controllers;

import v1.az.unibank.softpos.dtoV2.requests.AccountChanges;
import v1.az.unibank.softpos.dtoV2.requests.BranchV2;
import v1.az.unibank.softpos.dtoV2.requests.POSV2;
import v1.az.unibank.softpos.dtoV2.responses.BranchResponse;
import v1.az.unibank.softpos.dtoV2.responses.SoftResponseV2;
import v1.az.unibank.softpos.dtoV2.responses.TerminalResponseV2;
import v1.az.unibank.softpos.exceptions.TransAxisException;
import v1.az.unibank.softpos.service.CustomerCreatorV2;
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
@RequestMapping("/v2/soft/pos")
@RequiredArgsConstructor
public class CustomerServiceControllerV2 {

    private final CustomerCreatorV2 creatorV2;


    @PostMapping(value = "/corporate-customer/subcustomer",
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

    @PostMapping(value = "/corporate-customer/terminal",
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

    @PutMapping(value = "/corporate-customer/subcustomer/account",
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

}