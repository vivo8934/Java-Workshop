package chapter_4;

import java.util.Arrays;

public class Example_1 {

    public static void main(String[] args) {
        String name[] = new String[]{"Mfundo", "Yash", "Anele", "Vusi", "Sandiso"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

        for (int i = 0; i < name.length;i++)
            System.out.print(name[i] + " , ");
    }
}
