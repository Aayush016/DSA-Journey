import java.util.*;

public class TypeConversion {
    public static void main(String args[]){
        // int a = 25;
        // long b = a;

        // long a = 25;
        // // int b = a;  //Type conversion
        // int b = (int)a; // Type Casting
        // System.out.println(b);

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int sum = a+b+c;
        // int average = sum/3;
        // System.out.println("Average is: " + average);

        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pen + pencil + eraser;
        System.out.println("Total cost of the items: " + total);
        float gst = total * 0.18f;
        float G_total = total + gst;
        System.out.println("With GST = " + G_total);


        sc.close();
    }
}
