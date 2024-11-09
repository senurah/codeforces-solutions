package Divisions.Div3.Round677;
//code by senurah
public class BoringApartments {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int digit = x % 10;
            int length = String.valueOf(x).length();
            int ans = (digit - 1) * 10 + (length * (length + 1)) / 2;
            System.out.println(ans);
        }

        scanner.close();
    }
}