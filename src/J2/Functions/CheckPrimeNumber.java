package J2.Functions;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        // Define a method to find out if a number is prime or not.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (!checkPrime(number))
            System.out.println(number + " is not a prime number.");
        else
            System.out.println(number + " is a prime number.");
    }

    public static boolean checkPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; ++i) {
            // condition for non-prime number
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
