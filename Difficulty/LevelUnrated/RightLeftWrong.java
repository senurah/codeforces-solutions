package Difficulty.LevelUnrated;

import java.util.Scanner;

public class RightLeftWrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t >= 1 && t <= 10000) {

            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                int[] numbs = new int[n];
                for(int j = 0; j< n; j++){
                    numbs[j] = scanner.nextInt();
                }
                scanner.nextLine();
                String [] dirr = scanner.nextLine().split("");




            }
        }
    }
}
