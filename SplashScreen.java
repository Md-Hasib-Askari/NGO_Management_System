// package Nirmul.frames;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JFrame;

public class SplashScreen extends JFrame {
    // Core Literals
    final String loading_bg = "C:\\Users\\MDHASIBASKARI\\Desktop\\JAVA_SWING\\nms\\src\\main\\java\\static\\loading_bg.png";
    final int width = 600, height = 350;
    
    
    JProgressBar progress;
    
    SplashScreen() {
        
        JPanel panel = new JPanel(new BorderLayout()) {
            @Override
            public void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                ImageIcon img = new ImageIcon(loading_bg);
                g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(width, height));
        setUndecorated(true);
        setPreferredSize(new Dimension(width, height));
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        
        progress = new JProgressBar(0, 100);
        progress.setPreferredSize(new Dimension(100, 5));
        
        Thread progressing = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i+=10) {
                    progress.setValue(i);
                    
                    try {
                        sleep(200);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                dispose();
            }
        };
        progressing.start();
        panel.add(progress, BorderLayout.PAGE_END);
        add(panel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Runnable runner = new Runnable() {
            @Override
            public void run() {
			   System.setProperty("sun.java2d.uiScale", "1.0");
               new SplashScreen().setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);
    }
}
