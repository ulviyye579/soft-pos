package az.unibank.softpos.controllers;

import az.unibank.softpos.dto.requests.Branch;
import az.unibank.softpos.dto.requests.Company;
import az.unibank.softpos.dto.requests.POS;
import az.unibank.softpos.dto.responses.*;
import az.unibank.softpos.service.CustomerCreator;
import az.unibank.softpos.utils.Constants;
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
@RequestMapping("/v1/soft/pos")
@RequiredArgsConstructor
public class CustomerServiceController {

    private final CustomerCreator customerCreator;
    SoftResponse softResponse = new SoftResponse();
    ResponseCustomer responseCustomer = new ResponseCustomer();
    SubCustomer subcustomer = new SubCustomer();

    /**
     * @deprecated (as release of v2, replaced by /v2/soft/pos/corporate-customer)
     */
    @Deprecated(since="softpos-api-v2", forRemoval=true)
    @PostMapping(value = "/corporate-customer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseCustomer> createCustomer(@Valid @RequestBody Company modelCompany,
                                                           @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        try {
            responseCustomer = customerCreator.createCustomer(modelCompany, headerRequestorInitiatorRid);
            return ResponseEntity.ok(responseCustomer);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    /**
     * @deprecated (as release of v2, replaced by /v2/soft/pos/corporate-customer/subcustomer)
     */
    @Deprecated(since="softpos-api-v2", forRemoval=true)
    @PostMapping(value = "/corporate-customer/subcustomer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SubCustomer> createSubCustomer(@Valid @RequestBody Branch branch,
                                                         @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        try {
            subcustomer = customerCreator.createSubCustomer(branch, headerRequestorInitiatorRid);
            return ResponseEntity.ok(subcustomer);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    /**
     * @deprecated (as release of v2, replaced by /v2/soft/pos/corporate-customer/terminal)
     */
    @Deprecated(since="softpos-api-v2", forRemoval=true)
    @PostMapping(value = "/corporate-customer/terminal",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TerminalResponse> createTerminal(@Valid @RequestBody POS pos,
                                                           @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        try {
            TerminalResponse terminalResponse;
            terminalResponse = customerCreator.createTerminal(pos, headerRequestorInitiatorRid);
            return ResponseEntity.ok(terminalResponse);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }


    @PutMapping(value = "corporate-customer/terminal/activation/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> activateTerminal(@PathVariable("id") String id,
                                                         @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {

        try {
            softResponse = customerCreator.changeStatusTerminal(id, headerRequestorInitiatorRid, Constants.ACTIVE_STATUS);
            return ResponseEntity.ok(softResponse);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @PutMapping(value = "/corporate-customer/terminal/deactivation/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> deactivateTerminal(@PathVariable("id") String id,
                                                           @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {

        try {
            softResponse = customerCreator.changeStatusTerminal(id, headerRequestorInitiatorRid, Constants.DEACTIVATED_STATUS);
            return ResponseEntity.ok(softResponse);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @GetMapping(value = "corporate-customer/terminal/status/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TermStatusResponse> getStatusTerminal(@PathVariable("id") Long id,
                                                                @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        try {
            TermStatusResponse terminalDetails;
            terminalDetails = customerCreator.getStatusTerminal(id, headerRequestorInitiatorRid);
            return ResponseEntity.ok(terminalDetails);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @PutMapping(value = "corporate-customer/terminal/deletion/id/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> deleteTerminal(@PathVariable("id") String id,
                                                       @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        try {
            softResponse = customerCreator.deleteTerminal(id, headerRequestorInitiatorRid);
            return ResponseEntity.ok(softResponse);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    /**
     * @deprecated (as release of v2, replaced by /v2/soft/pos/corporate-customer/subcustomer/id/{id}/mcc/{mcc})
     */
    @Deprecated(since="softpos-api-v2", forRemoval=true)
    @PutMapping(value = "corporate-customer/subcustomer/id/{id}/mcc/{mcc}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftResponse> changeMccId(@PathVariable("id") String departmentId,
                                                    @PathVariable("mcc") String mcc,
                                                    @RequestHeader(value = "requestor-inst-rid", required = false) String headerRequestorInitiatorRid) {
        try {
            softResponse = customerCreator.changeMcc(departmentId, headerRequestorInitiatorRid, mcc);
            return ResponseEntity.ok(softResponse);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }


}