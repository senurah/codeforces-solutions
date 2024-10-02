package Divisions.Div3.Round974;
//code by senurah
import java.util.Scanner;

public class RobinHoodAndMajorOak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int startYear = Math.max(1, n - k + 1);

            int evenCount = (n / 2) - ((startYear - 1) / 2);
            int oddCount = (n - startYear + 1) - evenCount;

            if (oddCount % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


        scanner.close();
    }
}
