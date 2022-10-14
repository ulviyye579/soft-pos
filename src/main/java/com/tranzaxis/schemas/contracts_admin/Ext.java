/*
 * Copyright (c) 2020.
 *
 *
 *  @author Sanan Garibli
 *
 */

package com.tranzaxis.schemas.contracts_admin;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Ext")
public class Ext<T> {

    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<T> content;

    public List<T> getContent() {
        if (content == null) {
            content = new ArrayList<T>();
        }
        return this.content;
    }

}