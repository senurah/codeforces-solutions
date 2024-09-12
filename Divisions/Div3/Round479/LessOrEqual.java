package Divisions.Div3.Round479;
//code by senurah
import java.util.Arrays;
import java.util.Scanner;

public class LessOrEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (k == 0) {
            if (arr[0] > 1) {
                System.out.println(1);
            } else {
                System.out.println("-1");
            }
            return;
        }

        int x = arr[k - 1];

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                count++;
            }
        }

        if (count == k) {
            System.out.println(x);
        } else {
            System.out.println("-1");
        }
    }
}
