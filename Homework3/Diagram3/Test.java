package Homework3.Diagram3;

public class Test {
    public static void main(String[] args) {
        Football football = new Football("Adidas");
        System.out.println(football.getBrandName());
        football.toss();
        football.bounce();

        Baseball baseball = new Baseball("Baseball");
        System.out.println(baseball.getBrandName());
        baseball.toss();
        baseball.bounce();

        Ball ball = new Ball("Ball");
        System.out.println(ball.getBrandName());
        ball.bounce();
    }
}
