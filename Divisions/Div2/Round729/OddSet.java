package Divisions.Div2.Round729;

//code by senurah
import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int evenCount = 0, oddCount = 0;

            for (int i = 0; i < 2 * n; i++) {
                int num = scanner.nextInt();
                if (num % 2 == 0) evenCount++;
                else oddCount++;
            }

            if (evenCount == oddCount) System.out.println("Yes");
            else System.out.println("No");
        }

        scanner.close();
    }
}
