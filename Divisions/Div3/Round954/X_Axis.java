package Divisions.Div3.Round954;

import java.util.Scanner;

public class X_Axis {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if((t>=1)&&(t<=1000)){

            for(int h=0; h<t;h++){
                int x1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                int x3 = scanner.nextInt();

                int max = x1;
                int min = x1;

                if((x2 >= x1) &&(x2>= x3)){
                    max = x2;
                }else if ((x3>= x1)&&(x3 >= x1)){
                    max =x3;
                }

                if( (x2 <= x1) && (x2<= x3)){
                    min = x2;
                }else if((x3<= x1) && (x3<= x1)){
                    min = x3;
                }

                System.out.println(max-min);

            }


        }

    }

}
