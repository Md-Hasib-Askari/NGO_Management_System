package edu.aiub.UI.volunteer.essentials;

import edu.aiub.Static;

import javax.swing.*;
import java.awt.*;

public class RecentProjectInfo extends JPanel {
    private JLabel recentTittle;
    private JLabel rProjectName;
    private JLabel rProjectLeader;
    private JLabel rProjectLocation;
    private JLabel rProjectDonation;
    private JLabel rProjectWorkingDay;
    private JLabel rProjectPerformance;
    private JLabel recentTittle2;
    private JLabel rProjectName2;
    private JLabel rProjectLeader2;
    private JLabel rProjectLocation2;
    private JLabel rProjectDonation2;
    private JLabel rProjectWorkingDay2;
    private JLabel rProjectPerformance2;
    private String root = Static.VOLUNTEER_ROOT;
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon(root + "moreInfo.png").getImage(), 0,0,545,275,null);
    }

    public RecentProjectInfo() {
        setLayout(null);
        setBounds(21, 365, 545, 275);

        recentTittle = new JLabel();
        rProjectName = new JLabel();
        rProjectLeader = new JLabel();
        rProjectLocation = new JLabel();
        rProjectDonation = new JLabel();
        rProjectWorkingDay = new JLabel();
        rProjectPerformance = new JLabel();

        recentTittle2 = new JLabel();
        rProjectName2 = new JLabel();
        rProjectLeader2 = new JLabel();
        rProjectLocation2 = new JLabel();
        rProjectDonation2 = new JLabel();
        rProjectWorkingDay2 = new JLabel();
        rProjectPerformance2 = new JLabel();

        recentTittle.setFont(new Font("Inter", Font.BOLD, 18));
        recentTittle.setText("Recent Project Information");
        recentTittle.setBounds(25, 20, 500, 25);
        add(recentTittle);


        rProjectName.setFont(new Font("Inter", Font.BOLD, 16));
        rProjectName.setText("Project name: ");
        rProjectName.setBounds(25, 70, 240, 25);
        add(rProjectName);

        rProjectName2.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectName2.setText("Winter Clothes Distribution");
        rProjectName2.setBounds(270, 70, 400, 25);
        add(rProjectName2);

        rProjectLeader.setFont(new Font("Inter", Font.BOLD, 16));
        rProjectLeader.setText("Project leader: ");
        rProjectLeader.setBounds(25, 100, 240, 25);
        add(rProjectLeader);

        rProjectLeader2.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectLeader2.setText("Md. Osman Ali");
        rProjectLeader2.setBounds(270, 100, 400, 25);
        add(rProjectLeader2);

        rProjectWorkingDay.setFont(new Font("Inter", Font.BOLD, 16));
        rProjectWorkingDay.setText("Project working day: ");
        rProjectWorkingDay.setBounds(25, 130, 240, 25);
        add(rProjectWorkingDay);

        rProjectWorkingDay2.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectWorkingDay2.setText("13");
        rProjectWorkingDay2.setBounds(270, 130, 400, 25);
        add(rProjectWorkingDay2);

        rProjectLocation.setFont(new Font("Inter", Font.BOLD, 16));
        rProjectLocation.setText("Your working location: ");
        rProjectLocation.setBounds(25, 160, 240, 25);
        add(rProjectLocation);

        rProjectLocation2.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectLocation2.setText("Gazipur");
        rProjectLocation2.setBounds(270, 160, 400, 25);
        add(rProjectLocation2);

        rProjectDonation.setFont(new Font("Inter", Font.BOLD, 16));
        rProjectDonation.setText("Your project donation: ");
        rProjectDonation.setBounds(25, 190, 240, 25);
        add(rProjectDonation);

        rProjectDonation2.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectDonation2.setText("2700");
        rProjectDonation2.setBounds(270, 190, 400, 25);
        add(rProjectDonation2);

        rProjectPerformance.setFont(new Font("Inter", Font.BOLD, 16));
        rProjectPerformance.setText("Your project performance: ");
        rProjectPerformance.setBounds(25, 220, 240, 25);
        add(rProjectPerformance);

        rProjectPerformance2.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectPerformance2.setText("69%");
        rProjectPerformance2.setBounds(270, 220, 400, 25);
        add(rProjectPerformance2);
    }
}
