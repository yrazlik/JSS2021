package com.obss.jss.day2;

public class InstantiatingClasses4 {

    public static void main(String[] args) {
        Car1 car1 = new Car1("red", 90);

        Car1 anotherCar1 = car1;

        System.out.println(car1 == anotherCar1);

        car1.setColor("blue");

        System.out.println("Color of anotherCar is: " + anotherCar1.getColor());

        car1 = new Car1("orange", 100);

        System.out.println("Color of car is: " + car1.getColor());
        System.out.println("Color of anotherCar is: " + anotherCar1.getColor());
    }
}
