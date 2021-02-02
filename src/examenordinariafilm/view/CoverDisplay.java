
package examenordinariafilm.view;

import examenordinariafilm.model.Cover;


public interface CoverDisplay {
   public void display(Cover image);
    
    public Cover cover();
    void on(Shift shift);
    
    interface Shift {
        Cover left();
        Cover right();
    }
}
