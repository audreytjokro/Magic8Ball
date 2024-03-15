import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MagicEightBallTest {

    private String[] messages = {"Yes", "No", "Maybe", "Ask again later"};

    @Test
    void getTotalMessages() {
        MagicEightBall magicEightBall = new MagicEightBall(Color.BLACK, 5, messages);
        int total = magicEightBall.getTotalMessages();
        assertEquals(messages.length, total,"Total messages should be equal to the length of the messages array");
    }

    @Test
    void getMessage() {
        MagicEightBall magicEightBall = new MagicEightBall(Color.BLACK, 5, messages);
        String message = magicEightBall.getMessage(1);
        assertEquals("No", message, "The message at index 1 should be 'No'");
    }

}