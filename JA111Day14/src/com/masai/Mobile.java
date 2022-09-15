package com.masai;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String company, String... models) {
		
		
		for(String s : models) {
			
			for(int i = 0 ; i < outdatedModels.length ; i++) {
				
				if(s == outdatedModels[i]) {
					System.out.println(s + "_OUTDATED");
					break;
				}
				else if(i == outdatedModels.length - 1){
					System.out.println("Not an outdated model");
				}
				
			}	
		}
		
		if(models.length == 0) {
			System.out.println("Enter any " +company + " model name");
		}
		
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.searchOutdatedModel("Samsung", "note4");
		System.out.println("==========================================");
		m.searchOutdatedModel("Samsung", "note4","note5");
		System.out.println("==========================================");
		m.searchOutdatedModel("Samsung", "note4","note6","note10");
		System.out.println("==========================================");
		m.searchOutdatedModel("Samsung", "note9");
		System.out.println("==========================================");
		m.searchOutdatedModel("Samsung");
		System.out.println("==========================================");
		
	}

}
