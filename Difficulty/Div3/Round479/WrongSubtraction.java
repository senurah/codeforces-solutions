package Difficulty.Div3.Round479;
//code by senurah

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if(n>=1 && n<=Math.pow(10, 9) && k>=1 && k<=50){
            for(int i = 0; i < k; i++){
                if(n%10 == 0){
                    n = n/10;
                }else{
                    n = n-1;
                }
            }
            System.out.println(n);
        }
        scanner.close();


    }
}
