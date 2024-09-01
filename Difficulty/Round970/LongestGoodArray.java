package Difficulty.Round970;
//code by senurah
public class LongestGoodArray {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=10000){
            for(int i = 0; i<t; i++){
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int count = 0;
                int dif = 1;
                 while(l<=r){
                     count++;
                     l+=dif;
                     dif++;
                 }
                System.out.println(count);

            }
        }
    }
}
