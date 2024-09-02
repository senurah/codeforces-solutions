package Divisions.Div4.Round827;
//code by senurah
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t >= 1 && t <= 9261) {
            for (int i = 0; i < t; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();


                if((a+b)==c){
                    System.out.println("YES");
                }else if((a+c)==b){
                    System.out.println("YES");
                } else if ((b+c)==a) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
        }

    }
}
