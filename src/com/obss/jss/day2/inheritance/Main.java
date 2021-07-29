package com.obss.jss.day2.inheritance;

public class Main {

    public static void main(String[] args) {


        Animal cat = new Cat(2, "meow");

        System.out.println("Cat toString is: " + cat);

        Animal fish = new Fish(1);

       cat.makeSound();
       fish.makeSound();

       cat.makeDifferentSound();

       int a = Cat.x;

       Cat cat2 = new Cat(4, "meow");
       cat2.makeCatSound();
       // cat.makeCatSound(); // compile error
    }
}
