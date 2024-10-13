package Divisions.Div4.Round790;
//code by senurah
public class Lucky {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n >= 1 && n <= 1000) {
            for (int i = 0; i < n; i++) {
                String ticket = scanner.nextLine();

                int sumFirstHalf = (ticket.charAt(0) - '0') + (ticket.charAt(1) - '0') + (ticket.charAt(2) - '0');
                int sumSecondHalf = (ticket.charAt(3) - '0') + (ticket.charAt(4) - '0') + (ticket.charAt(5) - '0');

                if (sumFirstHalf == sumSecondHalf) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }
    }
}
