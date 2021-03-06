package aqa.core.lesson8.MykhailoOsadtsiv;

public class Triangle extends Shape implements Comparable {
    private double a, b, c;


    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calcArea() {
        double p = ( a + b + c ) / 2;
        double sqrtS = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(sqrtS);
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " + getShapeColor() +
                ", a=" + String.format("%.0f", a ) +
                ", b=" + String.format("%.0f", b ) +
                ", c=" + String.format("%.0f", c);
    }

    @Override
    public void draw() {
        System.out.println(this.toString() +
                ", area is : " + String.format("%.3f", this.calcArea()));
    }

    @Override
    public int compareTo(Shape obj) {
        if (this.calcArea() > obj.calcArea()) {
            return 1;
        } else if (this.calcArea() == obj.calcArea()) {
            return 0;
        } else return -1;
    }

    @Override
    public int compare (Shape obj) {
        return (this.getShapeColor().compareTo(obj.getShapeColor()));
    }
}
