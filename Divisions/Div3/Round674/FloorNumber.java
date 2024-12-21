package Divisions.Div3.Round674;
//code by senurah
import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            if (n <= 2) {
                System.out.println(1);
            } else {
                int floor = (int) Math.ceil((double) (n - 2) / x) + 1;
                System.out.println(floor);
            }
        }
        scanner.close();
    }
}