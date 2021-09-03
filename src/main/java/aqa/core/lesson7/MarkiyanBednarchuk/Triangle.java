package aqa.core.lesson7.MarkiyanBednarchuk;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        double sqrtS = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(sqrtS);
    }

    @Override
    public String toString() {
        return "This is Triangle, colour is: " + getShapeColor() + ", a=" + a + ", b=" + b + ", c=" + c;
    }
}