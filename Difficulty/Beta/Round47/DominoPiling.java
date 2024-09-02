//code by senurah
package Difficulty.Beta.Round47;

import java.util.Scanner;

public class DominoPiling {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if((n>=1)&&(n<=16)&& (m>=1)&&(m<=16)){
            int max = (m * n) / 2;

            System.out.println(max);

        }
    }
}
