package Divisions.Beta.Round9;

import java.util.Scanner;

//code by senurah
public class DieRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        int w = scanner.nextInt();

        int maxRoll = Math.max(y, w);
        int favorableOutcomes = 6 - maxRoll + 1;

        switch (favorableOutcomes) {
            case 1: System.out.println("1/6"); break;
            case 2: System.out.println("1/3"); break;
            case 3: System.out.println("1/2"); break;
            case 4: System.out.println("2/3"); break;
            case 5: System.out.println("5/6"); break;
            case 6: System.out.println("1/1"); break;
        }

        scanner.close();
    }
}
