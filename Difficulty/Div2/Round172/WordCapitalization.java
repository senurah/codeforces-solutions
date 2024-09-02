package Difficulty.Div2.Round172;
//code by senurah
import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
        scanner.close();
    }
}
