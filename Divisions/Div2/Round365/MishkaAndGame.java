package Divisions.Div2.Round365;
//code by senurah
public class MishkaAndGame {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 1 && n <= 1000) {
            int mishka = 0;
            int chris = 0;
            for (int i = 0; i < n; i++) {
                int m = scanner.nextInt();
                int c = scanner.nextInt();

                if (m > c) {
                    mishka++;
                } else if (c > m) {
                    chris++;
                }
            }

            if (mishka > chris) {
                System.out.println("Mishka");
            } else if (chris > mishka) {
                System.out.println("Chris");
            } else {
                System.out.println("Friendship is magic!^^");
            }
        }

        scanner.close();
    }
}
