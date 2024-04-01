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

        System.out.println("Pilih jenis bentuk (0: Lingkaran, 1: Persegi Panjang, 2: Segitiga): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Keliling Lingkaran: " + calculatePerimeter(circle));
                break;
            case 1:
                System.out.println("Keliling Persegi Panjang: " + calculatePerimeter(rectangle));
                break;
            case 2:
                System.out.println("Keliling Segitiga: " + calculatePerimeter(triangle));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }

    private static double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
