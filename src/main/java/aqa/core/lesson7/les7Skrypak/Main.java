package aqa.core.lesson7.les7Skrypak;

public class Main {
    public static void main (String[] args) {
        Shape shapeA = new Shape("white","Jane");
        System.out.println(shapeA);
        System.out.println(shapeA.calcArea());
        Circle circleA = new Circle("John", "blue", 35);
        System.out.println(circleA);
        System.out.println("Circle area is: " + circleA.calcArea());
        Rectangle rectangleA = new Rectangle("black", 7.8, 6.9);
        System.out.println(rectangleA);
        System.out.println("Rectangle area is: " + rectangleA.calcArea());
        Triangle triangleA = new Triangle("brown", "Jonny", 9.8, 7.9, 3.2);
        System.out.println(triangleA);
        System.out.println("Triangle area is: " + triangleA.calcArea());

        Shape[] arrFigures = new Shape[] {
                new Rectangle("neon", 4.5, 8.7),
                new Rectangle("blue", 9.8, 8.7),
                new Rectangle("pink", 3.5, 1.7),
                new Rectangle("milk", 2.5, 5.7),
                new Rectangle("coral", 6.9, 6.6),
                new Circle("John", "yellow", 88),
                new Circle("Minnie", "milky", 3),
                new Triangle("magenta", "Lola", 4, 5, 6),
                new Triangle("yellow", "Bob", 4, 5, 6)
        }
        for (Shape z: arrFigures) {
            System.out.println(z.toString() + " , area is" + z.calkArea());
        }


    }
}
