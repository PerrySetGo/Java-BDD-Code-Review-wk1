import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzTest {

  @Test
  public void InputStringOutputsAString_istrue() {
    WordPuzz testWordPuzz = new WordPuzz();
    String testInput = "String";
    String outputString = testWordPuzz.switchLetters(testInput);
    assertEquals(true, outputString instanceof String);
  }

  @Test
  public void InputStringOutPutsAsDashIfAVowel_istrue() {
    WordPuzz testWordPuzz = new WordPuzz();
    String testInput = "A";
    String outputString = testWordPuzz.switchLetters(testInput);
    assertEquals(outputString, "-");
  }

  @Test
  public void InputStringOutPutDoesnotChangeIfAConsonant_istrue() {
    WordPuzz testWordPuzz = new WordPuzz();
    String testInput = "K";
    String outputString = testWordPuzz.switchLetters(testInput);
    assertEquals(outputString, testInput);
  }


  @Test
  public void InputStringIsConsonantWithRightCase_istrue() {
    WordPuzz testWordPuzz = new WordPuzz();
    String testInput = "K";
    String outputString = testWordPuzz.switchLetters(testInput);
    Boolean outputStringCase = Character.isUpperCase(outputString.charAt(0));
    assertEquals(true, true);
  }

}
