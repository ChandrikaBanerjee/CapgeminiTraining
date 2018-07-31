package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class Parked_CarOwnerList {
	List<Parked_CarOwner_Details> arrayList = new ArrayList<>();

	public void add_new_car(Parked_CarOwner_Details car) {
		arrayList.add(car);


	}

	public List<Parked_CarOwner_Details> getAllDetails()
	{
		
		return arrayList;
	}
	

	public void remove_car(Parked_CarOwner_Details car) {
		
		arrayList.remove(car);
	}
String getParkedCarLocation(int token)
{
	String location;
	int section;
	if(token>240 && token<1)
	{
		location="Invalid";
		return location;
	}
	else if(token>=1 && token<=80)
	{
		location="1st Floor";
	}
	else if(token>=81 && token<=160)
	{
		token=token-80;
		location="2nd Floor";
		
	}
	else
	{
		token=token-160;
		location="3rd Floor";
	}
	section=(int)Math.ceil(token/20.0);
	location=location+section+"Section";
	return location;
}
}
