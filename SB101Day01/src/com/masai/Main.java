package com.masai;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Main {
	public static void main(String[] args) {
		HashMap<String, String> states = new HashMap<>();
		
		states.put("Kerala","Trivandrum");
		states.put("Karnataka","Bangalore");
		states.put("WestBengal","Kolkata");
		states.put("Maharashtra","Mumbai");
		states.put("TamilNadu","Chennai");
		
		
		for( Map.Entry<String, String> entry : states.entrySet()){
			System.out.println(entry.getKey()+"======>"+entry.getValue());
			}
		System.out.println("===========================================");
		TreeMap<Student,String> tm = new TreeMap<>(new StudentMarksComp());
		tm.put(new Student(1,"Sanju",490),"Maharastra");
		tm.put(new Student(2,"Amal",450),"Kerala");
		tm.put(new Student(5,"Vishnu",480),"TamilNadu");
		tm.put(new Student(3,"Amaan",410),"Karnatakaa");
		tm.put(new Student(4,"Arun",480),"Kerla");
		
		for( Map.Entry<Student, String> entry : tm.entrySet()){
			System.out.println(entry.getKey()+" from "+entry.getValue());
			}
		System.out.println("===========================================");

		
	}


}
