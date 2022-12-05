package az.unibank.softpos.dto.responses;
/*
 * Copyright (c) 2021.
 *
 *
 *  @author Ulviyya Musayeva
 *
 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@Getter
@Setter
@NoArgsConstructor
public class SoftResponse {

    private String id;
    private Boolean result;
    private String message;
}

