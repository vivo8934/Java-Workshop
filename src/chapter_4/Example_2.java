package chapter_4;

import java.util.Arrays;

public class Example_2 {
    public static void main(String[] args) {
        int numbers [] = new int[10];
        int num = 2;
        for (int printNum: numbers) {
            Arrays.fill(numbers, ++num);
            System.out.print(printNum);
        }
    }
}
