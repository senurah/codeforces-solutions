package Divisions.Beta.Round55;
//code by senurah
import java.util.Scanner;
public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int upper = 0;
        int lower = 0;
        for(int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upper++;
            } else {
                lower++;
            }
        }
        if(upper > lower) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
        scanner.close();
    }
}
