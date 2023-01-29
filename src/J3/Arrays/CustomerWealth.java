package J3.Arrays;

import java.util.Scanner;

public class CustomerWealth {
    public static void main(String[] args) {
        // Richest Customer Wealth
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Insert the number of columns: ");
        int columns = scanner.nextInt();

        int[][] accounts = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                accounts[i][j] = scanner.nextInt();
            }
        }

        System.out.println(maxCustomerWealth(accounts));

    }

    public static int maxCustomerWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int customerWealthSum = 0;

            for (int i : account) {
                customerWealthSum += i;
            }

            if (customerWealthSum > maxWealth) {
                maxWealth = customerWealthSum;
            }

        }

        return maxWealth;
    }
}
