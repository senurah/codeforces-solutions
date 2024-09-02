package Difficulty.Div2.Round238;
//code by senurah
import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
