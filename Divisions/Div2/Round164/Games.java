package Divisions.Div2.Round164;
//code by senurah
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] homeUniform = new int[n];
        int[] guestUniform = new int[n];

        for (int i = 0; i < n; i++) {
            homeUniform[i] = sc.nextInt();
            guestUniform[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && homeUniform[i] == guestUniform[j]) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
