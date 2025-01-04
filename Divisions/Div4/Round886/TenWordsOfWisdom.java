package Divisions.Div4.Round886;
//code by senurah
import java.util.Scanner;

public class TenWordsOfWisdom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int winnerIndex = 1;
            int maxQuality = -1;

            for (int i = 1; i <= n; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (a <= 10 && b > maxQuality) {
                    maxQuality = b;
                    winnerIndex = i;
                }
            }

            System.out.println(winnerIndex);
        }

        scanner.close();
    }
}

