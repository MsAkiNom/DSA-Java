package J3.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayPermutation {
    public static void main(String[] args) {
        // Build Array from Permutation
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i <= nums.length - 1; i++)
        {
            nums[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(ArrayPermutation(nums)));
    }

    public static int[] ArrayPermutation(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i <= nums.length - 1; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
