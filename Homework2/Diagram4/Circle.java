package Homework2.Diagram4;

public class Circle extends GeometricObject{
    public double radius;

    public Circle() {
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 0;
        }
    }

    public double getDiameter() {
        return radius * 2;
    }
}
