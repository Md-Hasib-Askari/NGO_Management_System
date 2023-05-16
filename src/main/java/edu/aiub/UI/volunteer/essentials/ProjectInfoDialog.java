package edu.aiub.UI.volunteer.essentials;

import edu.aiub.Static;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectInfoDialog extends JFrame{
    private String root = Static.VOLUNTEER_ROOT;
    public ProjectInfoDialog(String projectName, String fullName, String email, String address, String workplace, String phone) {

//        JFrame prInfoDialog = new JFrame();
//        prInfoDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel prInfoDialogPanel = new JPanel();
        prInfoDialogPanel.setSize(400,600);
        JLabel prInfoDialogLabel = new JLabel(new ImageIcon(root + "projectInformation.png"));
        prInfoDialogLabel.setSize(400,600);

        JLabel projectNameInfo = new JLabel("Project Name  :   " + projectName);
        projectNameInfo.setBounds(20,20,370,30);
        projectNameInfo.setFont(new Font("Inter", Font.PLAIN, 15));
        prInfoDialogLabel.add(projectNameInfo);


        JLabel nameInfo = new JLabel("Name              :   " + fullName);
        nameInfo.setBounds(20,60,350,30);
        nameInfo.setFont(new Font("Inter", Font.PLAIN, 15));
        prInfoDialogLabel.add(nameInfo);

        JLabel emailInfo = new JLabel("Email               :   " + email);
        emailInfo.setBounds(20,100,350,30);
        emailInfo.setFont(new Font("Inter", Font.PLAIN, 15));
        prInfoDialogLabel.add(emailInfo);


        JLabel addressInfo = new JLabel("Address          :   " + address);
        addressInfo.setBounds(20,140,350,30);
        addressInfo.setFont(new Font("Inter", Font.PLAIN, 15));
        prInfoDialogLabel.add(addressInfo);


        JLabel workPlaceInfo = new JLabel("Workplace      :   " + workplace);
        workPlaceInfo.setBounds(20,180,350,30);
        workPlaceInfo.setFont(new Font("Inter", Font.PLAIN, 15));
        prInfoDialogLabel.add(workPlaceInfo);


        JLabel phoneInfo = new JLabel("Phone              :   " + phone);
        phoneInfo.setBounds(20,220,350,30);
        phoneInfo.setFont(new Font("Inter", Font.PLAIN, 15));
        prInfoDialogLabel.add(phoneInfo);


        JButton okBtn = new JButton("OK");
        okBtn.setFont(new Font("Inter", Font.BOLD, 14));
        okBtn.setBounds(165,500,70,30);
        okBtn.setBackground(new Color(65,136,255));
        okBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });
        prInfoDialogLabel.add(okBtn);

        prInfoDialogPanel.add(prInfoDialogLabel);

        add(prInfoDialogPanel);

        setTitle("Next Project Applicant Information");
        setSize(400,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setVisible(true);
    }
}
