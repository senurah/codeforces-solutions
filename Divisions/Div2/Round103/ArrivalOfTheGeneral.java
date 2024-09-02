package Divisions.Div2.Round103;
//code by senurah
import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=2 && n<=100) {

            int[] soldiers = new int[n];
            for (int i = 0; i < n; i++) {
                soldiers[i] = scanner.nextInt();
            }

            int min = soldiers[0];
            int max = soldiers[0];
            int minIndex = 0;
            int maxIndex = 0;

            for (int i = 0; i < n; i++) {
                if (soldiers[i] <= min) {
                    min = soldiers[i];
                    minIndex = i;
                }

                if (soldiers[i] > max) {
                    max = soldiers[i];
                    maxIndex = i;
                }
            }

            if (minIndex < maxIndex) {
                System.out.println(maxIndex + (n - 1 - minIndex) - 1);
            } else {
                System.out.println(maxIndex + (n - 1 - minIndex));
            }

        }
    }

}
