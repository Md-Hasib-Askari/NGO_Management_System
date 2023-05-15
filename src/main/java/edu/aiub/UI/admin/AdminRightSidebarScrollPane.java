package edu.aiub.UI.admin;

import org.bson.Document;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminRightSidebarScrollPane {

    public static void add(JPanel panel, Document document, String title) {


        JPanel componentPanel = new JPanel();
        componentPanel.setLayout(new BoxLayout(componentPanel, BoxLayout.Y_AXIS));
        componentPanel.setBackground(new Color(255, 255, 255));

        JPanel components = new JPanel();
        components.setBackground(new Color(255, 255, 255));
        components.setLayout(new BorderLayout());
        components.add(new JLabel(document.getString(title)), BorderLayout.WEST);

        JButton viewBtn = new JButton("View");
        viewBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (title.equals("notice")) {
                    viewNotice(document);
                } else {
                    viewEvent(document);
                }
            }
        });
        components.add(viewBtn, BorderLayout.EAST);

        componentPanel.add(components);
        componentPanel.add(Box.createVerticalStrut(10));
        componentPanel.add(new JSeparator());
        componentPanel.add(Box.createVerticalStrut(10));
        panel.add(componentPanel);
    }


    public static void viewNotice(Document document) {
        JDialog dialog = new JDialog();
        dialog.setLayout(null);
        dialog.setSize(400, 600);
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);

        JLabel noticeTitle = new JLabel();
        noticeTitle.setText(document.getString("notice"));
        noticeTitle.setFont(new Font("Inter", Font.BOLD, 16));
        dialog.add(noticeTitle);
        noticeTitle.setBounds(20, 20, 360, 50);

        JSeparator separator = new JSeparator();
        separator.setBounds(20, 60, 360, 10);
        dialog.add(separator);

        JLabel noticeDescription = new JLabel();
        noticeDescription.setVerticalAlignment(JLabel.TOP);
        noticeDescription.setText(document.getString("description"));
        noticeDescription.setFont(new Font("Inter", Font.PLAIN, 14));
        dialog.add(noticeDescription);
        noticeDescription.setBounds(20, 70, 360, 350);

        JSeparator separator2 = new JSeparator();
        separator2.setBounds(20, 390, 360, 10);
        dialog.add(separator2);

        JLabel noticeDate = new JLabel();
        noticeDate.setText("Date: "+document.getString("date"));
        noticeDate.setFont(new Font("Inter", Font.PLAIN, 12));
        dialog.add(noticeDate);
        noticeDate.setBounds(20, 400, 360, 20);


        JLabel noticeTime = new JLabel();
        noticeTime.setText("Time: "+document.getString("time"));
        noticeTime.setFont(new Font("Inter", Font.PLAIN, 12));
        dialog.add(noticeTime);
        noticeTime.setBounds(20, 420, 360, 20);

    }

    public static void viewEvent(Document document) {
        JDialog dialog = new JDialog();
        dialog.setLayout(null);
        dialog.setSize(400, 600);
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);

        JLabel eventTitle = new JLabel();
        eventTitle.setText(document.getString("event"));
        eventTitle.setFont(new Font("Inter", Font.BOLD, 16));
        dialog.add(eventTitle);
        eventTitle.setBounds(20, 20, 360, 50);

        JSeparator separator = new JSeparator();
        separator.setBounds(20, 60, 360, 10);
        dialog.add(separator);

        JLabel eventDescription = new JLabel();
        eventDescription.setVerticalAlignment(JLabel.TOP);
        eventDescription.setText(document.getString("description"));
        eventDescription.setFont(new Font("Inter", Font.PLAIN, 14));
        dialog.add(eventDescription);
        eventDescription.setBounds(20, 70, 360, 350);

        JSeparator separator2 = new JSeparator();
        separator2.setBounds(20, 390, 360, 10);
        dialog.add(separator2);

        JLabel eventLocation = new JLabel();
        eventLocation.setText("Location: "+document.getString("location"));
        eventLocation.setFont(new Font("Inter", Font.BOLD, 12));
        dialog.add(eventLocation);
        eventLocation.setBounds(20, 400, 360, 20);

        JLabel noticeDate = new JLabel();
        noticeDate.setText("Date: "+document.getDate("start").toString());
        noticeDate.setFont(new Font("Inter", Font.PLAIN, 12));
        dialog.add(noticeDate);
        noticeDate.setBounds(20, 420, 360, 20);


        JLabel noticeTime = new JLabel();
        noticeTime.setText("Time: "+document.getDate("end").toString());
        noticeTime.setFont(new Font("Inter", Font.PLAIN, 12));
        dialog.add(noticeTime);
        noticeTime.setBounds(20, 440, 360, 20);

    }
}
