package Divisions.Div4.Round790;

//code by senurah
import java.util.Scanner;
public class EqualCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            int minCandies = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (arr[j] < minCandies) {
                    minCandies = arr[j];
                }
            }

            int totalCandiesEaten = 0;
            for (int j = 0; j < n; j++) {
                totalCandiesEaten += (arr[j] - minCandies);
            }

            System.out.println(totalCandiesEaten);
        }

        scanner.close();
    }
}
