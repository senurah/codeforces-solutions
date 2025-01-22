package Divisions.Beta.Round8;
//code by senurah
import java.util.Scanner;

public class Cplusequal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int count = 0;

            while (a <= n && b <= n) {
                if (a < b) {
                    a += b;
                } else {
                    b += a;
                }
                count++;
            }
            result.append(count).append("\n");
        }

        System.out.print(result);
    }
}

