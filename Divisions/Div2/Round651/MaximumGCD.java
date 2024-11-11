package Divisions.Div2.Round651;
//code by senurah
public class MaximumGCD {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=100){
            for(int i =0;i<t;i++){
                int n = scanner.nextInt();
                if(n>=1 && n<=1000000000){
                    System.out.println(n/2);
                }
            }
        }
    }
}
