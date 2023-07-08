package homework8.figure.mode;

public class Square extends Figure {
    private double length;
    private double result;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double figureArea() {
        result = Math.pow(length, 2);
        return result;
    }

    public String toString() {
        return "Square length: " + length;
    }
}
