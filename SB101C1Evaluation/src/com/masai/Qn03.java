package com.masai;

public class Qn03 {
	/*
	 * Wildcards in Java 
	 * in Java the " ? " represents the wildcard item.
	 * It is used to be flexible with the datatypes of parameter or a return type or whiles adding any items;
	 * 
	 * Upperbounded and Lowerbounded WildCcards 
	 * 
	 * Upperbounded >
	 * It decreases the restriction on a Variable or the values the variable can take;
	 * It make sure that the variable can have a specific type or any of the sub types of the same,
	 * i.e any class which is implementing or extending the given class;
	 * uses extends keyword;
	 * Lowerbounded >
	 * It increases the restriction on a Variable;
	 * It makes sure that only the specific type or the super type of the variable is used, 
	 * i.e any class that the given class is extending or implementing from;
	 * uses super keyword;
	 * 
	 * Eg :
	 * List < ? extends Person>
	 * this is upperbounded, here variable can take any variable which is extending from person, 
	 * i.e any child and subchild of the Person class;
	 * 
	 * List < ? super Student>
	 * this is lowerbounded, here variable can take any variablke which  is a super class of Student,
	 * i.e any class from which Student is extending or implementing;
	 * 
	 */

}
