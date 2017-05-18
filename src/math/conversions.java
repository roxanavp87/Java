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

    public static int hextoDec(String hex) {
        /*
         * 1. 7DE = (7 * 16^2) + (13 * 16^1) + (14 * 16^0)
         * 2. 7DE = (7 * 256) + (13 * 16) + (14 * 1)
         * 3. 7DE = 1792 + 208 + 14 = 2014 (in decimal number)
         */

        int dec = 0;
        StringBuilder hexSB = new StringBuilder(hex);
        hexSB = hexSB.reverse();

        char[] digits = hexSB.toString().toCharArray();
        for (int i=0; i<digits.length; i++) {
            dec += (int)Integer.parseInt(Character.toString(digits[i]),16) * Math.pow(16, i);
        }
        return dec;
    }


    public static StringBuilder decToBin(int numb) {
        /*
         * 1. Divide the decimal number by 2.   Treat the division as an integer division.
         * 2. Write down the remainder.
         * 3. Divide the result again by 2.  Treat the division as an integer division.
         * 4. Repeat step 2 and 3 until result is 0.
         * 5. The binary value is the digit sequence of the remainders from the last to first.
         */

        StringBuilder bin = new StringBuilder("");
        do {
            bin.append(numb%2);
            numb = numb/2;
        } while ( numb != 0);

        return bin.reverse();
    }


    public static int binToDec(String bin) {
        /*
         * 1. 101 = (1 * 2^2) + (0 * 2^1) + (1 * 2^0)
         * 2. 101 = (1 * 4) + (0 * 2) + (1 * 1)
         * 3. 101 = 4 + 0 + 1 = 5 (in decimal number)
         */

        int dec = 0;
        StringBuilder binSB = new StringBuilder(bin);
        binSB = binSB.reverse();

        char[] digits = binSB.toString().toCharArray();
        for (int i=0; i<digits.length; i++) {
            dec += (int)Integer.parseInt(Character.toString(digits[i]),2) * Math.pow(2, i);
        }
        return dec;
    }


    public static StringBuilder binToHex(String bin) {
        /*
         * convert binary to decimal
         * convert decimal to hexadecimal
         */

        return decToHex(binToDec(bin));

    }
}

class Testing {
    public static void main(String[] args) {
//        //Testing decToHex
//        System.out.println("Testing: 188, Output: " + conversions.decToHex(188) + ", Expected: bc");
//        System.out.println("Testing: 100, Output: " + conversions.decToHex(100) + ", Expected: 64");
//        System.out.println("Testing: 256, Output: " + conversions.decToHex(256) + ", Expected: 100");
//        System.out.println("Testing: 1128, Output: " + conversions.decToHex(1128) + ", Expected: 468");
//        System.out.println("Testing: 590, Output: " + conversions.decToHex(590) + ", Expected: 24e");

//        //Testing hextoDec
//        System.out.println("Testing: 7DE, Output: " + conversions.hextoDec("7DE") + ", Expected: 2014");
//        System.out.println("Testing: 10CE, Output: " + conversions.hextoDec("10CE") + ", Expected: 4302");

//        //Testing binToDec
//        System.out.println("Testing: 101, Output: " + conversions.binToDec("101") + ", Expected: 5");
//        System.out.println("Testing: 10011011, Output: " + conversions.binToDec("10011011") + ", Expected: 155");
//        System.out.println("Testing: 1011001, Output: " + conversions.binToDec("1011001") + ", Expected: 89");

//        //Testing decToBin
//        System.out.println("Testing: 25, Output: " + conversions.decToBin(25) + ", Expected: 11001");
//        System.out.println("Testing: 255, Output: " + conversions.decToBin(255) + ", Expected: 11111111");

        //Testing binToHex
        System.out.println("Testing: 11101100101001, Output: " + conversions.binToHex("11101100101001") + ", Expected: 3b29");
    }
}
