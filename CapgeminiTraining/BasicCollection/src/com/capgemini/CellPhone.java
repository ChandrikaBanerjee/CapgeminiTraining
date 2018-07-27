package com.capgemini;

public class CellPhone {
private String company;
private String model;
private String description;
private String operatingSystem;
private double price;
public String getCompany() {
	return company;
}
public String getModel() {
	return model;
}
@Override
public String toString() {
	return "CellPhone [company=" + company + ", model=" + model + ", description=" + description + ", operatingSystem="
			+ operatingSystem + ", price=" + price + "]";
}
public String getDescription() {
	return description;
}
public String getOperatingSystem() {
	return operatingSystem;
}
public double getPrice() {
	return price;
}
public CellPhone(String company, String model, String description, String operatingSystem, double price) {
	this.company = company;
	this.model = model;
	this.description = description;
	this.operatingSystem = operatingSystem;
	this.price = price;
}

}
