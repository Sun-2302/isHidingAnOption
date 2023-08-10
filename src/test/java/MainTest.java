import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void isHidingAnOptionTest(){
        //Output excepted: True
        Assertions.assertTrue(Main.isHidingAnOption("X..C....A.."));
        Assertions.assertTrue(Main.isHidingAnOption("XC.A"));
        Assertions.assertTrue(Main.isHidingAnOption("X..........C...........A....C"));

        //Output excepted: False
        Assertions.assertFalse(Main.isHidingAnOption("X...C..A"));
        Assertions.assertFalse(Main.isHidingAnOption("X....A.C.....C.C"));
        Assertions.assertFalse(Main.isHidingAnOption("X.....A"));
        Assertions.assertFalse(Main.isHidingAnOption("X..C..A"));
    }

}
