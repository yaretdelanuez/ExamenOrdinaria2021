
package examenordinariafilm;

import examenordinariafilm.control.Command;
import examenordinariafilm.model.Cover;
import examenordinariafilm.swing.ImagePanel;
import examenordinariafilm.swing.loadCover;
import examenordinariafilm.view.CoverDisplay;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/*Diseñar una aplicación para navegar por un catálogo de películas. La aplicación debe permitir organizar las películas por género, novedades,
las más vistas, las más valoradas. Cada película, además de una carátula, debe tener un título, año, director, actores, género, calificación y duración.
Representar el diseño en UML e implementar la arquitectura en Java.
*/
public class Main extends JFrame {

  
       public static void main(String[] args) {
        new Main().execute();
    }
    
    private List<Cover> images;
    private CoverDisplay imageDisplay;
    private Map<String,Command> commands = new HashMap<>();
    
    public Main() {
        this.setTitle("Cover Viewer");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(imagePanel());
        this.add(toolbar(), BorderLayout.SOUTH);
    }
    
    private void execute() {
        this.images = new loadCover(new File("fotos")).load();
        this.imageDisplay.display(images.get(0));
        //this.commands.put("<", new PrevImageCommand(images, imageDisplay)); //cuando cree el Prev tendria que pasar de portada porpor género, novedades,
                                                                              //las más vistas, las más valoradas 
        //this.commands.put(">", new NextImageCommand(images, imageDisplay)); // lo mismo pasaria con el next
        this.setVisible(true);
    }

    
    private JPanel imagePanel() {
        ImagePanel panel = new ImagePanel();
        this.imageDisplay = panel;
        return panel;
    }
    private JMenuBar toolbar() {
        JMenuBar toolbar = new JMenuBar();
        toolbar.add(button("<"));
        toolbar.add(button(">"));
        return toolbar;
    }

    private JButton button(String name) {
        JButton button = new JButton(name);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                commands.get(name).execute();
            }
        });
        return button;
    }

    
}
