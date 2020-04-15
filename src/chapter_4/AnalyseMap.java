package chapter_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AnalyseMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name", "Mfundo Vincent");
        map.put("surname", "Ngqanekana");
        map.put("address", "Die Hoewes Towers");
        map.put("mobile", "0797018505");
        map.put("Occupation", "Software Developer");

        Iterator <Map.Entry> iterator  = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            System.out.print("Key= " + entry.getKey());
            System.out.println(", Value= " + entry.getValue());

        }
    }
}
