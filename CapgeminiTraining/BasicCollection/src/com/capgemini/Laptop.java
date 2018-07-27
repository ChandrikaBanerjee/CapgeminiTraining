package com.capgemini;

public class Laptop {
private String company;
private String model;
private String operatingSystem;
private String processor;
public Laptop(String company,String model,String operatingSystem,String processor)
{
	this.company=company;
	this.model=model;
	this.operatingSystem=operatingSystem;
	this.processor=processor;
}
public String getCompany() {
	return company;
}
public String getModel() {
	return model;
}
public String getOperatingSystem() {
	return operatingSystem;
}
public String getProcessor() {
	return processor;
}
@Override
public String toString() {
	return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem + ", processor="
			+ processor + "]";
}

}
