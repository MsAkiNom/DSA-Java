package J1.FlowOfProgram;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //To calculate Fibonacci Series up to n numbers
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fib(n);
    }

    public static void fib(int n) {
        int f0 = 0;
        int f1 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(f0 + " ");
            int fi = f0 + f1;
            f0 = f1;
            f1 = fi;
        }
    }
}
