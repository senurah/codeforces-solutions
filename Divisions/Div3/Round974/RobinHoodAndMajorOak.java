package Divisions.Div3.Round974;
//code by senurah
import java.util.Scanner;

public class RobinHoodAndMajorOak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int year = scanner.nextInt();
            int leafLifespan = scanner.nextInt();

            int startYear = Math.max(1, year - leafLifespan + 1);

            int evenCount = (year / 2) - ((startYear - 1) / 2);
            int oddCount = (year - startYear + 1) - evenCount;

            if (oddCount % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
