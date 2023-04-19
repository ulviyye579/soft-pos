package az.unibank.softpos.dtov2.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BranchResponse {

    private String subCustomerId;
    private String result;
    private String externalId;
}
