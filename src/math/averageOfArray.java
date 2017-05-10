package math;

/**
 * Created by roxana on 5/10/17.
 */
public class averageOfArray {
    public static double average(double grades[]) {
        double result = 0;
        for(int i=0; i<grades.length; i++) {
            result += grades[i];
        }
        return result/grades.length;
    }
}
