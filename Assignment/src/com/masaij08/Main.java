package com.masaij08;

public class Main {

		public static void main(String[] args){
		Bird b1 = new Parrot();
b1.fly();
Bird b2 = (Bird)new Parrot();
b2.fly();

		}
		
}

/* Question 2
 * ClassCast Exception in Java is one of the unchecked exceptions that occur when we try to convert
 *  one class type object into another class type.
* ClassCast Exception is thrown when we try to cast an object of the parent class to the child class object.
* However, it can also be thrown when we try to convert the objects of two individual classes 
* that don't have any relationship between them. 
 */
// Question 3
/*In Java, polymorphism is a concept of object-oriented programming that allows us to perform
 *  a single action in different forms.
 *  Dynamic polymorphism is a process or mechanism in which a call to an overridden method
 *   at runtime rather than compile-time. It is also known as runtime polymorphism or dynamic method dispatch. 
 *  We can achieve dynamic polymorphism by using the method overriding.
 */

