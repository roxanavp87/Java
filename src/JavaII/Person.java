package JavaII;

/**
 * Created by roxana on 5/16/17.
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name =name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
