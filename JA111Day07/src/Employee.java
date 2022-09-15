public class Employee extends Member{
    String specialisation;
    String department;

    Employee(String name,int age, String number, String address, double salary,String specialisation, String department) {
        super(name, age,number, address, salary);
        this.specialisation = specialisation;
        this.department = department;

    }
    Employee(){

    }
    public void printDetails(){
        System.out.println("Name :" + super.name);
        System.out.println("Age :" + super.age);
        System.out.println("Number :" + super.number);
        System.out.println("Address :" + super.address);
        System.out.println("Salary :" + super.salary);
        System.out.println("Specialisation :" + this.specialisation);
        System.out.println("Department :" + this.department);

    }

}
