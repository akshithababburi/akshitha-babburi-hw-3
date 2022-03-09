package oodp;

import com.iit.hw3.LightBulb;
import com.iit.oodp.Button;
import com.iit.oodp.TableLamp;
import org.junit.Test;

public class TableLampTest {

    @Test
    public void testLamp() {
        Button b = new LightBulb();
        TableLamp lamp = new TableLamp(b);
        lamp.tableLampOff();
        lamp.tableLampOn();
    }


}
