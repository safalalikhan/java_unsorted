package com.masai.qn04;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Address implements Serializable{
	private String state,city,pincode;
	
	Address (String state,String city,String pincode){
		this.state=state;
		this.city=city;
		this.pincode=pincode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
