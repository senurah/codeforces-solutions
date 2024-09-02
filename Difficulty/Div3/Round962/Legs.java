package Difficulty.Div3.Round962;

import java.util.Scanner;

public class Legs {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if ((t >= 1) && (t <= 1000)) {

            for (int i = 0; i < t; i++) {

                int n = scanner.nextInt();

                int count = 0;

                if ((n >= 2) && (n <= 2000)) {

                    if (n % 4 == 0) {
                        count = n / 4;

                    } else if ((n % 4) % 2 == 0) {
                        count = (n / 4) + ((n % 4) / 2);
                    } else if (n % 2 == 0) {
                        count = n % 2;
                    }


                }

                System.out.println(count);


            }
        }

    }
}
