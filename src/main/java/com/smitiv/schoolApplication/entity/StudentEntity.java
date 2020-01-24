package com.smitiv.schoolApplication.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class StudentEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 354912524810897885L;
	@Id
	@Column(name = "st_enrollment")
	private Long stEnroll;
	@Column(name = "st_name")
	private String stName;
	@Column(name = "st_address")
	private String stAddress;
	@Column(name = "branch")
	private String branch;
	@Column(name = "phone_number")
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

	public Long getPhNo() {
		return phNo;
	}

	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "StudentEntity [stEnroll=" + stEnroll + ", stName=" + stName + ", stAddress=" + stAddress + ", branch="
				+ branch + ", phNo=" + phNo + "]";
	}

}
