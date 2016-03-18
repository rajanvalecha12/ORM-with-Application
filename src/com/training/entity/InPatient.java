package com.training.entity;
import java.util.*;
import java.sql.*;
public class InPatient extends Patient{
	private int wardNumber;
	private Timestamp dateOfAdmission;
	@Override
	public String toString() {
		return "InPatient [wardNumber=" + wardNumber + ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	public int getWardNumber() {
		return wardNumber;
	}
	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}
	public Timestamp getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(Timestamp dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	public InPatient(int patientId, String patientName, int age, int wardNumber, Timestamp dateOfAdmission) {
		super(patientId, patientName, age);
		this.wardNumber = wardNumber;
		this.dateOfAdmission = dateOfAdmission;
	}
	public InPatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InPatient(int patientId, String patientName, int age) {
		super(patientId, patientName, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double fee(){
		return 200.01;
	}
}

