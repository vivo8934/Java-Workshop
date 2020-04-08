package chapter_3;

import java.util.HashSet;
import java.util.Set;

public class duplicates {
    public static void main(String[] args) {
        String [] names  = {"vivo", "mfundo", "bgfghc", "vivo"};
        for (int  i =0;i<names.length;i++){
            for (int j=0;i<names.length;i++){
              if (names[i].equals(names[j])){
                  System.out.println(names[i]);
              }
            }
      //      System.out.println();
        }
//        int [] nums = {1,2,3,4,5,6,7,7,5,4};
//        Set<Integer> store = new HashSet<>();
//        for (int numbers: nums){
//            if (store.add(numbers) == false){
//                System.out.println("Found duplicates: " + numbers);
//            }
//        }
    }

}

