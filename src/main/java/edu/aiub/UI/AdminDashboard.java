package edu.aiub.UI;

import edu.aiub.essentials.ImageResizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminDashboard extends JFrame {
    private JTabbedPane RecentUpdates;
    private JLabel balanceLabel;
    private JButton bankBtn;
    private JPanel centerPanel;
    private JSeparator centerSeparator1;
    private JLabel currentBalance;
    private JPanel currentInfo;
    private JLabel currentTaskCount;
    private JButton dashboardBtn;
    private JLabel dashboardDate;
    private JLabel dashboardGreeting1;
    private JButton hideSidePanelBtn;
    private JButton inventoryBtn;
    private JPanel leftSidePanel;
    private JLabel logoLabel;
    private JLabel notice1;
    private JLabel notice2;
    private JLabel notice3;
    private JLabel notice4;
    private JLabel notice5;
    private JLabel notice6;
    private JPanel noticeBodyPanel;
    private JButton noticeBtn;
    private JPanel noticeHeaderPanel;
    private JLabel noticeLabel;
    private JLabel recentTaskLabel;
    private JPanel rightSidePanel;
    private JScrollPane runningTask;
    private JPanel runningTaskTab;
    private JButton settingsBtn;
    private JLabel task1;
    private JLabel task2;
    private JLabel task3;
    private JLabel task4;
    private JLabel task5;
    private JLabel task6;
    private JPanel taskBodyPanel;
    private JButton taskBtn;
    private JPanel taskHeaderPanel;
    private JLabel taskLabel;
    private JTable taskTable;
    private JScrollPane transactionPane;
    private JPanel transactionTab;
    private JTable transactionTable;
    private JButton userBtn;
    private JLabel userCount;
    private JLabel userLabel;
    private JButton vehicleBtn;
    private JLabel vehicleCount;
    private JLabel vehicleLabel;
    private JScrollPane vehiclePane;
    private JPanel vehicleTab;
    private JTable vehicleTable;
    private JScrollPane volunteerPane;
    private JPanel volunteerTab;
    private JTable volunteerTable;

    public AdminDashboard() {
        leftSidePanel = new JPanel();
        logoLabel = new JLabel();
        dashboardBtn = new JButton();
        userBtn = new JButton();
        taskBtn = new JButton();
        inventoryBtn = new JButton();
        vehicleBtn = new JButton();
        bankBtn = new JButton();
        noticeBtn = new JButton();
        hideSidePanelBtn = new JButton();
        settingsBtn = new JButton();
        centerPanel = new JPanel();
        dashboardDate = new JLabel();
        currentInfo = new JPanel();
        taskLabel = new JLabel();
        balanceLabel = new JLabel();
        vehicleLabel = new JLabel();
        userLabel = new JLabel();
        currentTaskCount = new JLabel();
        currentBalance = new JLabel();
        vehicleCount = new JLabel();
        userCount = new JLabel();
        centerSeparator1 = new JSeparator();
        RecentUpdates = new JTabbedPane();
        runningTaskTab = new JPanel();
        runningTask = new JScrollPane();
        taskTable = new JTable();
        transactionTab = new JPanel();
        transactionPane = new JScrollPane();
        transactionTable = new JTable();
        vehicleTab = new JPanel();
        vehiclePane = new JScrollPane();
        vehicleTable = new JTable();
        volunteerTab = new JPanel();
        volunteerPane = new JScrollPane();
        volunteerTable = new JTable();
        dashboardGreeting1 = new JLabel();
        rightSidePanel = new JPanel();
        noticeHeaderPanel = new JPanel();
        noticeLabel = new JLabel();
        noticeBodyPanel = new JPanel();
        notice1 = new JLabel();
        notice2 = new JLabel();
        notice3 = new JLabel();
        notice4 = new JLabel();
        notice5 = new JLabel();
        notice6 = new JLabel();
        taskHeaderPanel = new JPanel();
        recentTaskLabel = new JLabel();
        taskBodyPanel = new JPanel();
        task1 = new JLabel();
        task2 = new JLabel();
        task3 = new JLabel();
        task4 = new JLabel();
        task5 = new JLabel();
        task6 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setFont(new Font("Inter", 0, 10));
        setPreferredSize(new Dimension(1220, 750));
        setResizable(false);
        setLayout(null);

        leftSidePanel.setBackground(new Color(255, 255, 255));
        leftSidePanel.setMinimumSize(new Dimension(190, 500));
        leftSidePanel.setPreferredSize(new Dimension(190, 500));
        leftSidePanel.setLayout(null);

        logoLabel.setBackground(new Color(153, 255, 153));
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        logoLabel.setIcon(new ImageResizer("C:\\Users\\MDHASIBASKARI\\Desktop\\JAVA_SWING\\nms\\src\\main\\java\\static\\light_logo.png", 220, 150).getImage());
        logoLabel.setOpaque(true);
        leftSidePanel.add(logoLabel);
        logoLabel.setBounds(10, 10, 220, 150);

        dashboardBtn.setFont(new Font("Inter", Font.PLAIN, 14));
        dashboardBtn.setText("Dashbard");
        leftSidePanel.add(dashboardBtn);
        dashboardBtn.setBounds(10, 180, 220, 40);

        userBtn.setFont(new Font("Inter", Font.PLAIN, 14));
        userBtn.setText("User Management");
        userBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userBtnActionPerformed(e);
            }
        });
        leftSidePanel.add(userBtn);
        userBtn.setBounds(10, 240, 220, 40);

        taskBtn.setFont(new Font("Inter", Font.PLAIN, 14));
        taskBtn.setText("Task Management");
        leftSidePanel.add(taskBtn);
        taskBtn.setBounds(10, 300, 220, 40);

        inventoryBtn.setFont(new Font("Inter", Font.PLAIN, 14));
        inventoryBtn.setText("Inventory Management");
        leftSidePanel.add(inventoryBtn);
        inventoryBtn.setBounds(10, 360, 220, 40);

        vehicleBtn.setFont(new Font("Inter", Font.PLAIN, 14));
        vehicleBtn.setText("Vehicle Management");
        leftSidePanel.add(vehicleBtn);
        vehicleBtn.setBounds(10, 420, 220, 40);

        bankBtn.setFont(new Font("Inter", Font.PLAIN, 14));
        bankBtn.setText("Bank Management");
        leftSidePanel.add(bankBtn);
        bankBtn.setBounds(10, 480, 220, 40);

        noticeBtn.setFont(new Font("Inter", Font.PLAIN, 14));
        noticeBtn.setText("Notice");
        noticeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                noticeBtnActionPerformed(e);
            }
        });
        leftSidePanel.add(noticeBtn);
        noticeBtn.setBounds(10, 540, 220, 40);

        hideSidePanelBtn.setFont(new Font("Inter", Font.PLAIN, 14));
        hideSidePanelBtn.setText("<<");
        hideSidePanelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hideSidePanelBtnActionPerformed(e);
            }
        });
        leftSidePanel.add(hideSidePanelBtn);
        hideSidePanelBtn.setBounds(190, 630, 50, 40);

        settingsBtn.setFont(new Font("Inter", Font.PLAIN, 14));
        settingsBtn.setText("Settings");
        settingsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                settingsBtnActionPerformed(e);
            }
        });
        leftSidePanel.add(settingsBtn);
        settingsBtn.setBounds(10, 630, 160, 40);

        getContentPane().add(leftSidePanel);
        leftSidePanel.setBounds(0, 0, 240, 730);

        centerPanel.setBackground(new Color(255, 204, 204));
        centerPanel.setLayout(null);

        dashboardDate.setFont(new Font("Inter", 0, 12));
        dashboardDate.setText("Mon, 18 July 2022");
        centerPanel.add(dashboardDate);
        dashboardDate.setBounds(40, 30, 110, 15);

        currentInfo.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
        currentInfo.setLayout(new GridLayout(2, 5));

        taskLabel.setHorizontalAlignment(SwingConstants.CENTER);
        taskLabel.setText("Current Task Running");
        currentInfo.add(taskLabel);

        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        balanceLabel.setText("Current Balance");
        currentInfo.add(balanceLabel);

        vehicleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        vehicleLabel.setText("Available Vehicle");
        currentInfo.add(vehicleLabel);

        userLabel.setHorizontalAlignment(SwingConstants.CENTER);
        userLabel.setText("Total Users");
        currentInfo.add(userLabel);

        currentTaskCount.setFont(new Font("Inter", 0, 24));
        currentTaskCount.setHorizontalAlignment(SwingConstants.CENTER);
        currentTaskCount.setText("06");
        currentInfo.add(currentTaskCount);

        currentBalance.setFont(new Font("Inter", 0, 24));
        currentBalance.setHorizontalAlignment(SwingConstants.CENTER);
        currentBalance.setText("$15000.00");
        currentInfo.add(currentBalance);

        vehicleCount.setFont(new Font("Inter", 0, 24));
        vehicleCount.setHorizontalAlignment(SwingConstants.CENTER);
        vehicleCount.setText("11");
        currentInfo.add(vehicleCount);

        userCount.setFont(new Font("Inter", 0, 24));
        userCount.setHorizontalAlignment(SwingConstants.CENTER);
        userCount.setText("26");
        currentInfo.add(userCount);

        centerPanel.add(currentInfo);
        currentInfo.setBounds(20, 130, 660, 80);

        centerSeparator1.setForeground(new Color(153, 153, 153));
        centerSeparator1.setPreferredSize(new Dimension(0, 1));
        centerPanel.add(centerSeparator1);
        centerSeparator1.setBounds(40, 100, 610, 30);

        RecentUpdates.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        RecentUpdates.setOpaque(true);

        runningTaskTab.setLayout(null);

        taskTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "ID", "Task", "Started", "End"
                }
        ));
        runningTask.setViewportView(taskTable);

        runningTaskTab.add(runningTask);
        runningTask.setBounds(0, 0, 670, 410);

        RecentUpdates.addTab("Running Tasks", runningTaskTab);

        transactionTab.setLayout(null);

        transactionTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        transactionPane.setViewportView(transactionTable);

        transactionTab.add(transactionPane);
        transactionPane.setBounds(0, 0, 680, 430);

        RecentUpdates.addTab("Transactions", transactionTab);

        vehicleTab.setLayout(null);

        vehicleTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        vehiclePane.setViewportView(vehicleTable);

        vehicleTab.add(vehiclePane);
        vehiclePane.setBounds(0, 0, 680, 430);

        RecentUpdates.addTab("Appointed Vehicles", vehicleTab);

        volunteerTab.setLayout(null);

        volunteerTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        volunteerPane.setViewportView(volunteerTable);

        volunteerTab.add(volunteerPane);
        volunteerPane.setBounds(0, 0, 680, 430);

        RecentUpdates.addTab("Appointed Volunteers", volunteerTab);

        centerPanel.add(RecentUpdates);
        RecentUpdates.setBounds(20, 250, 660, 440);

        dashboardGreeting1.setFont(new Font("Inter", 0, 18));
        dashboardGreeting1.setText("Welcome back, Hasib!");
        centerPanel.add(dashboardGreeting1);
        dashboardGreeting1.setBounds(40, 60, 300, 23);

        add(centerPanel);
        centerPanel.setBounds(240, 0, 700, 720);

        rightSidePanel.setBackground(new Color(204, 255, 255));
        rightSidePanel.setLayout(null);

        noticeHeaderPanel.setMinimumSize(new Dimension(115, 50));
        noticeHeaderPanel.setLayout(null);

        noticeLabel.setFont(new Font("Inter", 0, 18));
        noticeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        noticeLabel.setText("Notice");
        noticeLabel.setOpaque(true);
        noticeLabel.setPreferredSize(new Dimension(115, 23));
        noticeHeaderPanel.add(noticeLabel);
        noticeLabel.setBounds(20, 20, 200, 30);

        rightSidePanel.add(noticeHeaderPanel);
        noticeHeaderPanel.setBounds(10, 10, 240, 70);

        noticeBodyPanel.setLayout(new GridLayout(9, 3));

        notice1.setText("Notice 1");
        noticeBodyPanel.add(notice1);

        notice2.setText("Notice 1");
        noticeBodyPanel.add(notice2);

        notice3.setText("Notice 1");
        noticeBodyPanel.add(notice3);

        notice4.setText("Notice 1");
        noticeBodyPanel.add(notice4);

        notice5.setText("Notice 1");
        noticeBodyPanel.add(notice5);

        notice6.setText("Notice 1");
        noticeBodyPanel.add(notice6);

        rightSidePanel.add(noticeBodyPanel);
        noticeBodyPanel.setBounds(10, 80, 240, 250);

        taskHeaderPanel.setMinimumSize(new Dimension(115, 50));
        taskHeaderPanel.setLayout(null);

        recentTaskLabel.setFont(new Font("Inter", 0, 18));
        recentTaskLabel.setHorizontalAlignment(SwingConstants.CENTER);
        recentTaskLabel.setText("New Tasks");
        recentTaskLabel.setOpaque(true);
        recentTaskLabel.setPreferredSize(new Dimension(115, 23));
        taskHeaderPanel.add(recentTaskLabel);
        recentTaskLabel.setBounds(20, 20, 200, 30);

        rightSidePanel.add(taskHeaderPanel);
        taskHeaderPanel.setBounds(10, 340, 240, 70);

        taskBodyPanel.setLayout(new GridLayout(9, 3));

        task1.setText("Task 1");
        taskBodyPanel.add(task1);

        task2.setText("Task 1");
        taskBodyPanel.add(task2);

        task3.setText("Task 1");
        taskBodyPanel.add(task3);

        task4.setText("Task 1");
        taskBodyPanel.add(task4);

        task5.setText("Task 1");
        taskBodyPanel.add(task5);

        task6.setText("Task 1");
        taskBodyPanel.add(task6);

        rightSidePanel.add(taskBodyPanel);
        taskBodyPanel.setBounds(10, 410, 240, 280);

        getContentPane().add(rightSidePanel);
        rightSidePanel.setBounds(940, 0, 260, 740);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void settingsBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void hideSidePanelBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void noticeBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void userBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
}
