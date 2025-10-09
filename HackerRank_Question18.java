import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Remove leading/trailing whitespace
        s = s.trim();

        // If the string is empty after trimming, there are no tokens
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Split on one or more non-letter characters
        String[] tokens = s.split("[^A-Za-z]+");

        // Print the number of tokens and then each token on its own line
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
