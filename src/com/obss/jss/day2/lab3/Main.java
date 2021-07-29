package com.obss.jss.day2.lab3;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10, "red");
        Rectangle rectangle = new Rectangle(10, 20, "blue");

        double areaOfCircle = circle.draw();
        double areaOfRectangle = rectangle.draw();

        System.out.println("Area of circle is: " + areaOfCircle);
        System.out.println("Area of rectangle is: " + areaOfRectangle);

    }
}
