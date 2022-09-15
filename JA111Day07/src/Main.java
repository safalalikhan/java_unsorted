public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Safal",26,"8137888877","ZameerManzil",10000,"Employee","Backend");
        Manager m = new Manager("Akshara",23,"9447231344","Chempakaparamb",20000,"Manager","Accounts");
        e.printDetails();
        e.printSalary();
        m.printDetails();
        m.printSalary();
    }
}
