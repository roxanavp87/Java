package math;

/**
 * Created by roxana on 5/10/17.
 */
public class minOfArray {
    public static double min(double grades[]) {
        double min = grades[0];
        for(int i=1; i<grades.length; i++) {
            if(min > grades[i]) {
                min = grades[i];
            }
        }
        return min;
    }
}
