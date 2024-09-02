package Divisions.Div4.Round964;
//code by senurah
import java.util.Scanner;

public class Showering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t >= 1 && t <= 10000) {
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                int s = scanner.nextInt();
                int m = scanner.nextInt();

                int[] low = new int[n];
                int[] high = new int[n];

                if(n>=1 && n<=(2*100000)){

                    for (int j = 0; j < n; j++) {
                        low[j] = scanner.nextInt();
                        high[j] = scanner.nextInt();
                    }
                    boolean shower = false;

                    if (low[0] >= s) {
                        shower = true;
                    }

                    for (int j = 1; j < n; j++) {
                        if (low[j] - high[j - 1] >= s) {
                            shower = true;
                            break;
                        }
                    }

                    if (m - high[n - 1] >= s) {
                        shower = true;
                    }

                    if (shower) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }

                }

            }
            scanner.close();

        }

    }
}

