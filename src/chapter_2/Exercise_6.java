package chapter_2;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        String message;

        Scanner seasonNo = new Scanner(System.in);
        System.out.println("Enter a number");
        int season = seasonNo.nextInt();

        switch (season){
            case 1:
                message = "Summer";

                break;
            case 2:
                message = "Autum";

                break;
            case 3:
                message = "Spring";

                break;
            case 4:
                message = "Winter";

                break;
            default:
                System.out.println("number does not corrrespond with seasons");
        }
    }
}
