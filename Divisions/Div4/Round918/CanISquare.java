package Divisions.Div4.Round918;

//code by senurah
import java.util.Scanner;

public class CanISquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            long totalSquares = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                totalSquares += a[i];
            }
            long side = (long) Math.sqrt(totalSquares);
            if (side * side == totalSquares) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
