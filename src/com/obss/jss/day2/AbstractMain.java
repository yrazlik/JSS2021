package com.obss.jss.day2;

public class AbstractMain {

    public static void main(String[] args) {

        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void sort() {
                System.out.println("anonymous class sort impl.");
            }
        };

        abstractClass.sort();

        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.sort();;
    }
}
