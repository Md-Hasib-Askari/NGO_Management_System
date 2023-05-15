package edu.aiub.UI.volunteer.essentials;

import edu.aiub.Static;
import edu.aiub.database.Events;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

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

        Events events = new Events();
        ArrayList<Document> eventList = events.getAll();
        Document latestEvent = eventList.get(eventList.size()-1);

        DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        String projectName = "<html><p><b>Project name: </b>" + latestEvent.getString("event") +"</p></html>";
        String projectLocation = "<html><p><b>Project Location: </b>" + latestEvent.getString("location") +"</p></html>";
        String projectStart = "<html><p><b>Project Starting On: </b>" + sdf.format(latestEvent.getDate("start")) +"</p></html>";
        String projectEnd = "<html><p><b>Project Ending On: </b>" + sdf.format(latestEvent.getDate("end")) +"</p></html>";

        recentTittle.setFont(new Font("Inter", Font.PLAIN, 18));
        recentTittle.setText("<html><b>Recent Project Information</b></html>");
        recentTittle.setBounds(25, 20, 500, 25);
        add(recentTittle);

        rProjectName.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectName.setText(projectName);
        rProjectName.setBounds(25, 70, 500, 25);
        add(rProjectName);

        rProjectLeader.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectLeader.setText(projectLocation);
        rProjectLeader.setBounds(25, 120, 500, 25);
        add(rProjectLeader);


        rProjectWorkingDay.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectWorkingDay.setText(projectStart);
        rProjectWorkingDay.setBounds(25, 170, 500, 25);
        add(rProjectWorkingDay);

        rProjectLocation.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectLocation.setText(projectEnd);
        rProjectLocation.setBounds(25, 220, 500, 25);
        add(rProjectLocation);
    }
}
