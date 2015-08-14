import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.*;

public class wordPuzz {
  public static void main(String[] args){
    String layout = "templates/layout.vtl";

    // set up input page
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/input.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {

      //run the program first
      String userInput = request.queryParams("userInput");
      String outPut = switchLetters(userInput);

      //then output the change to the page
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("outPut", outPut);
      model.put("template", "templates/output.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String switchLetters(String userInput){

    String resetWord = "";
    String letter = "";
    String userInputUpperCase = "";
    Boolean whichCase = false;

    Integer stringLength = userInput.length();
    Integer counter = 0;

    while (counter < stringLength){
      //go through the word letter by letter
      letter = Character.toString(userInput.charAt(counter));

      //grab the case
      whichCase = Character.isUpperCase(letter.charAt(0));

      // make it uppercase so we can get by with only one set of switches
      letter = letter.toUpperCase();

      //sub it appropriately
      switch(letter){
        case "A":
        letter = letter.replaceAll("A", "-");
        resetWord = resetWord+letter;
        break;

        case "E":
        letter = letter.replaceAll("E", "-");
        resetWord = resetWord+letter;
        break;

        case "I":
        letter = letter.replaceAll("I", "-");
        resetWord = resetWord+letter;
        break;

        case "O":
        letter = letter.replaceAll("O", "-");
        resetWord = resetWord+letter;
        break;

        case "U":
        letter = letter.replaceAll("U", "-");
        resetWord = resetWord+letter;
        break;

        default: //reset the cases correctly for consonants.
          if (whichCase == false){
            letter = letter.toLowerCase();
            //print her
          }
          else{ //nothing here
          }
          resetWord = resetWord+letter; 
        break;
        }
        counter++;
      }

      return resetWord;

    }  //close method

  } //close main class
