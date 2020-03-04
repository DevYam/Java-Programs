// This is a simple example to demonstrate the working of parameterized constructor

class Triangle{
    double sideA;
    double sideB;
    double sideC;

    // Constructor to calculate area for the equilateral triangle
    // With one parameter
    Triangle(double side){
        sideA = sideB = sideC = side;
        System.out.println("Area of equilateral triangle "+(sideA*sideB*sideC));
    }

    // Constructor to calculate area for the isosceles triangle
    //with two parameter
    Triangle(double side1, double side2){
        sideA = side1;
        sideB = side1;
        sideC = side2;
        System.out.println("Area of isosceles triangle "+(sideA*sideB*sideC));
    }

    // Constructor to calculate area for the scalene triangle
    // With three parameters
    Triangle(double side1,double side2, double side3){
        sideA = side1;
        sideB = side2;
        sideC = side3;
        System.out.println("Area of scalene triangle "+(sideA*sideB*sideC));
    }
}

public class parameterizedConstructor {
    public static void main(String[] args) {
        Triangle equilateral = new Triangle(12);  // Constructor with one parameter is called
        Triangle isosceles = new Triangle(12,13);   // Constructor with two parameter is called
        Triangle scalene = new Triangle(12,13,14);  // constructor with three parameter is called

    }
}
