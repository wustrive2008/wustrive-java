package org.wustrive.java.core.bean;

import java.io.Serializable;


public class CurrentUser extends AuthBean implements Serializable{
	private static final long serialVersionUID = -7919201192414048616L;

	private String name;
	private String phoneNumber;
	private String account;
	private Integer adminType;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public Integer getAdminType() {
        return adminType;
    }
    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }
	
}
