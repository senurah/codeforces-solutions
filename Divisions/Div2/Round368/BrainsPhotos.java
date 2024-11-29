package Divisions.Div2.Round368;

//code by senurah
import java.util.Scanner;
public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean isColor = false;
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            if (row.contains("C") || row.contains("M") || row.contains("Y")) {
                isColor = true;
                break;
            }
        }

        System.out.println(isColor ? "#Color" : "#Black&White");
    }
}
