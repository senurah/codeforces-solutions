package Divisions.Div4.Round918;
//code by senurah
public class OddOneOut {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=270){
            for(int i =0; i<t ; i++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();

                if(a==b){
                    System.out.println(c);
                }else if(a==c){
                    System.out.println(b);
                }else{
                    System.out.println(a);
                }
            }
        }
    }
}
