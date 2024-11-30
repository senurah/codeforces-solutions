package Divisions.Div4.Round928;
//code by senurah
import java.util.Scanner;
public class VladAndTheBestOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            int countA = 0, countB = 0;

            for (char c : input.toCharArray()) {
                if (c == 'A') countA++;
                else if (c == 'B') countB++;
            }

            if (countA > countB) System.out.println("A");
            else System.out.println("B");
        }

        scanner.close();
    }
}
