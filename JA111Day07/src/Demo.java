import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many student details do we need to enter ? ");
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        double sum = 0;
        for(int i = 0 ; i <n ; i ++){
            System.out.println("Enter roll no");
            int roll= sc.nextInt();
            System.out.println("Enter name :");
            String name = sc.next();
            System.out.println("Enter address");
            String address = sc.next();
            System.out.println("Enter Marks");
            int marks = sc.nextInt();
            arr[i] = new Student(roll,name,address,marks);
            sum += marks;
        }
        double avg = sum/n;
        System.out.println("Average marks : "+avg);



    }


}
