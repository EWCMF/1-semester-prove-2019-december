import junit.framework.TestCase;

// Test er ikke ændret fra start.
public class MainTest extends TestCase {


    public void testHelloAndras() {

        Main m = new Main();

        assertEquals("Hello András!", m.hello("András"));

    }


    public void testHelloEmptyString() {

        Main m = new Main();

        assertEquals("Hello World!", m.hello(""));
    }
}