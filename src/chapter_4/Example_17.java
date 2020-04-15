package chapter_4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Example_17 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        Set setOfkey;
        String key;

        properties.put("OS", "Ubuntu Linux");
        properties.put("version","18.04");
        properties.put("Language", "English (UK)");

        setOfkey = properties.keySet();
        Iterator iterator = setOfkey.iterator();

        while (iterator.hasNext()){
            key = (String) iterator.next();
            System.out.println(key + " = " + properties.getProperty(key));
        }
        System.out.println();
        String value = properties.getProperty("keyboard layout", "not found");
        System.out.println("keyboard layout = " + value);
    }
}
