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

