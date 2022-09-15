package com.masaij03;

public class VowelConsonant {
    public static void main(String[] args) {
    checkVowel('c');
    checkVowel('a');    
    }
    public static void checkVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }

}
