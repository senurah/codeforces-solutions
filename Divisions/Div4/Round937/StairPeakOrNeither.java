package Divisions.Div4.Round937;
//code by senurah
public class StairPeakOrNeither {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=1000){
            for(int i=0;i<t;i++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();

                if(a<b && b<c){
                    System.out.println("STAIR");
                } else if (a<b && b>c) {
                    System.out.println("PEAK");
                }else{
                    System.out.println("NONE");
                }

            }
        }

    }
}
