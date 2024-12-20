package Divisions.Div3.Round909;
//code  by senurah
import java.util.Scanner;

public class GameWithIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n % 3 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }

}
