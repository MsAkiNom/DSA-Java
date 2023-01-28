package J2.Functions;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        // Write a function that returns the sum of first n natural numbers.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumOfNaturalNumbers = sum(n);
        System.out.println(sumOfNaturalNumbers);
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        if (n != 0) {
            return sum;
        } else {
            return -1;
        }
    }
}
