import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void hasPaper() {
        assertEquals(100, printer.getSheetsOfPaper());
    }
    @Test
    public void hasToner() {
        assertEquals(50, printer.getTonerVolume());
    }
    @Test
    public void canPrint() {
        assertEquals("Printed 40 pages. There are 60 sheets of paper and 10 volumes of toner left in the cartridge.", printer.print(10, 4));
    }
    @Test
    public void lowOnToner() {
        assertEquals("There are only 50 volumes of toner and you require 60 for your print request!", printer.print(10, 6));
    }
    @Test
    public void lowOnPaper() {
        assertEquals("There are only 100 sheets of paper and you require 120 for your print request!", printer.print(10, 12));
    }
    @Test
    public void canRefillPaper() {
        assertEquals(100, printer.getSheetsOfPaper());
    }
    @Test
    public void canRefillToner() {
        assertEquals(50, printer.getTonerVolume());
    }

}
