package Divisions.Div3.Round388;
//code by senurah
public class BachgoldProblem {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=1 && n<=100000){
            if(n%2==0){
                System.out.println(n/2);
                for(int i=0;i<n/2;i++){
                    System.out.print("2 ");
                }
            }else{
                System.out.println(n/2);
                for(int i=0;i<n/2-1;i++){
                    System.out.print("2 ");
                }
                System.out.print("3");
            }
        }
    }
}
