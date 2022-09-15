public class Student {
    private String name,address;
    private int roll,marks;

    Student(int roll, String name,String address, int marks){
        this.address =address;
        this.marks = marks;
        this.name = name;
        this.roll = roll;
    }
    Student (){

    }

    public int getRoll() {
        return roll;
    }

    public String getAddress() {
        return address;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
