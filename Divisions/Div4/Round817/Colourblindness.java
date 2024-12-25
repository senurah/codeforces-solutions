package Divisions.Div4.Round817;

//code by senurah
public class Colourblindness {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String row1 = scanner.next();
            String row2 = scanner.next();

            boolean isIdentical = true;
            for (int i = 0; i < n; i++) {
                char c1 = row1.charAt(i);
                char c2 = row2.charAt(i);
                if ((c1 == 'R' && c2 != 'R') || (c1 != 'R' && c2 == 'R')) {
                    isIdentical = false;
                    break;
                }
            }

            System.out.println(isIdentical ? "YES" : "NO");
        }

        scanner.close();
    }
}
