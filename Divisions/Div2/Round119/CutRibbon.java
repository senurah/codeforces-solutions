package Divisions.Div2.Round119;
//code by senurah
import java.util.*;

public class CutRibbon {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = 0;
        for(int i = 0 ; i <= n /a ; i ++){
            for (int j = 0; j <= n/ b; j++) {
                int used = i*a + j*b;

                if(used > n) continue;

                int rem = n - used;
                if(rem % c == 0) {
                    int k = rem / c;
                    result = Math.max(result, i+j+k);

                }
            }
        }

        System.out.println(result);
    }
}
