package CodingChallenges;

/**
 * Created by roxana on 5/17/17.
 * Return the sum of the numbers in a given string divided by the number of letters.
 * The answer should be rounded to the nearest whole number.
 */

public class sumOfNumbersInString {
    private int counterOfNumbers = 0;

    public int sumOfNumbers(String input) {
        int sum = 0;
        String numbers = "0123456789";
        char[] inputArray = input.toCharArray();

        for (int j = 0; j < inputArray.length; j++) {
            if (numbers.indexOf(inputArray[j]) != -1) {
                sum += Character.digit(inputArray[j], 10);
                counterOfNumbers++;
            }
        }
        return Math.round(sum / (float) (input.length() - counterOfNumbers));
    }
}
