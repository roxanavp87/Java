package math;

/**
 * Created by roxana on 5/11/17.
 */
public class multiplication {
    public static int multWithRecursion(int num1, int num2) {
        if(num1 == 0 || num2 == 0) {
            return 0;
        } else if(num2 == 1) {
            return num1;
        }
        return num1 + multWithRecursion(num1, num2 -1);
    }
}
