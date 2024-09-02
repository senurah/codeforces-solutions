package Difficulty.Beta.Round97;
//code by senurah
public class Presents {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=1 && n <= 100){
            int [] friends = new int[n];
            for (int i =0 ; i<n ;  i++){
                friends[i] = scanner.nextInt();
            }
            int [] presents = new int[n];
            for(int i =0;i<n;i++){
                presents[friends[i]-1] = i+1;
            }
            for(int i =0;i<n;i++){
                System.out.print(presents[i]+" ");
            }
        }
    }
}
