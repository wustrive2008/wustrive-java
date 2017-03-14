package org.wustrive.java.core.bean;

import java.io.Serializable;

public class CurrentRole implements Serializable{
    private static final long serialVersionUID = -8436272707319248710L;

    private String name;
    
    private String code;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }
}
