package driver;

import java.util.Scanner;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Triangle;

public class ShapeCalculatorDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Choose shape type (0: Circle, 1: Rectangle, 2: Triangle): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Perimeter Circle: " + calculatePerimeter(circle));
                break;
            case 1:
                System.out.println("Perimeter Rectangle: " + calculatePerimeter(rectangle));
                break;
            case 2:
                System.out.println("Perimeter Triangle: " + calculatePerimeter(triangle));
                break;
            default:
                System.out.println("Choose not valid!");
        }

        scanner.close();
    }

    private static double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
