package Divisions.Div3.Round839;
//code by senurah
public class AplusB {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        for(int j=0;j<i;j++){
            String s = sc.nextLine();
            String[] arr = s.split("\\+");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            System.out.println(a+b);
        }
        sc.close();

    }
}
