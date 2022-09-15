import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Students you want to enter");
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("===========================================");
            System.out.println("Enter the Roll Number :");
            int roll = sc.nextInt();
            System.out.println("Enter the Name :");
            String name = sc.next();
            System.out.println("Enter the marks :");
            int marks = sc.nextInt();
            arr[i] = new Student(roll,name,marks);
        }
        System.out.println("===========================================");
        Student s1 = arr[0];
        s1.printDetails();
        System.out.println("===========================================");

    }
}
