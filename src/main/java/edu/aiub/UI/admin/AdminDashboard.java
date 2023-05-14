package edu.aiub.UI.admin;

import edu.aiub.UI.authentication.Signin;
import edu.aiub.UIComponents.*;
import edu.aiub.database.*;
import edu.aiub.essentials.*;
import org.bson.Document;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AdminDashboard extends JFrame {

    static String userName = "User";
    static JButton[] leftSidebarBtnList;
    private static DefaultTableModel taskTableModel;
    private static DefaultTableModel transactionTableModel;
    private static DefaultTableModel vehicleTableModel;
    private static DefaultTableModel volunteerTableModel;
    private static DefaultTableModel userTableModel;
    private static DefaultTableModel taskMainTableModel;
    private static DefaultTableModel inventoryTableModel;
    private static DefaultTableModel vehicleMainTableModel;
    private static DefaultTableModel noticeTableModel;
    private static DefaultTableModel tnxTableModel;

    private final CardLayout centerCardLayout;
    private final JButton contactBtn;
    private final JButton addInventoryBtn;
    private final JButton addNoticeBtn;
    private final JButton addTaskBtn;
    private final JButton addTnxBtn;
    private final JButton addUserBtn;
    private final JButton addVehicleBtn;
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
    private JTable taskMainTable;
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

    public AdminDashboard(int centerCardIndex) {

        contactBtn = new JButton();
        userPanel = new JPanel();
        userScrollPane = new JScrollPane();
        userTable = new JTable();
        userCountPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_bg.png").getImage(), 0, 0,180,100, null);
            }
        };
        userCountLabel = new JLabel();
        userCountMainLabel = new JLabel();
        addUserBtn = new JButton();
        userMonthList = new JComboBox<>();
        userYearList = new JComboBox<>();
        taskPanel = new JPanel();
        taskScrollPane = new JScrollPane();
        taskMainTable = new JTable();
        taskCountPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_bg.png").getImage(), 0, 0,180,100, null);
            }
        };
        taskCountLabel = new JLabel();
        taskCountMainLabel = new JLabel();
        addTaskBtn = new JButton();
        taskMonthList = new JComboBox<>();
        taskYearList = new JComboBox<>();
        inventoryPanel = new JPanel();
        inventoryCountPane = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_bg.png").getImage(), 0, 0,180,100, null);
            }
        };
        inventoryCountLabel = new JLabel();
        inventoryMainLabel = new JLabel();
        inventoryMonthList = new JComboBox<>();
        inventoryYearList = new JComboBox<>();
        addInventoryBtn = new JButton();
        inventoryScrollPane = new JScrollPane();
        inventoryTable = new JTable();
        vehiclePanel = new JPanel();
        vehicleCountPane = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_bg.png").getImage(), 0, 0,180,100, null);
            }
        };
        vehicleCountLabel = new JLabel();
        vehicleMainLabel = new JLabel();
        vehicleMonthList = new JComboBox<>();
        vehicleYearList = new JComboBox<>();
        addVehicleBtn = new JButton();
        vehicleScrollPane = new JScrollPane();
        vehicleCenterTable = new JTable();
        bankPanel = new JPanel();
        bankBalancePane = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_bg.png").getImage(), 0, 0,180,100, null);
            }
        };
        bankBalanceLabel = new JLabel();
        bankMainLabel = new JLabel();
        bankMonthList = new JComboBox<>();
        bankYearList = new JComboBox<>();
        addTnxBtn = new JButton();
        bankScrollPane = new JScrollPane();
        tnxTable = new JTable();
        noticePanel = new JPanel();
        noticeCountPane = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_bg.png").getImage(), 0, 0,180,100, null);
            }
        };
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

        Users userDB = new Users();
        Events taskDB = new Events();
        Inventory inventoryDB = new Inventory();
        Vehicle vehicleDB = new Vehicle();
        Transaction tnxDB = new Transaction();
        Notice noticeDB = new Notice();

        ArrayList<Document> userFromDB = userDB.getAll();
        ArrayList<Document> taskFromDB = taskDB.getAll();
        ArrayList<Document> inventoryFromDB = inventoryDB.getAll();
        ArrayList<Document> vehicleFromDB = vehicleDB.getAll();
        ArrayList<Document> tnxFromDB = tnxDB.getAll();
        ArrayList<Document> noticeFromDB = noticeDB.getAll();

        int userCountFromDB = userFromDB.size();
        int taskCountFromDB = taskFromDB.size();
        int inventoryCountFromDB = inventoryFromDB.size();
        int vehicleCountFromDB = vehicleFromDB.size();
        int tnxCountFromDB = tnxFromDB.size();
        int noticeCountFromDB = noticeFromDB.size();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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
        dashboardBtn.setBorder(null);
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
        userBtn.setBorder(null);
        userBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerCardLayout.show(centerCardPanel, "userPanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, userBtn);
            }
        });
        userBtn.setBounds(20, 170, 200, 45);

//      Task Button
        taskBtn.setBackground(new Color(46, 204, 113));
        taskBtn.setForeground(new Color(236, 240, 241));
        taskBtn.setBorder(null);
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
        inventoryBtn.setBorder(null);
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
        vehicleBtn.setBorder(null);
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
        bankBtn.setBorder(null);
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
        noticeBtn.setBorder(null);
        noticeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerCardLayout.show(centerCardPanel, "noticePanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, noticeBtn);
                noticeTableModel.fireTableDataChanged();
            }
        });
        noticeBtn.setBounds(20, 420, 200, 45);

//      Settings Button
        settingsBtn.setBackground(new Color(46, 204, 113));
        settingsBtn.setForeground(new Color(236, 240, 241));
        settingsBtn.setBorder(null);
        settingsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                settingsBtnActionPerformed(e);
                ButtonHighlighter.highlight(leftSidebarBtnList, settingsBtn);
                dispose();
                new Signin();
            }
        });
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

//      Left Side Panel Button Sequencing
        final String imgRoot = "src/main/java/edu/aiub/static/leftSidebarBtn/";

        final ArrayList<String> imgList = new ArrayList<>();
        imgList.add(imgRoot + "dashboardBtn.png");
        imgList.add(imgRoot + "userBtn.png");
        imgList.add(imgRoot + "taskBtn.png");
        imgList.add(imgRoot + "inventoryBtn.png");
        imgList.add(imgRoot + "vehicleBtn.png");
        imgList.add(imgRoot + "bankBtn.png");
        imgList.add(imgRoot + "noticeBtn.png");
        imgList.add(imgRoot + "settingsBtn.png");

        final ArrayList<Pair<JButton, String>> imgHoverList = new ArrayList<>();
        imgHoverList.add(new Pair<>(dashboardBtn, imgRoot + "dashboardBtn_hover" + ".png"));
        imgHoverList.add(new Pair<>(userBtn, imgRoot + "userBtn_hover" + ".png"));
        imgHoverList.add(new Pair<>(taskBtn, imgRoot + "taskBtn_hover" + ".png"));
        imgHoverList.add(new Pair<>(inventoryBtn, imgRoot + "inventoryBtn_hover" + ".png"));
        imgHoverList.add(new Pair<>(vehicleBtn, imgRoot + "vehicleBtn_hover" + ".png"));
        imgHoverList.add(new Pair<>(bankBtn, imgRoot + "bankBtn_hover" + ".png"));
        imgHoverList.add(new Pair<>(noticeBtn, imgRoot + "noticeBtn_hover" + ".png"));
        imgHoverList.add(new Pair<>(settingsBtn, imgRoot + "settingsBtn_hover" + ".png"));

        dashboardBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/dashboardBtn.png"));

        userBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/userBtn.png"));

        taskBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/taskBtn.png"));

        inventoryBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/inventoryBtn.png"));

        vehicleBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/vehicleBtn.png"));

        bankBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/bankBtn.png"));

        noticeBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/noticeBtn.png"));

        settingsBtn.setIcon(new ImageIcon("src/main/java/edu/aiub/static/leftSidebarBtn/settingsBtn.png"));

        imgHoverList.get(centerCardIndex).getFirst().setIcon(new ImageIcon(imgHoverList.get(centerCardIndex).getSecond()));

        leftSidePanel.add(dashboardBtn);

        leftSidePanel.add(userBtn);

        leftSidePanel.add(taskBtn);

        leftSidePanel.add(inventoryBtn);

        leftSidePanel.add(vehicleBtn);

        leftSidePanel.add(bankBtn);

        leftSidePanel.add(noticeBtn);

        leftSidePanel.add(settingsBtn);
//      Left Side Panel Button Sequencing End

        leftSidePanel.add(contactBtn);
        contactBtn.setBounds(51, 640, 138, 34);

        getContentPane().add(leftSidePanel);
        leftSidePanel.setBounds(0, 0, 240, 750);


        centerCardPanel.setLayout(new CardLayout());
        centerCardLayout = (CardLayout) centerCardPanel.getLayout();
        // Dashboard Panel ----------------------------------------------
        dashboardPanel.setBackground(new Color(236, 240, 241));
        dashboardPanel.setLayout(null);

        SimpleDateFormat dashboardDateFormat = new SimpleDateFormat("EEE, dd MMMM yyyy");

        dashboardDate.setFont(new Font("Inter", 0, 12));
        dashboardDate.setText(dashboardDateFormat.format(new Date()));
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

        currentTaskCount.setText(EssentialMethods.countPrinter(taskCountFromDB));

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
        currentBalance.setText(String.valueOf(EssentialMethods.totalBalance()));
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
        vehicleCount.setText(EssentialMethods.countPrinter(vehicleCountFromDB));
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
        userCount.setText(EssentialMethods.countPrinter(userCountFromDB));
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

        taskTableModel = new DefaultTableModel();

        taskTableModel.setColumnIdentifiers(new String[]{
                "ID",
                "Event",
                "Event Description",
                "Event Location",
                "Start",
                "End"
        });
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


        transactionTableModel = new DefaultTableModel();
        transactionTableModel.setColumnIdentifiers(new String[]{
                "ID",
                "Sender",
                "Method",
                "Fund",
                "Amount",
                "Date"
        });

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


        vehicleTableModel = new DefaultTableModel();
        vehicleTableModel.setColumnIdentifiers(new String[]{"ID", "Vehicle", "Driver", "Status"});

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

        volunteerTableModel = new DefaultTableModel();
        volunteerTableModel.setColumnIdentifiers(new String[]{
                "ID",
                "Volunteer",
                "Task",
                "Status"
        });

        for (int i = 0; i<30; i++) {
            volunteerTableModel.addRow(new String[]{""+i+1, "Volunteer "+i+1, "Task 1", "Available"});
        }

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
        setUserName(userName);


//        dashboardPanel.add(dashboardGreeting);
        dashboardGreeting.setBounds(40, 60, 400, 23);

        dashboardPanel.add(centerMainPanel);
        centerMainPanel.setBounds(10, 100, 680, 750);

        add(dashboardPanel);
        dashboardPanel.setBounds(240, 0, 700, 750);


        // End of Dashboard Panel ------------------------------------------------

        // Start of User Panel ---------------------------------------------------
//        userPanel.setBackground(new Color(255, 255, 255));
        userPanel.setAutoscrolls(true);
        userPanel.setLayout(null);

        userTableModel = new DefaultTableModel();
        userTableModel.setColumnIdentifiers(new String[]{
                "ID",
                "Name",
                "Email",
                "Password",
                "Phone",
                "Role"
        });

        for (int i = 0; i<userCountFromDB; i++) {
            userTableModel.addRow(new String[]{
                    userFromDB.get(i).getInteger("id").toString(),
                    userFromDB.get(i).getString("name"),
                    userFromDB.get(i).getString("email"),
                    userFromDB.get(i).getString("password"),
                    userFromDB.get(i).getString("phone"),
                    userFromDB.get(i).getString("role")
            });
        }
        userTable.setModel(userTableModel);
        userScrollPane.setViewportView(userTable);

        new TableEdit(userTable, userDB);

        userPanel.add(userScrollPane);
        userScrollPane.setBounds(10, 160, 680, 575);

        userCountPanel.setLayout(new GridLayout(2,1));
        userCountPanel.setBorder(new EmptyBorder(10,10,10,10));

        userCountLabel.setIcon(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_label.png"));
        userCountLabel.setText("Total Users");
        userCountPanel.add(userCountLabel);

        userCountMainLabel.setText(EssentialMethods.countPrinter(userCountFromDB));
        userCountMainLabel.setFont(new Font("Inter", Font.BOLD, 40));
        userCountPanel.add(userCountMainLabel);
//        userCountPanel.setBackground(new Color(255, 255, 255));
//        userCountMainLabel.setBounds(10, 30, 100, 40);

        userPanel.add(userCountPanel);
        userCountPanel.setBounds(10, 20, 180, 100);

        addUserBtn.setText("Add User");
        addUserBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addUserBtnActionPerformed(evt);
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


        // End of User Panel -----------------------------------------------------

        // Start of Task Panel ---------------------------------------------------
//        taskPanel.setBackground(new Color(255, 255, 255));
        taskPanel.setAutoscrolls(true);
        taskPanel.setLayout(null);

        taskMainTableModel = new DefaultTableModel();
        taskMainTableModel.setColumnIdentifiers(new String[]{
                "ID",
                "Event",
                "Event Description",
                "Location",
                "Start",
                "Deadline"
        });
        for (int i=0; i<taskCountFromDB; i++) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String start = formatter.format(taskFromDB.get(i).get("start"));
            String end = formatter.format(taskFromDB.get(i).get("end"));
            taskMainTableModel.addRow(new Object[]{
                    taskFromDB.get(i).getInteger("id").toString(),
                    taskFromDB.get(i).getString("event"),
                    taskFromDB.get(i).getString("description"),
                    taskFromDB.get(i).getString("location"),
                    start,
                    end
            });
        }
        taskMainTable.setModel(taskMainTableModel);
        taskScrollPane.setViewportView(taskMainTable);
        new TableEdit(taskMainTable, taskDB);

        taskPanel.add(taskScrollPane);
        taskScrollPane.setBounds(10, 160, 680, 530);

        taskCountPanel.setLayout(new GridLayout(2,1));
        taskCountPanel.setBorder(new EmptyBorder(10,10,10,10));

        taskCountLabel.setText("Total Users");
        taskCountLabel.setIcon(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_label.png"));
        taskCountPanel.add(taskCountLabel);

        taskCountMainLabel.setFont(new Font("Inter", Font.BOLD, 40));
        taskCountMainLabel.setText(EssentialMethods.countPrinter(taskCountFromDB));
        taskCountPanel.add(taskCountMainLabel);

        taskPanel.add(taskCountPanel);
        taskCountPanel.setBounds(10, 20, 180, 100);

        addTaskBtn.setText("Add Task");
        addTaskBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addTaskBtnActionPerformed(evt);
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

        // End of Task Panel -----------------------------------------------------

        // Start of Inventory Panel ----------------------------------------------
//        inventoryPanel.setBackground(new Color(255, 255, 255));
        inventoryPanel.setLayout(null);

        inventoryCountPane.setLayout(new GridLayout(2,1));
        inventoryCountPane.setBorder(new EmptyBorder(10,10,10,10));

        inventoryCountLabel.setText("Total Commodity");
        inventoryCountLabel.setIcon(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_label.png"));
        inventoryCountPane.add(inventoryCountLabel);

        inventoryMainLabel.setFont(new Font("Inter", Font.BOLD, 40));
        inventoryMainLabel.setText(EssentialMethods.countPrinter(inventoryCountFromDB));
        inventoryCountPane.add(inventoryMainLabel);

        inventoryPanel.add(inventoryCountPane);
        inventoryCountPane.setBounds(10, 20, 180, 100);

        inventoryMonthList.setModel(new DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        inventoryPanel.add(inventoryMonthList);
        inventoryMonthList.setBounds(240, 120, 110, 30);

        inventoryYearList.setModel(new DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023" }));
        inventoryPanel.add(inventoryYearList);
        inventoryYearList.setBounds(350, 120, 110, 30);

        addInventoryBtn.setText("Add Commodity");
        addInventoryBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addInventoryBtnActionPerformed(evt);
            }
        });
        inventoryPanel.add(addInventoryBtn);
        addInventoryBtn.setBounds(500, 60, 180, 40);

        inventoryTableModel = new DefaultTableModel();
        inventoryTableModel.setColumnIdentifiers(new Object[] {
                "ID",
                "Commodity",
                "Type",
                "Quantity",
                "Price"
        });

        for (int i=0; i<inventoryCountFromDB; i++) {
            inventoryTableModel.addRow(new String[] {
                    inventoryFromDB.get(i).getInteger("id").toString(),
                    inventoryFromDB.get(i).getString("commodity"),
                    inventoryFromDB.get(i).getString("type"),
                    inventoryFromDB.get(i).get("quantity").toString(),
                    inventoryFromDB.get(i).get("price").toString()
            });
        }
        inventoryTable.setModel(inventoryTableModel);
        inventoryScrollPane.setViewportView(inventoryTable);

        new TableEdit(inventoryTable, inventoryDB);

        inventoryPanel.add(inventoryScrollPane);
        inventoryScrollPane.setBounds(10, 160, 680, 530);

        // End of Inventory Panel ------------------------------------------------

        // Start of Vehicle Panel
//        vehiclePanel.setBackground(new Color(255, 255, 255));
        vehiclePanel.setLayout(null);

        vehicleCountPane.setLayout(new GridLayout(2,1));
        vehicleCountPane.setBorder(new EmptyBorder(10,10,10,10));

        vehicleCountLabel.setText("Total Vehicle");
        vehicleCountLabel.setIcon(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_label.png"));
        vehicleCountPane.add(vehicleCountLabel);

        vehicleMainLabel.setFont(new Font("Inter", Font.BOLD, 40));
        vehicleMainLabel.setText(EssentialMethods.countPrinter(vehicleCountFromDB));
        vehicleCountPane.add(vehicleMainLabel);

        vehiclePanel.add(vehicleCountPane);
        vehicleCountPane.setBounds(10, 20, 180, 100);

        vehicleMonthList.setModel(new DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        vehiclePanel.add(vehicleMonthList);
        vehicleMonthList.setBounds(240, 120, 110, 30);

        vehicleYearList.setModel(new DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023" }));
        vehiclePanel.add(vehicleYearList);
        vehicleYearList.setBounds(350, 120, 110, 30);

        addVehicleBtn.setText("Add Vehicle");
        addVehicleBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addVehicleBtnActionPerformed(evt);
            }
        });
        vehiclePanel.add(addVehicleBtn);
        addVehicleBtn.setBounds(500, 60, 180, 40);

        vehicleMainTableModel = new DefaultTableModel();
        vehicleMainTableModel.setColumnIdentifiers(new Object[]{
                "ID",
                "Name",
                "Model",
                "Status",
        });

        for (int i=0; i<vehicleCountFromDB; i++) {
            vehicleMainTableModel.addRow(new String[] {
                    vehicleFromDB.get(i).getInteger("id").toString(),
                    vehicleFromDB.get(i).getString("name"),
                    vehicleFromDB.get(i).getString("model"),
                    vehicleFromDB.get(i).getString("status"),
            });
        }
        vehicleCenterTable.setModel(vehicleMainTableModel);

        new TableEdit(vehicleCenterTable, vehicleDB);

        vehicleScrollPane.setViewportView(vehicleCenterTable);
        if (vehicleCenterTable.getColumnModel().getColumnCount() > 0) {
            vehicleCenterTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            vehicleCenterTable.getColumnModel().getColumn(2).setMinWidth(50);
            vehicleCenterTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        vehiclePanel.add(vehicleScrollPane);
        vehicleScrollPane.setBounds(10, 160, 680, 530);

        // End of Vehicle Panel ------------------------------------------------

        // Start of Transaction Panel
//        bankPanel.setBackground(new Color(255, 255, 255));
        bankPanel.setLayout(null);

        bankBalancePane.setLayout(new GridLayout(2,1));
        bankBalancePane.setBorder(new EmptyBorder(10,10,10,10));

        bankBalanceLabel.setText("Total Transactions");
        bankBalanceLabel.setIcon(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_label.png"));
        bankBalancePane.add(bankBalanceLabel);

        bankMainLabel.setFont(new Font("Inter", Font.BOLD, 40));
        bankMainLabel.setText(EssentialMethods.countPrinter(tnxCountFromDB));
        bankBalancePane.add(bankMainLabel);

        bankPanel.add(bankBalancePane);
        bankBalancePane.setBounds(10, 20, 180, 100);

        bankMonthList.setModel(new DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        bankPanel.add(bankMonthList);
        bankMonthList.setBounds(240, 120, 110, 30);

        bankYearList.setModel(new DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023" }));
        bankPanel.add(bankYearList);
        bankYearList.setBounds(350, 120, 110, 30);

        addTnxBtn.setText("Add Transaction");
        addTnxBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addTnxBtnActionPerformed(evt);
            }
        });
        bankPanel.add(addTnxBtn);
        addTnxBtn.setBounds(500, 60, 180, 40);


//      Transactions Table
        tnxTableModel = new DefaultTableModel();
        tnxTableModel.setColumnIdentifiers(new Object[]{
                "ID",
                "Sender",
                "Method",
                "Fund",
                "Amount",
                "Date",
        });

        for (int i=0; i<tnxCountFromDB; i++) {
            tnxTableModel.addRow(new String[] {
                    tnxFromDB.get(i).getInteger("id").toString(),
                    tnxFromDB.get(i).getString("sender"),
                    tnxFromDB.get(i).getString("method"),
                    tnxFromDB.get(i).getString("fund"),
                    tnxFromDB.get(i).getString("amount"),
                    sdf.format(tnxFromDB.get(i).getDate("date")),
            });
        }

        tnxTable.setModel(tnxTableModel);
        bankScrollPane.setViewportView(tnxTable);

        new TableEdit(tnxTable, tnxDB);

        bankPanel.add(bankScrollPane);
        bankScrollPane.setBounds(10, 160, 680, 530);

        // End of Transaction Panel

        // Start of Notice Panel
//        noticePanel.setBackground(new Color(255, 255, 255));
        noticePanel.setLayout(null);

        noticeCountPane.setLayout(new GridLayout(2,1));
        noticeCountPane.setBorder(new EmptyBorder(10,10,10,10));

        noticeCountLabel.setText("Total Notice");
        noticeCountLabel.setIcon(new ImageIcon("src/main/java/edu/aiub/static/currentInfo_label.png"));
        noticeCountPane.add(noticeCountLabel);

        noticeMainLabel.setFont(new Font("Inter", Font.BOLD, 40));
        noticeMainLabel.setText(EssentialMethods.countPrinter(noticeCountFromDB));
        noticeCountPane.add(noticeMainLabel);

        noticePanel.add(noticeCountPane);
        noticeCountPane.setBounds(10, 20, 180, 100);

        noticeMonthList.setModel(new DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        noticePanel.add(noticeMonthList);
        noticeMonthList.setBounds(240, 120, 110, 30);

        noticeYearList.setModel(new DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023" }));
        noticePanel.add(noticeYearList);
        noticeYearList.setBounds(350, 120, 110, 30);

        addNoticeBtn.setText("Add Notice");
        addNoticeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addNoticeBtnActionPerformed(evt);
            }
        });
        noticePanel.add(addNoticeBtn);
        addNoticeBtn.setBounds(500, 60, 180, 40);

//      Notice Table
        noticeTableModel = new DefaultTableModel();
        noticeTableModel.setColumnIdentifiers(new Object[]{
                "ID",
                "Notice",
                "Description",
                "Date",
                "Time"
        });

        for (int i=0; i<noticeCountFromDB; i++) {
            String date = noticeFromDB.get(i).get("date").toString();
            String time = noticeFromDB.get(i).get("date").toString();
            noticeTableModel.addRow(new Object[] {
                noticeFromDB.get(i).getInteger("id").toString(),
                noticeFromDB.get(i).getString("notice"),
                noticeFromDB.get(i).getString("description"),
                date,
                time,
            });
        }

        noticeTable.setModel(noticeTableModel);
        noticeScrollPane.setViewportView(noticeTable);

        new TableEdit(noticeTable, noticeDB);

        noticePanel.add(noticeScrollPane);
        noticeScrollPane.setBounds(10, 160, 680, 530);

        // End of Notice Panel


//      Card Layout Sequencing
        Pair<JPanel, String> dashboard = new Pair<>(dashboardPanel, "dashboardPanel");
        Pair<JPanel, String> user = new Pair<>(userPanel, "userPanel");
        Pair<JPanel, String> task = new Pair<>(taskPanel, "taskPanel");
        Pair<JPanel, String> inventory = new Pair<>(inventoryPanel, "inventoryPanel");
        Pair<JPanel, String> vehicle = new Pair<>(vehiclePanel, "vehiclePanel");
        Pair<JPanel, String> bank = new Pair<>(bankPanel, "bankPanel");
        Pair<JPanel, String> notice = new Pair<>(noticePanel, "noticePanel");

        ArrayList<Pair<JPanel, String>> cardPanels = new ArrayList<>();
        cardPanels.add(dashboard);
        cardPanels.add(user);
        cardPanels.add(task);
        cardPanels.add(inventory);
        cardPanels.add(vehicle);
        cardPanels.add(bank);
        cardPanels.add(notice);

        System.out.println(centerCardIndex);
        centerCardPanel.add(cardPanels.get(centerCardIndex).getFirst(), cardPanels.get(centerCardIndex).getSecond());
        for (int i=0; i<cardPanels.size(); i++) {
            if (i != centerCardIndex) {
                centerCardPanel.add(cardPanels.get(i).getFirst(), cardPanels.get(i).getSecond());
            }
        }
//      Card Layout Sequencing End

        centerCardPanel.setBounds(240, 0, 700, 750); // CardLayout for center panel
//        centerCardPanel.setBackground(new Color(236, 240, 241));
        add(centerCardPanel); // CardLayout for center panel


// Right Side Bar
// Right Side Bar
        JComponent[] noticeComponents = {noticeHeaderPanel, noticeBodyPanel, noticePanel, noticePane, noticeLabel};
        JComponent[] taskComponents = {taskHeaderPanel, taskBodyPanel, taskPane, recentTaskLabel};
        rightSidePanel = new RightSideBar(noticeComponents, taskComponents, noticeFromDB, noticeCountFromDB, taskFromDB, taskCountFromDB);

        add(rightSidePanel);
        rightSidePanel.setBounds(940, 0, 260, 740);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addUserBtnActionPerformed(ActionEvent evt) {
        UserAddForm userAddForm = new UserAddForm();
        userAddForm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                dispose();
                new AdminDashboard(1);
            }
        });
    }
    private void addTaskBtnActionPerformed(ActionEvent evt) {
        TaskAddForm taskAddForm = new TaskAddForm();
        taskAddForm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                dispose();
                new AdminDashboard(2);
            }
        });
    }

    private void addInventoryBtnActionPerformed(ActionEvent evt) {
        InventoryAddForm inventoryAddForm = new InventoryAddForm();
        inventoryAddForm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                dispose();
                new AdminDashboard(3);
            }
        });
    }

    private void addVehicleBtnActionPerformed(ActionEvent evt) {
        VehicleAddForm vehicleAddForm = new VehicleAddForm();
        vehicleAddForm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                dispose();
                new AdminDashboard(4);
            }
        });
    }

    private void addTnxBtnActionPerformed(ActionEvent evt) {
        TransactionAddForm transactionAddForm = new TransactionAddForm();
        transactionAddForm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                dispose();
                new AdminDashboard(5);
            }
        });
    }

    private void addNoticeBtnActionPerformed(ActionEvent evt) {
        NoticeAddForm noticeAddForm = new NoticeAddForm();
        noticeAddForm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                dispose();
                new AdminDashboard(6);
            }
        });
    }

    public void setUserName(String uName) {
        userName = uName;
        dashboardGreeting.setText("Welcome back, " + userName + "!");
        this.dashboardPanel.add(this.dashboardGreeting);
    }

    public static void updateNoticeTable(int noticeCountFromDB, ArrayList<Document> noticeFromDB) {
        String date = noticeFromDB.get(noticeCountFromDB-1).get("date").toString();
        String time = noticeFromDB.get(noticeCountFromDB-1).get("time").toString();
        noticeTableModel.addRow(new String[] {
                ""+(noticeCountFromDB),
                noticeFromDB.get(noticeCountFromDB-1).getString("notice"),
                noticeFromDB.get(noticeCountFromDB-1).getString("description"),
                date,
                time,
                null
        });
        noticeTableModel.fireTableDataChanged();
    }

    public static void deleteNoticeTable(int noticeCountFromDB, ArrayList<Document> noticeFromDB) {
        noticeTableModel.removeRow(noticeCountFromDB-1);
        noticeTableModel.fireTableDataChanged();
    }

}
