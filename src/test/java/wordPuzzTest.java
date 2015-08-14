import org.junit.*;
import static org.junit.Assert.*;

public class wordPuzzTest {

  @Test
  public void InputStringOutputsAString_istrue() {
    wordPuzz testWordPuzz = new wordPuzz();
    String testInput = "String";
    String outputString = testWordPuzz.createOutput(testInput);
    assertEquals(true, outputString instanceof String);
  }


  //maybe come back to this
  // @Test
  // public void InputStringOutputsAsDifferentString_istrue() {
  //   wordPuzz testWordPuzz = new wordPuzz();
  //   String testInput = "thisisateststringthatnoonewillenter";
  //   String outputString = testWordPuzz.createOutput(testInput);
  //   assertNotEquals(true, true);
  // }

}
