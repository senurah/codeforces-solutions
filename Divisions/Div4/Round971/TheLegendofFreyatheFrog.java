package Divisions.Div4.Round971;
//code by senurah
import java.util.Scanner;
public class TheLegendofFreyatheFrog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int k = scanner.nextInt();

            int xJumps = (x + k - 1) / k;
            int yJumps = (y + k - 1) / k;

            int totalJumps = Math.max(xJumps * 2 - 1, yJumps * 2);

            System.out.println(totalJumps);
        }

        scanner.close();
    }
}
