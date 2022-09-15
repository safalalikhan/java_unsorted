public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area(new Circle(1));
        s.area(new Rectangle(1,2));
        s.area((new Square(1)));
    }

}
