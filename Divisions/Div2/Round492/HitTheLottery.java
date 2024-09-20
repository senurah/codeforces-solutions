package Divisions.Div2.Round492;
//code by senurah
public class HitTheLottery {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 1 && n <= 1000000000) {
            int count = 0;
            while (n > 0) {
                if (n >= 100) {
                    n -= 100;
                    count++;
                } else if (n >= 20) {
                    n -= 20;
                    count++;
                } else if (n >= 10) {
                    n -= 10;
                    count++;
                } else if (n >= 5) {
                    n -= 5;
                    count++;
                } else {
                    n -= 1;
                    count++;
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}
