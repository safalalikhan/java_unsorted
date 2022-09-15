public class Main {

        public static void main(String[] args){
            System.out.println("Q1 ===============================");
            Bird b1 = new Parrot();

            b1.fly();

            Parrot p1 = (Parrot)b1;
            p1.sing();

            System.out.println("Q3 ===============================");
            Animal[] arr = new Animal[3];
            arr[0] = new Dog();
            arr[1] = new Cat();
            arr[2] = new Tiger();

            for(int i = 0 ; i < 3 ; i++){
                arr[i].eat();
                arr[i].walk();
                arr[i].makeNoise();
                System.out.println(">>>");
            }

        }

}
