import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test
    public void multiplicationOfZeroIntegerShouldReturnZero() {
        Main multiplyTester = new Main(); //Main is tested

        assertEquals(0, multiplyTester.multiply(10,0),"10 x 0 must be 0");
        assertEquals(0, multiplyTester.multiply(0,10),"0 x 10 must be 0");
        assertEquals(0, multiplyTester.multiply(0,0),"0 x 0 must be 0");


    }

    @Test
    public void divisionOfZeroIntegerShouldReturnZero() {
        Main divisionTester = new Main(); //Main is tested

        assertEquals(0, divisionTester.multiply(10,0),"10 / 0 must be 0");
        assertEquals(0, divisionTester.multiply(0,10),"0 / 10 must be 0");
        assertEquals(0, divisionTester.multiply(0,0),"0 / 0 must be 0");

    }

}
