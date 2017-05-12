package math;

/**
 * Created by roxana on 5/12/17.
 */
public class arrays {

    public static double average(double array[]) {
        double result = 0;
        for(int i=0; i<array.length; i++) {
            result += array[i];
        }
        return result/array.length;
    }

    public static double max(double array[]) {
        double max = array[0];
        for(int i=1; i<array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

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
