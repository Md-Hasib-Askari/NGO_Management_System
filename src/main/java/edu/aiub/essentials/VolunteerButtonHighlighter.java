package edu.aiub.essentials;

import edu.aiub.Static;

import javax.swing.*;

public class VolunteerButtonHighlighter {
    private static String root = Static.VOLUNTEER_ROOT+"leftSidebarBtn\\";
    private static String[] btnDefaultIcons = new String[] {
            root + "dashboardBtn.png",
            root + "eventBtn.png",
            root + "transactionBtn.png",
            root + "donationBtn.png",
            root + "noticeBtn.png",
            root + "logOutBtn.png"
    };
    private static String[] btnHoverIcons = new String[] {
            root + "dashboardBtn_hover.png",
            root + "eventBtn_hover.png",
            root + "transactionBtn_hover.png",
            root + "donationBtn_hover.png",
            root + "noticeBtn_hover.png",
            root + "logOutBtn_hover.png"
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
