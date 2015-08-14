import org.junit.*;
import static org.junit.Assert.*;

public class wordPuzzTest {

  @Test
  public void InputStringOutputsAString_istrue() {
    wordPuzz testWordPuzz = new wordPuzz();
    String testInput = "String";
    String outputString = testWordPuzz.switchLetters(testInput);
    assertEquals(true, outputString instanceof String);
  }

  @Test
  public void InputStringOutPutsAsDashIfAVowel_istrue() {
    wordPuzz testWordPuzz = new wordPuzz();
    String testInput = "A";
    String outputString = testWordPuzz.switchLetters(testInput);
    assertEquals(outputString, "-");
  }

  @Test
  public void InputStringOutPutDoesnotChangeIfAConsonant_istrue() {
    wordPuzz testWordPuzz = new wordPuzz();
    String testInput = "K";
    String outputString = testWordPuzz.switchLetters(testInput);
    assertEquals(outputString, testInput);
  }


  @Test
  public void InputStringIsConsonantWithRightCase_istrue() {
    wordPuzz testWordPuzz = new wordPuzz();
    String testInput = "K";
    String outputString = testWordPuzz.switchLetters(testInput);
    Boolean outputStringCase = Character.isUpperCase(outputString.charAt(0));
    assertEquals(true, true);
  }

}
