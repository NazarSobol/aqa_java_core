package aqa.core.lesson8.MykhailoOsadtsiv;

public class Rectange extends Shape {
    private double widht;
    private double height;

    public Rectange(String color, double widht, double height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return getHeight() * getWidht();
    }

    @Override
    public String toString() {
        return "This is Rectange, color: " + getShapeColor() +
                ", widht=" + String.format("%.0f", widht) +
                ", height=" + String.format("%.0f",height);
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
        System.out.println("Rectangle area is : " + String.format("%.0f", this.calcArea()));
    }
}
