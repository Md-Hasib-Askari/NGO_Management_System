package edu.aiub.essentials;

import javax.swing.*;

public class ButtonHighlighter {	
    static String root = "F:\\Java Project\\VolunteerDashboard\\Maven\\src\\main\\java\\edu\\aiub\\static\\leftSidebarBtn\\";
    static String[] btnDefaultIcons = new String[] {
            root + "dashboardBtn.png",
            root + "taskBtn.png",
            root + "bankBtn.png",
            root + "donationBtn.png",
            root + "noticeBtn.png",
            root + "settingsBtn.png"
    };
    static String[] btnHoverIcons = new String[] {
            root + "dashboardBtn_hover.png",
            root + "taskBtn_hover.png",
            root + "bankBtn_hover.png",
            root + "donationBtn_hover.png",
            root + "noticeBtn_hover.png",
            root + "settingsBtn_hover.png"
    };
    public static void highlight(JButton[] btnList, JButton clickedBtn) {
        int count = 0;
        for (JButton btn : btnList) {
            if (btn == clickedBtn) {
                btn.setIcon(new ImageIcon(btnHoverIcons[count++]));
            } else {
                btn.setIcon(new ImageIcon(btnDefaultIcons[count++]));
            }
        }
    }
}
