package Divisions.Div3.Round653;
//code by senurah
public class RequiredRemainder {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if (t >= 1 && t <= 50000) {
            for (int i = 0; i < t; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int n = scanner.nextInt();

                if (x >= 2 && y >= 0 && y < x && n >= y && n <= 1000000000) {
                    int maxK = n - (n % x) + y;
                    if (maxK > n) {
                        maxK -= x;
                    }
                    System.out.println(maxK);
                }
            }
        }
        scanner.close();
    }
}
