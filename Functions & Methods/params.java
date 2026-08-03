public class params{
    public static int sum(int a, int b){ // Parameters
        return a+b;
    }

    public static int product(int a, int b){
        return a*b;
    }

    public static int fact(int n){
        int fact = 1;
        for(int i=2; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
        System.out.println("Hello, World!");
        // System.out.println(sum(60, 9)); // Arguments
        // System.out.println(product(5,10));
        // System.out.println(fact(5));
        int fact_n = fact(5);
        int fact_r = fact(2);
        int fact_nr = fact((5-2));
        int biCoff = fact_n/(fact_r * fact_nr);
        System.out.println(biCoff);
    }
}