package Divisions.Div2.Round173;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if((t>=1)&&(t<=150)){
            int x=0;
            for(int h =0; h<=t;h++){
                String line = scanner.nextLine();

                if(line.equals("X++")|| line.equals("++X")){
                    x++;
                }else if(line.equals("X--")|| line.equals("--X")){
                    x--;
                }
            }
            System.out.println(x);
        }

    }

}
