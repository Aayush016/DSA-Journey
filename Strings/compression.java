public class compression {

    public static void compressedString(StringBuilder sb){
        StringBuilder sb1 = new StringBuilder("");

        for(int i=0; i<sb.length(); i++){
            Integer count = 1;
            while(i < sb.length()-1 && sb.charAt(i) == sb.charAt(i+1)){
                count++;
                i++;
            }
            sb1.append(sb.charAt(i));
            if(count>1){
                sb1.append(count);
            }
        }

        System.out.println(sb1);
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        compressedString(sb);
    }
}
