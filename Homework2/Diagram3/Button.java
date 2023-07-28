package Homework2.Diagram3;

public class Button {
    public float x, y;
    public float w, h;
    public color selectedColor;
    public color defaultColor;
    public boolean selected;
    public String label;

    public Button(float x, float y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public void display() {
        System.out.println("X: " + x + " Y: " + y);
        System.out.println("W: " + w + " H: " + h);
    }

    public void clicked(int x, int y) {
        if (x < this.x + this.w/2 && x > this.x - this.w/2 && y < this.y + this.h/2 && y > this.y - this.h/2) {
            System.out.println("You clicked the button");
        }
    }
}
