package CodingChallenges;

/**
 * Created by roxana on 8/24/17.
 */
public class CodeupChallenges {
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

    public static void main(String[] args) {
        generateNarcissisticNum();
    }
}
