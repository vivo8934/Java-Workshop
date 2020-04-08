package chapter_3;

public class Example_2 {
    public  static  void checkNumber(Number val){
        if (val instanceof Number)
            System.out.println("It is an Integer");

        if (val instanceof Double)
            System.out.println("It is a Double");
    }

    public static void main(String[] args) {
        int val1 = 33;
        double val2 = 22.3;
        checkNumber(val1 );
        checkNumber(val2);
    }
}
