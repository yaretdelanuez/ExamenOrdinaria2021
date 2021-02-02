/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenordinariafilm.control;

import examenordinariafilm.model.Cover;
import examenordinariafilm.view.CoverDisplay;
import examenordinariafilm.view.CoverLoader;
import java.util.List;

/**
 *
 * @author Yar
 */
public class InitCommand implements Command{
   
    private final CoverLoader coverLoader;
    private final List<Cover> covers;
    private final CoverDisplay coverDisplay;

    public InitCommand(CoverLoader imageLoader, List<Cover> images, CoverDisplay imageDisplay) {
        this.coverLoader = imageLoader;
        this.covers = images;
        this.coverDisplay = imageDisplay;
    }
    
    @Override
    public void execute() {
        covers.clear();
        covers.addAll(coverLoader.load());
        coverDisplay.display(covers.get(0));
    }
    
}