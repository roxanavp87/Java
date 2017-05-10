package math;

/**
 * Created by roxana on 5/10/17.
 */
public class averageOfArray {


    public static void main(String[] args) {
        double[] ints = {1 ,2, 3};

        System.out.println(average(ints));
    }

    public static double average(double grades[]) {
        double result = 0;
        for(int i=0; i<grades.length; i++) {
            result += grades[i];
        }
        return result/grades.length;

    }


}
