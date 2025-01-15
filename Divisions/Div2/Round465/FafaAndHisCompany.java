package Divisions.Div2.Round465;

//code by senurah
public class FafaAndHisCompany {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
