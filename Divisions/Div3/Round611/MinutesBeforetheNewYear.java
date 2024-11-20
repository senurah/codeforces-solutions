package Divisions.Div3.Round611;
//code by senurah
public class MinutesBeforetheNewYear {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=1439){
            for(int i =0;i<t;i++){
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                if(h>=0 && h<=23 && m>=0 && m<=59){
                    int result = (23-h)*60 + (60-m);
                    System.out.println(result);
                }
            }
        }
    }
}
