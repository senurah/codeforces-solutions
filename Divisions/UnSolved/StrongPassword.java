package Divisions.UnSolved;
//code by senurah

import java.util.HashSet;
import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int replace = -1;
        HashSet<Character> charSet = new HashSet<>();
        if (t >= 1 && t <= 1000) {
            for (int i = 0; i < t; i++) {
                String line = scanner.nextLine();
                String [] password = line.split("");
                char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
                HashSet<Character> alphabetSet = new HashSet<>();
                for (char c = 'a'; c <= 'z'; c++) {
                    alphabetSet.add(c);
                }

                ///finding unique char
                for (char c : line.toCharArray()) {
                    alphabetSet.remove(c);
                }
                char uniqeChar = returnUnique4(charSet);

                if(password.length==1){
                    replace = 0;
                }
                for(int j = 0; j< password.length-1;j++){
                    if((password[j+1] != null && (password[j].equals(password[j+1])))){
                        replace = j+1;
                        break;
                    }else{
                        //all unique
                        replace = -2;
                    }

                }
                //rebuilding
                if(replace==0){

                    System.out.print(uniqeChar);
                    for(String s: password){
                        System.out.print(s);
                    }
                    System.out.println();
                }else if(replace== -2){

                    System.out.print(uniqeChar);
                    for(String a :password){
                        System.out.print(a);
                    }
                    System.out.println();
                }else{
                    for(int k = 0; k <replace;k++){
                        System.out.print(password[k]);
                    }
                    System.out.print(uniqeChar);
                    for(int n =replace;n< password.length;n++){
                        System.out.print(password[n]);
                    }
                    System.out.println();
                }
            }
        }
    }
    public static char returnUnique(HashSet<Character> charSet){

        for(char c = 'b'; c<= 'z';c++){
            if(!charSet.contains(c)){
                return c;
            }
        }
        return  'x';
    }
    public static char returnUnique2(HashSet<Character> charSet,char[] alphabet){
        HashSet<Character> uniqueChars = new HashSet<>();
        for(char j : alphabet){
            if(!charSet.contains(j)){
                uniqueChars.add(j);
            }
        }
        Character[] tempArray = uniqueChars.toArray(new Character[0]);
       char [] charArray = new char[tempArray.length];

        for (int i = 0; i < tempArray.length; i++) {
            charArray[i] = tempArray[i];
        }
       //uniqueChars.toArray(charArray);
        return charArray[0];
    }

    public static char returnUnique3(HashSet<Character> alphabetSet){
        char[] missingLetters = new char[alphabetSet.size()];
        int index = 0;
        for (char c : alphabetSet) {
            missingLetters[index++] = c;
        }
        return missingLetters[0];
    }
    public static char returnUnique4(HashSet<Character> alphabetSet) {
        // Check if alphabetSet is empty
        if (alphabetSet.isEmpty()) {
            return 'x';  // or any default character
        }

        // Convert HashSet to an array and return the first element
        char[] missingLetters = new char[alphabetSet.size()];
        int index = 0;
        for (char c : alphabetSet) {
            missingLetters[index++] = c;
        }
        return missingLetters[0];
    }

 }
