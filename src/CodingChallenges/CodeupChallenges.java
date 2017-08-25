package CodingChallenges;

import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by roxana on 8/24/17.
 */
public class CodeupChallenges {
    /* Narcissistic Numbers:
       A narcissistic number is a non-negative integer (n) with m digits where the sum of all the individual digits raised to the power m is equal to n.
       Write a script to generate and output the first 25 narcissistic integers.
    */
    public static void generateNarcissisticNum() {
        int n =0;
        int sum =0, count=0;

        while (count<25) {
            char[] digits = Integer.toString(n, 10).toCharArray();
            int m = digits.length;
            for (char digit : digits) {
                sum += (int) Math.pow(Character.getNumericValue(digit), m);
            }
            if(sum == n) {
                count++;
                System.out.println(n);
            }
            n++;
            sum = 0;
        }
    }

    /* Maximum Subsequence Sum:
       Write a function that, given an array of both positive and negative integers, will find the maximum sum of contiguous numbers within that array.
    */
    public static int LargestSumContiguousSubarray(int[] arr) {
        int[] arrSumContiguousNum = Arrays.copyOf(arr, arr.length);
        int maxSum = 0;
        int n=1;

        while (n < arr.length) {
            for(int i=0; i<arr.length-n; i++) {
                arrSumContiguousNum[i] += arr[i+n];
            }
            arrSumContiguousNum[arr.length-n] = maxSum;
            int[] copyOfArrSum = Arrays.copyOf(arrSumContiguousNum, arrSumContiguousNum.length);
            Arrays.sort(copyOfArrSum);
            maxSum = copyOfArrSum[copyOfArrSum.length-1];
            n++;
        }

        return maxSum;
    }

    public static void main(String[] args) {
//        generateNarcissisticNum();

        int[] arr1 = {-2, -3, 4, -1, -2, 1, 5, -3}; // Expected output: 7
        int[] arr2 = {-7, 1, -3, 4, -1, 2, 1, -5, 4}; // Expected output: 6
        System.out.println("Max sum is " + LargestSumContiguousSubarray(arr2));
    }
}
