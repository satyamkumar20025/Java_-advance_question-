import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt(); // Number of queries

        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = a;
            for (int j = 0; j < n; j++) {
                result += (int) Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
