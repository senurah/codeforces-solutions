package Divisions.Beta.Round77;
//code by senurah
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] s = scanner.next().split("");
        int count = 1;
        boolean danger = false;
        for(int i=1; i<s.length; i++){
            if(s[i].equals(s[i-1])){
                count++;
                if(count == 7){
                    danger = true;
                    break;
                }
            }else{
                count = 1;
            }
        }
        if(danger){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
