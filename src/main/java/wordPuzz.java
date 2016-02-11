import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.*;

public class WordPuzz {
  public static void main(String[] args){
    String layout = "templates/layout.vtl";
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/input.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {
      String userInput = request.queryParams("userInput");
      String outPut = switchLetters(userInput);

      Map<String, Object> model = new HashMap<String, Object>();
      model.put("outPut", outPut);
      model.put("template", "templates/output.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String switchLetters(String userInput){
    String userOutput = userInput;
    int counter = 0;

    while (counter < userOutput.length()){
      String[] vowelsArray = {"A","a", "E", "e", "I", "i", "O","o","U", "u"};//catch all cases

      for (String vowel : vowelsArray){
        userOutput = userOutput.replaceAll(vowel, "-");
      }
      counter++;
    }
  return userOutput;
  }
}
