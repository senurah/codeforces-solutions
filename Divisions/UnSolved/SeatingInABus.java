package Divisions.UnSolved;
//code by senurah
import java.util.Scanner;

public class SeatingInABus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t >= 1 && t <= 1000) {

            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                int prevSeat = scanner.nextInt();
                int firstP = prevSeat;
                boolean isValid = true;

                for (int j = 1; j < n; j++) {
                    int currentSeat = scanner.nextInt();

                    if (((currentSeat != prevSeat + 1) && (currentSeat != prevSeat - 1)) &&
                            ((currentSeat != firstP + 1) && (currentSeat != firstP - 1))) {
                        isValid = false;
                        break;
                    }

                    prevSeat = currentSeat;
                }

                if (isValid) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }

        scanner.close();
    }
}
