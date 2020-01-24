package com.smitiv.schoolApplication.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -918257462337333650L;
	private Long stEnroll;
	private String stName;
	private String stAddress;
	private String branch;
	private Long phNo;

	
	
	public Long getStEnroll() {
		return stEnroll;
	}

	public void setStEnroll(Long stEnroll) {
		this.stEnroll = stEnroll;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStAddress() {
		return stAddress;
	}

	public void setStAddress(String stAddress) {
		this.stAddress = stAddress;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}



	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}

	public Long getPhNo() {
		return phNo;
	}

	@Override
	public String toString() {
		return "StudentDTO [stEnroll=" + stEnroll + ", stName=" + stName + ", stAddress=" + stAddress + ", branch="
				+ branch + ", phNo=" + phNo + "]";
	}

}
