package edu.aiub.UI.admin;

import edu.aiub.Static;
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

    private static String userName = "User";
    private static JButton[] leftSidebarBtnList;
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
//      Table Models
        noticeTableModel = new DefaultTableModel();
        noticeTableModel.setColumnIdentifiers(new Object[]{
                "ID",
                "Notice",
                "Description",
                "Date",
                "Time"
        });
        taskTableModel = new DefaultTableModel();
        taskTableModel.setColumnIdentifiers(new String[]{
                "ID",
                "Event",
                "Event Description",
                "Event Location",
                "Start",
                "End"
        });
        transactionTableModel = new DefaultTableModel();
        transactionTableModel.setColumnIdentifiers(new String[]{
                "ID",
                "Sender",
                "Method",
                "Fund",
                "Amount",
                "Date"
        });
        vehicleTableModel = new DefaultTableModel();
        vehicleTableModel.setColumnIdentifiers(new String[]{
                "ID",
                "Vehicle",
                "Driver",
                "Status"
        });
        volunteerTableModel = new DefaultTableModel();
        volunteerTableModel.setColumnIdentifiers(new String[]{
                "ID",
                "Volunteer",
                "Task",
                "Status"
        });
        //      Table Models End


        contactBtn = new JButton();
        userPanel = new JPanel();
        userScrollPane = new JScrollPane();
        userTable = new JTable();
        userCountPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_bg.png").getImage(), 0, 0,180,100, null);
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
                g.drawImage(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_bg.png").getImage(), 0, 0,180,100, null);
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
                g.drawImage(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_bg.png").getImage(), 0, 0,180,100, null);
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
                g.drawImage(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_bg.png").getImage(), 0, 0,180,100, null);
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
                g.drawImage(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_bg.png").getImage(), 0, 0,180,100, null);
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
                g.drawImage(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_bg.png").getImage(), 0, 0,180,100, null);
            }
        };
        noticeCountLabel = new JLabel();
        noticeMainLabel = new JLabel();
        noticeMonthList = new JComboBox<>();
        noticeYearList = new JComboBox<>();
        addNoticeBtn = new JButton();
        noticeScrollPane = new JScrollPane();
        noticeTable = new JTable();
        leftSidePanel = new JPanel();
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
                g.drawImage(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        balanceInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        vehicleInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        userInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
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

        
        //======== Database ========
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
        
        //======== Database ========

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
        setIconImage(new ImageIcon(Static.ADMIN_ROOT+"titleIcon.png").getImage());

        centerCardPanel.setLayout(new CardLayout());
        centerCardLayout = (CardLayout) centerCardPanel.getLayout();

//      Left Side Panel
        LeftSidebarPanel leftSidePanel = new LeftSidebarPanel(centerCardPanel, centerCardLayout, leftSidebarBtnList, centerCardIndex, noticeTableModel);
//
        getContentPane().add(leftSidePanel);
        leftSidePanel.setBounds(0, 0, 240, 750);


        // Dashboard Panel ----------------------------------------------
        dashboardPanel = new CenterDashboardPanel(
                centerMainPanel,
                taskInfoPanel,
                balanceInfoPanel,
                vehicleInfoPanel,
                userInfoPanel,
                currentInfo,
                runningTaskTab,
                transactionTab,
                vehicleTab,
                volunteerTab,

                RecentUpdates,

                runningTask,
                transactionPane,
                vehiclePane,
                volunteerPane,

                dashboardDate,
                taskLabel,
                currentTaskCount,
                balanceLabel,
                currentBalance,
                vehicleLabel,
                vehicleCount,
                userLabel,
                userCount,
                dashboardGreeting,

                taskTable,
                transactionTable,
                vehicleTable,
                volunteerTable,

                taskTableModel,
                transactionTableModel,
                vehicleTableModel,
                volunteerTableModel,

                sdf,

                taskFromDB,
                tnxFromDB,
                vehicleFromDB,

                vehicleCountFromDB,
                userCountFromDB,
                taskCountFromDB,
                tnxCountFromDB
        );
        add(dashboardPanel);
        setUserName(userName);

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

        userCountLabel.setIcon(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_label.png"));
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
        taskCountLabel.setIcon(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_label.png"));
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
        inventoryCountLabel.setIcon(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_label.png"));
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
        vehicleCountLabel.setIcon(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_label.png"));
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
        bankBalanceLabel.setIcon(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_label.png"));
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
        noticeCountLabel.setIcon(new ImageIcon(Static.ADMIN_ROOT+"currentInfo_label.png"));
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


//      Right Side Bar
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
        dashboardGreeting.setText("Welcome back, " + uName + "!");
        this.dashboardPanel.add(this.dashboardGreeting);
    }
}
