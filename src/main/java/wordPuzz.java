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
      //set up the hashmap and set the output
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/output.vtl");

      //run the program
      String userInput = request.queryParams("userInput");
      String outPut = switchLetters(userInput);

      //output the change to the page
      model.put("outPut", outPut);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String switchLetters( String userInput ){

    String userInputUpperCase = userInput.toUpperCase();
    String resetWord = "";
    String letter = "";
    Integer stringLength = userInputUpperCase.length();
    Integer counter = 0;

    while (counter < stringLength){

      letter = Character.toString(userInputUpperCase.charAt(counter));

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

        default:
        letter = letter;
        resetWord = resetWord+letter;
        break;
    }

    counter++;

  }

  return resetWord;



  //close method


  // public static String createOutput( String transformer, String userInput ){
  //
  //   if (userInput instanceof String){
  //     outPutType = "String";
  //   }
  //   return outPutType;
  // }


}

}
//close main class
