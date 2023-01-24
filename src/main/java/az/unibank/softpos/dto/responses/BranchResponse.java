package az.unibank.softpos.dto.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BranchResponse {

    private String merchantId;
    private String result;
    private String externalId;
}
