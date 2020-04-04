package chapter_1;

public class CheckingStatics {
     static  int vivo;
     int  sino;

    @Override
    public  String toString() {
        return "CheckingStatics{" +
                "sino=" + sino + vivo +
                '}';

    }

    public static void main(String[] args) {
        CheckingStatics a = new CheckingStatics();
        CheckingStatics b = new CheckingStatics();
        a.vivo = 4;
        a.sino = 5;
        b.vivo = 8;
        b.sino =10;
        System.out.println(a.vivo + " " + a.sino + " " + b.vivo + " " + b.sino);
        // output is : 8 5 8 10
    }
}
