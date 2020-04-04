package chapter_2;

public class EnhanceLoop {
    public static void main(String[] args) {
        String [] letters = new String[]{"A","B","C","D", "E","F"};

        for (String letter: letters){
            if (letter.equals("C"))
                continue;
            System.out.print(letter + " ");
        }
    }
}
