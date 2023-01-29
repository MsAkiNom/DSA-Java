package J3.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayShuffle {
    public static void main(String[] args) {
        // Shuffle the Array
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[2*n];

        for (int i = 0; i < 2*n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(shuffleArray(nums, n)));

    }

    public static int[] shuffleArray(int[] nums, int n) {
        int[] ans = new int[2*n];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }

        return ans;
    }
}
