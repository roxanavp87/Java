package math;

/**
 * Created by roxana on 5/10/17.
 */
public class minOfArray {
    public static double min(double array[]) {
        double min = array[0];
        for(int i=1; i<array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
