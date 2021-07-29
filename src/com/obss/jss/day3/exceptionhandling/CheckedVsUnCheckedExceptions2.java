package com.obss.jss.day3.exceptionhandling;

import java.io.IOException;

public class CheckedVsUnCheckedExceptions2 {

    public static void main(String[] args) {

        double result = divide(5.0, 0.0);

        // readFile(); // checked exception is thrown, must be handled

        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static double divide(double num1, double num2) throws ArithmeticException {
        return num1 / num2;
    }

    public static void readFile() throws IOException {
        // some implementation
    }
}
