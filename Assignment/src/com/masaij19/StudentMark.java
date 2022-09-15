package com.masaij19;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class StudentMark implements Comparator<Map.Entry<String,Student>> {
	@Override
	public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
		
		Student s1=o1.getValue();
		Student s2=o2.getValue();
		if(s1.getMark()>s2.getMark())
			return 1;
		else if(s1.getMark()<s2.getMark())
			return -1;
		else
		return 0;
	}
}
