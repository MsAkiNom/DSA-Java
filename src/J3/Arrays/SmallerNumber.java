package J3.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerNumber {
    public static void main(String[] args) {
        // How Many Numbers Are Smaller Than the Current Number
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(smallerNumber(nums)));

    }

    public static int[] smallerNumber(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int count = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
