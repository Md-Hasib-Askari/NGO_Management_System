package edu.aiub;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import edu.aiub.UI.AdminDashboard;
import edu.aiub.UI.SplashScreen;
import edu.aiub.UIComponents.NoticeAddForm;
import edu.aiub.database.Notice;
import edu.aiub.essentials.*;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;

public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("sun.java2d.uiScale", "1.0"); // Disable HiDPI

        FlatMacLightLaf.registerCustomDefaultsSource("edu.aiub.styles");
        FlatMacLightLaf.setup(); // Set FlatLaf theme
        FlatLafCustomizer.customizer(); // Customize FlatLaf theme

        Runnable runner = new Runnable() {
            @Override
            public void run() {
//                new SplashScreen();
                new AdminDashboard(0);
//                new NoticeAddForm();
//                new Test();
//                new ButtonTableExample();
//                SendMail.sendMail("mdhsbaskari@gmail.com", "test", "test");
            }
        };
        EventQueue.invokeLater(runner);
    }
}
