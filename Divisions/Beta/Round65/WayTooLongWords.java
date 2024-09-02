//code ys senurah
package Divisions.Beta.Round65;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if((n>=1) && (n<=100)){

            for(int i =0; i<=n;i++){

                String w = scanner.nextLine();
                String[] warry = w.split("");

                if(warry.length <= 10){
                    System.out.println(w);
                }else{
                    System.out.println(warry[0]+String.valueOf(warry.length-2)+warry[warry.length-1]);
                }

            }
        }

    }

}
