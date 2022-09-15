public class Qn02 {
    /*
    Overloading methods and Overriding methods in java :
      > Overloading methods in used to implement static polymorphism in java,
        Overriding methods is used to implement runtime polymorphism in java;

      > overloading methods :
      methods or maybe constructors having the same name and inside the same class.
      conditions : same name, different parameter types,different number of parameters, different order of parameters.
      error will be shown by the compiler during compile time.

      > overriding methods :
      methods of same name in the parent and child class during inheritance.
      we have to make sure tp use Override keyword to make sure which method is to be called.
      can have same named methods and same set of parameters.
      will create confusion during runtime.

     */


    // EXAMPLE :
   /*
    > overloading :
    class Student {
    public void sum(int a, int b){
        int sum = a + b;
    }
    public void sum(int a, int b, int c){
        int sum = a + b + c;
    }
    public void sum(double a, double b){
        double sum = a + b;
    }
    }


    > overriding :
    class Student {
    public void sum(int a, int b){
        int sum = a + b;
    }

    }
    class Toppers extends Student {
    Override public void sum(int a, int b){
    int sum = a + b + 10;
    }
    }
    */
}
