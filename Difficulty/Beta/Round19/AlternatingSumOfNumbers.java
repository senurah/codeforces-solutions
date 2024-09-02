package Difficulty.Beta.Round19;
//code by senurah
import java.util.Scanner;
public class AlternatingSumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        if(t>=1 && t<=1000){
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int sum = 0;

                if(n>=1 && n<=50){
                    for (int j = 0; j < n; j++) {
                        int num = sc.nextInt();
                        if (j % 2 == 0) {
                            sum += num;
                        } else {
                            sum -= num;
                        }
                    }

                    System.out.println(sum);
                }
            }

            sc.close();

        }


    }
}

