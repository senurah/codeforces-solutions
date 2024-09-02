package Difficulty.Div3.Round962;
//code by senurah
import java.util.Scanner;
public class Scale{

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if((t>=1)&&(t<=100)){

            for(int h=0; h<t;h++){

                int n = scanner.nextInt();
                int k = scanner.nextInt();
                //scanner .nextLine();


                if(n>=1){

                    char [][] matrix = new char[n][n];

                    for(int i=0;i<n;i++){

                        String line = scanner.next();
                        matrix[i] = line.toCharArray();

                    }

                    int size = n/k;
                    char[][] newMatrix = new char[size][size];

                    for(int x = 0 ; x< size; x++ ){
                        for(int y =0;y<size; y++){
                            newMatrix[x][y] = matrix[x*k][y*k];
                        }
                    }

                    for(int x = 0 ; x< size; x++ ){
                        for(int y =0;y<size; y++){
                            System.out.print(newMatrix[x][y]);

                        }
                        System.out.println();
                    }

                }


            }

            scanner.close();
        }

    }


}
