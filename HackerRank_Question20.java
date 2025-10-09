import java.util.Scanner;

public class Solution {

    /**
     * Returns the lexicographically smallest and largest substrings
     * of length k from the string s, separated by a newline.
     */
    public static String getSmallestAndLargest(String s, int k) {
        // Initialize smallest and largest to the first k-length substring
        String smallest = s.substring(0, k);
        String largest  = smallest;

        // Slide a window of length k over s
        for (int i = 1; i + k <= s.length(); i++) {
            String substr = s.substring(i, i + k);
            // Update smallest if current substring is lexicographically smaller
            if (substr.compareTo(smallest) < 0) {
                smallest = substr;
            }
            // Update largest if current substring is lexicographically larger
            if (substr.compareTo(largest) > 0) {
                largest = substr;
            }
        }

        // Return in the required format: smallest\nlargest
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k  = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
