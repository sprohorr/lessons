package homework8.figure;

import homework8.figure.mode.Circle;
import homework8.figure.mode.Rectangle;
import homework8.figure.mode.Square;
import homework8.figure.mode.Triangle;

import java.util.Scanner;

public class FigureRunner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(15, 5);
        Rectangle rectangle = new Rectangle(5, 15);
        Square square = new Square(2);
        Circle circle = new Circle(5);

        System.out.println(triangle + " Area of a triangle = " + triangle.figureArea());
        System.out.println(rectangle + " Area of a rectangle = " + rectangle.figureArea());
        System.out.println(square + " Area of a square = " + square.figureArea());
        System.out.println(circle + " Area of a circle = " + circle.figureArea());


        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter figure number:");
            System.out.println("1 - Triangle");
            System.out.println("2 - Rectangle");
            System.out.println("3 - Square");
            System.out.println("4 - Circle");
            System.out.println("0 - End");
            int number = scanner.nextInt();

            switch (number) {
                case 0 -> System.out.println("{End!}");
                case 1 -> System.out.println(triangle + " Area of a triangle = " + triangle.figureArea());
                case 2 -> System.out.println(rectangle + " Area of a rectangle = " + rectangle.figureArea());
                case 3 -> System.out.println(square + " Area of a square = " + square.figureArea());
                case 4 -> System.out.println(circle + " Area of a circle = " + circle.figureArea());
                default -> System.out.println("{Invalid input!}");
            }
            if (number == 0) break;

        }
    }
}
