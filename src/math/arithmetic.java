package math;

/**
 * Created by roxana on 5/12/17.
 */
public class arithmetic {
    public static int multiplication(int num1, int num2) {
        // multiplication using recursion
        if(num1 == 0 || num2 == 0) {
            return 0;
        } else if(num2 == 1) {
            return num1;
        }
        return num1 + multiplication(num1, num2 -1);
    }

    public  static long factorial(int num) {
        // the highest factorial that can be accurately calculated by this application is 57! because the highest long integer is 9,223,372,036,854,775,807
        if(num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num-1);
    }

}
