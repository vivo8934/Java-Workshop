package chapter_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example_16 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<Double>();
        list.add(5.0);
        list.add(2.2);
        list.add(37.5);
        list.add(3.1);
        list.add(1.3);

        System.out.print("Original list: " + list + "\n");
        Collections.sort(list);
        System.out.println("Modified list: " + list);
    }
}
