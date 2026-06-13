package Divisions.Beta.Round34;
//code by senurah
import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] tvArr = new int[n];
        for(int i = 0; i < n; i++){
            tvArr[i] = scanner.nextInt();
        }
        Arrays.sort(tvArr);

        int max = 0;
        for(int j = 0; j < m; j++){
            if(tvArr[j] < 0) {
                max = max + Math.abs(tvArr[j]);
            }
        }
        System.out.println(max);
    }
}
