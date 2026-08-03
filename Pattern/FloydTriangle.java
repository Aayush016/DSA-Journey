public class FloydTriangle {
    public static void Floyd_Triangle(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Hello, World!");
        Floyd_Triangle(5);
    }
}
