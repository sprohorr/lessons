package homework8.figure.mode;

public class Circle extends Figure {
    private double radius;
    private double pi = 3.14;
    private double result;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double figureArea() {
        result = pi * Math.pow(radius, 2);
        return result;
    }

    public String toString() {
        return "Circle radius: " + radius;
    }
}
