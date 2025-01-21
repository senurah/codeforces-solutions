package Divisions.Div2.Round893;

import java.util.Scanner;

public class ButtonsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + c > b) {
                result.append("First\n");
            } else {
                result.append("Second\n");
            }
        }
        System.out.print(result);
    }
}
