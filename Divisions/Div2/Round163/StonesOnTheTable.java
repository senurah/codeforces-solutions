package Divisions.Div2.Round163;
//code by senurah
import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String stones = scanner.next();
        int removeCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (stones.charAt(i) == stones.charAt(i + 1)) {
                removeCount++;
            }
        }
        System.out.println(removeCount);
        scanner.close();
    }
}

