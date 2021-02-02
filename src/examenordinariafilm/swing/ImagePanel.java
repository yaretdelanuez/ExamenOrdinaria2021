
package examenordinariafilm.swing;

import examenordinariafilm.model.Cover;
import examenordinariafilm.view.CoverDisplay;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Yar
 */
public class ImagePanel extends JPanel implements CoverDisplay {
    private Cover image;
    private BufferedImage data;

    public ImagePanel() {
    }

    @Override
    public void paint(Graphics g) {
        Box box = new Box(data.getWidth(), data.getHeight(), this.getWidth(), this.getHeight());
        g.drawImage(data, box.x, box.y, box.width, box.height,null);
    }

    @Override
    public void display(Cover image) {
        this.image = image;
        this.data = read(new File(image.getName()));
        repaint();
    }

    public Cover currentImage() {
        return this.image;
    }

    private static BufferedImage read(File file) {
        try {
            return ImageIO.read(file);
        } catch (IOException ex) {
            Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);            
            return null;
        }
    }

    @Override
    public Cover cover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void on(Shift shift) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Box {
        final int x;
        final int y;
        final int width;
        final int height;

        private Box(int imageWidth, int imageHeight, int panelWidth, int panelHeight) {
            double imageRatio = imageWidth / imageHeight;
            double panelRatio = panelWidth / panelHeight;
            this.width = (int) (imageRatio >= panelRatio ? panelWidth : imageWidth * panelHeight / imageHeight);
            this.height = (int) (imageRatio <= panelRatio ? panelHeight : imageHeight * panelWidth / imageWidth);
            this.x = (int) ((panelWidth - this.width) / 2);
            this.y = (int) ((panelHeight - this.height) / 2);
        }
    }
}