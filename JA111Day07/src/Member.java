public class Member {
    String name;
    int age;
    String number;
    String address;
    double salary;

    Member(String name,int age, String number, String address,double salary){
        this.name = name;
        this.age = age;
        this.number = number;
        this.address = address;
        this.salary = salary;
    }
    Member(){

    }
    public void printSalary(){
        System.out.println("Salary of " +this.name + " is :" +this.salary);
    }

}
