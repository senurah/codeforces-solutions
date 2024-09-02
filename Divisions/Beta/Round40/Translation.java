package Divisions.Beta.Round40;
//Code by senurah

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        StringBuilder s = new StringBuilder(scanner.nextLine());
        String t = scanner.nextLine();
        if(s.reverse().toString().equals(t)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
