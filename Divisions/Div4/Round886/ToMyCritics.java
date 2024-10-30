package Divisions.Div4.Round886;
//code by senurah
public class ToMyCritics {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=1000){
            for(int i =0; i<t;i++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();

                if(a+b>=10 || a+c >= 10 || b+c >=10){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

            }
        }
    }
}
