package edu.aiub.UI;

import edu.aiub.essentials.ImageResizer;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminDashboard extends JFrame {
    private String USER_AVATAR = "C:\\Users\\MDHASIBASKARI\\IdeaProjects\\nms\\src\\main\\java\\edu\\aiub\\static\\avatar.png";
    private String DASHBOARD_ICON = "src/main/java/edu/aiub/static/dashboard_icon.png";
    private String USER_ICON = "src/main/java/edu/aiub/static/dashboard_icon.png";
    private String TASK_ICON = "src/main/java/edu/aiub/static/dashboard_icon.png";
    private String INVENTORY_ICON = "src/main/java/edu/aiub/static/dashboard_icon.png";
    private String VEHICLE_ICON = "src/main/java/edu/aiub/static/dashboard_icon.png";
    private String BANK_ICON = "src/main/java/edu/aiub/static/dashboard_icon.png";
    private String NOTICE_ICON = "src/main/java/edu/aiub/static/dashboard_icon.png";
    private String SETTINGS_ICON = "src/main/java/edu/aiub/static/settings_icon.png";

    private CardLayout centerCardLayout;
    private JButton addInventoryBtn;
    private JButton addNoticeBtn;
    private JButton addTaskBtn;
    private JButton addTnxBtn;
    private JButton addUserBtn;
    private JButton addVehicleBtn;
    private JLabel bankBalanceLabel;
    private JPanel bankBalancePane;
    private JLabel bankMainLabel;
    private JComboBox<String> bankMonthList;
    private JPanel bankPanel;
    private JScrollPane bankScrollPane;
    private JComboBox<String> bankYearList;
    private JPanel centerCardPanel;
    private JLabel inventoryCountLabel;
    private JPanel inventoryCountPane;
    private JLabel inventoryMainLabel;
    private JComboBox<String> inventoryMonthList;
    private JPanel inventoryPanel;
    private JScrollPane inventoryScrollPane;
    private JTable inventoryTable;
    private JComboBox<String> inventoryYearList;
    private JLabel noticeCountLabel;
    private JPanel noticeCountPane;
    private JLabel noticeMainLabel;
    private JComboBox<String> noticeMonthList;
    private JPanel noticePanel;
    private JScrollPane noticeScrollPane;
    private JTable noticeTable;
    private JComboBox<String> noticeYearList;
    private JLabel taskCountLabel;
    private JLabel taskCountMainLabel;
    private JPanel taskCountPanel;
    private JComboBox<String> taskMonthList;
    private JPanel taskPanel;
    private JScrollPane taskScrollPane;
    private JComboBox<String> taskYearList;
    private JTable tnxTable;
    private JLabel userCountLabel;
    private JLabel userCountMainLabel;
    private JPanel userCountPanel;
    private JTable userMainTable;
    private JComboBox<String> userMonthList;
    private JPanel userPanel;
    private JScrollPane userScrollPane;
    private JTable userTable;
    private JComboBox<String> userYearList;
    private JTable vehicleCenterTable;
    private JLabel vehicleCountLabel;
    private JPanel vehicleCountPane;
    private JLabel vehicleMainLabel;
    private JComboBox<String> vehicleMonthList;
    private JPanel vehiclePanel;
    private JScrollPane vehicleScrollPane;
    private JComboBox<String> vehicleYearList;
    private JButton profileMenuBtn;
    private JTabbedPane RecentUpdates;
    private JLabel balanceLabel;
    private JButton bankBtn;
    private JPanel dashboardPanel;
    private JSeparator centerSeparator;
    private JLabel currentBalance;
    private JPanel currentInfo;
    private JLabel currentTaskCount;
    private JButton dashboardBtn;
    private JLabel dashboardDate;
    private JLabel dashboardGreeting;
    private JButton hideSidePanelBtn;
    private JButton inventoryBtn;
    private JPanel centerMainPanel;
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
        userPanel = new JPanel();
        userScrollPane = new JScrollPane();
        userTable = new JTable();
        userCountPanel = new JPanel();
        userCountLabel = new JLabel();
        userCountMainLabel = new JLabel();
        addUserBtn = new JButton();
        userMonthList = new JComboBox<>();
        userYearList = new JComboBox<>();
        taskPanel = new JPanel();
        taskScrollPane = new JScrollPane();
        userMainTable = new JTable();
        taskCountPanel = new JPanel();
        taskCountLabel = new JLabel();
        taskCountMainLabel = new JLabel();
        addTaskBtn = new JButton();
        taskMonthList = new JComboBox<>();
        taskYearList = new JComboBox<>();
        inventoryPanel = new JPanel();
        inventoryCountPane = new JPanel();
        inventoryCountLabel = new JLabel();
        inventoryMainLabel = new JLabel();
        inventoryMonthList = new JComboBox<>();
        inventoryYearList = new JComboBox<>();
        addInventoryBtn = new JButton();
        inventoryScrollPane = new JScrollPane();
        inventoryTable = new JTable();
        vehiclePanel = new JPanel();
        vehicleCountPane = new JPanel();
        vehicleCountLabel = new JLabel();
        vehicleMainLabel = new JLabel();
        vehicleMonthList = new JComboBox<>();
        vehicleYearList = new JComboBox<>();
        addVehicleBtn = new JButton();
        vehicleScrollPane = new JScrollPane();
        vehicleCenterTable = new JTable();
        bankPanel = new JPanel();
        bankBalancePane = new JPanel();
        bankBalanceLabel = new JLabel();
        bankMainLabel = new JLabel();
        bankMonthList = new JComboBox<>();
        bankYearList = new JComboBox<>();
        addTnxBtn = new JButton();
        bankScrollPane = new JScrollPane();
        tnxTable = new JTable();
        noticePanel = new JPanel();
        noticeCountPane = new JPanel();
        noticeCountLabel = new JLabel();
        noticeMainLabel = new JLabel();
        noticeMonthList = new JComboBox<>();
        noticeYearList = new JComboBox<>();
        addNoticeBtn = new JButton();
        noticeScrollPane = new JScrollPane();
        noticeTable = new JTable();
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
        centerCardPanel = new JPanel();
        dashboardPanel = new JPanel();
        userPanel = new JPanel();
        dashboardDate = new JLabel();
        centerMainPanel = new JPanel();
        currentInfo = new JPanel();
        taskLabel = new JLabel();
        balanceLabel = new JLabel();
        vehicleLabel = new JLabel();
        userLabel = new JLabel();
        currentTaskCount = new JLabel();
        currentBalance = new JLabel();
        vehicleCount = new JLabel();
        userCount = new JLabel();
        centerSeparator = new JSeparator();
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
        dashboardGreeting = new JLabel();
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
        logoLabel.setIcon(new ImageResizer(USER_AVATAR, 50, 50).getImage());
        logoLabel.setText("Md Hasib Askari");
        logoLabel.setOpaque(true);
        leftSidePanel.add(logoLabel);
        logoLabel.setBounds(10, 20, 170, 50);

        profileMenuBtn = new JButton();
        profileMenuBtn.setText("<>");
        profileMenuBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                profileMenuBtnActionPerformed(e);
            }
        });
        leftSidePanel.add(profileMenuBtn);
        profileMenuBtn.setBounds(180, 20, 50, 50);

//      Dashboard Button
        dashboardBtn.setFont(new Font("Inter", Font.PLAIN, 12));
        dashboardBtn.setIcon(new ImageResizer(DASHBOARD_ICON, 20, 20).getImage());
        dashboardBtn.setText("Dashbard");
        dashboardBtn.setHorizontalAlignment(SwingConstants.LEFT);
        leftSidePanel.add(dashboardBtn);
        dashboardBtn.setBounds(20, 90, 190, 25);
        dashboardBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerCardLayout.show(centerCardPanel, "dashboardPanel");
            }
        });

//      User Button
        userBtn.setFont(new Font("Inter", Font.PLAIN, 12));
        userBtn.setText("User Management");
        userBtn.setHorizontalAlignment(SwingConstants.LEFT);
        userBtn.setIcon(new ImageResizer(USER_ICON, 20, 20).getImage());
        userBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerCardLayout.show(centerCardPanel, "userPanel");
            }
        });
        leftSidePanel.add(userBtn);
        userBtn.setBounds(20, 120, 190, 25);

        taskBtn.setFont(new Font("Inter", Font.PLAIN, 12));
        taskBtn.setHorizontalAlignment(SwingConstants.LEFT);
        taskBtn.setIcon(new ImageResizer(TASK_ICON, 20, 20).getImage());
        taskBtn.setText("Task Management");
        leftSidePanel.add(taskBtn);
        taskBtn.setBounds(20, 150, 190, 25);
        taskBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerCardLayout.show(centerCardPanel, "taskPanel");
            }
        });

        inventoryBtn.setFont(new Font("Inter", Font.PLAIN, 12));
        inventoryBtn.setHorizontalAlignment(SwingConstants.LEFT);
        inventoryBtn.setIcon(new ImageResizer(INVENTORY_ICON, 20, 20).getImage());
        inventoryBtn.setText("Inventory Management");
        leftSidePanel.add(inventoryBtn);
        inventoryBtn.setBounds(20, 180, 190, 25);
        inventoryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                centerCardLayout.show(centerCardPanel, "inventoryPanel");
            }
        });

        vehicleBtn.setFont(new Font("Inter", Font.PLAIN, 12));
        vehicleBtn.setHorizontalAlignment(SwingConstants.LEFT);
        vehicleBtn.setIcon(new ImageResizer(VEHICLE_ICON, 20, 20).getImage());
        vehicleBtn.setText("Vehicle Management");
        leftSidePanel.add(vehicleBtn);
        vehicleBtn.setBounds(20, 210, 190, 25);
        vehicleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                centerCardLayout.show(centerCardPanel, "vehiclePanel");
            }
        });

        bankBtn.setFont(new Font("Inter", Font.PLAIN, 12));
        bankBtn.setHorizontalAlignment(SwingConstants.LEFT);
        bankBtn.setIcon(new ImageResizer(BANK_ICON, 20, 20).getImage());
        bankBtn.setText("Bank Management");
        leftSidePanel.add(bankBtn);
        bankBtn.setBounds(20, 240, 190, 25);
        bankBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                centerCardLayout.show(centerCardPanel, "bankPanel");
            }
        });

        noticeBtn.setFont(new Font("Inter", Font.PLAIN, 12));
        noticeBtn.setHorizontalAlignment(SwingConstants.LEFT);
        noticeBtn.setIcon(new ImageResizer(NOTICE_ICON, 20, 20).getImage());
        noticeBtn.setText("Notice");
        noticeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerCardLayout.show(centerCardPanel, "noticePanel");
            }
        });
        leftSidePanel.add(noticeBtn);
        noticeBtn.setBounds(20, 270, 190, 25);

        hideSidePanelBtn.setFont(new Font("Inter", Font.PLAIN, 12));
        hideSidePanelBtn.setText("<<");
        hideSidePanelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hideSidePanelBtnActionPerformed(e);
            }
        });
        leftSidePanel.add(hideSidePanelBtn);
        hideSidePanelBtn.setBounds(190, 630, 50, 40);

        settingsBtn.setFont(new Font("Inter", Font.PLAIN, 14));
        settingsBtn.setIcon(new ImageResizer(SETTINGS_ICON, 20, 20).getImage());
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


        centerCardPanel.setLayout(new CardLayout());
        centerCardLayout = (CardLayout) centerCardPanel.getLayout();
        // Dashboard Panel ----------------------------------------------
        dashboardPanel.setBackground(new Color(255, 204, 204));
        dashboardPanel.setLayout(null);

        dashboardDate.setFont(new Font("Inter", 0, 12));
        dashboardDate.setText("Mon, 18 July 2022");
        dashboardPanel.add(dashboardDate);
        dashboardDate.setBounds(40, 30, 110, 15);

        centerMainPanel.setLayout(null);

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

//        dashboardPanel.add(currentInfo);
        centerMainPanel.add(currentInfo);
        currentInfo.setBounds(10, 10, 660, 80);

        centerSeparator.setForeground(new Color(153, 153, 153));
        centerSeparator.setPreferredSize(new Dimension(0, 1));
        dashboardPanel.add(centerSeparator);
        centerSeparator.setBounds(40, 100, 610, 30);

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

//        dashboardPanel.add(RecentUpdates);
        centerMainPanel.add(RecentUpdates);
        RecentUpdates.setBounds(10, 120, 660, 440);

        dashboardGreeting.setFont(new Font("Inter", 0, 18));
        dashboardGreeting.setText("Welcome back, Hasib!");
        dashboardPanel.add(dashboardGreeting);
        dashboardGreeting.setBounds(40, 60, 300, 23);

        dashboardPanel.add(centerMainPanel);
        centerMainPanel.setBounds(10, 120, 680, 570);

        add(dashboardPanel);
        dashboardPanel.setBounds(240, 0, 700, 720);

        centerCardPanel.add(dashboardPanel, "dashboardPanel");

        // End of Dashboard Panel ------------------------------------------------

        // Start of User Panel ---------------------------------------------------
        userPanel.setBackground(new Color(153, 153, 255));
        userPanel.setAutoscrolls(true);
        userPanel.setLayout(null);

        userTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {"1", "Hasib", "example@gmail.com", "13246546789", "12/2/22", "Staff", null},
                        {"2", "A", null, null, null, null, null},
                        {"3", "B", null, null, null, null, null},
                        {"4", "C", null, null, null, null, null},
                        {"5", "D", null, null, null, null, null}
                },
                new String [] {
                        "ID", "Name", "Email", "Phone", "Registered On", "User Type", "Action"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userScrollPane.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            userTable.getColumnModel().getColumn(2).setMinWidth(50);
            userTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            userTable.getColumnModel().getColumn(5).setHeaderValue("User Type");
        }

        userPanel.add(userScrollPane);
        userScrollPane.setBounds(10, 160, 680, 530);

        userCountPanel.setLayout(null);

        userCountLabel.setText("Total Users");
        userCountPanel.add(userCountLabel);
        userCountLabel.setBounds(10, 10, 100, 16);

        userCountMainLabel.setFont(new Font("Segoe UI", 0, 36));
        userCountMainLabel.setText("22");
        userCountPanel.add(userCountMainLabel);
        userCountMainLabel.setBounds(10, 30, 100, 40);

        userPanel.add(userCountPanel);
        userCountPanel.setBounds(10, 20, 120, 80);

        addUserBtn.setText("Add New User");
        addUserBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
//                addUserBtnActionPerformed(evt);
            }
        });
        userPanel.add(addUserBtn);
        addUserBtn.setBounds(500, 60, 180, 40);

        userMonthList.setModel(new DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        userPanel.add(userMonthList);
        userMonthList.setBounds(240, 120, 110, 30);

        userYearList.setModel(new DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023" }));
        userPanel.add(userYearList);
        userYearList.setBounds(350, 120, 110, 30);


        centerCardPanel.add(userPanel, "userPanel");
        // End of User Panel -----------------------------------------------------

        // Start of Task Panel ---------------------------------------------------
        taskPanel.setBackground(new Color(153, 153, 255));
        taskPanel.setAutoscrolls(true);
        taskPanel.setLayout(null);

        userMainTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {"1", "Hasib", "example@gmail.com", "13246546789", "12/2/22", "Staff", null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                },
                new String [] {
                        "ID", "Name", "Email", "Phone", "Registered On", "User Type", "Action"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        taskScrollPane.setViewportView(userMainTable);
        if (userMainTable.getColumnModel().getColumnCount() > 0) {
            userMainTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            userMainTable.getColumnModel().getColumn(2).setMinWidth(50);
            userMainTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            userMainTable.getColumnModel().getColumn(5).setHeaderValue("User Type");
        }

        taskPanel.add(taskScrollPane);
        taskScrollPane.setBounds(10, 160, 680, 530);

        taskCountPanel.setLayout(null);

        taskCountLabel.setText("Total Users");
        taskCountPanel.add(taskCountLabel);
        taskCountLabel.setBounds(10, 10, 100, 16);

        taskCountMainLabel.setFont(new Font("Segoe UI", 0, 36)); // NOI18N
        taskCountMainLabel.setText("22");
        taskCountPanel.add(taskCountMainLabel);
        taskCountMainLabel.setBounds(10, 30, 100, 40);

        taskPanel.add(taskCountPanel);
        taskCountPanel.setBounds(10, 20, 120, 80);

        addTaskBtn.setText("Add New Task");
        addTaskBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
//                addTaskBtnActionPerformed(evt);
            }
        });
        taskPanel.add(addTaskBtn);
        addTaskBtn.setBounds(500, 60, 180, 40);

        taskMonthList.setModel(new DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        taskPanel.add(taskMonthList);
        taskMonthList.setBounds(240, 120, 110, 30);

        taskYearList.setModel(new DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023" }));
        taskPanel.add(taskYearList);
        taskYearList.setBounds(350, 120, 110, 30);

        centerCardPanel.add(taskPanel, "taskPanel");
        // End of Task Panel -----------------------------------------------------

        // Start of Inventory Panel ----------------------------------------------
        inventoryPanel.setBackground(new Color(255, 102, 102));
        inventoryPanel.setLayout(null);

        inventoryCountPane.setLayout(null);

        inventoryCountLabel.setText("Total Commodity");
        inventoryCountPane.add(inventoryCountLabel);
        inventoryCountLabel.setBounds(10, 10, 100, 16);

        inventoryMainLabel.setFont(new Font("Segoe UI", 0, 36)); // NOI18N
        inventoryMainLabel.setText("22");
        inventoryCountPane.add(inventoryMainLabel);
        inventoryMainLabel.setBounds(10, 30, 100, 40);

        inventoryPanel.add(inventoryCountPane);
        inventoryCountPane.setBounds(10, 20, 120, 80);

        inventoryMonthList.setModel(new DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        inventoryPanel.add(inventoryMonthList);
        inventoryMonthList.setBounds(240, 120, 110, 30);

        inventoryYearList.setModel(new DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023" }));
        inventoryPanel.add(inventoryYearList);
        inventoryYearList.setBounds(350, 120, 110, 30);

        addInventoryBtn.setText("Add New Commodity");
        addInventoryBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
//                addInventoryBtnActionPerformed(evt);
            }
        });
        inventoryPanel.add(addInventoryBtn);
        addInventoryBtn.setBounds(500, 60, 180, 40);

        inventoryTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "ID", "Name", "Type", "Amount", "Price", "Action"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryScrollPane.setViewportView(inventoryTable);
        if (inventoryTable.getColumnModel().getColumnCount() > 0) {
            inventoryTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            inventoryTable.getColumnModel().getColumn(2).setMinWidth(50);
            inventoryTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        inventoryPanel.add(inventoryScrollPane);
        inventoryScrollPane.setBounds(10, 160, 680, 530);

        centerCardPanel.add(inventoryPanel, "inventoryPanel");
        // End of Inventory Panel ------------------------------------------------

        // Start of Vehicle Panel
        vehiclePanel.setBackground(new Color(51, 255, 51));
        vehiclePanel.setLayout(null);

        vehicleCountPane.setLayout(null);

        vehicleCountLabel.setText("Total Vehicle");
        vehicleCountPane.add(vehicleCountLabel);
        vehicleCountLabel.setBounds(10, 10, 100, 16);

        vehicleMainLabel.setFont(new Font("Segoe UI", 0, 36)); // NOI18N
        vehicleMainLabel.setText("22");
        vehicleCountPane.add(vehicleMainLabel);
        vehicleMainLabel.setBounds(10, 30, 100, 40);

        vehiclePanel.add(vehicleCountPane);
        vehicleCountPane.setBounds(10, 20, 120, 80);

        vehicleMonthList.setModel(new DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        vehiclePanel.add(vehicleMonthList);
        vehicleMonthList.setBounds(240, 120, 110, 30);

        vehicleYearList.setModel(new DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023" }));
        vehiclePanel.add(vehicleYearList);
        vehicleYearList.setBounds(350, 120, 110, 30);

        addVehicleBtn.setText("Add New Vehicle");
        addVehicleBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
//                addVehicleBtnActionPerformed(evt);
            }
        });
        vehiclePanel.add(addVehicleBtn);
        addVehicleBtn.setBounds(500, 60, 180, 40);

        vehicleCenterTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "ID", "Name", "Type", "Amount", "Price", "Action"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vehicleScrollPane.setViewportView(vehicleCenterTable);
        if (vehicleCenterTable.getColumnModel().getColumnCount() > 0) {
            vehicleCenterTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            vehicleCenterTable.getColumnModel().getColumn(2).setMinWidth(50);
            vehicleCenterTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        vehiclePanel.add(vehicleScrollPane);
        vehicleScrollPane.setBounds(10, 160, 680, 530);

        centerCardPanel.add(vehiclePanel, "vehiclePanel");
        // End of Vehicle Panel ------------------------------------------------

        // Start of Transaction Panel
        bankPanel.setBackground(new Color(51, 255, 51));
        bankPanel.setLayout(null);

        bankBalancePane.setLayout(null);

        bankBalanceLabel.setText("Total Transactions");
        bankBalancePane.add(bankBalanceLabel);
        bankBalanceLabel.setBounds(10, 10, 100, 16);

        bankMainLabel.setFont(new Font("Segoe UI", 0, 36)); // NOI18N
        bankMainLabel.setText("22");
        bankBalancePane.add(bankMainLabel);
        bankMainLabel.setBounds(10, 30, 100, 40);

        bankPanel.add(bankBalancePane);
        bankBalancePane.setBounds(10, 20, 120, 80);

        bankMonthList.setModel(new DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        bankPanel.add(bankMonthList);
        bankMonthList.setBounds(240, 120, 110, 30);

        bankYearList.setModel(new DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023" }));
        bankPanel.add(bankYearList);
        bankYearList.setBounds(350, 120, 110, 30);

        addTnxBtn.setText("Add New Transaction");
        addTnxBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
//                addTnxBtnActionPerformed(evt);
            }
        });
        bankPanel.add(addTnxBtn);
        addTnxBtn.setBounds(500, 60, 180, 40);

        tnxTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "ID", "Name", "Type", "Amount", "Price", "Action"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bankScrollPane.setViewportView(tnxTable);
        if (tnxTable.getColumnModel().getColumnCount() > 0) {
            tnxTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            tnxTable.getColumnModel().getColumn(2).setMinWidth(50);
            tnxTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        bankPanel.add(bankScrollPane);
        bankScrollPane.setBounds(10, 160, 680, 530);

        centerCardPanel.add(bankPanel, "bankPanel");
        // End of Transaction Panel

        // Start of Notice Panel
        noticePanel.setBackground(new Color(51, 255, 51));
        noticePanel.setLayout(null);

        noticeCountPane.setLayout(null);

        noticeCountLabel.setText("Total Notice");
        noticeCountPane.add(noticeCountLabel);
        noticeCountLabel.setBounds(10, 10, 100, 16);

        noticeMainLabel.setFont(new Font("Segoe UI", 0, 36)); // NOI18N
        noticeMainLabel.setText("22");
        noticeCountPane.add(noticeMainLabel);
        noticeMainLabel.setBounds(10, 30, 100, 40);

        noticePanel.add(noticeCountPane);
        noticeCountPane.setBounds(10, 20, 120, 80);

        noticeMonthList.setModel(new DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        noticePanel.add(noticeMonthList);
        noticeMonthList.setBounds(240, 120, 110, 30);

        noticeYearList.setModel(new DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023" }));
        noticePanel.add(noticeYearList);
        noticeYearList.setBounds(350, 120, 110, 30);

        addNoticeBtn.setText("Add New Notice");
        addNoticeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
//                addNoticeBtnActionPerformed(evt);
            }
        });
        noticePanel.add(addNoticeBtn);
        addNoticeBtn.setBounds(500, 60, 180, 40);

        noticeTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "ID", "Name", "Type", "Amount", "Price", "Action"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        noticeScrollPane.setViewportView(noticeTable);
        if (noticeTable.getColumnModel().getColumnCount() > 0) {
            noticeTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            noticeTable.getColumnModel().getColumn(2).setMinWidth(50);
            noticeTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        noticePanel.add(noticeScrollPane);
        noticeScrollPane.setBounds(10, 160, 680, 530);

        centerCardPanel.add(noticePanel, "noticePanel");
        // End of Notice Panel

        centerCardPanel.setBounds(240, 0, 700, 700); // CardLayout for center panel
        add(centerCardPanel); // CardLayout for center panel

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
