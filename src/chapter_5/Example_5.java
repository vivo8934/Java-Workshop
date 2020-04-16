package chapter_5;

public class Example_5 {
    private static  void staticMethod(){
        System.out.println("static method, accessible from a null reference" );
    }

    private void  nonStaticMethod(){
        System.out.println("non-Static method, inaccessible from a null reference");
    }
    public static void main(String[] args) {
        Example_5 obj = null;

      //  obj.nonStaticMethod();
        obj.staticMethod();
    }
}
