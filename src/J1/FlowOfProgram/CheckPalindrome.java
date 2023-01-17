package J1.FlowOfProgram;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        // Find out whether the given integer is Palindrome or not
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.print(isPalindrome(number));
    }

    public static boolean isPalindrome(int x) {
        if ((x % 10 == 0 && x != 0) || x < 0) {
            return false;
        }
        int reverseN = 0;
        while (x > reverseN) {
            reverseN = reverseN * 10 + x % 10;
            x /= 10;
        }

        return x == reverseN || x == reverseN / 10;

    }

}
