package com.masai;

public class Product {

String name;
double price;
String company;
int count = 0;

public Product(String n, double p, String c, int x) {
this.price = p;
this.count += x;
this.company = c;
this.name = n;
}
}
