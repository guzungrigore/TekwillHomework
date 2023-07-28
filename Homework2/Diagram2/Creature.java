package Homework2.Diagram2;

import java.util.Random;

public class Creature {
    protected float x,y;
    protected float lifeforce;
    protected PShape s;

    protected Creature(float x, float y, PShape s) {
        this.x = x;
        this.y = y;
        this.s = s;
    }

    protected void display() {
        System.out.println("Current position is X: " + x + " and Y: " + y);
    }

    protected void move() {
        Random random = new Random();
        x += random.nextInt(5) + 1;
        y += random.nextInt(5) + 1;
    }

    protected void attack(Creature c) {
        c.lifeforce-= 10;
    }
}
