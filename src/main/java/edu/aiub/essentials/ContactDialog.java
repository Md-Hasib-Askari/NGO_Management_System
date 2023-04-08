package edu.aiub.essentials;

import com.toedter.calendar.JDateChooser;
import edu.aiub.database.Events;
import edu.aiub.database.Notice;

import javax.swing.*;

import java.awt.*;

import static java.awt.Desktop.getDesktop;
import static java.net.URI.*;

public class ContactDialog extends JDialog {
    public ContactDialog() {
        setLayout(new BorderLayout());
        setModal(true);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setTitle("Contact Us");

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
//                g.drawImage(new ImageIcon("src\\main\\java\\edu\\aiub\\static\\contactDialog_bg.png").getImage(), 0, 0, 286, 300, null);
            }
        };
        panel.setLayout(null);

        JLabel mailToLabel = new JLabel("Mail to");
        mailToLabel.setBounds(40, 50, getWidth()-100, 50);

        JTextField mailToField = new JTextField();
        mailToField.setBounds(40, 90, ((getWidth()-100)), 50);

        JLabel mailSubject = new JLabel("Mail Subject");
        mailSubject.setBounds(40, 150, (getWidth()-100), 50);

        JTextArea mailSubjectField = new JTextArea();
        mailSubjectField.setBounds(40, 190, (getWidth()-100), 50);

        JLabel Message = new JLabel("Message");
        Message.setBounds(40, 230, (getWidth()-100), 50);

        JTextArea taskDescriptionArea = new JTextArea();
        taskDescriptionArea.setBounds(40, 270, (getWidth()-100), 70);


        JButton addTaskButton = new JButton("Send Mail");
        addTaskButton.addActionListener(e -> {
            dispose();
            SendMail.sendMail(mailToField.getText(), mailSubjectField.getText(), taskDescriptionArea.getText());
        });
        addTaskButton.setBounds(40, 350, (getWidth()-100), 50);

        panel.add(Box.createVerticalStrut(50));
        panel.add(mailToLabel);
        panel.add(mailToField);
        panel.add(Message);
        panel.add(taskDescriptionArea);
        panel.add(mailSubject);
        panel.add(mailSubjectField);
        panel.add(addTaskButton);
        panel.add(Box.createVerticalStrut(50));

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
