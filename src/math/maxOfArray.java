package math;

/**
 * Created by roxana on 5/10/17.
 */
public class maxOfArray {
    public static double max(double array[]) {
        double max = array[0];
        for(int i=1; i<array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
