public class overloading{
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static boolean isPrime(int n){
        boolean isP = true;
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                isP = false;
            }
        }
        return isP;
    }

    public static void rangePrime(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i) == true){
                System.out.println(i);
            }
        }
        return;
    }
    public static void main(String args[]){
        System.out.println("Examples of function Overloading!");
        // System.out.println(sum(9,10));
        // System.out.println(sum(9,10,11));
        // System.out.println(sum(9.1f,10.12f));
        // if(isPrime(11) == true){
        //     System.out.println("The given number is a Prime");
        // } else{
        //     System.out.println("Given number is not a Prime");
        // }
        rangePrime(100);
    }
}


/* Java overloading is the process where the function name will be same,
but the parameters will be different.
Function overloading doesn't check the return type it only checks number of parameters.
The return types of the parameters can be different but the function itself cannot be of different returntype
we will get an error.
*/