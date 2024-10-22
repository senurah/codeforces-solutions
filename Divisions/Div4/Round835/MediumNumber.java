package Divisions.Div4.Round835;
//code by senurah
import java.util.Arrays;

public class MediumNumber {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=6840){
            for(int i =0 ; i<t; i++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();

                int [] array = {a,b,c};
                Arrays.sort(array);
                System.out.println(array[1]);
            }
        }
    }
}
