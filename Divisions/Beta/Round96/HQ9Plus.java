package Divisions.Beta.Round96;
//code by senurah
import java.util.Scanner;

public class HQ9Plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String program = scanner.next();
        if(program.contains("H") || program.contains("Q") || program.contains("9")) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
