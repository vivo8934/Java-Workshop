package chapter_3.wordtool;

import java.util.Arrays;

public class WordTool {

    WordTool(){}

    public int wordCount(String s){
        int count = 0;
        if (!(s.isEmpty() || s == null)){
            String[] w = s.split("\\s+");
            System.out.println(Arrays.toString(w));
            count  = w.length;
        }
        System.out.println(count);
        return  count;
    }

    public int charaterCount(String s, boolean withSpaces){
        int count = 0;
        if ((!s.isEmpty() || s == null)){
            if (withSpaces){
                count = s.length();
                System.out.println(count);
            }else {
                count = s.replace(" ", "").length();
                System.out.println(count);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        WordTool wb = new WordTool();
        wb.wordCount("Mfundo Ngqanekana");
        wb.charaterCount("Mfundo Ngqanekana",false);
    }
}
