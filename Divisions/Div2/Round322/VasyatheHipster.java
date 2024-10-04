package Divisions.Div2.Round322;
//code by senurah
public class VasyatheHipster {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        System.out.println(min + " " + (max - min) / 2);
    }
}
