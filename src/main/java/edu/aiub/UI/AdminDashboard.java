package edu.aiub.UI;

import edu.aiub.essentials.ButtonHighlighter;
import edu.aiub.essentials.ContactDialog;
import edu.aiub.essentials.ImageResizer;
import edu.aiub.essentials.TableColumnCenterizer;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdminDashboard extends JFrame {
    static JButton[] leftSidebarBtnList;

    private CardLayout centerCardLayout;
    private JButton contactBtn;
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
    private JTabbedPane RecentUpdates;
    private JLabel balanceLabel;
    private JButton bankBtn;
    private JPanel dashboardPanel;
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
    private JLabel notice1;
    private JLabel notice2;
    private JLabel notice3;
    private JLabel notice4;
    private JLabel notice5;
    private JLabel notice6;
    private JScrollPane noticePane;
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
    private JScrollPane taskPane;
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
    private JPanel taskInfoPanel;
    private JPanel balanceInfoPanel;
    private JPanel vehicleInfoPanel;
    private JPanel userInfoPanel;

    public AdminDashboard() {
        contactBtn = new JButton();
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
        leftSidePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon("src/main/java/edu/aiub/static/leftSidebar_bg.png").getImage(), 10, 20, getWidth()-20, getHeight()-40, null);
            }
        };
        dashboardBtn = new JButton();
        userBtn = new JButton();
        taskBtn = new JButton();
        inventoryBtn = new JButton();
        vehicleBtn = new JButton();
        bankBtn = new JButton();
        noticeBtn = new JButton();
        settingsBtn = new JButton();

//      Add Left Side Bar Buttons sequentially
        leftSidebarBtnList = new JButton[]{dashboardBtn, userBtn, taskBtn, inventoryBtn, vehicleBtn, bankBtn, noticeBtn, settingsBtn};

//      Center Panel
        hideSidePanelBtn = new JButton();
        centerCardPanel = new JPanel();
        dashboardPanel = new JPanel();
        userPanel = new JPanel();
        dashboardDate = new JLabel();
        centerMainPanel = new JPanel();
        currentInfo = new JPanel();
        taskInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        balanceInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        vehicleInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        userInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        taskLabel = new JLabel();
        balanceLabel = new JLabel();
        vehicleLabel = new JLabel();
        userLabel = new JLabel();
        currentTaskCount = new JLabel();
        currentBalance = new JLabel();
        vehicleCount = new JLabel();
        userCount = new JLabel();
        RecentUpdates = new JTabbedPane() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
//                UIManager.put("TabbedPane.tabAreaInsets", new Insets(20, 20, 20, 20));
            }
        };
        runningTaskTab = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 25, 25);
                g2.dispose();
                super.paintComponent(g);
            }
        };
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

//      Right Side Panel
        rightSidePanel = new JPanel();
        noticeHeaderPanel = new JPanel();
        noticeLabel = new JLabel();
        noticeBodyPanel = new JPanel();
        noticePane = new JScrollPane();
        notice1 = new JLabel();
        notice2 = new JLabel();
        notice3 = new JLabel();
        notice4 = new JLabel();
        notice5 = new JLabel();
        notice6 = new JLabel();
        taskHeaderPanel = new JPanel();
        recentTaskLabel = new JLabel();
        taskPane = new JScrollPane();
        taskBodyPanel = new JPanel();
        task1 = new JLabel();
        task2 = new JLabel();
        task3 = new JLabel();
        task4 = new JLabel();
        task5 = new JLabel();
        task6 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setFont(new Font("Inter", 0, 10));
        setPreferredSize(new Dimension(1220, 790));
        setMinimumSize(new Dimension(1220, 790));
        setMinimumSize(new Dimension(1220, 790));
        setResizable(false);
        setLayout(null);
        setTitle("NGO Management System");
        setBackground(Color.WHITE);
        setIconImage(new ImageIcon("src/main/java/edu/aiub/static/titleIcon.png").getImage());

        leftSidePanel.setBackground(new Color(236, 240, 241));
        leftSidePanel.setMinimumSize(new Dimension(220, 790));
        leftSidePanel.setPreferredSize(new Dimension(220, 790));
        leftSidePanel.setLayout(null);

//      Dashboard Button
        dashboardBtn.setBackground(new Color(46, 204, 113));
        dashboardBtn.setForeground(new Color(46, 204, 113));
        dashboardBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/dashboardBtn_hover.png"));
        dashboardBtn.setBorder(null);
        leftSidePanel.add(dashboardBtn);
        dashboardBtn.setBounds(20, 120, 200, 45);
        dashboardBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerCardLayout.show(centerCardPanel, "dashboardPanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, dashboardBtn);
            }
        });

//      User Button
        userBtn.setBackground(new Color(46, 204, 113));
        userBtn.setForeground(new Color(236, 240, 241));
        userBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/userBtn.png"));
        userBtn.setBorder(null);
        userBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerCardLayout.show(centerCardPanel, "userPanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, userBtn);
            }
        });
        leftSidePanel.add(userBtn);
        userBtn.setBounds(20, 170, 200, 45);

//      Task Button
        taskBtn.setBackground(new Color(46, 204, 113));
        taskBtn.setForeground(new Color(236, 240, 241));
        taskBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/taskBtn.png"));
        taskBtn.setBorder(null);
        leftSidePanel.add(taskBtn);
        taskBtn.setBounds(20, 220, 200, 45);
        taskBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerCardLayout.show(centerCardPanel, "taskPanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, taskBtn);
            }
        });

//      Inventory Button
        inventoryBtn.setBackground(new Color(46, 204, 113));
        inventoryBtn.setForeground(new Color(236, 240, 241));
        inventoryBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/inventoryBtn.png"));
        inventoryBtn.setBorder(null);
        leftSidePanel.add(inventoryBtn);
        inventoryBtn.setBounds(20, 270, 200, 45);
        inventoryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                centerCardLayout.show(centerCardPanel, "inventoryPanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, inventoryBtn);
            }
        });

//      Vehicle Button
        vehicleBtn.setBackground(new Color(46, 204, 113));
        vehicleBtn.setForeground(new Color(236, 240, 241));
        vehicleBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/vehicleBtn.png"));
        vehicleBtn.setBorder(null);
        leftSidePanel.add(vehicleBtn);
        vehicleBtn.setBounds(20, 320, 200, 45);
        vehicleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                centerCardLayout.show(centerCardPanel, "vehiclePanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, vehicleBtn);
            }
        });

//      Bank Button
        bankBtn.setBackground(new Color(46, 204, 113));
        bankBtn.setForeground(new Color(236, 240, 241));
        bankBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/bankBtn.png"));
        bankBtn.setBorder(null);
        leftSidePanel.add(bankBtn);
        bankBtn.setBounds(20, 370, 200, 45);
        bankBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                centerCardLayout.show(centerCardPanel, "bankPanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, bankBtn);
            }
        });

//      Notice Button
        noticeBtn.setBackground(new Color(46, 204, 113));
        noticeBtn.setForeground(new Color(236, 240, 241));
        noticeBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/noticeBtn.png"));
        noticeBtn.setBorder(null);
        noticeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerCardLayout.show(centerCardPanel, "noticePanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, noticeBtn);
            }
        });
        leftSidePanel.add(noticeBtn);
        noticeBtn.setBounds(20, 420, 200, 45);

//      Settings Button
        settingsBtn.setBackground(new Color(46, 204, 113));
        settingsBtn.setForeground(new Color(236, 240, 241));
        settingsBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/settingsBtn.png"));
        settingsBtn.setBorder(null);
        settingsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                settingsBtnActionPerformed(e);
                ButtonHighlighter.highlight(leftSidebarBtnList, settingsBtn);
            }
        });
        leftSidePanel.add(settingsBtn);
        settingsBtn.setBounds(20, 470, 200, 45);

//      Contact Button
        contactBtn.setBackground(new Color(98, 217, 149));
        contactBtn.setForeground(new Color(98, 217, 149));
        contactBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/contactBtn.png"));
        contactBtn.setBorder(null);
        contactBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (contactBtn.getIcon().toString().equals("src/main/java/edu/aiub/static/leftSidebarBtn/contactBtn.png")) {
                    contactBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/contactBtn_hover.png"));
                }
                ContactDialog contactDialog = new ContactDialog();
                contactDialog.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        super.windowClosed(e);
                        contactBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/contactBtn.png"));
                    }
                });

            }
        });
        leftSidePanel.add(contactBtn);
        contactBtn.setBounds(51, 640, 138, 34);

        getContentPane().add(leftSidePanel);
        leftSidePanel.setBounds(0, 0, 240, 750);


        centerCardPanel.setLayout(new CardLayout());
        centerCardLayout = (CardLayout) centerCardPanel.getLayout();
        // Dashboard Panel ----------------------------------------------
        dashboardPanel.setBackground(new Color(236, 240, 241));
        dashboardPanel.setLayout(null);

        dashboardDate.setFont(new Font("Inter", 0, 12));
        dashboardDate.setText("Mon, 18 July 2022");
        dashboardPanel.add(dashboardDate);
        dashboardDate.setBounds(40, 30, 110, 15);

        centerMainPanel.setLayout(null);

//      Current Info
        taskInfoPanel.setLayout(new GridLayout(2, 1));

        taskLabel.setHorizontalAlignment(SwingConstants.CENTER);
        taskLabel.setIcon(new ImageResizer("src/main/java/edu/aiub/static/currentInfo_label.png", 15, 15).getImage());
        taskLabel.setIconTextGap(10);
        taskLabel.setText("Task Running");
        taskLabel.setFont(new Font("Inter", Font.BOLD, 12));
        taskInfoPanel.add(taskLabel);

        currentTaskCount.setFont(new Font("Inter", Font.BOLD, 35));
        currentTaskCount.setHorizontalAlignment(SwingConstants.CENTER);
        currentTaskCount.setVerticalAlignment(SwingConstants.TOP);
        currentTaskCount.setText("06");
        taskInfoPanel.add(currentTaskCount);

//      Balance Info
        balanceInfoPanel.setLayout(new GridLayout(2, 1));

        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        balanceLabel.setIcon(new ImageResizer("src/main/java/edu/aiub/static/currentInfo_label.png", 15, 15).getImage());
        balanceLabel.setIconTextGap(10);
        balanceLabel.setFont(new Font("Inter", Font.BOLD, 12));
        balanceLabel.setText("Current Balance");
        balanceInfoPanel.add(balanceLabel);

        currentBalance.setFont(new Font("Inter", Font.BOLD, 35));
        currentBalance.setHorizontalAlignment(SwingConstants.CENTER);
        currentBalance.setVerticalAlignment(SwingConstants.TOP);
        currentBalance.setText("15000");
        balanceInfoPanel.add(currentBalance);

//      Vehicle Info
        vehicleInfoPanel.setLayout(new GridLayout(2, 1));

        vehicleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        vehicleLabel.setIcon(new ImageResizer("src/main/java/edu/aiub/static/currentInfo_label.png", 15, 15).getImage());
        vehicleLabel.setIconTextGap(10);
        vehicleLabel.setFont(new Font("Inter", Font.BOLD, 12));
        vehicleLabel.setText("Available Vehicle");
        vehicleInfoPanel.add(vehicleLabel);

        vehicleCount.setFont(new Font("Inter", Font.BOLD, 35));
        vehicleCount.setVerticalAlignment(SwingConstants.TOP);
        vehicleCount.setHorizontalAlignment(SwingConstants.CENTER);
        vehicleCount.setText("11");
        vehicleInfoPanel.add(vehicleCount);

//      User Info
        userInfoPanel.setLayout(new GridLayout(2, 1));

        userLabel.setHorizontalAlignment(SwingConstants.CENTER);
        userLabel.setIcon(new ImageResizer("src/main/java/edu/aiub/static/currentInfo_label.png", 15, 15).getImage());
        userLabel.setIconTextGap(10);
        userLabel.setFont(new Font("Inter", Font.BOLD, 12));
        userLabel.setText("Total Users");
        userInfoPanel.add(userLabel);

        userCount.setFont(new Font("Inter", Font.BOLD, 35));
        userCount.setVerticalAlignment(SwingConstants.TOP);
        userCount.setHorizontalAlignment(SwingConstants.CENTER);
        userCount.setText("26");
        userInfoPanel.add(userCount);

        currentInfo.add(taskInfoPanel);
        currentInfo.add(balanceInfoPanel);
        currentInfo.add(vehicleInfoPanel);
        currentInfo.add(userInfoPanel);

//        dashboardPanel.add(currentInfo);
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

        DefaultTableModel taskTableModel = new DefaultTableModel();
        {
            taskTableModel.setColumnIdentifiers(new String[]{"ID", "Task", "Started", "End"});
            taskTableModel.addRow(new String[]{"1", "Task 1", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"2", "Task 2", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"3", "Task 3", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"4", "Task 4", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"5", "Task 5", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"6", "Task 6", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"7", "Task 7", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"8", "Task 8", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"9", "Task 9", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"10", "Task 10", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"11", "Task 11", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"12", "Task 12", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"13", "Task 13", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"14", "Task 14", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"15", "Task 15", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"16", "Task 16", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"17", "Task 17", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"18", "Task 18", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"19", "Task 19", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"20", "Task 20", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"21", "Task 21", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"22", "Task 22", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"23", "Task 23", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"24", "Task 24", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"25", "Task 25", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"26", "Task 26", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"27", "Task 27", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"28", "Task 28", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"29", "Task 29", "12:00", "12:30"});
            taskTableModel.addRow(new String[]{"30", "Task 30", "12:00", "12:30"});
        }

        taskTable.setModel(taskTableModel);
        TableColumnCenterizer.centerTableColumn(taskTable);
        runningTask.setViewportView(taskTable);

        runningTaskTab.add(runningTask);
        runningTask.setBounds(0, 0, 657, 450);

        RecentUpdates.addTab("Running Tasks", runningTaskTab);

        transactionTab.setLayout(null);

        DefaultTableModel transactionTableModel = new DefaultTableModel();
        transactionTableModel.setColumnIdentifiers(new String[]{"ID", "Sender", "Amount", "Date", "Time"});
        transactionTableModel.addRow(new String[]{"1", "Sender 1", "1000", "12/12/2021", "12:00"});
        transactionTableModel.addRow(new String[]{"2", "Sender 2", "1000", "12/12/2021", "12:00"});
        transactionTableModel.addRow(new String[]{"3", "Sender 3", "1000", "12/12/2021", "12:00"});
        transactionTableModel.addRow(new String[]{"4", "Sender 4", "1000", "12/12/2021", "12:00"});
        transactionTable.setModel(transactionTableModel);
        transactionPane.setViewportView(transactionTable);
        TableColumnCenterizer.centerTableColumn(transactionTable);

        transactionTab.add(transactionPane);
        transactionPane.setBounds(0, 0, 657, 450);

        RecentUpdates.addTab("Transactions", transactionTab);

        vehicleTab.setLayout(null);

        DefaultTableModel vehicleTableModel = new DefaultTableModel();
        vehicleTableModel.setColumnIdentifiers(new String[]{"ID", "Vehicle", "Driver", "Status"});
        vehicleTableModel.addRow(new String[]{"1", "Vehicle 1", "Driver 1", "Available"});
        vehicleTableModel.addRow(new String[]{"2", "Vehicle 2", "Driver 2", "Available"});
        vehicleTableModel.addRow(new String[]{"3", "Vehicle 3", "Driver 3", "Available"});
        vehicleTableModel.addRow(new String[]{"4", "Vehicle 4", "Driver 4", "Available"});

        vehicleTable.setModel(vehicleTableModel);
        vehiclePane.setViewportView(vehicleTable);
        TableColumnCenterizer.centerTableColumn(vehicleTable);

        vehicleTab.add(vehiclePane);
        vehiclePane.setBounds(0, 0, 657, 450);

        RecentUpdates.addTab("Appointed Vehicles", vehicleTab);

        volunteerTab.setLayout(null);

        DefaultTableModel volunteerTableModel = new DefaultTableModel();
        volunteerTableModel.setColumnIdentifiers(new String[]{"ID", "Volunteer", "Task", "Status"});
        volunteerTableModel.addRow(new String[]{"1", "Volunteer 1", "Task 1", "Available"});
        volunteerTableModel.addRow(new String[]{"2", "Volunteer 2", "Task 2", "Available"});
        volunteerTableModel.addRow(new String[]{"3", "Volunteer 3", "Task 3", "Available"});
        volunteerTableModel.addRow(new String[]{"4", "Volunteer 4", "Task 4", "Available"});

        volunteerTable.setModel(volunteerTableModel);
        volunteerPane.setViewportView(volunteerTable);
        TableColumnCenterizer.centerTableColumn(volunteerTable);

        volunteerTab.add(volunteerPane);
        volunteerPane.setBounds(0, 0, 657, 450);

        RecentUpdates.addTab("Appointed Volunteers", volunteerTab);

//        dashboardPanel.add(RecentUpdates);
//        centerMainPanel.setBackground(new Color(138, 184, 197));
        centerMainPanel.add(RecentUpdates);
        RecentUpdates.setBounds(10, 140, 660, 490);

        dashboardGreeting.setFont(new Font("Inter", Font.BOLD, 25));
        dashboardGreeting.setText("Welcome back, Hasib!");
        dashboardPanel.add(dashboardGreeting);
        dashboardGreeting.setBounds(40, 60, 300, 23);

        dashboardPanel.add(centerMainPanel);
        centerMainPanel.setBounds(10, 100, 680, 750);

        add(dashboardPanel);
        dashboardPanel.setBounds(240, 0, 700, 750);

        centerCardPanel.add(dashboardPanel, "dashboardPanel");

        // End of Dashboard Panel ------------------------------------------------

        // Start of User Panel ---------------------------------------------------
        userPanel.setBackground(new Color(255, 255, 255));
        userPanel.setAutoscrolls(true);
        userPanel.setLayout(null);

        DefaultTableModel userTableModel = new DefaultTableModel();
        userTableModel.setColumnIdentifiers(new String[]{"ID", "Name", "Email", "Phone", "Address", "User Type"});
        userTableModel.addRow(new String[]{"1", "Hasib", "example@domain.com", "01700000000", "Dhaka, Bangladesh", "Admin"});
        userTable.setModel(userTableModel);
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
        taskPanel.setBackground(new Color(255, 255, 255));
        taskPanel.setAutoscrolls(true);
        taskPanel.setLayout(null);

        DefaultTableModel userMainTableModel = new DefaultTableModel();
        userMainTableModel.setColumnIdentifiers(new String[]{"ID", "Name", "Email", "Phone", "Registered On", "User Type", "Action"});
        userMainTableModel.addRow(new String[]{"1", "Hasib", "example@domain.com", "13246546789", "12/2/22", "Staff", null});
        userMainTableModel.addRow(new String[]{"2", "A", null, null, null, null, null});
        userMainTableModel.addRow(new String[]{"3", "B", null, null, null, null, null});
        userMainTableModel.addRow(new String[]{"4", "C", null, null, null, null, null});
        userMainTableModel.addRow(new String[]{"5", "D", null, null, null, null, null});

        userMainTable.setModel(userMainTableModel);
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
        inventoryPanel.setBackground(new Color(255, 255, 255));
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
                    String.class, String.class, String.class, String.class, String.class, Object.class
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
        vehiclePanel.setBackground(new Color(255, 255, 255));
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

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID", "Name", "Type", "Amount", "Price", "Action"});
        vehicleCenterTable.setModel(model);


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
        bankPanel.setBackground(new Color(255, 255, 255));
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


//      Transactions Table
        DefaultTableModel tnxTableModel = new DefaultTableModel();
        tnxTableModel.setColumnIdentifiers(new Object[]{"ID", "Name", "Type", "Amount", "Price", "Action"});
        tnxTable.setModel(tnxTableModel);

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
//        noticePanel.setBackground(new Color(255, 255, 255));
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

//      Notice Table
        DefaultTableModel noticeTableModel = new DefaultTableModel();
        noticeTableModel.setColumnIdentifiers(new Object[]{"ID", "Name", "Type", "Amount", "Price", "Action"});
        noticeTable.setModel(noticeTableModel);


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

        centerCardPanel.setBounds(240, 0, 700, 750); // CardLayout for center panel
//        centerCardPanel.setBackground(new Color(236, 240, 241));
        add(centerCardPanel); // CardLayout for center panel


//      Right Side Bar
//        rightSidePanel.setBackground(new Color(204, 255, 255));
        rightSidePanel.setLayout(null);

        noticeHeaderPanel.setMinimumSize(new Dimension(115, 50));
        noticeHeaderPanel.setLayout(null);

        noticeLabel.setIcon(new ImageIcon("src/main/java/edu/aiub/static/noticeHeader_bg.png"));
        noticeHeaderPanel.add(noticeLabel);
        noticeLabel.setBounds(0, 0, 240, 50);

        rightSidePanel.add(noticeHeaderPanel);
        noticeHeaderPanel.setBounds(10, 25, 240, 50);

//      Notice Body
        noticeBodyPanel.setLayout(new BoxLayout(noticeBodyPanel, BoxLayout.Y_AXIS));
        noticeBodyPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        noticeBodyPanel.setBackground(new Color(255, 255, 255));
        noticePanel.add(noticeBodyPanel);

        noticePane.setBounds(10, 80, 240, 250);
//        noticeBodyPanel.setBounds(10, 10, 240, 250);

        for (int i = 0; i < 20; i++) {
            AdminRightSidebarScrollPane.add(noticeBodyPanel, new JLabel("Notice " + i));

        }

        noticePane.setViewportView(noticeBodyPanel);
        noticePane.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
        rightSidePanel.add(noticePane);


        taskHeaderPanel.setMinimumSize(new Dimension(115, 50));
        taskHeaderPanel.setLayout(null);

        recentTaskLabel.setIcon(new ImageIcon("src/main/java/edu/aiub/static/projectHeader_bg.png"));
        taskHeaderPanel.add(recentTaskLabel);
        recentTaskLabel.setBounds(0, 0, 240, 50);

        rightSidePanel.add(taskHeaderPanel);
        taskHeaderPanel.setBounds(10, 355, 240, 50);

        taskBodyPanel.setLayout(new BoxLayout(taskBodyPanel, BoxLayout.Y_AXIS));
        taskBodyPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        taskBodyPanel.setBackground(new Color(255, 255, 255));
//        taskBodyPanel.setBounds(10, 410, 240, 280);
        taskPane.add(taskBodyPanel);

        for (int i = 0; i < 20; i++) {
            AdminRightSidebarScrollPane.add(taskBodyPanel, new JLabel("Task " + i));
        }

        taskPane.setViewportView(taskBodyPanel);
        taskPane.setBounds(10, 410, 240, 320);
        taskPane.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
        rightSidePanel.add(taskPane);

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
