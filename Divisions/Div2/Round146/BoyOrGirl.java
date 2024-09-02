package Divisions.Div2.Round146;
//code by senurah
import java.util.HashSet;
import java.util.Scanner;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] name = scanner.next().split("");

        HashSet<String> set = new HashSet<>();
        for(String s : name){
            set.add(s);
        }

        if(set.size()%2==0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        scanner.close();
    }
}
