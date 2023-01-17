package J1.FlowOfProgram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Input a year and find whether it is a leap year or not.
        System.out.print("Enter a Year : ");
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            System.out.println("Please insert an integer");
        } else {
            int year = scanner.nextInt();
            // 1st condition check- It is leap year and not
            // 2nd condition check - century leap year
            // 3rd condition check- It is century leap year
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println(year + " is a leap year");
            else
                System.out.println(year + " is not a leap year");
        }
    }
}
