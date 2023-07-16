import java.util.*;

public class Copyingarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        ArrayList<Integer> list2 = new ArrayList<>();

        // for (int i = 0; i < list.size(); i++) {
        // int a = list.get(i);
        // list2.add(a);
        // }
        list2.addAll(0, list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list2.get(i));
        }

    }
}
