package Divisions.Div2.Round105;
//code by senurah
public class InsomniaCure {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int count = 0;
        if(k>=1 && k<=10 && l>=1 && l<=10 && m>=1 && m<=10 && n>=1 && n<=10 && d>=1 && d<=100000){
            for (int i = 1; i <= d; i++) {
                if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                    count++;
                }
            }

            System.out.println(count);

        }

    }
}
