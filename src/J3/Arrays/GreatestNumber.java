package J3.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        // Kids With the Greatest Number of Candies
        // This question is stupid cause if I give all of my candies to a kid,
        // then I shouldn't have any candies to give to the other remaining kids :)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of an array: ");
        int n = scanner.nextInt();
        int[] candies = new int[n];

        System.out.println("Insert candies of each kid: ");
        for (int i = 0; i < candies.length; i++) {
            candies[i] = scanner.nextInt();
        }

        System.out.println("Insert extraCandies you have: ");
        int extraCandies = scanner.nextInt();

        System.out.println(maxCandies(candies, extraCandies));
    }

    public static List<Boolean> maxCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int maxCandies = Integer.MIN_VALUE;

        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;

    }
}
