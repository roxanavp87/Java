package CodingChallenges;

/**
 * Created by roxana on 5/17/17.
 * Write a function that determines whether or not a given string is a valid password.
 * A password must follow these rules:
 * 1. It must have a capital letter
 * 2. It must have at least one number
 * 3. It must contain a punctuation mark
 * 4. It cannot have the word "password" in it.
 * 5. It must be longer than 7 characters and shorter than 21 characters.
 */

public class checkPassword {
    private char [] punctuation = {'.' , ',' , ';' , ':', '?' , '!' , '"' , '\'' , ')' , '('};
    private char [] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public boolean checkPass(String password) {
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasWordPassword = password.toLowerCase().contains("password");
        boolean hasRightSize = password.length() >= 7 && password.length() <= 21;
        boolean hasPunctuationMark = false;
        boolean hasNumber = false;

        for(int i=0; i<punctuation.length; i++) {
            if(password.indexOf(punctuation[i]) != -1) {
                hasPunctuationMark = true;
                break;
            }
        }

        for(int j=0; j<numbers.length; j++) {
            if(password.indexOf(numbers[j]) != -1) {
                hasNumber = true;
                break;
            }
        }

        return hasUppercase && !hasWordPassword && hasRightSize && hasPunctuationMark && hasNumber;
    }
}
