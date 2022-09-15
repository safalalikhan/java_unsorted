package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
List<Product> productList = new ArrayList<>();
void addProductToList(Product product) {
	
}
List<Product> showAllProduct(){
	if(productList!=null)return productList;
	else return null;
}
public void addProduct(Product product) {
productList.add(product);	
}
}
