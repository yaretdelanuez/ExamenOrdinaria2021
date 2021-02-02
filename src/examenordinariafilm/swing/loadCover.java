/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenordinariafilm.swing;

import examenordinariafilm.view.CoverLoader;
import examenordinariafilm.model.Cover;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yar
 */

public class loadCover implements CoverLoader{
    private final File root;
    
    public loadCover(File root) {
        this.root = root;
    }
    
    @Override
    public List<Cover> load() {
        List<Cover> result = new ArrayList<>();
        for(File file : root.listFiles(filter()))
            result.add(new Cover(file.getAbsolutePath()));
        return result;
    }

    private static final String[] ImageExtensions = new String[] {"jpg", "png", "jpeg"};
    private FilenameFilter filter() {
        return new FilenameFilter() {
            @Override
            public boolean accept(File file, String name) {
                for(String extension : ImageExtensions)
                    if (name.endsWith(extension)) return true;
                return false;
            }
        };
    }
}