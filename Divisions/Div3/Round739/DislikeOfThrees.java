package Divisions.Div3.Round739;
//code by senurah
import java.util.ArrayList;
import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        ArrayList<Integer> sequence = new ArrayList<>();
        int num = 1;

        while (sequence.size() < 1000) {
            if (num % 3 != 0 && num % 10 != 3) {
                sequence.add(num);
            }
            num++;
        }

        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt();
            System.out.println(sequence.get(k - 1));
        }

        scanner.close();
        }

}
