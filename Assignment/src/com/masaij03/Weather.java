package com.masaij03;

public class Weather {
    public static void main(String[] args) {
    checkWeather(true,true,60);
    checkWeather(true,false,60);
    checkWeather(false,false,10);
    checkWeather(false,false,60);


    

    }
    public static void checkWeather(boolean rain, boolean snow,double temp) {
        if(temp > 50 && rain==false && snow== false)
            System.out.println("Let's go out!");
        else
            System.out.println("Let's stay home");
    }

}
