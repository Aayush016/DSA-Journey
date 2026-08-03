import java.util.*;

public class pattern{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        // for(int i=0; i<4;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Print Reverse of a number. Eg: 10899 -> 99801
        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        // while(num > 0){
        //     int lastD = num % 10;
        //     System.out.print(lastD);
        //     num /= 10;
        // }

        // Reverse the given number
        // int num = sc.nextInt();
        // int rev=0;
        // while(num>0){
        //     int lastD = num%10;
        //     rev = (rev*10) + lastD;
        //     num /= 10;
        // }
        // System.out.println(rev);

        // Check if prime or not?
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<num; i++){
            if(num == 2){
                isPrime = true;
            } else if((num%i) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The given number is a PRIME");
        } else{
            System.out.println("The given number is NOT a Prime");
        }
    }
}