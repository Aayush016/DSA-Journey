// You have to remove the duplicates from the string: "apnacollege"



public class Remove_Duplicates {
    public static void remove_Duplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        // Base Case
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // Work
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            // Duplicate character
            remove_Duplicates(str, idx+1, newStr, map);
        } else {
            map[currChar-'a']=true;
            remove_Duplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        remove_Duplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
