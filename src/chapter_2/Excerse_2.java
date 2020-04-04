package chapter_2;

public class Excerse_2 {
    public static void main(String[] args) {
        int maxDistance = 10;
        int distanceToHome = 11;
        if(distanceToHome > maxDistance){
            System.out.println("Distance from store  to your home is: ");
            System.out.println(" more than " + maxDistance + "km away");
            System.out.println("That is too far for free delivery");
        }
        if (distanceToHome <= maxDistance){
            System.out.println("Distance from store to your home is: ");
            System.out.println(" within " + maxDistance + "km away");
            System.out.println("you will get a free delivery");
        }
    }
}
