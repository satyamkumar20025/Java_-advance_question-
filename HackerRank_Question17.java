import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());
        
        for (int i = 0; i < T; i++) {
            String regex = sc.nextLine();
            try {
                // Try to compile the regex
                Pattern.compile(regex);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                // If a syntax error occurs, it's invalid
                System.out.println("Invalid");
            }
        }
        
        sc.close();
    }
}
