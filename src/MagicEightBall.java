import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class MagicEightBall extends Ball {
    private String[] messages; //null
    public MagicEightBall(Color color, int size, String[] messages) {
        // new Ball (color, size)
        super(color, size);

        // super call is ALWAYS the first line in the constructor

        this.messages = messages;
    }

    public int getTotalMessages(){
        return messages.length;
    }

    public String getMessage(int index){
        return messages[index];
    }

    public String shake(){
        // generate random index for messages array

        int index = new Random().nextInt(getTotalMessages());

        // return message at the index generated
        return getMessage(index);

    }
    // super.toString would reach into the ball class and call that toString instead of this one
    @Override
    public String toString(){
        return "MagicEightBall Messages: " +
                Arrays.toString(messages) + "\n" + super.toString();
    }
}
