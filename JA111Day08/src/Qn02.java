public class Qn02 {
    /*
    When the call of an overridden method is handled during the runtime, it is known as Dynamic or runtime polymorphism;
    Here, the method is called using the reference variable of a parent class;
    i.e an overridden method of child is called using a parent class variable referring to a child.


    Eg :
    class Parent{
    void fun1(){
System.out.println("fun in Parent");
    }
    }
    class Child extends Parent(){
    @Override
    void fun1(){
System.out.println("fun in Child");
    }
    }
    // inside main >
    Parent p = new Child();  // here Upcasting is down automatically
    p.fun1(); // will give op as "fun in Child"

    > There is also runtime polymorphism in multilevel inheritance.
     */
}
