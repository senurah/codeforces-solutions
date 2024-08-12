package Difficulty.Level800;
//code by senurah
import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t >= 1 && t <= 10000) {
            for (int i = 0; i < t; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int rem = a % b;
                if (rem == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(b - rem);
                }
            }
        }
    }
}
