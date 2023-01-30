package J3.Arrays;

import java.util.Scanner;

public class CheckPangram {
    public static void main(String[] args) {
        // Check if the Sentence Is Pangram
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(checkPangram(sentence));

    }

    public static boolean checkPangram(String sentence) {
        for (int i = 0; i < 26; ++i) {
            char currChar = (char)('a' + i);

            if (sentence.indexOf(currChar) == -1)
                return false;
        }

        return true;
    }
}
