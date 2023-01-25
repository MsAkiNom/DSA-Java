package J2.Functions;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        // Write a program to print the factorial of a number by defining a method named 'Factorial'
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(factorial(number));

    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
           fact *= i;
        }
        return fact;
    }
}
