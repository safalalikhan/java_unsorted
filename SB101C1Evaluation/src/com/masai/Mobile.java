package com.masai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	
	public String addMobile(String company, String model) {
		if(mobiles.get(company) == null) {
			ArrayList<String> mobileList = new ArrayList<>();
			mobileList.add(model);
			mobiles.put(company,mobileList);
			return "Mobile added successfully\" after adding a mobile";
		}
		else {
			mobiles.get(company).add(model);
			return "Mobile added successfully\" after adding a mobile";
		}
		
		
	}
	
	public List<String> getModels(String company)throws InvalidMobileException{
		if(mobiles.get(company) == null) {
			throw new InvalidMobileException("Company not in Database");

		}
		else return mobiles.get(company);
		
	}
	
	public static void main(String[] args) {
		Mobile demo = new Mobile();
		demo.addMobile("apple","iphone13");
		demo.addMobile("apple","iphone12pro");
		demo.addMobile("apple","iphone13mini");
		demo.addMobile("apple","iphonese");
		demo.addMobile("samsung", "s20");
		demo.addMobile("samsung", "s22ultra");
		demo.addMobile("nokia", "1100");
		
		
		try {
			System.out.println(demo.getModels("apple"));
			System.out.println(demo.getModels("redmi"));
		}catch(InvalidMobileException ime) {
			System.out.println(ime.getMessage());
		}


		
		
		
		
	}

}
