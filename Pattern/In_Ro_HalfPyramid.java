public class In_Ro_HalfPyramid {

    public static void half_Pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Hello, World!");
        half_Pyramid(5);
    }
}
