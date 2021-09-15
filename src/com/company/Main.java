package com.company;
import java.util.Scanner;

public class Main {

    public static void squareRoot (double x0, double x1, double a) {
        double difference = 1.0001;
        boolean exit = false;
        while (!exit) {
            if ((x0 - x1) + 1 < difference) {
                System.out.println(x0);
                exit = true;
            } else {
                x0 = x1;
                x1 = (x0 + a / x0) / 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you want to find the square of: ");
        double a = scanner.nextDouble();
        double x0 = a/2;
        double x1 = (x0 + a/x0) / 2;

        squareRoot(x0, x1, a);
    }
}
