/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenordinariafilm.mock;

import examenordinariafilm.model.Cover;
import examenordinariafilm.view.CoverDisplay;

/**
 *
 * @author Yar
 */
public class MockCoverDisplay implements CoverDisplay {
    
    private Cover cover;
    @Override
    public void display(Cover image) {
        this.cover = cover;
        System.out.println(cover.getName());
    }

    @Override
    public Cover cover() {
        return cover;
    }

    @Override
    public void on(Shift shift) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

