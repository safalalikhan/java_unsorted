package com.masaij19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main19 {

	public static void main(String[] args) {
	
		StudentMark sm=new StudentMark();
		HashMap<String,Student> hm = new HashMap();
		hm.put("Himachal",new Student(1,"Vikky",875));
		hm.put("Tamilnadu",new Student(2,"Sanju",840));
		hm.put("Karnataka",new Student(5,"Vineesh",950));
		hm.put("Ladakh",new Student(10,"Safal",890));
		hm.put("Kerla",new Student(9,"Arun",800));
		
		
		Set<Map.Entry<String,Student>> set = hm.entrySet();
		
		Set<Map.Entry<String,Student>> Tree=new TreeSet<>(sm);
		
		for(Map.Entry<String,Student> me: set) {
			Tree.add(me);
		}
		
		for(Map.Entry<String,Student> T: Tree) {
		
		
		Student student = T.getValue();
		System.out.println("Toppers Student of State :" + T.getKey()+"-"+"Roll :" + student.getRoll()+" , "+"Name :" + student.getName()+" , "+"Marks :" + student.getMark());
		
	}
	}
}
