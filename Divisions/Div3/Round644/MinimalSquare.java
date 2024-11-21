package Divisions.Div3.Round644;
//code by senurah
public class MinimalSquare {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=10000){
            for(int i =0;i<t;i++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if(a>=1 && a<=100 && b>=1 && b<=100){
                    int min = Math.min(a, b);
                    int max = Math.max(a, b);
                    int result = Math.max(min*2, max)*Math.max(min*2, max);
                    System.out.println(result);
                }
            }
        }
    }
}
