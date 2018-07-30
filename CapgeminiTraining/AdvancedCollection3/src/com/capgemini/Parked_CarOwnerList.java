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

}
