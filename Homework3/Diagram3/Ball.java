package Homework3.Diagram3;

public class Ball implements Tossable{
    public String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public void toss() {
        System.out.println(this.getClass().getSimpleName() + " has been thrown");
    }

    public void bounce() {
        System.out.println(this.getClass().getSimpleName() + " is bouncing");
    }
}
