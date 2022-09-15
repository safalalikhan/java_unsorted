package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> city = new ArrayList<>();
		city.add("Kochi");
		city.add("Bangalore");
		city.add("Delhi");
		city.add("Munnar");
		
		PrintList inter = c ->System.out.println(city);
		inter.display(city);
		
	}

}
