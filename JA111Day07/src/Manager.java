public class Manager extends Member{
    String specialisation;
    String department;

    Manager(String name,int age, String number, String address, double salary,String specialisation, String department) {
        super(name,age, number, address, salary);
        this.specialisation = specialisation;
        this.department = department;

    }
    Manager(){

    }
    public void printDetails(){
        System.out.println("Name :" + this.name);
        System.out.println("Age :" + this.age);
        System.out.println("Number :" + this.number);
        System.out.println("Address :" + this.address);
        System.out.println("Salary :" + this.salary);
        System.out.println("Specialisation :" + this.specialisation);
        System.out.println("Department :" + this.department);

    }
}
