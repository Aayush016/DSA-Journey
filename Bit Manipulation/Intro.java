public class Intro{
    public static void main(String[] args) {
        // Bit-wise Operators

        // 1. Binary AND (&)
        System.out.println((5 & 6));

        // 2. Binary OR (|)
        System.out.println((5 | 6));

        // 3. Binary XOR (^)
        System.out.println((5 ^ 6));

        // 4. Binary One's Compliment (~)
        System.out.println((~5));

        // Expected output = 2, but Given output = -6? Why so?
        // That is because our numbers are not stored int 3-bit(101 -> 5)
        // They are stored like this 00000101 in 8 bit form.
        /*
        So we get something like this 111111010.
        to but that's not 6!
        To find the number we need to do 2's compliment!
        That is done by: adding one after 1's compliment that is adding 1 to 11111010.
        So we need to do not of 11111010 that is 00000101
        then add 1 -> 00000110
        Now that number is 6 and since our number n has 1 at the msb we give it a -ve Val
        */

        // 5. Binary Left Shift (<<)
        System.out.println((5<<2));

        // 5. Binary Right Shift (>>)
        System.out.println((6>>1));
    }
}