package quiz;
import junit.framework.TestCase;

public class SporgsmaalTest extends TestCase {

    // Begge test fejler men det er en måde at se exceptions i brug.

    public void testSetSporgsmaalTekstException() {
        Sporgsmaal sporgsmaal = new Sporgsmaal();
        sporgsmaal.setSporgsmaalTekst("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
    }

    public void testSetPointException() {
        Sporgsmaal sporgsmaal = new Sporgsmaal();
        sporgsmaal.setPoint(-4);
    }
}
