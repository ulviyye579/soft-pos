package az.unibank.softpos.dto;
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
@XmlRootElement(name = "Response")
@XmlType(propOrder = {"id", "result", "message"})
public class SoftResponse {

    private String id;
    private String result;
    private String message;
}

