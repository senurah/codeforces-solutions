package Difficulty.Div2.Round295;
//code by senurah
import java.util.Scanner;
import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n >= 26) {
            String stringLine = scanner.nextLine().toLowerCase().trim();
            HashSet<Character> letters = new HashSet<>();

            for (char c : stringLine.toCharArray()) {
                if (Character.isLetter(c)) {
                    letters.add(c);
                }
            }

            if (letters.size() == 26) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
