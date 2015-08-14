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
    System.out.println("Should be Uppercase:" + userInputUpperCase );
    userInputUpperCase = userInputUpperCase.replaceAll("A", "-");
    System.out.println("Should be edited:" + userInputUpperCase );
    return userInputUpperCase;
  }


  // public static String createOutput( String transformer, String userInput ){
  //
  //   if (userInput instanceof String){
  //     outPutType = "String";
  //   }
  //   return outPutType;
  // }




}//close main class
