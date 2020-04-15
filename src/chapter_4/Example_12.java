package chapter_4;

import java.util.ArrayList;
import java.util.List;

public class Example_12 {

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("No");
        list.add("Matter");
        list.add("What");
        list.add("Do");

        System.out.println(list);
        list.subList(2,4).clear();
        System.out.println(list);
    }
}
