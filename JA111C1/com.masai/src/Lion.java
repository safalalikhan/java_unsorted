public class Lion {
    static int totalDeaths = 0;
    static void printKillings(){
        System.out.println("Total killings by lions in jungle = "+ totalDeaths);
    }
    String name;
    boolean isHungry;
    int age;

    Lion(String n,int a,boolean h){
        this.name = n;
        this.age = a;
        this.isHungry = h;
    }
    public void thinking(){
        if(!this.isHungry){
            System.out.println(this.name + " is sleeping");
        }
        else if(this.age > 12){
            totalDeaths += 2;
            System.out.println(this.name + " has eaten two animal");
        }
        else if( this.age <= 12 && this.age >=2 ){
            totalDeaths += 1;
            System.out.println(this.name + " has eaten one animal");
        }
        else {
            System.out.println(this.name + " is calling Mom");
        }
    }
    public static  void main(String[] args){
        Lion lion1 = new Lion("Nrupul",13,false);
        Lion lion2 = new Lion("Yogeshl",14,true);
        Lion lion3 = new Lion("Ankush",10,true);
        Lion lion4 = new Lion("Safal",1,true);
        lion1.thinking();
        lion2.thinking();
        lion3.thinking();
        lion4.thinking();

        printKillings();

    }

}
