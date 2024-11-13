package Divisions.Div3.Round762;

//code by senurah
public class SquareString {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=100){
            for (int i = 0; i < t; i++) {
                String s = scanner.next();
                int n = s.length();

                if (n % 2 == 0 && s.substring(0, n / 2).equals(s.substring(n / 2))) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

    }
}
