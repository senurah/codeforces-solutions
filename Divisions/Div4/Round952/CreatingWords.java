package Divisions.Div4.Round952;
//code by senurah
public class CreatingWords {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        if(t>=0 && t<=100){
            for(int i=0;i<t;i++){
                String[] s = scanner.nextLine().split("");
                System.out.println(s[4]+s[1]+s[2]+s[3]+s[0]+s[5]+s[6]);
            }
        }
    }
}
