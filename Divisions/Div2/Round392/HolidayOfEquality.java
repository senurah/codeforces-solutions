package Divisions.Div2.Round392;
//code by senurah
public class HolidayOfEquality {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] citizens = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            citizens[i] = scanner.nextInt();
            if (citizens[i] > max) {
                max = citizens[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += max - citizens[i];
        }

        System.out.println(sum);
    }
}
