import java.sql.SQLOutput;

public class Shapes {

    public void area(Circle circle){
        System.out.println("Area of circle :"+ (22/7 * circle.radius * circle.radius));
    }
    public void area(Rectangle rectangle){
        System.out.println("Area of rectangle :"+ (rectangle.length * rectangle.breadth));
    }
    public void area(Square square){
        System.out.println("Area of square :"+ (square.side* square.side));
    }
}
/*
Static polymorphism in java is achieved through method overloading.
i.e creation of methods with the same name but with different parameters
(different order or different type or different return type)


 */