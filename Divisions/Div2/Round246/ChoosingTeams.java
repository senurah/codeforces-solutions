package Divisions.Div2.Round246;
//code by senurah
public class ChoosingTeams {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (n >= 1 && n <= 2000 && k >= 1 && k <= 5) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                int time = scanner.nextInt();
                if (time <= 5 - k) {
                    count++;
                }
            }

            System.out.println(count / 3);
        }

        scanner.close();
    }
}
