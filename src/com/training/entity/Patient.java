package com.training.entity;

public class Patient {
private int patientId;
private String patientName;
private int age;
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + "]";
}
public Patient(int patientId, String patientName, int age) {
	super();
	this.patientId = patientId;
	this.patientName = patientName;
	this.age = age;
}
public Patient() {
	super();
	// TODO Auto-generated constructor stub
}

public double fee(){
	return 10.01;
}
}
