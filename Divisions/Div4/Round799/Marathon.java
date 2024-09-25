package Divisions.Div4.Round799;
//code by senurah
import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        if(t>=1 && t<=10000){
            for (int i = 0; i < t; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int d = scanner.nextInt();

                int count = 0;

                if (b > a) count++;
                if (c > a) count++;
                if (d > a) count++;

                System.out.println(count);
            }

        }

        scanner.close();
    }
}
