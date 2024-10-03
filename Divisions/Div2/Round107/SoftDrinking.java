package Divisions.Div2.Round107;
//code by senurah
public class SoftDrinking {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();

        int totalDrink = k * l;
        int totalLime = c * d;
        int totalSalt = p;

        int totalToast = Math.min(totalDrink / nl, Math.min(totalLime, totalSalt / np)) / n;
        System.out.println(totalToast);
    }
}
