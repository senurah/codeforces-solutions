package Divisions.Div2.Round320;
//code by senurah
import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        while(n > 0){
            if(n%2 ==1){
                count++;
            }
            n = n /2;
        }

        System.out.println(count);
    }
}