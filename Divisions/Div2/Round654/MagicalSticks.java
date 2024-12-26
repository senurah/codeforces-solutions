package Divisions.Div2.Round654;

//code by senurah
import java.util.Scanner;

public class MagicalSticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println((n + 1) / 2);
        }

        scanner.close();
    }
}
