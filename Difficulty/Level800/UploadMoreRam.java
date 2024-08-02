package Difficulty.Level800;
import java.util.Scanner;
public class UploadMoreRam {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if((t>=1)&&(t<=10000)){

            for(int h=0; h<t;h++){

                int n = scanner.nextInt();
                int k = scanner.nextInt();

                if((n>=1)&&(k<=100)){

                    if(k==1){
                        System.out.println(n);
                    }else if(n==1){
                        System.out.println(1);
                    }else{

                        int c = ((n *k)-k)+1;
                        System.out.println(c);

                    }

                }

            }
        }

    }

}
