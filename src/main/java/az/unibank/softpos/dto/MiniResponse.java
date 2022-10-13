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

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Getter
@Setter
@NoArgsConstructor
@XmlRootElement(name = "Response")
@XmlType(propOrder = {"id", "code", "description"})
public class MiniResponse {

    private String id;
    private String code;
    private String description;
}
