import java.util.*;

public class Condn{
    public static void main(String args[]){
        // System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>=18){
        //     System.out.println("You are ELIGIBLE to vote");
        // } else{
        //     System.out.println("You are NOT ELIGIBLE to vote");
        // }

        // Largest of A ,B
        // int a = 10;
        // int b = 5;
        // if(a>b){
        //     System.out.println("A is greater than B");
        // } else{
        //     System.out.println("B is greater than A");
        // }

        // Print Even or Odd
        // int num = sc.nextInt();
        // if(num%2 == 0){
        //     System.out.println("The given number: " + num + ", is EVEN");
        // } else{
        //     System.out.println("The given number: " + num + ", is ODD");
        // }

        /*
        Taxation:
        < 5L -> 0% Tax
        5-10L -> 20% Tax
        > 10L -> 30% Tax
        */
        // int income = sc.nextInt();
        // if(income <= 500000){
        //     System.out.println("No Tax is cut");
        // } else if (income > 500000 && income <= 1000000) {
        //     System.out.println("Tax that will be cut is: " + income * 0.2);
        // }
        // else{
        //     System.out.println(income * 0.3);
        // }

        // Print the largest of A, B, C
        // System.out.println("Enter A: ");
        // int a = sc.nextInt();
        // System.out.println("Enter B: ");
        // int b = sc.nextInt();
        // System.out.println("Enter C: ");
        // int c = sc.nextInt();

        // if(a>b && a>c){
        //     System.out.println("A is the largest");
        // } else if(b>c){
        //     System.out.println("B is the largest");
        // } else {
        //     System.out.println("C is the largest");
        // }

        // Ternary Operator
        // Variable = cond? stmt1 : stmt2
        // Stmt is printed if cond is true and rest uk

        int num = sc.nextInt();
        String type = num%2 == 0? "Even" : "Odd";
        System.out.println(type);

        sc.close();
    }
}