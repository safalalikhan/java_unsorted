public class Student {
    private int roll;
    private String name;
    private int marks;
    Student(int roll, String name, int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    Student(){

    }
    public void printDetails(){
        System.out.println("Student Roll Number :" + this.roll);
        System.out.println("Student Name :" + this.name);
        System.out.println("Student Mark :" + this.marks);
    }
}
