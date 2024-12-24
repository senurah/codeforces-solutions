package Divisions.Div3.Round644;

//code by senurah
import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] strengths = new int[n];

            for (int i = 0; i < n; i++) {
                strengths[i] = scanner.nextInt();
            }

            Arrays.sort(strengths);
            int minDifference = Integer.MAX_VALUE;

            for (int i = 1; i < n; i++) {
                minDifference = Math.min(minDifference, strengths[i] - strengths[i - 1]);
            }

            System.out.println(minDifference);
        }

        scanner.close();
    }
}
