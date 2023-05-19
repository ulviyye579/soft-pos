package az.unibank.softpos.dtov2.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MiniResponse {

    private String id;
    private String code;
    private String description;
}
