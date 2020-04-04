package chapter_2;

public class Exercise_3 {
    public static void main(String[] args) {
        int speed = 75;
        int speedForFine= 70;
        int maxSpeed = 60;

        if (speed <= maxSpeed){
            System.out.println("speed is less than equal max speed");
            if (speed < maxSpeed){
                System.out.println("speed is less than max speed");
            }
        }
        if (speed >= maxSpeed){
            System.out.println("you are over speed limit");
            if (speed > speedForFine){
                System.out.println("you are eligeble to get a fine for speeding");
            }
        }

    }
}
