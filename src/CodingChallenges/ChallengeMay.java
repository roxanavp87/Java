package CodingChallenges;

import java.util.Scanner;

/**
 * Created by roxana on 5/26/17.
 */
public class ChallengeMay {
    public static void main(String[] args) {
        numberToWord nToW = new numberToWord();
        ExcelColumn ec = new ExcelColumn();
        Palindrome pal = new Palindrome();
        Count4 c4 = new Count4();
        CountFactorialNumbers countFactorialNum = new CountFactorialNumbers();
        Scanner input = new Scanner(System.in);
        int number;

//        //Quiz 1: Given a whole number from 1-9, turn it into the word it represents
//        System.out.println("Enter a number");
//        number = input.nextInt();
//        System.out.println(nToW.getWord(number));

//        //Quiz 2: Find Excel column name from a given column number
//        System.out.println("Enter an excel column number: ");
//        number = input.nextInt();
//        System.out.println("Excel column name is " + ec.getExcelColName(number));
//
//        //Quiz 3: Check if a number is Palindrome
//        System.out.println("Enter a number");
//        number = input.nextInt();
//        System.out.println(pal.ifPalindrome(number));

//        //Quiz 4: Count numbers from 1 to n that have 4 as a digit
//        System.out.println("Enter a number");
//        number = input.nextInt();
//        System.out.println(c4.count4(number));

        //Quiz 5: Count factorial numbers in a given range
        System.out.println("Enter low");
        int number1 = input.nextInt();
        System.out.println("Enter high");
        int number2 = input.nextInt();
        System.out.println(countFactorialNum.countFact(number1, number2));
    }
}

class numberToWord {
    /*
        Given a whole number from 1-9, turn it into the word it represents
        Input       Output
        5           Five
     */
    private String[] numbers = {"Zero", "One", "Two", "three", "Four", "Five", "Six", "Seven", "Nine"};

    public String getWord(int num) {
        if (num > 0 && num < 10) {
            return numbers[num];
        } else {
            return "Enter a valid number";
        }
    }
}


class ExcelColumn {
    /*
        Find Excel column name from a given column number
        MS Excel columns has a pattern like A, B, C, … ,Z, AA, AB, AC,…. ,AZ, BA, BB, … ZZ, AAA, AAB ….. etc.
        In other words, column 1 is named as “A”, column 2 as “B”, column 27 as “AA”.
       Given a column number, find its corresponding Excel column name. Following are more examples.
        Input          Output
         26             Z
         51             AY
         52             AZ
         80             CB
         676            YZ
         702            ZZ
         705            AAC
    */

    public String getExcelColName(int num) {
        // 'A' = 65, 'B' = 66;
        String colName = "";
        do {
            num--;
            colName = (char) (num % 26 + 65) + colName;
            num /= 26;
        } while (num > 0);
        return colName;
    }
}


class Palindrome {
    /*
        Check if a number is Palindrome
        Given an integer, write a function that returns true if the given number is palindrome, else false.
        For example, 12321 is palindrome, but 1451 is not palindrome.
        Input       Output
        99699       true
        56455       false
     */

    public boolean ifPalindrome(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        for (int i = 0; i < digits.length / 2; i++) {
            if (digits[i] != digits[digits.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

class Count4 {
    /*
        Count numbers from 1 to n that have 4 as a digit
        Given a number n, find count of all numbers from 1 to n that have 4 as a digit
        Input       Output
        5           1
        50          14
     */
    public int count4(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            char[] digits = Integer.toString(i).toCharArray();
            for (char digit : digits) {
                if (digit == '4') {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

class CountFactorialNumbers {
    /*
        A number F is a factorial number if there exists some integer I >= 0 such that F = I! (that is, F is factorial of I).
        Examples of factorial numbers are 1, 2, 6, 24, 120, ….
        Write a program that takes as input two long integers ‘low’ and ‘high’ where 0 < low < high and finds count of factorial
        numbers in the closed interval [low, high]. Examples:

        Input: 0 1
        Output: 1 //Reason: Only factorial number is 1

        Input: 12 122
        Output: 2 // Reason: factorial numbers are 24, 120

        Input: 2 720
        Output: 5 // Factorial numbers are: 2, 6, 24, 120, 720
     */

    public int countFact(long low, long high) {
        int count = 0;
        for(long i=low; i<=high; i++) {
            if(ifFactorial(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean ifFactorial(long num) {
        long result = 1;
        int count = 1;
        while(result <= num) {
            result = math.arithmetic.factorial(count);
            if(result == num) {
                return true;
            }
            count++;
        }
        return false;
    }
}







