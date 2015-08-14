import org.junit.*;
import static org.junit.Assert.*;

public class wordPuzzTest {

  @Test
  public void InputStringOutputsAString_istrue() { //maybe come back to this?
    wordPuzz testWordPuzz = new wordPuzz();
    String testInput = "String";
    String outputString = testCoinCombo.createOutput(testInput);
    assertEquals(true, outputString instanceof String);
  }

}
