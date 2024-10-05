package Divisions.Div2.Round377;
//code by senurah
public class BuyaShovel {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();

        int count = 1;
        while (true) {
            if ((k * count) % 10 == 0 || (k * count) % 10 == r) {
                System.out.println(count);
                break;
            }
            count++;
        }
    }
}
