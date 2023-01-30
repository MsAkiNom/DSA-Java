package J3.Arrays;

import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        // Number of Good Pairs
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(goodPairs(nums));

    }

    public static int goodPairs(int[] nums) {
        int c = 0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
        }
        return c;
    }
}
