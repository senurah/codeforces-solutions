package Divisions.Div4.Round806;
//code by senurah
public class YesorYes {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        if(t>=1 && t <=1000){
            for(int i =0 ; i<t; i++){
                String s = scanner.nextLine().toLowerCase();
                if(s.equals("yes")){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }

    }
}
