public class decTobin{

    public static int decTbin(int n){
        int binNum = 0;
        int pow = 0;
        while(n>0){
            int lastD = n % 2;
            binNum = binNum + (lastD * (int) Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.println(binNum);
        return 0;
    }
    public static void main(String args[]){
        System.out.println("Hello World");
        decTbin(7);
    }
}