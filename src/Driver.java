import java.awt.*;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
//        // construct a ball object
//        Ball ball = new Ball(Color.GRAY,8);
//        // call toString() automatically
//        System.out.println(ball);
//
//        //declare an array of Ball objects - holding 2 ball objects
//        Ball[] ballArray = {
//                new Ball(Color.GRAY, 10),
//                new Ball(Color.BLUE, 5)
//        };
//
//        // this object ballArray[0] size = 10 GRAY
//        // other object ballArray[1] size = 5 BLUE
//        int result = ballArray[0].compareTo(ballArray[1]);
//        System.out.println("Result: " + result);
//
//        // use the sort method in the Arrays class
//        // to put the ball objects in order
//        Arrays.sort(ballArray);
//        System.out.println(Arrays.toString(ballArray));

        String[] msgs = {"yes", "no", "maybe", "definitely not", "without a doubt", "most likely", "signs point to yes", "outlook bad"};

        MagicEightBall ball8 = new MagicEightBall(Color.darkGray,
                10, msgs);

        for (int i = 1; i <= 5; i++) {
            System.out.println("You shake the magic eight ball.");
            System.out.println("The ball says: " + ball8.shake());
            System.out.println();
        }

        System.out.println(ball8);
    }
}
