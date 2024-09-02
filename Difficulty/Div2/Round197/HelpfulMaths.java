package Difficulty.Div2.Round197;

//code by senurah

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineArray = scanner.nextLine().replace("+","").split("");
        scanner.close();
        int [] arr = new int[lineArray.length];
        for(int i =0; i < lineArray.length;i++){
            arr[i] = Integer.valueOf(lineArray[i]);
        }
        Arrays.sort(arr);

        for(int i =0; i< arr.length ;i++){
            System.out.print(arr[i]);
            if(i != (arr.length-1)){
                System.out.print("+");
            }
        }
    }
}
