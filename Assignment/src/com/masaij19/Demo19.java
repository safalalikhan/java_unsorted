package com.masaij19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo19 {

	public static void main(String[] args) {
	
		HashMap< String, String> hm=new HashMap<>();
		hm.put("Karnataka", "Bengaluru");
		hm.put("West Bengal", "Kolkata");
		hm.put("Maharashtra", "Mumbai");
		hm.put("Kerala", "Trivandrum");
		hm.put("Tamil_Nadu", "Madras");
		Set<Map.Entry<String,String>> set =hm.entrySet();
		
		for(Map.Entry<String,String> ME: set)
		{
		System.out.println(ME.getKey()+"-capital-"+ME.getValue());	
		}
		
	}
}
