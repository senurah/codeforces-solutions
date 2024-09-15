package Divisions.Div2.Round267;
//code by senurah
public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 1 && n <= 100) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                int p = scanner.nextInt();
                int q = scanner.nextInt();

                if (q - p >= 2) {
                    count++;
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}
