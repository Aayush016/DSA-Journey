// import java.util.*;

public class intro{

    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // System.out.println("Starting string lessons\n\n");
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str1 = new String("xyz");

        // // Strings are IMMUTABLE
        // Scanner sc = new Scanner(System.in);
        // String name;
        // // name = sc.next();
        // next() only takes one word as input.
        // Any space or word after that will not be counted
        // name = sc.nextLine();
        // System.out.println(name);

        String fullName = "Aayush Pandey";
        System.out.println(fullName.length());




        // Concatenation
        String firstName = "Aayush";
        String lastName = "Pandey";
        System.out.println(firstName+" "+lastName);
        System.out.println(fullName.charAt(0));
        printLetters(fullName);
    }
}