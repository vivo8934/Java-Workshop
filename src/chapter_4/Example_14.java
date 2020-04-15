package chapter_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example_14 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add(2);
        list.add(37);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            int i = (Integer) iterator.next();
            System.out.print(i + " ");
        }
    }
}
