package Divisions.Div4.Round944;
//code by senurah
public class ClockNString {
    public static void main(String[] args) {
        java.util.Scanner  scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<= 5940){
            for(int i=0;i<t;i++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int d = scanner.nextInt();

                if (a > b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                if (c > d) {
                    int temp = c;
                    c = d;
                    d = temp;
                }

                if ((a < c && c < b && !(a < d && d < b)) || (a < d && d < b && !(a < c && c < b)) ||
                        (c < a && a < d && !(c < b && b < d)) || (c < b && b < d && !(c < a && a < d))) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }



            }
        }
    }
}
