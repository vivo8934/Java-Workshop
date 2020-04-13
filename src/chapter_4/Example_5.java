package chapter_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example_5 {

    public static void main(String[] args) {
        Integer [] myNums = new Integer[]{3,6,7,4,2,1};

        Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(myNums));
        System.out.println(mySet);

    }
}
