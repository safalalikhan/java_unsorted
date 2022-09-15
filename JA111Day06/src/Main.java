import java.util.Scanner;

public class Main {
    public static String reversString(String input){
        char[] arr = new char[input.length()];
        for(int i = 0; i < input.length() ;i ++){
            arr[input.length()-1-i] = input.charAt(i);
        }
    String ans = String.valueOf(arr);
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.next();
        String result = reversString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);
    }
}
