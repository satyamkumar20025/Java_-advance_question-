import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        // 1. Sum of lengths
        System.out.println(a.length() + b.length());

        // 2. Lexicographical comparison
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");

        // 3. Capitalize first letter of each
        String aCap = a.substring(0, 1).toUpperCase() + a.substring(1);
        String bCap = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(aCap + " " + bCap);
    }
}
