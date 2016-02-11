import org.junit.rules.ExternalResource;
import spark.Spark;

public class ServerRule extends ExternalResource {

  protected void before() {
      String[] args = {};
      WordPuzz.main(args);
   }

  protected void after() {
      Spark.stop();
  }
}
