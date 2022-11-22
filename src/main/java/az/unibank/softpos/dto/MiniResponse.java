/*
 * Copyright (c) 2021.
 *
 *
 *  @author Sanan Garibli
 *
 */

package az.unibank.softpos.dto;

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
