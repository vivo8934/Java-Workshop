package chapter_1;

/**
 this set of code is using the theorem of pythagoras
 //to calculate the value of hypotenuse.

 h^2 = a^2 + b^2  - formular to calculate
 **/

public class Example_6 {

    public static void main(String[] args) {
        double a = 4;
        double b = 3;
        double h = 0;

        h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println(h);
    }

}
