package chapter_4;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example_9 {

    public static void main(String[] args) {
        Set set  = new LinkedHashSet();

        set.add(35);
        set.add(19);
        set.add(11);
        set.add(83);
        set.add(7);

        System.out.println(set);

        Set set2 = new LinkedHashSet();
        set2.add(3);
        set2.add(19);
        set2.add(11);
        set2.add(0);
        set2.add(7);

        set.containsAll(set2);
        System.out.println(set);


            }
}
