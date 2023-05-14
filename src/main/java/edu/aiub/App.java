package edu.aiub;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import edu.aiub.UI.admin.AdminDashboard;
import edu.aiub.UI.donation.Guest;
import edu.aiub.essentials.*;

import java.awt.*;

public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("sun.java2d.uiScale", "1.0"); // Disable HiDPI

        FlatMacLightLaf.setup(); // Set FlatLaf theme
        FlatLafCustomizer.customizer(); // Customize FlatLaf theme

        Runnable runner = new Runnable() {
            @Override
            public void run() {
//                new SplashScreen();
//                new AdminDashboard(0);
//                new Test();
//                new VehicleAddForm();
//                SendMail.sendMail("mdhsbaskari@gmail.com", "test", "test");
//                new CreateAccount();
                new Guest();
            }
        };
        EventQueue.invokeLater(runner);
    }
}
