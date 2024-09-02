package Divisions.Div2.Round200;
//code by senurah
public class Magnets {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=1 && n<=100000){
            int count = 1;
            String[] magnets = new String[n];
            for (int i = 0; i < n; i++) {
                magnets[i] = scanner.next();
            }
            for (int i = 0; i < n - 1; i++) {
                if (!magnets[i].equals(magnets[i + 1])) {
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
