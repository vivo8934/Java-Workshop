package chapter_4;

import java.util.Arrays;

public class Example_4 {
    public static void main(String[] args) {

        String firstNames[] = new String[]{"Mfundo", "Anele", "Vusi", "Sandiso", "Vaz", "Richard", "yegan"};

        Arrays.sort(firstNames);
        System.out.println(Arrays.toString(firstNames));
        int search = Arrays.binarySearch(firstNames, "Vaz");
        System.out.println(search);
    }
}
