package com.masai;

public class CustomGenericClass <T>{
	T obj;
	void add(T obj){
	this.obj=obj;
	}
	T get(){
	return obj;
	}

}
