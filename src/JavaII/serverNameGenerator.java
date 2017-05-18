package JavaII;

/**
 * Created by roxana on 5/18/17.
 */
public class serverNameGenerator {
    private String[] adjectives = {"clean", "elegant", "fancy", "powerful", "important",
                            "white", "old-fashioned", "wrong", "mushy", "big"};
    private String[] nouns = {"team", "family", "friendship", "trust", "ocean",
                        "train", "sunset", "visitor", "water", "rice"};

    public String serverGenerator() {
        return adjectives[math.randomNumber.random(0,9)] + " " + nouns[math.randomNumber.random(0,9)];
    }
}

class testingServerNameGenerator {
    public static void main(String[] args) {
        serverNameGenerator serverName = new serverNameGenerator();
        System.out.println(serverName.serverGenerator());
    }
}
