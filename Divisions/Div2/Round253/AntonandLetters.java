package Divisions.Div2.Round253;
//code by senurah
public class AntonandLetters {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String line = scanner.nextLine();
        line = line.substring(1, line.length() -1);

        String[] arr = line.split(", ");
        java.util.HashSet<String> set = new java.util.HashSet<>();
        for (String c : arr) {
            set.add(c);
        }
        if(set.contains("")){
            System.out.println(0);
        }else{
            System.out.println(set.size());
        }
    }
}
