package chapter_3;

public class Example_4 {
    public static long fact(int n){
        if (n == 1)
            return 1;
        return  n * fact(n -1);
    }

    public static void main(String[] args) {
        int input = Integer.parseInt("2");
        long factorial = fact(input);
        System.out.println(factorial);
    }
}
