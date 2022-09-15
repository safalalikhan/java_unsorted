package com.masai;

public class Demo {
	public static void main(String[] args) {
		
		CustomGenericClass<String> gen1 = new CustomGenericClass<>();
		gen1.add("Hello");
		System.out.println(gen1.get());
		CustomGenericClass<Integer> gen2 = new CustomGenericClass<>();
		gen2.add(20);
		System.out.println(gen2.get());
		CustomGenericClass<Student> gen3 = new CustomGenericClass<>();
		gen3.add(new Student(10,"Safal",780));
		System.out.println(gen3.get().getName());
		
	}

}
