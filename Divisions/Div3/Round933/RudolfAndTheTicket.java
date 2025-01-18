package Divisions.Div3.Round933;
//code by senurah
import java.util.Scanner;

public class RudolfAndTheTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] left = new int[n];
            int[] right = new int[m];

            for (int i = 0; i < n; i++) {
                left[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                right[i] = sc.nextInt();
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (left[i] + right[j] <= k) {
                        count++;
                    }
                }
            }
            result.append(count).append("\n");
        }

        System.out.print(result);
        sc.close();
    }

}
