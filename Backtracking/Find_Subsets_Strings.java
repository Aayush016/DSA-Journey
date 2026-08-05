/*Find & print all subsets of a given string
"abc"

" ", a, b, c, ab, bc, ac, abc
*/


public class Find_Subsets_Strings {

    public static void printSubsets(String str, String ans, int i){
        // Base Case
        if(i == str.length()) {
            if(ans.length() == 0) {
            System.out.println("null");
            } else {
            System.out.println(ans);
            }
            return;
            }

        // Recursion
        // Yes
        printSubsets(str, ans+str.charAt(i), i+1);
        // No
        printSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "",0);
    }
}
