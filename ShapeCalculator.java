package mathmethod;
import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Circle =====
        System.out.println("=== Circle ===");
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double circleArea = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;
        System.out.println("Area of Circle = " + circleArea);
        System.out.println("Circumference of Circle = " + circleCircumference);
        System.out.println();

        // ===== Rectangle =====
        System.out.println("=== Rectangle ===");
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        double rectangleArea = length * breadth;
        double rectanglePerimeter = 2 * (length + breadth);
        System.out.println("Area of Rectangle = " + rectangleArea);
        System.out.println("Perimeter of Rectangle = " + rectanglePerimeter);
        System.out.println();

        // ===== Square =====
        System.out.println("=== Square ===");
        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();
        double squareArea = side * side;
        double squarePerimeter = 4 * side;
        System.out.println("Area of Square = " + squareArea);
        System.out.println("Perimeter of Square = " + squarePerimeter);
        System.out.println();

        // ===== Triangle =====
        System.out.println("=== Triangle ===");
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        double triangleArea = 0.5 * base * height;
        double trianglePerimeter = a + b + c;
        System.out.println("Area of Triangle = " + triangleArea);
        System.out.println("Perimeter of Triangle = " + trianglePerimeter);

        sc.close();
    }
}

