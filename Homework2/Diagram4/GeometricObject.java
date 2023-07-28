package Homework2.Diagram4;

public class GeometricObject {
    protected String color;
    protected boolean filled;
    protected java.util.Date dateCreated;

    protected GeometricObject() {
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        if(color.isBlank()){
            this.color = color;
        }
    }

    protected boolean isFilled() {
        return filled;
    }

    protected void setFilled(boolean filled) {
        this.filled = filled;
    }

    protected java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    protected double getArea(){
        return 0;
    }

    protected double getPerimeter(){
        return 0;
    }
}
