package com.masai.qn01;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Address implements Serializable{
	private String city,pincode;
	Address (String city, String pincode){
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	

}
