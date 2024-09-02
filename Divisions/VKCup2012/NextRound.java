package Divisions.VKCup2012;

import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();


        if((1<= n) && (n<=50) && (1<= k) && (k<=50)){

            int[] marksArray = new int[n];
            for (int i = 0; i < n; i++) {
                marksArray[i] = scanner.nextInt();
            }

            int kthPlaceScore = marksArray[k - 1];
            int count = 0;

            for (int score : marksArray) {
                if (score >= kthPlaceScore && score > 0) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
