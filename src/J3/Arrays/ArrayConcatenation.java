package J3.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcatenation {
    public static void main(String[] args) {
        // Concatenation of Array
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(concatenatedArray(nums)));

    }

    public static int[] concatenatedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];

        }

        return ans;
    }
}
