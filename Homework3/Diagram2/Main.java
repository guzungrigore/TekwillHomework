package Homework3.Diagram2;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        System.out.println(c1.getArea());

        System.out.println("---------");

        Circle c2 = new Circle(2.0);
        System.out.println(c2.getRadius());
        System.out.println(c2.getColor());
        System.out.println(c2.getArea());

        System.out.println("---------");

        Circle c3 = new Circle();
        System.out.println(c3.getRadius());
        System.out.println(c3.getColor());
        System.out.println(c3.getArea());
    }
}
