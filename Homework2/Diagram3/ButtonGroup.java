package Homework2.Diagram3;

public class ButtonGroup {
    public int activeButton;
    public Button[] buttons;

    public ButtonGroup(Button[] buttons) {
        this.buttons = buttons;
    }

    public void display() {
        for (Button button : buttons) {
            System.out.println(button);
        }
    }

    public void clicked (int x, int y) {
        for (Button button : buttons) {
            button.clicked(x,y);
        }
    }

}
