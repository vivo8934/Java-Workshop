package chapter_5;

/**
 * Exception in java
 * @Author : Mfundo Ngqanekana
 */

public class Example_1 {
    public static void main(String[] args) {
        String s = null;
        System.out.println("Go Java Go");
        try {
            System.out.println(s.length());
            System.out.println("Programs that wont be reached");
        } catch (NullPointerException e) {
            System.out.println("Cant get length of null string");
        }

    }
}
