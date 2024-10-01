package Divisions.Goodbye2016;
//code by senurah
public class NewYearAndHurry {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (n >= 1 && n <= 10 && k >= 1 && k <= 240) {
            int time = 240 - k;
            int count = 0;
            for (int i = 1; i <= n; i++) {
                time -= 5 * i;
                if (time >= 0) {
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }
    }
}
