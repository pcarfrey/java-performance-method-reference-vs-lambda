import org.junit.AfterClass;
import org.junit.Test;

public class MethodReferenceLambdaTimerTest {

    public static MethodReferenceLambdaTimer timer = new MethodReferenceLambdaTimer();
    public static final int NUMBER_OF_ELEMENTS = 10000;

    @Test
    public void testArrayListPrintlnString() {
        timer.arrayListPrintln("String", NUMBER_OF_ELEMENTS);
    }

    @Test
    public void testArrayListPrintlnInt() {
        timer.arrayListPrintln(123, NUMBER_OF_ELEMENTS);
    }

    @Test
    public void testArrayListValueOfString() {
        timer.arrayListValueOf("String", NUMBER_OF_ELEMENTS);
    }

    @Test
    public void testArrayListValueOfInt() {
        timer.arrayListValueOf(123, NUMBER_OF_ELEMENTS);
    }

    @AfterClass
    public static void printSummary() {
        timer.printSummary();
    }
}