package chapter_5;

public class BreakingTheLaw {

    public static class MyException extends Exception{

       public MyException(){
            super();
        }
        public  MyException(String message){
           super(message);
        }
        public MyException(String message, Throwable cause){
           super(message,cause);
        }
        public MyException(Throwable cause){
           super(cause);
        }
    }

    public static void main(String[] args) throws MyException {
        String s =  null;

        try {
            System.out.println(s.length());
        }catch (NullPointerException ne){
            throw new MyException("Exception: My Exception Happened", ne);
        }
    }
}
