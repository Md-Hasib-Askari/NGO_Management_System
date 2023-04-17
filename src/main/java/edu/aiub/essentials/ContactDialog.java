package edu.aiub.essentials;

import javax.swing.*;

import java.awt.*;

import static java.awt.Desktop.getDesktop;
import static java.net.URI.*;

public class ContactDialog extends JDialog {
    public ContactDialog() {
        setLayout(new BorderLayout());
        setModal(true);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setTitle("Contact Us");

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon("F:\\Java Project\\VolunteerDashboard\\Maven\\src\\main\\java\\edu\\aiub\\static\\contactDialog_bg.png").getImage(), 0, 0, 286, 300, null);
            }
        };
        panel.setLayout(null);
        JLabel contactLabel1 = new JLabel("If you are having problems, contact us.");
        contactLabel1.setFont(new Font("Inter", Font.PLAIN, 12));
        contactLabel1.setForeground(new Color(255, 255, 255));
        contactLabel1.setBounds(20, 90, 280, 30);
        panel.add(contactLabel1);

        JLabel contactLabel2 = new JLabel("We\'re here to help you.");
        contactLabel2.setFont(new Font("Inter", Font.PLAIN, 12));
        contactLabel2.setForeground(new Color(255, 255, 255));
        contactLabel2.setBounds(20, 110, 280, 30);
        panel.add(contactLabel2);

        JButton btn = new JButton();
        btn.setBounds(74, 180, 138, 34);
        btn.setBackground(new Color(44, 62, 80));
        btn.addActionListener(e -> {
            btn.setIcon(new ImageIcon("F:\\Java Project\\VolunteerDashboard\\Maven\\src\\main\\java\\edu\\aiub\\static\\leftSidebarBtn\\contactBtn_hover.png"));
            open("https://www.linkedin.com/in/sisiam08/");
            dispose();
        });
        btn.setBorder(null);
        btn.setIcon(new ImageIcon("F:\\Java Project\\VolunteerDashboard\\Maven\\src\\main\\java\\edu\\aiub\\static\\leftSidebarBtn\\contactBtn.png"));
        panel.add(btn);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
    public static void open(String url) {
        try {
            getDesktop().browse(create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
