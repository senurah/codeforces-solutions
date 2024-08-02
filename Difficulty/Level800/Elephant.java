package Difficulty.Level800;
//Code by senurah
import java.util.*;

public class Elephant{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if((x>=1)&& (x<=1000000)){
            if((x%5)==0){
                System.out.println(x/5);
            } else{
                System.out.println((x/5)+1);
            }

        }

    }
}
