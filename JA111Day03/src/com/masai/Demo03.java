package com.masai;

public class Demo03 {
    public  static void main(String[] args) {
        checkVowel('c');
        checkVowel('a');
        checkVowel('&');
    }
    public static void checkVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch =='I' || ch== 'O' || ch == 'U')
            System.out.println("Vowel");
        else if( ch <= 'z' && ch >= 'a' || ch <= 'Z' && ch >= 'A')
            System.out.println("Consonant");
        else
            System.out.println("Error : Invalid Entry");
    }
}
