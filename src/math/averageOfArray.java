package math;

/**
 * Created by roxana on 5/10/17.
 */
public class averageOfArray {


    public static void main(String[] args) {
        double[] ints = {1 ,2, 3};

        System.out.println(average(ints));
    }

    public static double average(double array[]) {
        double result = 0;
        for(int i=0; i<array.length; i++) {
            result += array[i];
        }
        return result/array.length;

    }


}
