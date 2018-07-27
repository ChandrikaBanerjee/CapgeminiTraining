package com.capgemini;

public class School {
private String name;
private String city;
private String schoolDistrict;
private int greatSchoolRanking;
public String getName() {
	return name;
}
public String getCity() {
	return city;
}
public String getSchoolDistrict() {
	return schoolDistrict;
}
public int getGreatSchoolRanking() {
	return greatSchoolRanking;
}
public School(String name, String city, String schoolDistrict, int greatSchoolRanking) {
	this.name = name;
	this.city = city;
	this.schoolDistrict = schoolDistrict;
	this.greatSchoolRanking = greatSchoolRanking;
}
@Override
public String toString() {
	return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict + ", greatSchoolRanking="
			+ greatSchoolRanking + "]";
}

}
