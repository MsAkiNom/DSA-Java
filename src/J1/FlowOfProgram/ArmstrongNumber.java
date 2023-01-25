package J1.FlowOfProgram;

import java.util.Scanner;

public class ArmstrongNumber {
    // Find Armstrong number between two given number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        checkArmstrong(number1);
        checkArmstrong(number2);

    }

    public static void checkArmstrong(int n) {
        int result = 0;
        int originalNumber = n;
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if (result == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }

}
