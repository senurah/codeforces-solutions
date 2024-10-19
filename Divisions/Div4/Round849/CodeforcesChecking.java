package Divisions.Div4.Round849;
//code by senurah
public class CodeforcesChecking {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String [] s = {"c", "o", "d", "e", "f", "o", "r", "c", "e", "s"};
        int t = scanner.nextInt();
        scanner.nextLine();
        if(t>=1 && t<=26){
            for(int i = 0; i<t;i++){
                String letter = scanner.next();
                boolean isFound = false;
                for(String letterInArray : s){
                    if(letterInArray.equals(letter)){
                        System.out.println("YES");
                        isFound = true;
                        break;
                    }
                }
                if(!isFound){
                    System.out.println("NO");
                }
            }
        }
    }
}
