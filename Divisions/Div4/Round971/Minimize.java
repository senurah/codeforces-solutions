package Divisions.Div4.Round971;
//code by senurah
import java.util.ArrayList;
import java.util.Collections;
public class Minimize {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=55){
            for(int i=0;i<t;i++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                ArrayList<Integer> temp = new ArrayList<Integer>();
                for(int c=a;c<=b;c++){
                    // (c−a)+(b−c)
                    int result = (c-a)+(b-c);
                    temp.add(result);

                }
                System.out.println(Collections.min(temp));
            }
        }
    }
}
