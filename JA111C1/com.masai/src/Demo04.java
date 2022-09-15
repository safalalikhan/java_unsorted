public class Demo04 {
    /*
    Static Variables :
    These are associated with the class directly and not the objects of the class.
    It has only single instance for all the objects created for the class.
    Any changes made to the static variables using one object will reflect for all the other objects also.
    It is created or memory allocated during compile time.
    Belongs to the class.
    Declared using static keyword.
    eg : <classname>.<variablename> ;

    Non-Static Variables :
    These are specified for each object created for the class.
    Every object has there on instances for a non-static variable.
    It is created or memory is allocated during the creation of the object or runtime.
    Belongs to the object of the class.
    Declared without static keyword.
    eg : <objectname>.<variablename> ;

     */

    // Methods can also be declared as static and non-static, by default the variables and methods are non-static,
    // We use static keyword to make the member of Class as static.

    /*
    public class Bank {
        static int bankTotal = 0;
        int balance;

    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        b1.bankTotal = 100;
        b1.balance = 100;
        b2.bankTotal = 200;
        b2.balance = 200;

        System.out.println(b1.balance+"-"+b1.bankTotal); // output > 100-200
        System.out.println(b2.balance+"-"+b2.bankTotal); // output > 200-200

        Bank.bankTotal = 500;
        System.out.println(b1.balance+"-"+ b1.bankTotal); // output > 100-500
        System.out.println(b2.balance+"-"+ b2.bankTotal); // output > 200-500

    }
}
     */
}
