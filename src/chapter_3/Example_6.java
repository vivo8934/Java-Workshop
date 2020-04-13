package chapter_3;

/**
 * Inner class
 * @Atuthor: Mfundo Ngqanekana
 * @since : 2020/04/08
 */
class Containers{
    int c = 17;
    public void print(){
        System.out.println("This is a outer class ");
    }
}

public class Example_6 {
    public static void main(String[] args) {
        Containers containers = new Containers(){
            @Override
            public void print() {
                System.out.println("Inner class");
            }
        };
        containers.print();
        System.out.println(containers.c);
    }

}
