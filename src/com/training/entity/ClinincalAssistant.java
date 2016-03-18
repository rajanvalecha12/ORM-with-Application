package com.training.entity;

public class ClinincalAssistant {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ClinincalAssistant() {
	super();
	// TODO Auto-generated constructor stub
}
public ClinincalAssistant(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "ClinincalAssistant [id=" + id + ", name=" + name + "]";
}

}
