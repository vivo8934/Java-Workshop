package chapter_3;

public class Example {
    public static void main(String[] args) {
        Computerss tab = new Tablets();
        tab.whatIsIt();
    }
}
class Computerss{
    public static void whatIsIt(){
        System.out.println("This is a computer");
    }
}
class Tablets extends  Computerss{

    public static void whatIsIt() {
        System.out.println("this is a tablet");
    }
}

