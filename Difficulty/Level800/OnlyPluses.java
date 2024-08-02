package Difficulty.Level800;

import java.util.Scanner;

public class OnlyPluses{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if((t>=1)&&(t<=1000)){

            for(int h=0; h<t;h++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();

                if((a>=1)&&(a<=10)&&(b>=1)&&(b<=10)&&(c>=1)&&(c<=10)){

                    for(int k =0; k<5;k++){

                        if((a>=b) && (c>=b)){
                            b++;
                        }else if((b>=c) && (a>=c)){
                            c++;
                        }else {
                            a++;
                        }
                    }

                    System.out.println(a*b*c);

                }
            }

        }


    }

}