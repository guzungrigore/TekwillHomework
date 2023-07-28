package Homework2.Diagram4;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }
}
