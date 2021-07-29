package com.obss.jss.day3.strings;

public class NewStringCreation1 {

    public static void main(String[] args) {

        // explicitly creates a new and referentially distinct instance of a String object
        String str1 = new String("a");

        // may reuse an instance from the string constant pool if one is available.
        String str2 = "a";

        String str3 = "a";
        String str4 = new String("a");

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str4: " + (str1 == str4));
        System.out.println("str2 == str3: " + (str2 == str3));
        System.out.println("str2 == str4: " + (str2 == str4));
    }
}
