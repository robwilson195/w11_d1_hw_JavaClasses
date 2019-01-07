import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(20, 50);
    }

    @Test
    public void shouldHavePaperStock() {
        int expected = 20;
        assertEquals(expected, printer.getPaper());
    }

    @Test
    public void shouldFailToPrintIfInsufficientPaper() {
        printer.print(4, 6);
        assertEquals(20, printer.getPaper());
    }

    @Test
    public void shouldPrintIfSufficientPaper() {
        printer.print(3, 6);
        assertEquals(2, printer.getPaper());
    }

    @Test
    public void shouldBeAbleToRefill() {
        printer.print(3, 6);
        assertEquals(2, printer.getPaper());
        printer.refillPaper();
        assertEquals(20, printer.getPaper());
    }

    @Test
    public void shouldHaveToner() {
        assertEquals(50, printer.getToner());
    }

    @Test
    public void shouldLoseTonerUponPrinting() {
        printer.print(3, 6);
        assertEquals(32, printer.getToner());
    }
}
