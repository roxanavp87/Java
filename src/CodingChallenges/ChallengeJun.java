package CodingChallenges;

import java.util.*;

/**
 * Created by roxana on 6/21/17.
 */
public class ChallengeJun {
    public static void main(String[] args) {
        Quiz1 q1 = new Quiz1();
        Quiz2 q2 = new Quiz2();
        Quiz3 q3 = new Quiz3();
        Quiz4 q4 = new Quiz4();
        Quiz5 q5 = new Quiz5();

//        Quiz 1
//        q1.q1();

        //Quiz 2
//        double[] arrayTest = {75, 89, 35, -3, 0, -23, 90, -90};
//        System.out.println(Arrays.toString(q2.minMax(arrayTest)));

        //Quiz3
//        System.out.println(q3.greatestCommonDivisor(15, 16));


//        Quiz 5
        List<Integer> list1 = new ArrayList<>(Arrays.asList(6, 9, 0, 5, 10, 89, 67, 90));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(8, 0, 4, 6, 90, 8));
        System.out.println(q5.mergeWithoutDuplicates(list1,list2));

    }
}

class Quiz1 {
    public void q1() {
        Scanner input = new Scanner(System.in);
        int number1, number2, option;
        System.out.println("Enter number 1");
        number1 = input.nextInt();
        System.out.println("Enter number 2");
        number2 = input.nextInt();

        System.out.println("Enter an option");
        System.out.println("(1) Multiplication\n" +
                           "(2) Division");

        option = input.nextInt();
        if(option == 1){
            System.out.println(number1*number2);
        } else if(option == 2) {
            System.out.println(number1/number2);
        } else {
            System.out.println("Select a valid option");
        }
    }
}

class Quiz2 {
    private double max(double array[]) {
        double max = array[0];
        for(int i=1; i<array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    private double min(double array[]) {
        double min = array[0];
        for(int i=1; i<array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public double[] minMax(double array[]) {
        double min = min(array);
        double max = max(array);
        double[] result = {min, max};
        return result;
    }

}

class Quiz3 {
    public int greatestCommonDivisor(int num1, int num2) {
        if (num2==0) {
            return num1;
        }
        return greatestCommonDivisor(num2,num1%num2);
    }
}

class Quiz4 {

}

class Quiz5 {

    public List<Integer> mergeWithoutDuplicates(List<Integer> list1, List<Integer> list2) {
        return removeDuplicates(mergeLists(list1, list2));
    }


    private List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    private List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> finalList = new ArrayList<>();
        int i =0;
        while (!list.isEmpty()){
            int value = list.get(i);
            list.remove(i);
            if(!list.contains(value)) { //value is unique, so add it to the list
                finalList.add(value);
            } else { //remove all the repetitions
                for(int j =0; j<list.size(); j++) {
                    if(value == list.get(j)) {
                        list.remove(j);
                    }
                }
            }
        }
        return finalList;
    }
}
