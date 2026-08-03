public class Hollow_Rhombus {
    public static void h_rhombus(int n, int m){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=m; j++){
                if( (i == 1 || i == n) || (j == 1 || j == m)){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Akela hu KAafi hu!");
        h_rhombus(4, 5);
    }
}
