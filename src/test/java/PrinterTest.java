import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(20);
    }

    @Test
    public void shouldHavePaperStock() {
        int expected = 20;
        assertEquals(expected, printer.getPaper());
    }
}
