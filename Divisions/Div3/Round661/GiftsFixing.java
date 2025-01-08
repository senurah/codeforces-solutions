package Divisions.Div3.Round661;
//code by senurah
import java.util.Scanner;

public class GiftsFixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] < minA) minA = a[i];
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (b[i] < minB) minB = b[i];
            }
            long moves = 0;
            for (int i = 0; i < n; i++) {
                int da = a[i] - minA;
                int db = b[i] - minB;
                moves += Math.max(da, db);
            }
            System.out.println(moves);
        }
        sc.close();
    }
}

