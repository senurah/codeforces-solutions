package Divisions.Div2.Round111;
//code by senurah
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n>=1 && n<=100){
            int [] coins = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                coins[i] = scanner.nextInt();
                sum += coins[i];
            }
            int count = 0;
            int mySum = 0;
            int myCount = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n-1; j++){
                    if(coins[j] < coins[j+1]){
                        int temp = coins[j];
                        coins[j] = coins[j+1];
                        coins[j+1] = temp;
                    }
                }
            }
            for(int i = 0; i < n; i++){
                mySum += coins[i];
                myCount++;
                count++;
                if(mySum > sum/2){
                    break;
                }
            }
            System.out.println(count);
        }
    }

}
