package oodp;

import com.iit.hw3.PushDownLightBulb;
import com.iit.oodp.PushDownButton;
import com.iit.oodp.PushDownLamp;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class PushDownLampTest {

    PushDownButton pushDownButton;
    PushDownLamp pushDownLamp;

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        pushDownButton = new PushDownLightBulb();
        pushDownLamp = new PushDownLamp(pushDownButton);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testLampOnAndOff() {
        pushDownLamp.operateLamp();
        assertEquals("Push button light is on", outputStreamCaptor.toString().trim());
        pushDownLamp.operateLamp();
    }
}
