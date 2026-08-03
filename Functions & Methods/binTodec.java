public class binTodec{
    public static int binTdec(int n){
        int decimal = 0;
        int pow = 0;
        while(n>0){
            int lastD = n%10;
            decimal = decimal + (lastD * (int) Math.pow(2, pow));
            pow++;
            n /= 10;
        }
        System.out.println(decimal);
        return 0;
    }
    public static void main(String args[]){
        System.out.println("Hello, World!");
        binTdec(111);
    }
}