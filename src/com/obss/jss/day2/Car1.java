package com.obss.jss.day2;

public class Car1 {

    private String color;
    private int speed;

    public Car1() {

    }

    public Car1(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        speed += 5;
    }

}
