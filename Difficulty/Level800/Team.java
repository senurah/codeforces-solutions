package Difficulty.Level800;

import java.util.Scanner;

public class Team {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if((n>=1)&&(n<=1000)){
            int count = 0;
            for(int i =0; i<=n; i++){
                String line = scanner.nextLine();
                if(((line.equals("1 1 1"))|| (line.equals("1 1 0"))) || ((line.equals("1 0 1")) || (line.equals("0 1 1")))){
                    //System.out.println(line);
                    count++;
                }
            }

            System.out.println(count);

        }

    }

}
