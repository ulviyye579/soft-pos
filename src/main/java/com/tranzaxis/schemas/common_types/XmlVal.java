/*
 * Copyright (c) 2022.
 *
 *
 *  @author Sanan Garibli
 *
 */

package com.tranzaxis.schemas.common_types;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "XmlVal")
public class XmlVal<T> {

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