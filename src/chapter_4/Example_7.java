package chapter_4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example_7 {
    public static void main(String[] args) {
        Integer odd[] = new Integer[]{1,3,5,7,9};
        Integer even[] = new Integer[]{2,4,6,8};

        Set set1 = new TreeSet();
        Collections.addAll(set1,odd);

        Set set2 = new TreeSet();
        Collections.addAll(set2, even);

        set1.addAll(set2);
        System.out.println(set1);

    }
}
