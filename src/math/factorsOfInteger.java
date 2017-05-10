package math;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by roxana on 5/10/17.
 */
public class factorsOfInteger {
    public static void main(String[] args) {
        System.out.println(factors(12));
    }

    public static ArrayList factors(int num) {
        // create an array list
        ArrayList al = new ArrayList();

        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                al.add(i);
                if(i != num/i) {
                    al.add(num/i);
                }
            }
        }
        Collections.sort(al);
        return al;
    }
}
