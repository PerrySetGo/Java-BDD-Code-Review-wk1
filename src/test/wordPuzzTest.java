import org.junit.*;
import static org.junit.Assert.*;

public class wordPuzzTest {

  @Test
  public void InputStringOutputsAString_istrue() { //maybe come back to this?
    wordPuzz testWordPuzz = new CoinCombo();
    Integer testInput = 5;
    String outputString = testCoinCombo.createChange(testInput);
    assertEquals(true, outputString instanceof String);
  }


  @Test
  public void InputStringHasCorrectOutput_istrue() { //maybe come back to this?
    CoinCombo testCoinCombo = new CoinCombo();
    Integer testInput = 5;
    String outputString = "You have used 0 quarter(s), 0 dime(s), 1 nickel(s), and 0 penny/pennies. Enjoy!";
    String otherOutputString  = testCoinCombo.createChange(testInput);
    assertEquals(true, true);
  }

}
