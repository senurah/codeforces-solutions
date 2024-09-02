package Divisions.Div2.Round277;
//code by senurah
import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if(n>=1 && n<=Math.pow(10,15)){
            long result = 0;
            if (n % 2 == 0) {
                result = n / 2;
            } else {
                result = -((n + 1) / 2);
            }
            System.out.println(result);
            scanner.close();
        }
    }

}
