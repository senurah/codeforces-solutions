package Divisions.Div2.Round404;
//code by senurah
public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        if(n>=1 && n<=200000){
            int count =0;
            for(int i =0;i<n;i++){
                String line = scanner.nextLine();
                if(line.equals("Tetrahedron")){
                    count+=4;
                } else if (line.equals("Cube")) {
                    count+=6;
                } else if (line.equals("Octahedron")) {
                    count+=8;
                } else if (line.equals("Dodecahedron")) {
                    count+=12;
                } else if (line.equals("Icosahedron")) {
                    count+=20;
                }
            }

            System.out.println(count);
        }
    }
}
