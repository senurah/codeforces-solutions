package Divisions.Div4.Round944;
//code by senurah
public class MyFirstSortingProblem {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=100){
            for(int i =0; i<t;i++){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if(x<y){
                    System.out.println(x+" "+y);
                }else{
                    System.out.println(y+" "+x);
                }
            }
        }

    }
}
