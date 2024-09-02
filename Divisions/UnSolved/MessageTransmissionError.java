package Divisions.UnSolved;
//code by senurah
import java.util.Scanner;

public class MessageTransmissionError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int n = t.length();

        for (int i = 1; i < n; i++) {
            if (t.substring(0, i).equals(t.substring(n - i))) {
                String s = t.substring(0, n - i);
                System.out.println("YES");
                System.out.println(s);
                return;
            }
        }

        System.out.println("NO");
    }
}
