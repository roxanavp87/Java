package JavaII;

/**
 * Created by roxana on 5/16/17.
 */
public class Testing {
    public static void main(String[] args) {
        Person p1 = new Person("Rox");

        p1.sayHello();

        // change name
        p1.setName("Ana");

        p1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person1.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

        Input in = new Input();
        System.out.println("Do you want to continue?");
        System.out.println(in.yesNo());

        int userInput = in.getInt(5, 10);
        System.out.println(userInput);

        double userIn = in.getDouble(5.0, 100.23);
        System.out.println(userIn);


    }
}
