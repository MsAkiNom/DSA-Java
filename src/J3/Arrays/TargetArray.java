package J3.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TargetArray {
    public static void main(String[] args) {
        // Create Target Array in the Given Order
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];
        int[] index = new int[scanner.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < index.length; i++) {
            index[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(targetArray(nums, index)));


    }

    public static int[] targetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }

        for(int i = 0; i < target.size(); i++){
            ans[i] = target.get(i);
        }

        return ans;
    }
}
