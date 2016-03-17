package com.training.entity;

import java.io.Serializable;

import com.training.domains.Address;

public class Doctor implements Serializable {
	private int doctorCode;
	private String doctorName;
	private long handPhone;
	private Address resiAddress;
	private Address hospitalAddress;

	public Address getResiAddress() {
		return resiAddress;
	}

	public void setResiAddress(Address resiAddress) {
		this.resiAddress = resiAddress;
	}

	public Address getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(Address hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public int getDoctorCode() {
		return doctorCode;
	}

	public void setDoctorCode(int doctorCode) {
		this.doctorCode = doctorCode;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	

	@Override
	public String toString() {
		return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", handPhone=" + handPhone
				+ ", resiAddress=" + resiAddress + ", hospitalAddress=" + hospitalAddress + "]";
	}

	public Doctor(int doctorCode, String doctorName, long handPhone) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

}
