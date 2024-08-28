package Difficulty.LevelUnrated;
//code by senurah
import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = 6 - (a + b);

        System.out.println(c);

        sc.close();
    }
}
