package J2.Functions;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        // Define a method to find out if a number is prime or not.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        checkPrime(number);
    }

    public static void checkPrime(int num) {
        boolean flag = false;

        if (num <= 1) {
            flag = true;
        }

        for (int i = 2; i <= num / 2; ++i) {
            // condition for non-prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
