package chapter_1;

public class Example_4 {


    public  double pythagoras(double a,double b){

      double c  = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println(c);
        return c;

    }

    public static void main(String[] args) {
        Example_4 example4 = new Example_4();
        example4.pythagoras(2,3);
    }
}
