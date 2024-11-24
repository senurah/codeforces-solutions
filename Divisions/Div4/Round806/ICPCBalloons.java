package Divisions.Div4.Round806;
//code by senurah
import java.util.Scanner;
import java.util.HashSet;

public class ICPCBalloons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            HashSet<Character> solved = new HashSet<>();
            int balloons = 0;

            for (char c : s.toCharArray()) {
                if (solved.contains(c)) {
                    balloons += 1;
                } else {
                    solved.add(c);
                    balloons += 2;
                }
            }

            System.out.println(balloons);
        }

        scanner.close();
    }
}
