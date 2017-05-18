package math;

/**
 * Created by roxana on 5/18/17.
 */
public class conversions {
    public static StringBuilder decToHex(int numb) {
        /*
         * 1. Divide the decimal number by 16.   Treat the division as an integer division.
         * 2. Write down the remainder (in hexadecimal).
         * 3. Divide the result again by 16.  Treat the division as an integer division.
         * 4. Repeat step 2 and 3 until result is 0.
         * 5. The hex value is the digit sequence of the remainders from the last to first.
         */

        StringBuilder hex = new StringBuilder("");
        do {
            hex.append(Integer.toHexString(numb%16));
            numb = numb/16;
        } while ( numb != 0);

        return hex.reverse();
    }
}

class Testing {
    public static void main(String[] args) {
        System.out.println("Testing: 188, Output: " + conversions.decToHex(188) + ", Expected: bc");
        System.out.println("Testing: 100, Output: " + conversions.decToHex(100) + ", Expected: 64");
        System.out.println("Testing: 256, Output: " + conversions.decToHex(256) + ", Expected: 100");
        System.out.println("Testing: 1128, Output: " + conversions.decToHex(1128) + ", Expected: 468");
        System.out.println("Testing: 590, Output: " + conversions.decToHex(590) + ", Expected: 24e");
    }
}
