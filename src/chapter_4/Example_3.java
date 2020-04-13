package chapter_4;

/**
 * Creating an array and making copies of that original array using.
 * copyOfRange method , creates a copy from an original array using range from and to.
 * copyof method , creates a new copy but with a modify length of an array.
 *
 * @Author: Mfundo Ngqanekana.
 */


import java.util.Arrays;

public class Example_3 {

    public static void main(String[] args) {
        int[] num = new int[5];

        Arrays.fill(num, 1);
        System.out.println(Arrays.toString(num));

        int[] copyNum = Arrays.copyOfRange(num, 0, 2);
        System.out.println(Arrays.toString(copyNum));

        boolean comparison = Arrays.equals(num, copyNum);
        int[] longNum = new int[0];
        boolean compOne = Arrays.equals(copyNum, longNum);
        System.out.println(comparison);

        longNum = Arrays.copyOf(num, 10);
        System.out.println(Arrays.toString(longNum));

    }
}
