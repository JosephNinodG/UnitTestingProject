import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test
    public void testEquals(){
        Main myMain = new Main();
        int a = 9;
        int b = 5;
        assertEquals(14, myMain.addStuff(9,5));
    }
}
