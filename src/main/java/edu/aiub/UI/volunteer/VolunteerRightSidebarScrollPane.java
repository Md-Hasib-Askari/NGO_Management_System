package edu.aiub.UI.volunteer;

import javax.swing.*;
import java.awt.*;

public class VolunteerRightSidebarScrollPane {

    public static void add(JPanel panel, JComponent component) {
        JPanel componentPanel = new JPanel();
        componentPanel.setLayout(new BoxLayout(componentPanel, BoxLayout.Y_AXIS));
        componentPanel.setBackground(new Color(255, 255, 255));
        componentPanel.add(component);
        componentPanel.add(Box.createVerticalStrut(10));
        componentPanel.add(new JSeparator());
        componentPanel.add(Box.createVerticalStrut(10));
        panel.add(componentPanel);
    }
}
