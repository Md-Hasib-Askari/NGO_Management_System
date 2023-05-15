package edu.aiub.UI.admin;

import edu.aiub.Static;
import edu.aiub.essentials.EssentialMethods;
import edu.aiub.essentials.ImageResizer;
import edu.aiub.essentials.TableColumnCenterizer;
import org.bson.Document;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CenterDashboardPanel extends JPanel {

    public CenterDashboardPanel(
            JPanel centerMainPanel,
            JPanel taskInfoPanel,
            JPanel balanceInfoPanel,
            JPanel vehicleInfoPanel,
            JPanel userInfoPanel,
            JPanel currentInfo,
            JPanel runningTaskTab,
            JPanel transactionTab,
            JPanel vehicleTab,
            JPanel volunteerTab,

            JTabbedPane RecentUpdates,

            JScrollPane runningTask,
            JScrollPane transactionPane,
            JScrollPane vehiclePane,
            JScrollPane volunteerPane,

            JLabel dashboardDate,
            JLabel taskLabel,
            JLabel currentTaskCount,
            JLabel balanceLabel,
            JLabel currentBalance,
            JLabel vehicleLabel,
            JLabel vehicleCount,
            JLabel userLabel,
            JLabel userCount,
            JLabel dashboardGreeting,

            JTable taskTable,
            JTable transactionTable,
            JTable vehicleTable,
            JTable volunteerTable,

            DefaultTableModel taskTableModel,
            DefaultTableModel transactionTableModel,
            DefaultTableModel vehicleTableModel,
            DefaultTableModel volunteerTableModel,

            SimpleDateFormat sdf,

            ArrayList<Document> taskFromDB,
            ArrayList<Document> tnxFromDB,
            ArrayList<Document> vehicleFromDB,

            int vehicleCountFromDB,
            int userCountFromDB,
            int taskCountFromDB,
            int tnxCountFromDB

            ) {
        setBackground(new Color(236, 240, 241));
        setLayout(null);

        SimpleDateFormat dashboardDateFormat = new SimpleDateFormat("EEE, dd MMMM yyyy");

        dashboardDate.setFont(new Font("Inter", 0, 12));
        dashboardDate.setText(dashboardDateFormat.format(new Date()));
        add(dashboardDate);
        dashboardDate.setBounds(40, 30, 110, 15);

        centerMainPanel.setLayout(null);

//      Current Info
        taskInfoPanel.setLayout(new GridLayout(2, 1));

        taskLabel.setHorizontalAlignment(SwingConstants.CENTER);
        taskLabel.setIcon(new ImageResizer(Static.ADMIN_ROOT+"currentInfo_label.png", 15, 15).getImage());
        taskLabel.setIconTextGap(10);
        taskLabel.setText("Task Running");
        taskLabel.setFont(new Font("Inter", Font.BOLD, 12));
        taskInfoPanel.add(taskLabel);

        currentTaskCount.setFont(new Font("Inter", Font.BOLD, 35));
        currentTaskCount.setHorizontalAlignment(SwingConstants.CENTER);
        currentTaskCount.setVerticalAlignment(SwingConstants.TOP);

        currentTaskCount.setText(EssentialMethods.countPrinter(taskCountFromDB));

        taskInfoPanel.add(currentTaskCount);

//      Balance Info
        balanceInfoPanel.setLayout(new GridLayout(2, 1));

        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        balanceLabel.setIcon(new ImageResizer(Static.ADMIN_ROOT+"currentInfo_label.png", 15, 15).getImage());
        balanceLabel.setIconTextGap(10);
        balanceLabel.setFont(new Font("Inter", Font.BOLD, 12));
        balanceLabel.setText("Current Balance");
        balanceInfoPanel.add(balanceLabel);

        currentBalance.setFont(new Font("Inter", Font.BOLD, 35));
        currentBalance.setHorizontalAlignment(SwingConstants.CENTER);
        currentBalance.setVerticalAlignment(SwingConstants.TOP);
        currentBalance.setText(String.valueOf(EssentialMethods.totalBalance()));
        balanceInfoPanel.add(currentBalance);

//      Vehicle Info
        vehicleInfoPanel.setLayout(new GridLayout(2, 1));

        vehicleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        vehicleLabel.setIcon(new ImageResizer(Static.ADMIN_ROOT+"currentInfo_label.png", 15, 15).getImage());
        vehicleLabel.setIconTextGap(10);
        vehicleLabel.setFont(new Font("Inter", Font.BOLD, 12));
        vehicleLabel.setText("Available Vehicle");
        vehicleInfoPanel.add(vehicleLabel);

        vehicleCount.setFont(new Font("Inter", Font.BOLD, 35));
        vehicleCount.setVerticalAlignment(SwingConstants.TOP);
        vehicleCount.setHorizontalAlignment(SwingConstants.CENTER);
        vehicleCount.setText(EssentialMethods.countPrinter(vehicleCountFromDB));
        vehicleInfoPanel.add(vehicleCount);

//      User Info
        userInfoPanel.setLayout(new GridLayout(2, 1));

        userLabel.setHorizontalAlignment(SwingConstants.CENTER);
        userLabel.setIcon(new ImageResizer(Static.ADMIN_ROOT+"currentInfo_label.png", 15, 15).getImage());
        userLabel.setIconTextGap(10);
        userLabel.setFont(new Font("Inter", Font.BOLD, 12));
        userLabel.setText("Total Users");
        userInfoPanel.add(userLabel);

        userCount.setFont(new Font("Inter", Font.BOLD, 35));
        userCount.setVerticalAlignment(SwingConstants.TOP);
        userCount.setHorizontalAlignment(SwingConstants.CENTER);
        userCount.setText(EssentialMethods.countPrinter(userCountFromDB));
        userInfoPanel.add(userCount);

        currentInfo.add(taskInfoPanel);
        currentInfo.add(balanceInfoPanel);
        currentInfo.add(vehicleInfoPanel);
        currentInfo.add(userInfoPanel);

//        add(currentInfo);
        centerMainPanel.add(currentInfo);
        currentInfo.setBounds(10, 10, 660, 100);
//        currentInfo.setBackground(new Color(255, 255, 255));
        currentInfo.setBorder(null);
        currentInfo.setLayout(new GridLayout(1, 4, 10, 0));

        RecentUpdates.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
//        RecentUpdates.setOpaque(true);
//        RecentUpdates.setFont(new Font("Inter", Font.PLAIN, 12));
//        RecentUpdates.setForeground(new Color(0, 0, 0));
//        RecentUpdates.setBackground(new Color(50, 255, 126));
        runningTaskTab.setLayout(null);


        for (int i = 0; i<taskCountFromDB; i++) {
            taskTableModel.addRow(new Object[]{
                    taskFromDB.get(i).getInteger("id").toString(),
                    taskFromDB.get(i).getString("event"),
                    taskFromDB.get(i).getString("description"),
                    taskFromDB.get(i).getString("location"),
                    sdf.format(taskFromDB.get(i).get("end")),
                    sdf.format(taskFromDB.get(i).get("end"))
            });
        }

        taskTable.setModel(taskTableModel);
        TableColumnCenterizer.centerTableColumn(taskTable);
        runningTask.setViewportView(taskTable);

        runningTaskTab.add(runningTask);
        runningTask.setBounds(0, 0, 657, 450);

        RecentUpdates.addTab("Running Tasks", runningTaskTab);

        transactionTab.setLayout(null);




        for (int i = 0; i<tnxCountFromDB; i++) {
            transactionTableModel.addRow(new String[]{
                    tnxFromDB.get(i).getInteger("id").toString(),
                    tnxFromDB.get(i).getString("sender"),
                    tnxFromDB.get(i).getString("method"),
                    tnxFromDB.get(i).getString("fund"),
                    sdf.format(tnxFromDB.get(i).get("date")),
            });
        }

        transactionTable.setModel(transactionTableModel);
        transactionPane.setViewportView(transactionTable);
        TableColumnCenterizer.centerTableColumn(transactionTable);

        transactionTab.add(transactionPane);
        transactionPane.setBounds(0, 0, 657, 450);

        RecentUpdates.addTab("Transactions", transactionTab);

        vehicleTab.setLayout(null);




        for (int i = 0; i<vehicleCountFromDB; i++) {
            vehicleTableModel.addRow(new String[]{
                    vehicleFromDB.get(i).getInteger("id").toString(),
                    vehicleFromDB.get(i).getString("name"),
                    vehicleFromDB.get(i).getString("model"),
                    vehicleFromDB.get(i).getString("status")
            });
        }

        vehicleTable.setModel(vehicleTableModel);
        vehiclePane.setViewportView(vehicleTable);
        TableColumnCenterizer.centerTableColumn(vehicleTable);

        vehicleTab.add(vehiclePane);
        vehiclePane.setBounds(0, 0, 657, 450);

        RecentUpdates.addTab("Vehicle Status", vehicleTab);

        volunteerTab.setLayout(null);



        for (int i = 0; i<30; i++) {
            volunteerTableModel.addRow(new String[]{""+i+1, "Volunteer "+i+1, "Task 1", "Available"});
        }

        volunteerTable.setModel(volunteerTableModel);
        volunteerPane.setViewportView(volunteerTable);
        TableColumnCenterizer.centerTableColumn(volunteerTable);

        volunteerTab.add(volunteerPane);
        volunteerPane.setBounds(0, 0, 657, 450);

        RecentUpdates.addTab("Appointed Volunteers", volunteerTab);

//        add(RecentUpdates);
//        centerMainPanel.setBackground(new Color(138, 184, 197));
        centerMainPanel.add(RecentUpdates);
        RecentUpdates.setBounds(10, 140, 660, 490);

        dashboardGreeting.setFont(new Font("Inter", Font.BOLD, 25));
//        setUserName(userName);


//        add(dashboardGreeting);
        dashboardGreeting.setBounds(40, 60, 400, 23);

        add(centerMainPanel);
        centerMainPanel.setBounds(10, 100, 680, 750);

        setBounds(240, 0, 700, 750);
    }

}
