package chapter_4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example_6 {
    public static void main(String[] args) {
        String [] myArray = new String[]{"2","4","5","7","8","9"};

        Set mySet = new HashSet();

        Collections.addAll(mySet, myArray);
        System.out.println(mySet);
    }
}
