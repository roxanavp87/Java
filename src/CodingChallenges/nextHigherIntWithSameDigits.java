package CodingChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by roxana on 5/18/17.
 * Given a number, find the next higher number which has the exact same set of digits as the original number
 *
 * Solution: Given this number: 34722641
 * Step 1: Split the sequence of digits in two, so that the right part is as long as possible while remaining in decreasing order: 34722 641
 * Step 2: Select the last digit of the first sequence: 3472(2) 641
 * Step 3: Find the smallest digit in the second sequence that is larger than it: 3472(2) 6(4)1 and swap them: 3472(4) 6(2)1
 * Step 4: Sort the second sequence into increasing order: 34724 126
 */

public class nextHigherIntWithSameDigits {
    public int getHigherInt(int num) {
        String sNum = Integer.toString(num);
        char [] digits = sNum.toCharArray();
        boolean notPossible = false;

        for(int i=digits.length-1; i>0; i--) {

            //step 1
            if(Character.digit(digits[i-1], 10) >= Character.digit(digits[i], 10)) {
                if(i == 1) {
                    notPossible = true;
                }
                continue;
            }

            for(int j=digits.length-1; j>=i; j--) {
                //step 2
                if(Character.digit(digits[i-1], 10) >= Character.digit(digits[j], 10)) {
                    continue;
                }

                //step 3
                char temp = digits[i-1];
                digits[i-1] = digits[j];
                digits[j] = temp;
                break;
            }

            //step 4
            Arrays.sort(digits, i, digits.length);
            break;
        }

        return (notPossible)? -1 : Integer.parseInt(String.valueOf(digits));
    }
}


 class TestingNextHigherIntWithSameDigits {
     public static void main(String[] args) {
         nextHigherIntWithSameDigits test = new nextHigherIntWithSameDigits();
         System.out.println("Testing: 230, Output: " + test.getHigherInt(230) + ", Expected: 302");
         System.out.println("Testing: 34722641, Output: " + test.getHigherInt(34722641) + ", Expected: 34724126");
         System.out.println("Testing: 1234675, Output: " + test.getHigherInt(1234675) + ", Expected: 1234756");
     }

}