import java.util.Scanner;

public class Course {
    int courseId,courseFee;
    String courseName;
    public void displayCourseDetails(){
        System.out.println("Course Name :" + this.courseName);
        System.out.println("Course ID :" + this.courseId);
        System.out.println("Course Fee :" + this.courseFee);

    }
    public static void authenticate(String username, String password){
        System.out.println("Inside Authenticate");
        if(username == "Admin" && password == "1234"){
            Scanner scanner = new Scanner(System.in);
            Course c1 = new Course();
            System.out.println("Enter Course Name");
            c1.courseName = scanner.nextLine();
            System.out.println("Enter Course ID");
            c1.courseId = scanner.nextInt();
            System.out.println("Enter Course Fee");
            c1.courseFee = scanner.nextInt();

            System.out.println("Course Details : ");
            c1.displayCourseDetails();

        }
        else {
            System.out.println("Invalis Username or password");
        }

    }

    public static void main(String[] args) {
        authenticate("Admin","1234");
        authenticate("admin","4321");

    }

}

