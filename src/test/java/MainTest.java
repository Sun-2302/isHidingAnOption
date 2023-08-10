import org.example.Main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void isHidingAnOptionTest(){
        //Output excepted: True
        assertTrue(Main.isHidingAnOption("X..C....A.."));
        assertTrue(Main.isHidingAnOption("XC.A"));
        assertTrue(Main.isHidingAnOption("X..........C...........A....C"));

        //Output excepted: False
        assertFalse(Main.isHidingAnOption("X...C..A"));
        assertFalse(Main.isHidingAnOption("X....A.C.....C.C"));
        assertFalse(Main.isHidingAnOption("X.....A"));
        assertFalse(Main.isHidingAnOption("X..C..A"));
    }

}
