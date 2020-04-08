package chapter_3;

public class Example_5 {
    public static void main(String[] args) {
        Container cc  = new Container();
        cc.printContinent();
    }
}

class Container{
    private class  Continent{

        public void print(){
            System.out.println("This is a inner class");
        }
    }

    void  printContinent(){
        Continent continent = new Continent();
        continent.print();
    }

}
