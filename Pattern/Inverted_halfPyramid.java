public class Inverted_halfPyramid{
    public static void IHPyramid(int n){
        for(int i=n; i>0; i--){
            // int num = 1;
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Hello, World!");
        IHPyramid(5);
    }
}