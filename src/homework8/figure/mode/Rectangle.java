package homework8.figure.mode;

public class Rectangle extends Figure {
    private double length;
    private double width;
    private double result;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double figureArea() {
        result = length * width;
        return result;
    }

    public String toString() {
        return "Rectangle length: " + length + " Rectangle width: " + width;
    }
}
