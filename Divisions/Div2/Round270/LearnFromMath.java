package Divisions.Div2.Round270;
//code by senurah
public class LearnFromMath {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 12 && n <= 1000000) {
            for (int i = 4; i <= n / 2; i++) {
                int j = n - i;
                if (isComposite(i) && isComposite(j)) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
        scanner.close();
    }

    private static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
