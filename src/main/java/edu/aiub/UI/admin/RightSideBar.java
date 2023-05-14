package edu.aiub.UI.admin;

import org.bson.Document;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class RightSideBar extends JPanel {
    JPanel noticeHeaderPanel;
    JPanel noticeBodyPanel;
    JPanel noticePanel;
    JScrollPane noticePane;
    JLabel noticeLabel;
    JPanel taskHeaderPanel;
    JPanel taskBodyPanel;
    JScrollPane taskPane;
    JLabel recentTaskLabel;
//    JComponent[] noticeComponents = {noticeHeaderPanel, noticeBodyPanel, noticePanel, noticePane, noticeLabel};
//    JComponent[] taskComponents = {taskHeaderPanel, taskBodyPanel, taskPane, recentTaskLabel};

    public RightSideBar(JComponent[] noticeComponents, JComponent[] taskComponents, ArrayList<Document> noticeFromDB, int noticeCountFromDB, ArrayList<Document> taskFromDB, int taskCountFromDB) {
        //      Right Side Bar
        noticeHeaderPanel = (JPanel) noticeComponents[0];
        noticeBodyPanel = (JPanel) noticeComponents[1];
        noticePanel = (JPanel) noticeComponents[2];
        noticePane = (JScrollPane) noticeComponents[3];
        noticeLabel = (JLabel) noticeComponents[4];

        taskHeaderPanel = (JPanel) taskComponents[0];
        taskBodyPanel = (JPanel) taskComponents[1];
        taskPane = (JScrollPane) taskComponents[2];
        recentTaskLabel = (JLabel) taskComponents[3];

        setLayout(null);

        noticeHeaderPanel.setMinimumSize(new Dimension(115, 50));
        noticeHeaderPanel.setLayout(null);

        noticeLabel.setIcon(new ImageIcon("src/main/java/edu/aiub/static/noticeHeader_bg.png"));
        noticeHeaderPanel.add(noticeLabel);
        noticeLabel.setBounds(0, 0, 240, 50);

        add(noticeHeaderPanel);
        noticeHeaderPanel.setBounds(10, 25, 240, 50);

//      Notice Body
        noticeBodyPanel.setLayout(new BoxLayout(noticeBodyPanel, BoxLayout.Y_AXIS));
        noticeBodyPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        noticeBodyPanel.setBackground(new Color(255, 255, 255));
        noticePanel.add(noticeBodyPanel);

        noticePane.setBounds(10, 80, 240, 250);
//        noticeBodyPanel.setBounds(10, 10, 240, 250);

        for (int i = 0; i < noticeCountFromDB && i < 20; i++) {
            AdminRightSidebarScrollPane.add(noticeBodyPanel, new JLabel(noticeFromDB.get(i).getString("notice")));
        }

        noticePane.setViewportView(noticeBodyPanel);
        noticePane.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
        add(noticePane);


        taskHeaderPanel.setMinimumSize(new Dimension(115, 50));
        taskHeaderPanel.setLayout(null);

        recentTaskLabel.setIcon(new ImageIcon("src/main/java/edu/aiub/static/projectHeader_bg.png"));
        taskHeaderPanel.add(recentTaskLabel);
        recentTaskLabel.setBounds(0, 0, 240, 50);

        add(taskHeaderPanel);
        taskHeaderPanel.setBounds(10, 355, 240, 50);

        taskBodyPanel.setLayout(new BoxLayout(taskBodyPanel, BoxLayout.Y_AXIS));
        taskBodyPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        taskBodyPanel.setBackground(new Color(255, 255, 255));
//        taskBodyPanel.setBounds(10, 410, 240, 280);
        taskPane.add(taskBodyPanel);

        for (int i = 0; i < 20 && i < taskCountFromDB; i++) {
            AdminRightSidebarScrollPane.add(taskBodyPanel, new JLabel(taskFromDB.get(i).getString("event")));
        }

        taskPane.setViewportView(taskBodyPanel);
        taskPane.setBounds(10, 410, 240, 320);
        taskPane.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
        add(taskPane);
    }
}
