package Difficulty.Div2.Round379;
//code by senurah
import java.util.Scanner;

public class AntonNDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String games = scanner.next();
        int anton = 0;
        int danik = 0;
        for (int i = 0; i < n; i++) {
            if (games.charAt(i) == 'A') {
                anton++;
            } else {
                danik++;
            }
        }
        if (anton > danik) {
            System.out.println("Anton");
        } else if (anton < danik) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        scanner.close();
    }
}
