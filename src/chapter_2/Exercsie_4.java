package chapter_2;

import java.util.Scanner;

public class Exercsie_4 {
    public static void main(String[] args) {
//        int age = 30;
        Scanner enterAge = new Scanner(System.in);
        System.out.println("Please enter age: ");
        int age = enterAge.nextInt();
        Scanner enterBpm = new Scanner(System.in);
        System.out.println("enter bpm: ");
        int bpm = enterBpm.nextInt();

        if (age <= 30){
            if ((bpm >= 95) && (bpm <= 162)){
                System.out.println("Heart rate is normal");
            }
            else if (bpm < 95){
                System.out.println("Heart rate is very low");
            }
            else {
                System.out.println("Heart rate is very high");
            }
        }else if (age > 30 ){
            if ((bpm >= 80)&& (bpm <= 136)){
                System.out.println("Heart rate is normal");
            }
        }else if (bpm < 80){
            System.out.println("Heart rate is very low");
        }else {
            System.out.println("Heart rate very high");
        }

    }
}
