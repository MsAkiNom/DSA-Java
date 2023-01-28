package J2.Functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        // Write a function to check if a given triplet is a Pythagorean triplet or not.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean isTriplet = tripletExists(a, b, c);
        if (isTriplet) {
            System.out.println("Triplet exists");
        } else {
            System.out.println("Triplet doesn't exist");
        }

    }

    public static boolean tripletExists(int a, int b, int c) {
        a = a * a; b = b * b; c = c * c;

        return a == b + c || b == c + a || c == a + b;
    }
}
