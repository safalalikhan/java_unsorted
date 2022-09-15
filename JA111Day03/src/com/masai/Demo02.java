package com.masai;

public class Demo02 {
    public static void main(String[] args) {
        checkWeather(true,true,70);
        checkWeather(true,false,75);
        checkWeather(false,false,10);
        checkWeather(false,true,60);

        checkWeather(false,false,60);




    }
    public static void checkWeather(boolean isRaining, boolean isSnowing,double temperature) {
        if(temperature > 50 && isRaining==false && isSnowing== false)
            System.out.println("Let's go out!");
        else
            System.out.println("Let's stay home");
    }
}
