package Divisions.Div3.Round642;

//code by senurah
import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            for (int i = 0; i < k && i < n; i++) {
                if (a[i] < b[n - 1 - i]) {
                    int temp = a[i];
                    a[i] = b[n - 1 - i];
                    b[n - 1 - i] = temp;
                } else {
                    break;
                }
            }

            int sum = 0;
            for (int num : a) {
                sum += num;
            }
            System.out.println(sum);
        }

        scanner.close();
    }
}
