package Difficulty.Level800;
//code by senurah
public class BeautifulYear {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int year = scanner.nextInt();
        if(1000<= year && year<=9000){
            while (true) {
                year++;
                int a = year / 1000;
                int b = year / 100 % 10;
                int c = year / 10 % 10;
                int d = year % 10;
                if (a != b && a != c && a != d && b != c && b != d && c != d) {
                    break;
                }
            }
            System.out.println(year);
        }
        scanner.close();

    }
}
