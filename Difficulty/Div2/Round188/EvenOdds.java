package Difficulty.Div2.Round188;
//code by senurah
import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long result = 0;
        long half = (n + 1) / 2;
        if (k <= half) {
            result = 2 * k - 1;
        } else {
            result = 2 * (k - half);
        }

        System.out.println(result);
    }
}
