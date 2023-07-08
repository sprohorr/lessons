package homework8.figure.mode;

public class Triangle extends Figure {
    private double baseOfTriangle;
    private double height;
    protected double result;

    public Triangle(double baseOfTriangle, double height) {
        this.height = height;
        this.baseOfTriangle = baseOfTriangle;
    }

    @Override
    public double figureArea() {
        result = (baseOfTriangle * height) / 2;
        return result;
    }

    public String toString() {
        return "Base of triangle: " + baseOfTriangle + ", Triangle height: "
                + height + ".";
    }


}
