package CodingChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by roxana on 5/18/17.
 */
public class nextHigherIntWithSameDigits {
    public int getHigherInt(int num) {
        String sNum = Integer.toString(num);
        char [] arrayOfDigits = sNum.toCharArray();
        boolean notPossible = false;

        for(int i=arrayOfDigits.length-1; i>0; i--) {

            //Split the sequence of digits in two, so that the right part is as long as possible while remaining
            //in decreasing order: 34722 641
            if(Character.digit(arrayOfDigits[i-1], 10) >= Character.digit(arrayOfDigits[i], 10)) {
                if(i == 1) {
                    notPossible = true;
                }
                continue;
            }

            for(int j=arrayOfDigits.length-1; j>i; j--) {
                //Select the last digit of the first sequence: 3472(2) 641
                if(Character.digit(arrayOfDigits[i-1], 10) >= Character.digit(arrayOfDigits[j], 10)) {
                    continue;
                }

                //Find the smallest digit in the second sequence that is larger than it: 3472(2) 6(4)1
                // and swap them 3472(4) 6(2)1
                char temp = arrayOfDigits[i-1];
                arrayOfDigits[i-1] = arrayOfDigits[j];
                arrayOfDigits[j] = temp;
            }

            //Sort the second sequence into increasing order: 34724 126
            Arrays.sort(arrayOfDigits, i, arrayOfDigits.length);
            break;
        }

        return (notPossible)? -1 : Integer.parseInt(String.valueOf(arrayOfDigits));
    }
}


 class TextingNextHigherIntWithSameDigits {
     public static void main(String[] args) {
         nextHigherIntWithSameDigits test = new nextHigherIntWithSameDigits();
         System.out.println(test.getHigherInt(34722641));
         System.out.println(test.getHigherInt(641));
         System.out.println(test.getHigherInt(230));
     }

}