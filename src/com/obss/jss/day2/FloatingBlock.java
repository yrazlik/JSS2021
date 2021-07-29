package com.obss.jss.day2;

public class FloatingBlock {

    private static int i = 5;
    private int x;

    {
        System.out.println("Inside floating block");
        x = 20;
    }

    static {
        System.out.println("Inside static floating block");
        i = 44;
    }

    public static int getI() {
        return i;
    }

    public int getX() {
        return x;
    }
}
