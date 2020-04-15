package chapter_4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example_15 {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<Double>();
        list.add(2.4);
        list.add(2.5);
        list.add(2.6);
        list.add(2.7);

        System.out.print("Original List: " + list + "\n");

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            double d = (Double) listIterator.next();

            listIterator.set(Math.round(d));

        }
        System.out.print("Modified list: " + list);
    }
}
