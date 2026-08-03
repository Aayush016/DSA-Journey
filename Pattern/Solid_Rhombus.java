public class Solid_Rhombus{
    public static void S_Rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Akela Hi Kaafi Hu!");
        S_Rhombus(5);
    }
}