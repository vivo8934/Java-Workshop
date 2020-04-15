package chapter_4;

import java.io.Console;

public class AnalyseInput {
    public static void main(String[] args) {
        Console cons;
        String line = "";
        if ((cons = System.console()) != null && (line = cons.readLine()) != null){
            System.out.println("You type: " + line);
        }
    }
}
