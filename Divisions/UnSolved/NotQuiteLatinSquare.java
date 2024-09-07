package Divisions.UnSolved;
//code by senurah
import java.util.HashSet;
import java.util.Scanner;

public class NotQuiteLatinSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        if (t >= 1 && t <= 108) {
            for (int i = 0; i < t; i++) {
                for (int k = 0; k < 3; k++) {
                    HashSet<Character> row = new HashSet<>();
                    String line = scanner.nextLine();

                    for (int j = 0; j < 3; j++) {
                        char currentChar = line.charAt(j);
                        if (currentChar != '?') {
                            row.add(currentChar);
                        }
                    }

                    if (row.size() == 2) {
                        if (row.contains('A') && row.contains('B')) {
                            System.out.println("C");
                        } else if (row.contains('A') && row.contains('C')) {
                            System.out.println("B");
                        } else {
                            System.out.println("A");
                        }
                        break;
                    }
                }
            }
        }

        scanner.close();
    }
}
