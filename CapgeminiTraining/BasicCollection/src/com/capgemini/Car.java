package com.capgemini;

public class Car {
@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
private String make;
private String model;
private int year;
private double price;
public Car(String make,String model,int year,double price)
{
	this.make=make;
	this.model=model;
	this.year=year;
	this.price=price;
}
public String getMake() {
	return make;
}
public String getModel() {
	return model;
}
public int getYear() {
	return year;
}
public double getPrice() {
	return price;
}
}
