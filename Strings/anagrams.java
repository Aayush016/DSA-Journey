import java.util.Arrays;

public class anagrams {

    public static boolean checkAnagrams(String str, String str1){
        // boolean isAnagram = true;

        if(str.length() != str1.length()){
            return false;
        }
        char arr1[] = new char[str.length()];
        char arr2[] = new char[str1.length()];
        for(int i=0; i<str.length(); i++){
            arr1[i] = str.charAt(i);
        }
        for(int i=0; i<str1.length(); i++){
            arr2[i] = str1.charAt(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "care";
        String str1 = "sher";

        boolean check = checkAnagrams(str, str1);
        System.out.println(check);
    }
}
