package edu.aiub;

import com.formdev.flatlaf.FlatLightLaf;
import edu.aiub.UI.AdminDashboard;
import edu.aiub.UI.SplashScreen;

import java.awt.*;

public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("sun.java2d.uiScale", "1.0"); // Disable HiDPI

        FlatLightLaf.setup(); // Set FlatLaf theme

        Runnable runner = new Runnable() {
            @Override
            public void run() {
//                new SplashScreen();
                new AdminDashboard();
            }
        };
        EventQueue.invokeLater(runner);
    }
}
