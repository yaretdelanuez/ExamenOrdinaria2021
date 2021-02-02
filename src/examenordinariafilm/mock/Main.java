
package examenordinariafilm.mock;

import examenordinariafilm.control.Command;
import examenordinariafilm.control.InitCommand;
import examenordinariafilm.model.Cover;
import examenordinariafilm.view.CoverDisplay;
import examenordinariafilm.view.CoverLoader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    private static Map<String, Command> initCommands(List<Cover> images, CoverDisplay imageDisplay, CoverLoader imageLoader) {
        HashMap<String, Command> result = new HashMap<>();
        //result.put("q", new ExitImageCommand());
        result.put("i", new InitCommand(imageLoader, images, imageDisplay));
        //result.put("p", new PrevImageCommand(images, imageDisplay));
        //result.put("n", new NextImageCommand(images, imageDisplay));
        //result.put("Q", result.get("q"));
        //result.put("P", result.get("p"));
        //result.put("N", result.get("n"));
        return result;
    }   
}
