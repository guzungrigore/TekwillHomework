package Homework3.Diagram4;

public class CDPlayer implements Player{
    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " started playing");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " stopped playing");
    }

    @Override
    public void pause() {
        System.out.println(this.getClass().getSimpleName() + " paused");
    }

    @Override
    public void reverse() {
        System.out.println(this.getClass().getSimpleName() + " reversing");
    }
}
