package edu.aiub.UI.volunteer;

import edu.aiub.Static;
import edu.aiub.UI.admin.AdminRightSidebarScrollPane;
import edu.aiub.UI.authentication.Signin;
import edu.aiub.UI.donation.Guest;
import edu.aiub.UI.volunteer.essentials.EventApplyForm;
import edu.aiub.UI.volunteer.essentials.RecentProjectInfo;
import edu.aiub.database.DatabaseConnectivity;
import edu.aiub.database.Events;
import edu.aiub.database.Notice;
import edu.aiub.database.Transaction;
import edu.aiub.essentials.ContactDialog;
import edu.aiub.essentials.VolunteerButtonHighlighter;
import org.bson.Document;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



public class VolunteerDashboard extends JFrame {
	private JButton[] leftSidebarBtnList;

    private String root = Static.VOLUNTEER_ROOT;
	
	private CardLayout mainCardLayout;
	private CardLayout centerCardLayout;
	private CardLayout projectCardLayout;
    private JButton contactBtn;
    private JPanel mainCardPanel;
    private JPanel centerCardPanel;
    private JButton transactionBtn;
    private JPanel dashboardPanel;
    private JPanel middleInfo;
    private JPanel exploreProjectsInfo;
    private JButton dashboardBtn;
    private JLabel dateLabel;
	//private SimpleDateFormat dashboardDateFormat;
	private JButton profileBtn;
    private JButton inventoryBtn;
    private JPanel leftSidePanel;
	private JPanel eventPanel;
	private JTable completePrTable;
	private JTable runningPrTable;
	private DefaultTableModel completePrModel;
	private DefaultTableModel runningPrModel;
	private JScrollPane completePrScroll;
	private JScrollPane runningPrScroll;
	private JPanel projectTablePanel;
	private JTabbedPane eventTabbedPane;
    private JPanel projectRunningPanel;
    private JPanel projectCompletePanel;
	private JButton completePrBtn;
	private JButton runningPrBtn;
	private JButton eventAdsBtn;
	private JPanel logOutPanel;
	private JLabel logOutLabel;
	private JPanel noticePanel;
	private JPanel transactionPanel;
	private JLabel transanctionTALabel;
	private JLabel transanctionTATitle;
	private JLabel transanctionTAAmount;
	private JLabel transanctionTAHLine;
	private JLabel transanctionMALabel;
	private JLabel transanctionMATitle;
	private JLabel transanctionMAAmount;
	private JLabel transanctionMACalander;
	private JLabel transanctionTableLabel;
	private JTable transanctionTable;
	private JTableHeader transanctionHeader;
	private DefaultTableModel transanctionModel;
	private JScrollPane transanctionScroll;
	private JButton transanctionDelete;
	private JLabel noticeTitleLabel;
	private JTable noticeTable;
	private JTableHeader noticeHeader;
	private DefaultTableModel noticeModel;
	private JScrollPane noticeScroll;
	private JButton noticeDelete;
	private JButton noticeView;
	private JLabel noticeLabel;
	private JPanel noticeDialogPanel;
	private JLabel noticeSubject;
	private JLabel noticeDetailsLabel;
	private DefaultTableCellRenderer centerRenderer;
    private JButton noticeBtn;
    private JPanel rightSideMainPanel;
    private JPanel rightSidePanel;
    private JButton logOutBtn;
    private JButton eventBtn;
    private JButton donationBtn;
    private JLabel nextProjectLabelTittle;
    private JLabel nextProjectLabelHeadline;
    private JLabel nextProjectLabelDetails;
    private JLabel exploreProjectsTittle;
    private JLabel projectName1;
    private JLabel projectName2;
    private JLabel projectName3;
    private JLabel projectName4;
    private JLabel projectName5;
    private JLabel projectName6;
    private JLabel projectName7;
    private JLabel projectDetails1;
    private JLabel projectDetails2;
    private JLabel projectDetails3;
    private JLabel projectDetails4;
    private JLabel projectDetails5;
    private JLabel projectDetails6;
    private JLabel projectDetails7;
	private JLabel donationTittle;
	private JLabel donateAmount;
	private JLabel taskTittle;
	private JLabel task;
	private JLabel recentTittle;
	private JLabel rProjectName;
	private JLabel rProjectLeader;
	private JLabel rProjectLocation;
	private JLabel rProjectDonation;
	private JLabel rProjectWorkingDay;
	private JLabel rProjectPerformance;
	private JPanel nextProjectInfoPanel;
	private JPanel donationInfoPanel;
	private JPanel taskInfoPanel;
	private JPanel recentProjectInfoPanel;
	private JPanel exploreProjectsPanel;
	private JButton applyBtn;
	private JButton seeMoreBtn;
	private JPanel seeMoreDialogPanel;
	private JDialog seeMoreDialog;
	private JButton donateBtn;
	private JButton logoutBtn;
	private JLabel profileTag;
	private JLabel myProjectsLabel;
	private JLabel completeProjectsLabel;
	private JLabel completeProjectsIconLabel;
	private JLabel runningProjectsLabel;
	private JLabel runningProjectsIconLabel;
	private JPanel projectsUpdateInfoPanel;
	private JLabel completeProjectAmount;
	private JLabel runningProjectAmount;
	private JDialog noticeDialog;
	
	
	private JDialog prApplyDialog;
	private JPanel prApplyDialogPanel;
	private JLabel prApplyDialogLabel;
	private JLabel prAdLabel;
	private JLabel prTitleLabel;
	private JLabel prDetailsLabel;
	private JLabel prConditionTitleLabel;
	private JLabel prCondition1Label;
	private JLabel prCondition2Label;
	private JLabel prCondition3Label;
	private JLabel prCondition4Label;
	private JLabel prInformationTitleLabel;
	private JLabel nameLable;
	private JTextField name;
	private JLabel emailLable;
	private JTextField email;
	private JLabel addressLable;
	private JTextField address;
	private JLabel workPlaceLable;
	private JTextField workplace;
	private JLabel phoneLable;
	private JTextField phone;
	private JButton prapplyBtn;
	private JScrollPane applyScroll;
	
	
	private JDialog prApplyDialogE;
	private JPanel prApplyDialogPanelE;
	private JLabel prApplyDialogLabelE;
	private JLabel prAdLabelE;
	private JLabel prTitleLabelE;
	private JLabel prDetailsLabelE;
	private JLabel prConditionTitleLabelE;
	private JLabel prCondition1LabelE;
	private JLabel prCondition2LabelE;
	private JLabel prCondition3LabelE;
	private JLabel prCondition4LabelE;
	private JLabel prInformationTitleLabelE;
	private JLabel nameLableE;
	private JTextField nameE;
	private JLabel emailLableE;
	private JTextField emailE;
	private JLabel addressLableE;
	private JTextField addressE;
	private JLabel workPlaceLableE;
	private JTextField workplaceE;
	private JLabel phoneLableE;
	private JTextField phoneE;
	private JButton prapplyBtnE;
	private JScrollPane applyScrollE;
	
	
	private JLabel eventAdsLabel;
	private JDialog eventApplyDialog;
	private JPanel eventApplyDialogPanel;
	private JLabel eventApplyDialogLabel;
	private JLabel eventApplyAdLabel;
	private JLabel eventDetailsTitleLabel;
	private JLabel eventDeadlineLabel;
	private JLabel eventDateLabel;
	private JLabel eventDayLabel;
	private JLabel eventLocationLabel;
	private JLabel eventInformationTitleLabel;
	private JLabel firstNameLable;
	private JTextField firstName;
	private JLabel lastNameLable;
	private JTextField lastName;
	private JLabel eventEmailLable;
	private JTextField eventEmail;
	private JLabel eventAddressLable;
	private JTextField eventAddress;
	private JLabel eventPhoneLable;
	private JTextField eventPhone;
	private JButton eventapplyBtn;
	private JScrollPane eventApplyScroll;


	
	private String[] noticeColumn = new String[]{"Subject", "Date"};
	private String[][] noticeRow;


	private String[] transanctionColumn = new String[]{"Date", "Project", "Amount"};
	private String[][] transanctionRow;
	
	
	private String[] completePrColumn = new String[]{"Available Project"};
	private String[][] completePrRow;
	
	
	private String[] runningPrColumn = new String[]{"Running Project"};
	private String[][] runningPrRow = new String[][]{
		
		{"     Winter Colthes Distribution"},
		{"     Post Cyclone Rehabilitation"},
		{"     Health Campaign"},
		{"     Dengue"},
		{"     Tree Forestation"},
		{"     Food Distribution"},
		{"     Health Campaign"}	
		
	};
	
	

    public VolunteerDashboard() {

//		Database Section
		//	Notice Table
//		DB
		Notice notice = new Notice();
		ArrayList<Document> noticeList = notice.getAll();
		int noticeListSize = noticeList.size();

//		DB end
		noticeRow = new String[noticeListSize][2];
		for(int i=0; i<noticeListSize; i++) {
			noticeRow[i][0] = noticeList.get(i).getString("notice");
			noticeRow[i][1] = noticeList.get(i).getString("date");
		}

		//		Transaction Table
		Transaction transaction = new Transaction();
		ArrayList<Document> transactionList = transaction.getAll();
		int transactionListSize = transactionList.size();

		DateFormat spf = new SimpleDateFormat("dd-MM-yyyy");


		transanctionRow = new String[transactionListSize][3];
		for (int i=0; i<transactionListSize; i++) {
			transanctionRow[i][0] = spf.format(transactionList.get(i).getDate("date"));
			transanctionRow[i][1] = transactionList.get(i).getString("fund");
			transanctionRow[i][2] = transactionList.get(i).getString("amount");
		}

		//		Project Table
		Events events = new Events();
		ArrayList<Document> projects = events.getAll();
		int projectCountDB = projects.size();

		completePrRow = new String[projectCountDB][1];
		for(int i=0; i<projectCountDB; i++) {
			completePrRow[i][0] = projects.get(i).getString("event");
		}

//		Database Section End
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new Font("Inter", 0, 10));
        setPreferredSize(new Dimension(1220, 790));
        setMinimumSize(new Dimension(1220, 790));
        setMinimumSize(new Dimension(1220, 790));
        setResizable(false);
        setLayout(null);
        setTitle("Nirmul Foundation");
        setBackground(Color.WHITE);
        setIconImage(new ImageIcon(root + "titleIcon.png").getImage());
		
		
		
		leftSidePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon(root + "leftSideBar.png").getImage(), 10, 20, getWidth()-20, getHeight()-40, null);
            }
        };
        dashboardBtn = new JButton();
        eventBtn = new JButton();
        donationBtn = new JButton();
        transactionBtn = new JButton();
        noticeBtn = new JButton();
        logOutBtn = new JButton();
		contactBtn = new JButton();
		
		
		//Left Side Bar
		leftSidebarBtnList = new JButton[]{dashboardBtn, eventBtn, transactionBtn, donationBtn, noticeBtn, logOutBtn};
		
		
		

		//Center Panel
        mainCardPanel = new JPanel();
		centerCardPanel = new JPanel();
        dashboardPanel = new JPanel();
        middleInfo = new JPanel();
        profileTag = new JLabel();
		
		
        

        leftSidePanel.setBackground(new Color(236, 240, 241));
        leftSidePanel.setMinimumSize(new Dimension(220, 790));
        leftSidePanel.setPreferredSize(new Dimension(220, 790));
        leftSidePanel.setLayout(null);

		//Dashboard Button
        dashboardBtn.setBackground(new Color(65, 136, 255));
        //dashboardBtn.setForeground(new Color(65, 136, 225));
        dashboardBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/dashboardBtn_hover.png"));
        dashboardBtn.setBorder(null);
        leftSidePanel.add(dashboardBtn);
        dashboardBtn.setBounds(20, 120, 200, 45);
        dashboardBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainCardLayout.show(mainCardPanel, "centerCardPanel");
				//mainCardLayout.show(mainCardPanel, "rightSidePanel");
                centerCardLayout.show(centerCardPanel, "dashboardPanel");
                //centerCardLayout.show(centerCardPanel, "rightSideMainPanel");
                VolunteerButtonHighlighter.highlight(leftSidebarBtnList, dashboardBtn);
            }
        });
		
		//Event Button
        eventBtn.setBackground(new Color(65, 136, 255));
        eventBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/eventBtn.png"));
        eventBtn.setBorder(null);
        leftSidePanel.add(eventBtn);
        eventBtn.setBounds(20, 170, 200, 45);
        eventBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainCardLayout.show(mainCardPanel, "eventPanel");
                VolunteerButtonHighlighter.highlight(leftSidebarBtnList, eventBtn);
            }
        });


		//Bank Button
        transactionBtn.setBackground(new Color(65, 136, 255));
        transactionBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/transactionBtn.png"));
        transactionBtn.setBorder(null);
        leftSidePanel.add(transactionBtn);
        transactionBtn.setBounds(20, 220, 200, 45);
        transactionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainCardLayout.show(mainCardPanel, "centerCardPanel");
				//mainCardLayout.show(mainCardPanel, "rightSidePanel");
				centerCardLayout.show(centerCardPanel, "transactionPanel");
				//centerCardLayout.show(centerCardPanel, "rightSideMainPanel");
                VolunteerButtonHighlighter.highlight(leftSidebarBtnList, transactionBtn);
            }
        });
		
		
//      Donation Button
        donationBtn.setBackground(new Color(65, 136, 255));
        donationBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/donationBtn.png"));
        donationBtn.setBorder(null);
        leftSidePanel.add(donationBtn);
        donationBtn.setBounds(20, 270, 200, 45);
        donationBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                VolunteerButtonHighlighter.highlight(leftSidebarBtnList, donationBtn);
				donationBtnActionPerformed(actionEvent);
            }
        });


//      Notice Button
        noticeBtn.setBackground(new Color(65, 136, 255));
        noticeBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/noticeBtn.png"));
        noticeBtn.setBorder(null);
        noticeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainCardLayout.show(mainCardPanel, "centerCardPanel");
				//mainCardLayout.show(mainCardPanel, "rightSidePanel");
				centerCardLayout.show(centerCardPanel, "noticePanel");
				//centerCardLayout.show(centerCardPanel, "rightSideMainPanel");
				VolunteerButtonHighlighter.highlight(leftSidebarBtnList, noticeBtn);
            }
        });
        leftSidePanel.add(noticeBtn);
        noticeBtn.setBounds(20, 320, 200, 45);
		
		

//      Log Out Button
        logOutBtn.setBackground(new Color(65, 136, 255));
        logOutBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/logOutBtn.png"));
        logOutBtn.setBorder(null);
        logOutBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainCardLayout.show(mainCardPanel, "logOutPanel");
//				VolunteerButtonHighlighter.highlight(leftSidebarBtnList, logOutBtn);
				dispose();
				new Signin();
            }
        });
        leftSidePanel.add(logOutBtn);
        logOutBtn.setBounds(20, 370, 200, 45);

//      Contact Button
        contactBtn.setBackground(new Color(103, 160, 255));
        contactBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/contactBtn.png"));
//        contactBtn.setBorder(null);
        contactBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (contactBtn.getIcon().toString().equals(root + "leftSidebarBtn/contactBtn.png")) {
                    contactBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/contactBtn_hover.png"));
                }
                ContactDialog contactDialog = new ContactDialog();
                contactDialog.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        super.windowClosed(e);
                        contactBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/contactBtn.png"));
                    }
                });

            }
        });
        leftSidePanel.add(contactBtn);
        contactBtn.setBounds(51, 640, 138, 34);

        add(leftSidePanel);
        leftSidePanel.setBounds(0, 0, 240, 750);
		
		
		centerCardPanel.setLayout(new CardLayout());
        centerCardLayout = (CardLayout) centerCardPanel.getLayout();
		
		mainCardPanel.setLayout(new CardLayout());
        mainCardLayout = (CardLayout) mainCardPanel.getLayout();
        
		
		// Dashboard Panel ----------------------------------------------
      
        dashboardPanel.setLayout(null);

        
		//Furure Project
        nextProjectInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "nextProject.png").getImage(), 0,0,543,188,null);
            }
        };
		nextProjectLabelTittle = new JLabel();
        nextProjectLabelHeadline = new JLabel();
        nextProjectLabelDetails = new JLabel();
		
        nextProjectInfoPanel.setLayout(null);
		nextProjectInfoPanel.setBounds(21, 0, 543, 188);
		
        //Next Project Info

		Document latestProject = projects.get(projectCountDB-1);
		String latestProjectName = latestProject.getString("event");
		String latestProjectDetails = latestProject.getString("description");
		
        nextProjectLabelTittle.setFont(new Font("Inter", Font.BOLD, 20));
        nextProjectLabelTittle.setText("Next Project");
		nextProjectLabelTittle.setBounds(20, 10, 200, 25);
		nextProjectLabelTittle.setForeground(new Color(255,255,255));
        nextProjectInfoPanel.add(nextProjectLabelTittle);
        
		
		nextProjectLabelHeadline.setFont(new Font("Inter", Font.BOLD, 16));
        nextProjectLabelHeadline.setText(latestProjectName);
		nextProjectLabelHeadline.setBounds(20, 45, 229, 25);
		nextProjectLabelHeadline.setForeground(new Color(255,255,255));
        nextProjectInfoPanel.add(nextProjectLabelHeadline);
        
		
		nextProjectLabelDetails.setFont(new Font("Inter", Font.PLAIN, 12));
        nextProjectLabelDetails.setText("<html>" + "<p>" + latestProjectDetails + "<p>" + "<html>");
		nextProjectLabelDetails.setBounds(20, 70, 254, 50);
		nextProjectLabelDetails.setForeground(new Color(255,255,255));
        nextProjectInfoPanel.add(nextProjectLabelDetails);
	
		
		/*seeMoreBtn = new JButton("see more");
        seeMoreBtn.setBorder(null);
		seeMoreBtn.setBounds(13, 115, 75, 22);
		seeMoreBtn.setFont(new Font("Inter", Font.PLAIN, 14));
		//seeMoreBtn.setBackground(new Color(100,158,255));
		seeMoreBtn.setForeground(new Color(0,76,204));
		
		seeMoreBtn.setOpaque(false);
		seeMoreBtn.setFocusPainted(false);
		seeMoreBtn.setBorderPainted(false);
		seeMoreBtn.setContentAreaFilled(false);
		seeMoreBtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		
		nextProjectInfoPanel.add(seeMoreBtn);
		
		seeMoreBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				seeMoreDialogPanel = new JPanel()
				{
					public void paintComponent(Graphics g)
					{
						g.drawImage(new ImageIcon(root + "project_applyBG.png"). getImage(),0,0,getWidth(),getHeight(), null);
					}
				};
				
				seeMoreDialogPanel.setBounds(0,0,1109,708);
				
				seeMoreDialog = new JDialog();
				seeMoreDialog.setTitle("Next Project Details");
				seeMoreDialog.setVisible(true);
				seeMoreDialog.setSize(1109,708);
				seeMoreDialog.setLocationRelativeTo(null);
				seeMoreDialog.add(seeMoreDialogPanel);
			}
		});*/
		
		
		applyBtn = new JButton(new ImageIcon(root + "applyBtn.png"));
        applyBtn.setBorder(null);
		applyBtn.setBounds(20, 130, 81, 37);
		//applyBtn.setBackground(new Color(172,203,255));
		
		applyBtn.setOpaque(false);
		applyBtn.setFocusPainted(false);
		applyBtn.setBorderPainted(false);
		applyBtn.setContentAreaFilled(false);
		applyBtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		
		
		nextProjectInfoPanel.add(applyBtn);
		
		applyBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new EventApplyForm(latestProject);
			}
		});
		
		dashboardPanel.add(nextProjectInfoPanel);
		
		
		
		//Donation Info
        donationInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "highlightMsg.png").getImage(), 0,0,255,133,null);
            }
        };
		
		donationTittle = new JLabel();
        donateAmount = new JLabel();
        
		
        donationInfoPanel.setLayout(null);
		donationInfoPanel.setBounds(233, 0, 255, 133);
		
        
        donationTittle.setFont(new Font("Inter", Font.BOLD, 18));
        donationTittle.setText("Donation");
		donationTittle.setBounds(20, 10, 200, 25);
        donationInfoPanel.add(donationTittle);
        middleInfo.add(donationInfoPanel);

		Transaction donation = new Transaction();
		ArrayList<Document> donationList = donation.getAll();
		int totalDonation = donationList.size();
		int totalDonationAmount = 0;

		for (int i = 0; i < totalDonation - 5; i++) {
			Document donationDoc = donationList.get(i);
			int amount = Integer.parseInt(donationDoc.getString("amount"));
			totalDonationAmount += amount;
		}

		donateAmount.setFont(new Font("Inter", Font.BOLD, 30));
		donateAmount.setForeground(new Color(82,99,255));
        donateAmount.setText("<html>&#2547 "+totalDonationAmount + "</html>");
		donateAmount.setBounds(50, 60, 200, 25);
        donationInfoPanel.add(donateAmount);
        middleInfo.add(donationInfoPanel);
		
		
		//Task Info
        taskInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "highlightMsg.png").getImage(), 0,0,255,133,null);
            }
        };
		taskTittle = new JLabel();
        task = new JLabel();
        
		
        taskInfoPanel.setLayout(null);
		taskInfoPanel.setBounds(233, 0, 255, 133);
		
        
        taskTittle.setFont(new Font("Inter", Font.BOLD, 18));
        taskTittle.setText("Overall Donations");
		taskTittle.setBounds(20, 10, 200, 25);
        taskInfoPanel.add(taskTittle);
        middleInfo.add(taskInfoPanel);

		task.setFont(new Font("Inter", Font.BOLD, 30));
		task.setForeground(new Color(82,99,255));
        task.setText(""+(totalDonation - 5));
		task.setBounds(100, 60, 200, 25);
        taskInfoPanel.add(task);
        middleInfo.add(taskInfoPanel);
		
        
		dashboardPanel.add(middleInfo);
        middleInfo.setBounds(21, 210, 543, 133);
        middleInfo.setBorder(null);
        middleInfo.setLayout(new GridLayout(1, 2, 30, 0));
		
		
		
		//Recent Project info
        recentProjectInfoPanel = new RecentProjectInfo();
		recentTittle = new JLabel();
		rProjectName = new JLabel();
		rProjectLeader = new JLabel();
		rProjectLocation = new JLabel();
		rProjectDonation = new JLabel();
		rProjectWorkingDay = new JLabel();
		rProjectPerformance = new JLabel();

		dashboardPanel.add(recentProjectInfoPanel);
		
        dashboardPanel.setBounds(0, 0, 570, 720);

        centerCardPanel.add(dashboardPanel, "dashboardPanel");

        // End of Dashboard Panel ------------------------------------------------
		
		
		// Transaction Panel
		
		
		transactionPanel = new JPanel();
		transactionPanel.setLayout(null);
		
		transanctionTALabel = new JLabel(new ImageIcon(root + "balance.png"));
		
		transanctionTATitle = new JLabel("Total Balance");
		transanctionTATitle.setFont(new Font("Inter", Font.BOLD, 18));
		transanctionTATitle.setBounds(20,3,200,50);
		transanctionTALabel.add(transanctionTATitle);
		
		transanctionTAAmount = new JLabel("10250");
		transanctionTAAmount.setFont(new Font("Inter", Font.BOLD, 30));
		transanctionTAAmount.setBounds(85,50,100,50);
		transanctionTALabel.add(transanctionTAAmount);
		
		transanctionTAHLine = new JLabel("Your total received amount.");
		transanctionTAHLine.setFont(new Font("Inter", Font.PLAIN, 12));
		transanctionTAHLine.setBounds(57,100,300,25);
		transanctionTALabel.add(transanctionTAHLine);
		
		transactionPanel.add(transanctionTALabel);
		transanctionTALabel.setBounds(22,5,257,142);
		
		
		
		
		transanctionMALabel = new JLabel(new ImageIcon(root + "balance.png"));
		
		transanctionMATitle = new JLabel("Monthly Balance");
		transanctionMATitle.setFont(new Font("Inter", Font.BOLD, 18));
		transanctionMATitle.setBounds(20,3,200,50);
		transanctionMALabel.add(transanctionMATitle);
		
		transanctionMAAmount = new JLabel("500");
		transanctionMAAmount.setFont(new Font("Inter", Font.BOLD, 30));
		transanctionMAAmount.setBounds(100,50,100,50);
		transanctionMALabel.add(transanctionMAAmount);
		
		transanctionMACalander = new JLabel("September");
		transanctionMACalander.setFont(new Font("Inter", Font.PLAIN, 12));
		transanctionMACalander.setBounds(180,4,70,50);
		transanctionMALabel.add(transanctionMACalander);
		
		transactionPanel.add(transanctionMALabel);
		transanctionMALabel.setBounds(310,5,257,142);
		
		
		
		
		transanctionTableLabel = new JLabel(new ImageIcon(root + "balanceHistory.png"));
		transactionPanel.add(transanctionTableLabel);
		transanctionTableLabel.setBounds(22,169,545,472);
		
		
		
		
		transanctionTable = new JTable();
		JTableHeader transanctionHeader = transanctionTable.getTableHeader();
		transanctionHeader.setFont(new Font("Inter", Font.BOLD, 18));
		transanctionHeader.setBackground(new Color(65,136,255));
		transanctionHeader.setForeground(new Color(255,255,255));
		
		transanctionModel = new DefaultTableModel(transanctionRow, transanctionColumn);
		transanctionTable.setModel(transanctionModel);
		
		transanctionTable.setFont(new Font("Inter", Font.PLAIN,16));
		transanctionTable.setBackground(new Color(255,255,255));
		transanctionTable.setSelectionBackground(new Color(111,165,255));
		transanctionTable.setRowHeight(35);
		transanctionTable.getColumnModel().getColumn(1).setPreferredWidth(200);
		//transanctionTable.setEnabled(false);
		
		centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		transanctionTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
		transanctionTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
		transanctionTable.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		
		transanctionScroll = new JScrollPane(transanctionTable);
		transanctionScroll.setBounds(0,24,545,400);
		transanctionTableLabel.add(transanctionScroll);
			
		
		
		transanctionDelete = new JButton("Delete");
		transanctionDelete.setBounds(455,431,80,30);
		transanctionDelete.setBackground(new Color(65,136,255));
		//transanctionDelete.setBorder(null);
		transanctionTableLabel.add(transanctionDelete);
		
		transanctionDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				int numberofRow = transanctionTable.getSelectedRow();
				
				if(numberofRow>=0)
				{
					transanctionModel.removeRow(numberofRow);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No transanction history has been selected!");
				}
			}
		});
		
		transactionPanel.add(transanctionTableLabel);
		
		transactionPanel.setBounds(0,0,570,720);
		//transactionPanel.setBackground(Color.BLUE);
		centerCardPanel.add(transactionPanel, "transactionPanel");
		
		
		
		
		// Notice Panel
		
		noticePanel = new JPanel();
		noticePanel.setLayout(null);
		
		noticeLabel = new JLabel(new ImageIcon(root + "noticePanel.png"));
		noticeLabel.setBounds(22,0,545,641);
		
		
		noticeTitleLabel = new JLabel("Notice");
		noticeTitleLabel.setFont(new Font("Inter", Font.BOLD, 22));
		noticeTitleLabel.setForeground(new Color(65,136,255));
		noticeTitleLabel.setBounds(240,8,100,50);
		noticeLabel.add(noticeTitleLabel);
		
		noticeTable = new JTable();
		JTableHeader noticeHeader = noticeTable.getTableHeader();
		noticeHeader.setFont(new Font("Inter", Font.BOLD, 18));
		noticeHeader.setBackground(new Color(65,136,255));
		noticeHeader.setForeground(new Color(255,255,255));

		noticeModel = new DefaultTableModel(noticeRow, noticeColumn);
		centerRenderer = new DefaultTableCellRenderer();
		noticeTable.setModel(noticeModel);
		
		noticeTable.setFont(new Font("Inter", Font.PLAIN,16));
		noticeTable.setBackground(new Color(255,255,255));
		noticeTable.setSelectionBackground(new Color(111,165,255));
		noticeTable.setRowHeight(50);
		noticeTable.getColumnModel().getColumn(0).setPreferredWidth(350);
		//noticeTable.setEnabled(false);
		
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		noticeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
		noticeTable.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		
		noticeScroll = new JScrollPane(noticeTable);
		noticeScroll.setBorder(new EmptyBorder(new Insets(20,20,20,20)));
		noticeScroll.setBounds(0,60,545,540);
		noticeLabel.add(noticeScroll);
		
		noticeView = new JButton("View");
		noticeView.setBounds(10,600,80,30);
		noticeView.setBackground(new Color(65,136,255));
		//noticeView.setBorder(null);
		noticeLabel.add(noticeView);
		
		
		noticeView.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				int numberofRow = noticeTable.getSelectedRow();
				String subject = noticeModel.getValueAt(numberofRow,0).toString();
				
				noticeDialogPanel = new JPanel() {
				@Override
				public void paintComponent(Graphics g) {
					g.drawImage(new ImageIcon(root + "noticeDialog.png").getImage(), 0,0,635,299,null);
				}
				};
				noticeDialogPanel.setLayout(null);
				noticeDialogPanel.setBounds(0,0,635,299);
				
				noticeSubject = new JLabel(subject);
				noticeSubject.setFont(new Font("Inter", Font.BOLD, 16));
				noticeSubject.setBounds(10,10,400,50);
				noticeDialogPanel.add(noticeSubject);
				
				noticeDetailsLabel = new JLabel("Details:");
				noticeDetailsLabel.setFont(new Font("Inter", Font.BOLD, 14));
				noticeDetailsLabel.setBounds(29,70,150,50);
				noticeDialogPanel.add(noticeDetailsLabel);
				
				noticeDialog = new JDialog();
				noticeDialog.setTitle("Notice");
				noticeDialog.setVisible(true);
				noticeDialog.setSize(653,338);
				noticeDialog.setLocationRelativeTo(null);
				noticeDialog.add(noticeDialogPanel);
				
			}
		});
		
		
		
		noticeDelete = new JButton("Delete");
		noticeDelete.setBounds(455,600,80,30);
		noticeDelete.setBackground(new Color(65,136,255));
		//noticeDelete.setBorder(null);
		noticeLabel.add(noticeDelete);
		
		noticeDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				int numberofRow = noticeTable.getSelectedRow();
				
				if(numberofRow>=0)
				{
					noticeModel.removeRow(numberofRow);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No notice has been selected!");
				}
			}
		});
		
		noticePanel.add(noticeLabel);
		
		noticePanel.setBounds(0,0,570,720);
		centerCardPanel.add(noticePanel, "noticePanel");


		//Right Side Panel
        
        rightSideMainPanel = new JPanel();
		rightSideMainPanel.setLayout(null);
		
		rightSidePanel = new JPanel();
		rightSidePanel.setLayout(null);
		

        exploreProjectsPanel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(new ImageIcon(root + "donationBar.png").getImage(), 0,0,getWidth(),getHeight(),null);
			}
		};
		
		
		exploreProjectsInfo = new JPanel();
		exploreProjectsTittle = new JLabel();
        projectName1 = new JLabel();
        projectName2 = new JLabel();
        projectName3 = new JLabel();
        projectName4 = new JLabel();
        projectName5 = new JLabel();
        projectDetails1 = new JLabel();
        projectDetails2 = new JLabel();
        projectDetails3 = new JLabel();
        projectDetails4 = new JLabel();
        projectDetails5 = new JLabel();
		
		
		exploreProjectsPanel.setLayout(new BoxLayout(exploreProjectsPanel, BoxLayout.Y_AXIS));
		exploreProjectsPanel.setBackground(null);
		exploreProjectsPanel.setBorder(new EmptyBorder(new Insets(20,20,20,20)));
//		exploreProjectsPanel.setBounds(50, 50, 300, 350);

		JScrollPane exploreProjectsPane = new JScrollPane() ;
		exploreProjectsPane.setBounds(10, 0, 350, 430);
		exploreProjectsPane.setBorder(null);
		exploreProjectsPane.setBackground(null);

        exploreProjectsTittle.setFont(new Font("Inter", Font.BOLD, 20));
        exploreProjectsTittle.setText("Explore Projects");
		exploreProjectsTittle.setBounds(55, 10, 200, 30);
//        rightSidePanel.add(exploreProjectsTittle);
        



		//Projects Name
		for (int i = 0; i < projectCountDB && i < 20; i++) {
//            AdminRightSidebarScrollPane.add(noticeBodyPanel, new JLabel(noticeFromDB.get(i).getString("notice")));
			VolunteerRightSidebarScrollPane.add(exploreProjectsPanel, projects.get(i).getString("event"));
		}
		exploreProjectsPane.setViewportView(exploreProjectsPanel);


		
		rightSidePanel.add(exploreProjectsPane);
		
		
		
		//Update Projects Info
		
		projectsUpdateInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "myProjects.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
		
		
		myProjectsLabel = new JLabel();
        completeProjectsLabel = new JLabel();
        completeProjectsIconLabel = new JLabel(new ImageIcon(root + "availableProjectIcon.png"));
        completeProjectAmount = new JLabel();
		
		projectsUpdateInfoPanel.setLayout(null);
		projectsUpdateInfoPanel.setBounds(10, 449, 350, 192);
		
		myProjectsLabel.setFont(new Font("Inter", Font.BOLD, 20));
        myProjectsLabel.setText("Available Projects");
        projectsUpdateInfoPanel.add(myProjectsLabel);
		myProjectsLabel.setBounds(20, 10, 200, 30);

		
		projectsUpdateInfoPanel.add(completeProjectsIconLabel);
		completeProjectsIconLabel.setBounds(70, 87, 40, 40);
		
		completeProjectAmount.setFont(new Font("Inter", Font.BOLD, 45));
		completeProjectAmount.setForeground(new Color(82,99,255));
		if (projectCountDB < 10) {
			completeProjectAmount.setText("0"+projectCountDB);
		} else {
			completeProjectAmount.setText(""+projectCountDB);
		}
        projectsUpdateInfoPanel.add(completeProjectAmount);
		completeProjectAmount.setBounds(160, 78, 150, 60);
		

		
		rightSidePanel.add(projectsUpdateInfoPanel);
		rightSideMainPanel.add(rightSidePanel);
		rightSidePanel.setBounds(822, 85, 370, 720);
		add(rightSidePanel);
		
		centerCardPanel.setBounds(240, 0, 980, 720);
        mainCardPanel.add(centerCardPanel, "centerCardPanel");
		
		
		
		// Event Panel
		
		eventPanel = new JPanel();
		eventPanel.setLayout(null);
		
		
		//eventLabel = new JLabel();
		
		//Next Project
        nextProjectInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "nextProject.png").getImage(), 0,0,543,188,null);
            }
        };
		nextProjectLabelTittle = new JLabel();
        nextProjectLabelHeadline = new JLabel();
        nextProjectLabelDetails = new JLabel();
		
        nextProjectInfoPanel.setLayout(null);
		nextProjectInfoPanel.setBounds(21, 0, 543, 188);
		
        //Next Project Info




        nextProjectLabelTittle.setFont(new Font("Inter", Font.BOLD, 20));
        nextProjectLabelTittle.setText("Next Project");
		nextProjectLabelTittle.setBounds(20, 10, 200, 25);
		nextProjectLabelTittle.setForeground(new Color(255,255,255));
        nextProjectInfoPanel.add(nextProjectLabelTittle);
        
		
		nextProjectLabelHeadline.setFont(new Font("Inter", Font.BOLD, 16));
        nextProjectLabelHeadline.setText(latestProjectName);
		nextProjectLabelHeadline.setBounds(20, 45, 229, 25);
		nextProjectLabelHeadline.setForeground(new Color(255,255,255));
        nextProjectInfoPanel.add(nextProjectLabelHeadline);
        
		
		nextProjectLabelDetails.setFont(new Font("Inter", Font.PLAIN, 12));
        nextProjectLabelDetails.setText(latestProjectDetails);
		nextProjectLabelDetails.setBounds(20, 70, 254, 50);
		nextProjectLabelDetails.setForeground(new Color(255,255,255));
        nextProjectInfoPanel.add(nextProjectLabelDetails);
	
		
		
		applyBtn = new JButton(new ImageIcon(root + "applyBtn.png"));
        applyBtn.setBorder(null);
		applyBtn.setBounds(20, 130, 81, 37);
		//applyBtn.setBackground(new Color(172,203,255));
		
		applyBtn.setOpaque(false);
		applyBtn.setFocusPainted(false);
		applyBtn.setBorderPainted(false);
		applyBtn.setContentAreaFilled(false);
		applyBtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		
		nextProjectInfoPanel.add(applyBtn);
		
		applyBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new EventApplyForm(latestProject);
			}
		});
		
		
		eventPanel.add(nextProjectInfoPanel);
		
		
		
		projectTablePanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "projectTableBG.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };		
		
		/*runningPrBtn = new JButton("Running Project");
		runningPrBtn.setBounds(5,5,260,100);
		runningPrBtn.setBackground(new Color(65,136,255));
		runningPrBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				projectCardLayout.show(projectCardPanel, "runningPrScroll");
			}
		});		
		projectTablePanel.add(runningPrBtn);



		
		completePrBtn = new JButton("Completed Project");
		completePrBtn.setBounds(265,5,260,100);
		completePrBtn.setBackground(new Color(65,136,255));
		completePrBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				projectCardLayout.show(projectCardPanel, "completePrScroll");
			}
		});		
		projectTablePanel.add(completePrBtn);*/
		
		
		
		//projectCardLayout = new CardLayout();
		projectCompletePanel = new JPanel();
		//projectCompletePanel.setLayout(null);
		
		projectRunningPanel = new JPanel();
		//projectRunningPanel.setLayout(null);
		
		eventTabbedPane = new JTabbedPane()
		{			
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				
				int w = getWidth();
				int h = getHeight();
				
				g.setColor(getBackground());
				g.drawRoundRect(0, 0, w-1, h-1, 25, 25);
			}
		};
		eventTabbedPane.setBounds(5,5,533,418);
		
		
		
		runningPrTable = new JTable();
		JTableHeader runningPrHeader = runningPrTable.getTableHeader();
		runningPrHeader.setFont(new Font("Inter", Font.BOLD, 18));
		runningPrHeader.setBackground(new Color(65,136,255));
		runningPrHeader.setForeground(new Color(255,255,255));
		
		runningPrModel = new DefaultTableModel(runningPrRow,runningPrColumn);
		runningPrTable.setModel(runningPrModel);
		
		runningPrTable.setFont(new Font("Inter", Font.PLAIN,16));
		runningPrTable.setBackground(new Color(255,255,255));
		runningPrTable.setSelectionBackground(new Color(111,165,255));
		runningPrTable.setRowHeight(50);
		
		runningPrScroll = new JScrollPane(runningPrTable);
		runningPrScroll.setLocation(0,0);
		runningPrScroll.setPreferredSize(new Dimension(543,400));
		projectRunningPanel.add(runningPrScroll);

		projectRunningPanel.setBounds(0,200,543,400);
		
		//ImageIcon runningIcon = new ImageIcon(root + "runningProjectBtn.png");
		
//		eventTabbedPane.add("Running Project", projectRunningPanel);
//		eventTabbedPane.setBackgroundAt(0, new Color(65,136,255));
		
		
		completePrTable = new JTable();
		JTableHeader completePrHeader = completePrTable.getTableHeader();
		completePrHeader.setFont(new Font("Inter", Font.BOLD, 18));
		completePrHeader.setBackground(new Color(65,136,255));
		completePrHeader.setForeground(new Color(255,255,255));
		
		completePrModel = new DefaultTableModel(completePrRow,completePrColumn);
		completePrTable.setModel(completePrModel);
		
		completePrTable.setFont(new Font("Inter", Font.PLAIN,16));
		completePrTable.setBackground(new Color(255,255,255));
		completePrTable.setSelectionBackground(new Color(111,165,255));
		completePrTable.setRowHeight(50);
		
		completePrScroll = new JScrollPane(completePrTable);
		completePrScroll.setLocation(0,0);
		completePrScroll.setPreferredSize(new Dimension(543,400));
		projectCompletePanel.add(completePrScroll);
		
		projectCompletePanel.setBounds(0,200,543,400);
		
		
		eventTabbedPane.add("Available Project", projectCompletePanel);
		eventTabbedPane.setBackgroundAt(0, new Color(65,136,255));
		
		
		
		projectTablePanel.add(eventTabbedPane);
		projectTablePanel.setLayout(null);
		projectTablePanel.setBounds(21,212,543,428);
		projectTablePanel.setBorder(new EmptyBorder(new Insets(20,20,20,20)));


		eventPanel.add(projectTablePanel);
		

	
	
		eventPanel.setBounds(0,0,570,652);
		mainCardPanel.add(eventPanel, "eventPanel");
		
		
		
		// Log Out Panel
		
		logOutPanel = new JPanel();
		logOutPanel.setLayout(null);
		
		logOutLabel = new JLabel(new ImageIcon(root + "fullpage.png"));
		
		
		logOutPanel.add(logOutLabel);
		logOutLabel.setBounds(0,0,927,652);
		
		mainCardPanel.add(logOutPanel, "logOutPanel");
		logOutPanel.setBounds(0,0,927,652);
		
		
		
		mainCardPanel.setBounds(240, 85, 570, 720); // CardLayout for Main panel
		mainCardPanel.setBackground(Color.BLUE);
        add(mainCardPanel); // CardLayout for Main panel
        
		
		
        dateLabel = new JLabel();
		dateLabel.setFont(new Font("Inter", Font.BOLD, 14));
        dateLabel.setBounds(270, 30, 300, 23);
		
		SimpleDateFormat dashboardDateFormat = new SimpleDateFormat("EEE, dd MMMM yyyy");
		dateLabel.setText(dashboardDateFormat.format(new Date()));
		
		add(dateLabel);
		
		
		
		profileBtn = new JButton();
		profileBtn.setIcon(new ImageIcon(root + "avatar.png"));
		profileBtn.setIconTextGap(14);
		profileBtn.setHorizontalAlignment(SwingConstants.LEFT);
		profileBtn.setBounds(990,30,200,25);
		profileBtn.setBackground(new Color(236,240,241));
		profileBtn.setForeground(new Color(0,0,0));
		profileBtn.setFont(new Font("Inter", Font.BOLD, 18));
		profileBtn.setBorder(null);
		add(profileBtn);
		
		
		profileTag.setFont(new Font("Inter", Font.PLAIN, 12));
        profileTag.setText("Volunteer");
        profileTag.setBounds(1030, 50, 100, 18);
		add(profileTag);
		
		
        setLocationRelativeTo(null);
        setVisible(true);
		pack();
    }

	private void donationBtnActionPerformed(ActionEvent actionEvent) {
		new Guest().setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public void setUserName(String uName) {
		profileBtn.setText(uName);
		this.add(profileBtn);
//		this.dashboardPanel.add(this.dashboardGreeting);
	}
}