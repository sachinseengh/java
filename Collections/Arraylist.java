// package Collections;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(0, 7);
        list.add(1, 8);

        // System.out.println(list);

        // add to arraylist together

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(46);
        list2.add(47);

        // if we donot provide the index then it add from the last elements of list
        list.addAll(0, list2);

        // set replace the element
        list.set(1, 18);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
