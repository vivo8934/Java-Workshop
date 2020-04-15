package chapter_4;

import java.io.Console;
import java.util.*;

public class AnalseInputApp {

    public static void main(String[] args) {
        ArrayList <String> text = new ArrayList<String>();
        Console cons;
        String line = "";
        while (!line.equals(" * ") && (cons = System.console()) != null && (line = cons.readLine()) != null){
            List <String> lineList  = new ArrayList<String>(Arrays.asList(line.split(" ")));
            text.addAll(lineList);
        }
        System.out.println("You typed: " + text);
        System.out.println("Word count is : " + text.size());

        Set <String> textSet = new HashSet<String>();
        textSet.addAll(text);

        Iterator iterator = textSet.iterator();

        while (iterator.hasNext()){
            String s = (String) iterator.next();
            int freq = Collections.frequency(text, s);

            System.out.println(s + " appears " + freq + " times");
        }
    }
}
