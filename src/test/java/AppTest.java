import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();


  @Test //basic test to show we are running input page correctly
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Word Puzzle Game!");
  }

  @Test //when we enter vowels, return page contains dashes
  public void vowelReplaceMentTest() {
      goTo("http://localhost:4567/");
      fill("#userInput").with("AAA");
      submit(".btn");
      assertThat(pageSource()).contains("---");
  }

  @Test //when we enter consonants, return page contains consonants
  public void consonantReplaceMentTest() {
      goTo("http://localhost:4567/");
      fill("#userInput").with("PPP");
      submit(".btn");
      assertThat(pageSource()).contains("PPP");
  }
}
