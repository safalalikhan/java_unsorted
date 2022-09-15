package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Qn03 {
    public static void main(String[] args)
    {

        List<String> names = new ArrayList<>(Arrays.asList("akshara","safal","amaan","amal"));

        // for loop 
        for (int i = 0; i < names.size(); i++)
            System.out.print("name using for loop " + names.get(i)+"\n");
        System.out.println("======================================");
        
        // enhanced for loop
        for(String s : names)
        	System.out.println("name using enhnced for loop " + s );
        System.out.println("======================================");

        
        // iterator
        Iterator<String> it = names.iterator();
        while (it.hasNext())
            System.out.print("name using enhnced for loop " + it.next()+"\n");
        System.out.println("======================================");

    }

}
