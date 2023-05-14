package edu.aiub.UI.admin;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class AdminRightSidebarScrollPane {

    public static void add(JPanel panel, JComponent component) {
        JPanel componentPanel = new JPanel();
        componentPanel.setLayout(new BoxLayout(componentPanel, BoxLayout.Y_AXIS));
        componentPanel.setBackground(new Color(255, 255, 255));

        JPanel components = new JPanel();
        components.setLayout(new BorderLayout());
        components.add(component, BorderLayout.WEST);

        JButton viewBtn = new JButton("View");
        components.add(viewBtn, BorderLayout.EAST);

        componentPanel.add(components);
        componentPanel.add(Box.createVerticalStrut(10));
        componentPanel.add(new JSeparator());
        componentPanel.add(Box.createVerticalStrut(10));
        panel.add(componentPanel);
    }
}
