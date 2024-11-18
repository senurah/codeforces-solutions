package Divisions.Div2.Round280;
//code by senurah
public class VanyaAndCubes {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int height = 0;
        int sum = 0;
        int i = 1;
        while (sum <= n) {
            sum += i * (i + 1) / 2;
            if (sum <= n) {
                height++;
            }
            i++;
        }
        System.out.println(height);
        scanner.close();
    }
}
