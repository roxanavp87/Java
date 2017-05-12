package math;

/**
 * Created by roxana on 5/12/17.
 */
public class randomNumber {
    public static int random(int min, int max) {
        return (int)Math.round(Math.random()*(max - min)) + min;
    }
}
