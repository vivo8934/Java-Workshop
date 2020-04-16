package chapter_5;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example_3 {
    public static void main(String[] args)   {

        List<String> lines = Collections.emptyList();

        try {
            lines = Files.readAllLines(Paths.get("readme.txt"));
        }catch (NoSuchFileException e){
            System.out.println("Exception: File not found");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("Exception: IO exception");
        }


        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
