package Divisions.Beta.Round85;
//code by senurah
import java.util.Scanner;
public class PetyaNStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next().toLowerCase();
        String second = scanner.next().toLowerCase();
        int result = first.compareTo(second);
        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        scanner.close();


    }
}
