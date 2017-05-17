package JavaII;

/**
 * Created by roxana on 5/17/17.
 * Bob is a lackadaisical teenager. In conversation, his responses are very limited.
 * Bob answers 'Sure.' if you ask him a question.
 * He answers 'Whoa, chill out!' if you yell at him.
 * He says 'Fine. Be that way!' if you address him without actually saying anything.
 * He answers 'Whatever.' to anything else.
 */

public class TalkWithBob {

    public String sayHello() {
        return "Hello, I'm Bob!";
    }

    public String getAnswer(String question) {
        String answer = "It's the end";
        if(!question.equalsIgnoreCase("end")) {
            if (question.endsWith("?")) {
                answer = "Sure";
            } else if (question.trim().equals("")) {
                answer = "Fine. Be that way";
            } else if (question.equals(question.toUpperCase()) && !question.equals(question.toLowerCase())) {
                answer = "Whoa, chill out!";
            } else {
                answer = "Whatever";
            }
        }
        return answer;
    }

}
