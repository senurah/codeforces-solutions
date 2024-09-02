package Divisions.Div4.Round964;

import java.util.Scanner;

//code by senurah
public class AplusBAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        if (t >= 1 && t <= 90) {
            for(int i =0; i<t;i++){
                String[] numbers = scanner.nextLine().split("");
                System.out.println(Integer.valueOf(numbers[0])+Integer.valueOf(numbers[1]));
            }

        }

    }
}
