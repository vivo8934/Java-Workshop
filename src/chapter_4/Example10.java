package chapter_4;

import java.util.ArrayList;
import java.util.List;

public class Example10 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(35);
        list.add(19);
        list.add(11);
        list.add(83);
        list.add(7);

        System.out.println(list);
        int index = list.indexOf(19);
        System.out.println("Index of 19: " + index);
        System.out.println("Component: " + list.get(index));
    }
}
