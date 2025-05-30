import java.util.Scanner;
class InputScanner{
    Scanner sc = new Scanner(System.in);
}

abstract class Shape extends InputScanner{
    double dim1;
    double dim2;
    abstract double printArea();
}
class Rectangle extends Shape{

    Rectangle(){
        System.out.println("Enter the dimensions of the Rectangle: ");
    	super.dim1 = sc.nextInt();
    	super.dim2 = sc.nextInt();
    }

    double printArea(){
        System.out.println("\nArea of rectangle: ");
        return(dim1 * dim2);
    }
}

class Triangle extends Shape{

    Triangle (){
    System.out.println("Enter the dimensions of the Triangle: ");
    super.dim1 = sc.nextInt();
    super.dim2 = sc.nextInt();
    }

    double printArea(){
        System.out.println("Area of Triangle: ");
        return 0.5 * dim1 * dim2;
    }
}

class Circle extends Shape{
    Circle (){
    System.out.println("Enter the dimension (radius) of the Circle: ");
    super.dim1 = sc.nextInt();
    }

    double printArea(){
        System.out.println("Area of Circle: ");
        return 3.14*dim1*dim1;
    }
}
class AbstractDemo{
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle ();

        Shape figref; //This is OK, no object is created

        figref = r;
        System.out.println("Area is: "+figref.printArea()+"\n");

        figref = t;
        System.out.println("Area is: "+ figref.printArea()+"\n");

        figref = c;
        System.out.println("Area is: "+figref.printArea()+"\n");
    }
}
