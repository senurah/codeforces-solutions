package Divisions.Div4.Round859;
//code by senurah
import java.util.Arrays;
import java.util.Scanner;

public class GrabtheCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);
            int mihai = 0, bianca = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (a[i] % 2 == 0) {
                    mihai += a[i];
                } else {
                    bianca += a[i];
                }
            }

            System.out.println(mihai > bianca ? "YES" : "NO");
        }

        scanner.close();
    }
}
