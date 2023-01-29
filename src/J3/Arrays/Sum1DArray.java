package J3.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum1DArray {
    public static void main(String[] args) {
        // Running Sum of 1d Array
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(sum(nums)));

    }

    public static int[] sum(int[] nums) {
        int[] runningSum = new int[nums.length];

        runningSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {

            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;

    }
}
