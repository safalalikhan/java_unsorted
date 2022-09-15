package com.masaij20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
public static void main(String args[]) {
	List<City> cityList = new ArrayList<>();
	cityList.add(new City("Bangalore"));
	cityList.add(new City("Kochi"));
	cityList.add(new City("Delhi"));
	cityList.add(new City("Pune"));
	cityList.sort((c1, c2) -> c1.name.compareTo(c2.name));
	System.out.println(cityList);
}
}
