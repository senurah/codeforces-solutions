package Divisions.Div3.Round891;
//code by senurah
import java.util.Scanner;
import java.util.Arrays;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            if (sum % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
