import java.util.Scanner;

/**
 * Created by roxana on 5/12/17.
 */
public class funnyStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput;
        String str;

        System.out.println("Enter a string with a minimum of 10 characters and a number between 1 and 5: \n");
        str = in.nextLine();
        userInput = in.nextInt();


        for(int i=userInput; i<= str.length(); i+=userInput) {
            str = (toUpperCASE(str, i)).toString();
        }
        System.out.println(str);
    }

    public static StringBuilder toUpperCASE(String str, int index) {
        StringBuilder sb = new StringBuilder(str);
        sb.replace(index-1, index, (str.substring(index-1, index)).toUpperCase());
        return sb;
    }
}
