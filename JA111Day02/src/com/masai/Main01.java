package com.masai;

public class Main01 {
    public static void main(String[] args) {


        String city = "Bangalore";
        printCity(city);
        printCity("Kochi");

    }
    public static void printCity(String city){
        switch (city){
            case "Mumbai":
                System.out.println("Financial City");
                break;
            case "Kolkata":
                System.out.println("City of Joy");
                break;
            case "Bangalore":
                System.out.println("Cyber City");
                break;
            case "Delhi":
                System.out.println("Capital of the country");
                break;
            default:
                System.out.println("May be Other Indian City");
        }
    }
}
