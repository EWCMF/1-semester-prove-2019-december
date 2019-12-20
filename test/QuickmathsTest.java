import org.junit.Test;

import static org.junit.Assert.*;

// Tests her er skrevet selv.
public class QuickmathsTest {

    @Test
    public void testSum() {
        Quickmaths quickmaths = new Quickmaths();
        int a = 4;
        int b = 10;

        int sum = quickmaths.sum(a, b);

        assertEquals(14, sum);
    }

    @Test
    public void testGennemsnit() {
        Quickmaths quickmaths = new Quickmaths();
        int a = 10;
        int b = 6;

        int gennemsnit = quickmaths.gennemsnit(a, b);

        assertEquals(8, gennemsnit);
    }
}