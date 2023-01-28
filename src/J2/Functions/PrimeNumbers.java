package J2.Functions;

import java.util.Scanner;

import static J2.Functions.CheckPrimeNumber.checkPrime;

public class PrimeNumbers {
    public static void main(String[] args) {
        // Write a function that returns all prime numbers between two given numbers.
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        primeNumbers(n1, n2);

    }

    public static void primeNumbers(int num1, int num2) {

        for (int i = num1; i <= num2; i++) {
           if (checkPrime(i)) {
               System.out.print(i +" ");
           }
        }

    }
}
