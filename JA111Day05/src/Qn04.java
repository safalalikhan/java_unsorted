import java.util.Scanner;

public class Qn04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = scanner.nextLine();
        System.out.println("Enter the character position you want to access ");
        int i = scanner.nextInt();

        System.out.println("Character at position " + i + " is "+str.charAt(i-1));
    }
}
