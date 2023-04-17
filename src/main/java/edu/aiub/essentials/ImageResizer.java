package edu.aiub.essentials;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageResizer {
    private ImageIcon imgIcon;
    public ImageResizer(String location, int height, int width) {
        ImageIcon img = new ImageIcon(location);
        Image resizedImg = img.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        imgIcon = new ImageIcon(resizedImg);
        img = null;
    }
    public void setImage(String location, int height, int width) {
        ImageIcon img = new ImageIcon(location);
        Image resizedImg = img.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        imgIcon = new ImageIcon(resizedImg);
        img = null;
    }
    public ImageIcon getImage() {
        return imgIcon;
    }
}

