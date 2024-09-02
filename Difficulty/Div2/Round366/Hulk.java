package Difficulty.Div2.Round366;
//code by senurah
import java.util.Scanner;
public class Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result.append("I hate");
            } else {
                result.append("I love");
            }

            if (i < n) {
                result.append(" that ");
            }
        }

        result.append(" it");
        System.out.println(result);
    }
}
