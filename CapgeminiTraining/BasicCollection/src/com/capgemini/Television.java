package com.capgemini;

public class Television {
private String company;
private String type;
private boolean enable;
private double price;
@Override
public String toString() {
	return "Television [company=" + company + ", type=" + type + ", enable=" + enable + ", price=" + price + "]";
}
public String getCompany() {
	return company;
}
public String getType() {
	return type;
}
public boolean isEnable() {
	return enable;
}
public double getPrice() {
	return price;
}
public Television(String company, String type, boolean enable, double price) {

	this.company = company;
	this.type = type;
	this.enable = enable;
	this.price = price;
}


}
