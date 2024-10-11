package Divisions.Div3.Round667;
//code by senurah
public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int diff = Math.abs(a - b);
            int count = diff / 10;
            if (diff % 10 != 0) {
                count++;
            }

            System.out.println(count);
        }
    }
}
