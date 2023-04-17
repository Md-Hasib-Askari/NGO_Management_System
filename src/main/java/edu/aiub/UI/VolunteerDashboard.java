package edu.aiub.UI;

import edu.aiub.essentials.ButtonHighlighter;
import edu.aiub.essentials.ContactDialog;
import edu.aiub.essentials.ImageResizer;
import edu.aiub.essentials.TableColumnCenterizer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.*;
import javax.swing.border.*;
//import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VolunteerDashboard extends JFrame {
    static JButton[] leftSidebarBtnList;

    private String root = "F:\\Java Project\\VolunteerDashboard\\Maven\\src\\main\\java\\edu\\aiub\\static\\";
	
	private CardLayout centerCardLayout;
    private JButton contactBtn;
    private JPanel centerCardPanel;
    private JButton bankBtn;
    private JPanel dashboardPanel;
    private JPanel middleInfo;
    private JPanel exploreProjectsInfo;
    private JButton dashboardBtn;
    private JLabel dashboardGreeting;
	private JButton profileBtn;
    private JButton inventoryBtn;
    private JPanel centerMainPanel;
    private JPanel leftSidePanel;
	private JPanel noticePanel;
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
    private JPanel rightSidePanel;
    private JButton settingsBtn;
    private JButton projectBtn;
    private JButton donationBtn;
    private JLabel futureProjectLabelTittle;
    private JLabel futureProjectLabelHeadline;
    private JLabel futureProjectLabelDetails;
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
	private JPanel futureProjectInfoPanel;
	private JPanel donationInfoPanel;
	private JPanel taskInfoPanel;
	private JPanel recentProjectInfoPanel;
	private JPanel exploreProjectsPanel;
	private JButton applyBtn;
	private JButton seeMoreBtn;
	private JButton donateBtn;
	private JButton logoutBtn;
	private JLabel profileTag;
	private JLabel myProjectsLabel;
	private JLabel completeProjectsLabel;
	private JLabel pendingProjectsLabel;
	private JPanel projectsUpdateInfoPanel;
	private JLabel completeProjectAmount;
	private JLabel pendingProjectAmount;
	private JDialog noticeDialog;
	
	private String[] noticeColumn = new String[]{"Subject", "Date"};
	private String[][] noticeRow = new String[][]{
		
		{"     Packing and distributing meal", "16-02-2023"},
		{"     Blood collection", "20-02-2023"},
		{"     Participating in tree seedling propagation", "29-02-2023"},
		{"     Providing support and companionship", "10-03-2023"},
		{"     Participating in medical missions", "27-03-2023"},
		{"     Sorting and organizing donated food", "07-04-2023"},
		{"     Food Packeging", "16-04-2023"},
		{"     Participating in food drives", "26-04-2023"},
		{"     Packing and distributing meal", "16-02-2023"},
		{"     Blood collection", "20-02-2023"},
		{"     Participating in tree seedling propagation", "29-02-2023"},
		{"     Providing support and companionship", "10-03-2023"},
		{"     Participating in medical missions", "27-03-2023"},
		{"     Sorting and organizing donated food", "07-04-2023"},
		{"     Food Packeging", "16-04-2023"}
		
		
	};

    public VolunteerDashboard() {
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
        projectBtn = new JButton();
        donationBtn = new JButton();
        bankBtn = new JButton();
        noticeBtn = new JButton();
        settingsBtn = new JButton();
		contactBtn = new JButton();
		
		
		//Left Side Bar
		leftSidebarBtnList = new JButton[]{dashboardBtn, projectBtn, bankBtn, donationBtn, noticeBtn, settingsBtn};
		
		
		

//      Center Panel
        centerCardPanel = new JPanel();
        dashboardPanel = new JPanel();
        centerMainPanel = new JPanel();
        middleInfo = new JPanel();
        dashboardGreeting = new JLabel();
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
                centerCardLayout.show(centerCardPanel, "dashboardPanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, dashboardBtn);
            }
        });
		
		//Project Button
        projectBtn.setBackground(new Color(65, 136, 255));
        projectBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/taskBtn.png"));
        projectBtn.setBorder(null);
        leftSidePanel.add(projectBtn);
        projectBtn.setBounds(20, 170, 200, 45);
        projectBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerCardLayout.show(centerCardPanel, "taskPanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, projectBtn);
            }
        });


		//Bank Button
        bankBtn.setBackground(new Color(65, 136, 255));
        bankBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/bankBtn.png"));
        bankBtn.setBorder(null);
        leftSidePanel.add(bankBtn);
        bankBtn.setBounds(20, 220, 200, 45);
        bankBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                centerCardLayout.show(centerCardPanel, "bankPanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, bankBtn);
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
                centerCardLayout.show(centerCardPanel, "donationPanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, donationBtn);
            }
        });


//      Notice Button
        noticeBtn.setBackground(new Color(65, 136, 255));
        noticeBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/noticeBtn.png"));
        noticeBtn.setBorder(null);
        noticeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerCardLayout.show(centerCardPanel, "noticePanel");
                ButtonHighlighter.highlight(leftSidebarBtnList, noticeBtn);
            }
        });
        leftSidePanel.add(noticeBtn);
        noticeBtn.setBounds(20, 320, 200, 45);

//      Settings Button
        settingsBtn.setBackground(new Color(65, 136, 255));
        settingsBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/settingsBtn.png"));
        settingsBtn.setBorder(null);
        settingsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ButtonHighlighter.highlight(leftSidebarBtnList, settingsBtn);
            }
        });
        leftSidePanel.add(settingsBtn);
        settingsBtn.setBounds(20, 370, 200, 45);

//      Contact Button
        contactBtn.setBackground(new Color(103, 160, 255));
        contactBtn.setIcon(new ImageIcon(root + "leftSidebarBtn/contactBtn.png"));
        contactBtn.setBorder(null);
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
        // Dashboard Panel ----------------------------------------------
        //dashboardPanel.setBackground(new Color(236, 240, 241));
        //dashboardPanel.setBackground(Color.RED);
        dashboardPanel.setLayout(null);

        centerMainPanel.setLayout(null);
		//centerMainPanel.setBackground(Color.BLUE);

		
		//Furure Project
        futureProjectInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "nextProject.png").getImage(), 0,0,543,188,null);
            }
        };
		futureProjectLabelTittle = new JLabel();
        futureProjectLabelHeadline = new JLabel();
        futureProjectLabelDetails = new JLabel();
		
        futureProjectInfoPanel.setLayout(null);
		futureProjectInfoPanel.setBounds(21, 0, 543, 188);
		
        //Future Project Info
		
        futureProjectLabelTittle.setFont(new Font("Inter", Font.BOLD, 20));
        futureProjectLabelTittle.setText("Future Project");
		futureProjectLabelTittle.setBounds(20, 10, 200, 25);
        futureProjectInfoPanel.add(futureProjectLabelTittle);
        
		
		futureProjectLabelHeadline.setFont(new Font("Inter", Font.BOLD, 16));
        futureProjectLabelHeadline.setText("Winter Clothes Distribution");
		futureProjectLabelHeadline.setBounds(20, 45, 229, 25);
        futureProjectInfoPanel.add(futureProjectLabelHeadline);
        
		
		futureProjectLabelDetails.setFont(new Font("Inter", Font.PLAIN, 12));
        futureProjectLabelDetails.setText("<html>" + "<p>" + "Like every year, we plan to distribute special " + "winter survival kits among underprivileged " + "communities to save them from the cold." + "<p>" + "<html>");
		futureProjectLabelDetails.setBounds(20, 70, 254, 50);
        futureProjectInfoPanel.add(futureProjectLabelDetails);
	
		
		seeMoreBtn = new JButton("see more");
        seeMoreBtn.setBorder(null);
		seeMoreBtn.setBounds(18, 115, 75, 22);
		seeMoreBtn.setBackground(new Color(172,203,255));
		seeMoreBtn.setForeground(new Color(65,136,255));
		futureProjectInfoPanel.add(seeMoreBtn);
		
		seeMoreBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Open new window");
			}
		});
		
		
		
		//UIManager.put("Button.arc", 30);
		applyBtn = new JButton(new ImageIcon(root + "applyBtnHover.png"));
        applyBtn.setBorder(null);
		//applyBtn.setBorderPainted(false);
		//applyBtn.setContentAreaFilled(false);
		//applyBtn.setOpaque(true);
		applyBtn.setBounds(20, 145, 74, 33);
		applyBtn.setBackground(new Color(172,203,255));
		futureProjectInfoPanel.add(applyBtn);
		
		applyBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "This is Apply Button");
			}
		});
		
		centerMainPanel.add(futureProjectInfoPanel);
		
		
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
		donationInfoPanel.setBounds(233, 80, 255, 133);
		
        
        donationTittle.setFont(new Font("Inter", Font.BOLD, 18));
        donationTittle.setText("Donation");
		donationTittle.setBounds(20, 10, 200, 25);
        donationInfoPanel.add(donationTittle);
        middleInfo.add(donationInfoPanel);
		
		donateAmount.setFont(new Font("Inter", Font.BOLD, 30));
		donateAmount.setForeground(new Color(82,99,255));
        donateAmount.setText("6050");
		donateAmount.setBounds(100, 60, 200, 25);
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
		taskInfoPanel.setBounds(233, 80, 255, 133);
		
        
        taskTittle.setFont(new Font("Inter", Font.BOLD, 18));
        taskTittle.setText("Working Performance");
		taskTittle.setBounds(20, 10, 200, 25);
        taskInfoPanel.add(taskTittle);
        middleInfo.add(taskInfoPanel);
		
		task.setFont(new Font("Inter", Font.BOLD, 30));
		task.setForeground(new Color(82,99,255));
        task.setText("73%");
		task.setBounds(100, 60, 200, 25);
        taskInfoPanel.add(task);
        middleInfo.add(taskInfoPanel);
		
        
		centerMainPanel.add(middleInfo);
        middleInfo.setBounds(21, 210, 543, 133);
        middleInfo.setBorder(null);
        middleInfo.setLayout(new GridLayout(1, 2, 30, 0));
		
		
		
		//Recent Project info
        recentProjectInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "moreInfo.png").getImage(), 0,0,545,275,null);
            }
        };
		recentTittle = new JLabel();
		rProjectName = new JLabel();
		rProjectLeader = new JLabel();
		rProjectLocation = new JLabel();
		rProjectDonation = new JLabel();
		rProjectWorkingDay = new JLabel();
		rProjectPerformance = new JLabel();
		
        recentProjectInfoPanel.setLayout(null);
		recentProjectInfoPanel.setBounds(21, 365, 545, 275);
		
        recentTittle.setFont(new Font("Inter", Font.BOLD, 18));
        recentTittle.setText("Recent Project Information");
		recentTittle.setBounds(25, 20, 300, 25);
        recentProjectInfoPanel.add(recentTittle);
		
		rProjectName.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectName.setText("Project name: Winter Clothes Distribution");
		rProjectName.setBounds(25, 70, 300, 25);
        recentProjectInfoPanel.add(rProjectName);
		
		rProjectLeader.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectLeader.setText("Project leader: Md. Osman Ali");
		rProjectLeader.setBounds(25, 100, 300, 25);
        recentProjectInfoPanel.add(rProjectLeader);
		
		rProjectWorkingDay.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectWorkingDay.setText("Project working day: 13");
		rProjectWorkingDay.setBounds(25, 130, 300, 25);
        recentProjectInfoPanel.add(rProjectWorkingDay);
		
		rProjectLocation.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectLocation.setText("Your working location: Gazipur");
		rProjectLocation.setBounds(25, 160, 300, 25);
        recentProjectInfoPanel.add(rProjectLocation);
		
		rProjectDonation.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectDonation.setText("Your project donation: 2500");
		rProjectDonation.setBounds(25, 190, 300, 25);
        recentProjectInfoPanel.add(rProjectDonation);
		
		rProjectPerformance.setFont(new Font("Inter", Font.PLAIN, 16));
        rProjectPerformance.setText("Your project performance: 69%");
		rProjectPerformance.setBounds(25, 220, 300, 25);
        recentProjectInfoPanel.add(rProjectPerformance);
		
		
		centerMainPanel.add(recentProjectInfoPanel);
		
		
        

        dashboardGreeting.setFont(new Font("Inter", Font.BOLD, 14));
        dashboardGreeting.setText("Welcome back, Siam!");
        add(dashboardGreeting);
        dashboardGreeting.setBounds(270, 30, 300, 23);
		
		
		profileBtn = new JButton("Shahariar Islam"); 
		profileBtn.setIcon(new ImageIcon(root + "avatar.png"));
		profileBtn.setIconTextGap(14);
		profileBtn.setBounds(495,30,200,25);
		profileBtn.setBackground(new Color(236,240,241));
		profileBtn.setForeground(new Color(0,0,0));
		profileBtn.setFont(new Font("Inter", Font.BOLD, 18));
		profileBtn.setBorder(null);
		add(profileBtn);
		
		
		profileTag.setFont(new Font("Inter", Font.PLAIN, 12));
        profileTag.setText("Volunteer");
        profileTag.setBounds(628, 50, 300, 18);
		add(profileTag);
		
		logoutBtn = new JButton(new ImageIcon(root + "logoutBtn.png"));
		logoutBtn.setBorder(null);
		logoutBtn.setBorderPainted(false);
		logoutBtn.setContentAreaFilled(false);
		logoutBtn.setOpaque(true);
		logoutBtn.setBounds(730,32,75,30);
		logoutBtn.setBackground(new Color(236,240,241));
		add(logoutBtn);
		
		logoutBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "This is Log Out Button");
			}
		});
		
		
        

        dashboardPanel.add(centerMainPanel);
        centerMainPanel.setBounds(0, 0, 595, 720);

        add(dashboardPanel);
        dashboardPanel.setBounds(240, 85, 595, 720);

        centerCardPanel.add(dashboardPanel, "dashboardPanel");

        // End of Dashboard Panel ------------------------------------------------
		
		
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
		//noticeModel.setColumnIdentifiers(noticeColumn);
		noticeTable.setModel(noticeModel);
		
		noticeTable.setFont(new Font("Inter", Font.PLAIN,16));
		noticeTable.setBackground(new Color(255,255,255));
		noticeTable.setSelectionBackground(new Color(111,165,255));
		noticeTable.setRowHeight(50);
		noticeTable.getColumnModel().getColumn(0).setPreferredWidth(410);
		//noticeTable.setEnabled(false);
		
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		noticeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
		noticeTable.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		
		noticeScroll = new JScrollPane(noticeTable);
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
		
		noticePanel.setBounds(240,85,595,720);
		centerCardPanel.add(noticePanel, "noticePanel");
		
		
		centerCardPanel.setBounds(240, 85, 595, 720); // CardLayout for center panel
        add(centerCardPanel); // CardLayout for center panel
		


		//Right Side Panel
        
        rightSidePanel = new JPanel();
		rightSidePanel.setLayout(null);
		rightSidePanel.setBounds(800, 0, 450, 750);

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
        projectName6 = new JLabel();
        projectName7 = new JLabel();
        projectDetails1 = new JLabel();
        projectDetails2 = new JLabel();
        projectDetails3 = new JLabel();
        projectDetails4 = new JLabel();
        projectDetails5 = new JLabel();
        projectDetails6 = new JLabel();
        projectDetails7 = new JLabel();
		
		
		exploreProjectsPanel.setLayout(null);
		exploreProjectsPanel.setBounds(35, 26, 353, 457);
		
		
        exploreProjectsTittle.setFont(new Font("Inter", Font.BOLD, 20));
        exploreProjectsTittle.setText("Explore Projects");
		exploreProjectsTittle.setBounds(20, 10, 200, 30);
        exploreProjectsPanel.add(exploreProjectsTittle);
        
        
		//Projects Name
		projectName1.setFont(new Font("Inter", Font.BOLD, 16));
        projectName1.setText("Tree Forestation");
		projectName1.setBounds(20, 50, 200, 25);
        exploreProjectsPanel.add(projectName1);
        
		projectDetails1.setFont(new Font("Inter", Font.PLAIN, 10));
        projectDetails1.setText("<html>" + "<p>" + "Lorem Ipsum is simply dummy text of the printing and typesetting industry." + "<p>" + "<html>");
		projectDetails1.setBounds(20, 76, 226, 25);
        exploreProjectsPanel.add(projectDetails1);
		
		donateBtn = new JButton();
		donateBtn.setIcon(new ImageIcon(root + "donationBtn.png"));
        donateBtn.setBorder(null);
		donateBtn.setBackground(new Color(255,255,255));
		exploreProjectsPanel.add(donateBtn);
		donateBtn.setBounds(251, 63, 82, 36);
		
		donateBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "This is Donation Button 1");
			}
		});
		
		
		projectName2.setFont(new Font("Inter", Font.BOLD, 16));
        projectName2.setText("Health Campaign");
		projectName2.setBounds(20, 115, 200, 25);
        exploreProjectsPanel.add(projectName2);
        
		projectDetails2.setFont(new Font("Inter", Font.PLAIN, 10));
        projectDetails2.setText("<html>" + "<p>" + "Lorem Ipsum is simply dummy text of the printing and typesetting industry." + "<p>" + "<html>");
		projectDetails2.setBounds(20, 141, 226, 25);
        exploreProjectsPanel.add(projectDetails2);
		
		donateBtn = new JButton();
		donateBtn.setIcon(new ImageIcon(root + "donationBtn.png"));
        donateBtn.setBorder(null);
		donateBtn.setBackground(new Color(255,255,255));
		exploreProjectsPanel.add(donateBtn);
		donateBtn.setBounds(251, 128, 82, 36);
		
		donateBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "This is Donation Button 2");
			}
		});
		
		projectName3.setFont(new Font("Inter", Font.BOLD, 16));
        projectName3.setText("Dengue");
		projectName3.setBounds(20, 180, 200, 25);
        exploreProjectsPanel.add(projectName3);
        
		projectDetails3.setFont(new Font("Inter", Font.PLAIN, 10));
        projectDetails3.setText("<html>" + "<p>" + "Lorem Ipsum is simply dummy text of the printing and typesetting industry." + "<p>" + "<html>");
		projectDetails3.setBounds(20, 206, 226, 25);
        exploreProjectsPanel.add(projectDetails3);
		
		donateBtn = new JButton();
		donateBtn.setIcon(new ImageIcon(root + "donationBtn.png"));
        donateBtn.setBorder(null);
		donateBtn.setBackground(new Color(255,255,255));
		exploreProjectsPanel.add(donateBtn);
		donateBtn.setBounds(251, 193, 82, 36);
		
		donateBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "This is Donation Button 3");
			}
		});
		
		projectName4.setFont(new Font("Inter", Font.BOLD, 16));
        projectName4.setText("Food Distribution");
		projectName4.setBounds(20, 245, 200, 25);
        exploreProjectsPanel.add(projectName4);
        
		projectDetails4.setFont(new Font("Inter", Font.PLAIN, 10));
        projectDetails4.setText("<html>" + "<p>" + "Lorem Ipsum is simply dummy text of the printing and typesetting industry." + "<p>" + "<html>");
		projectDetails4.setBounds(20, 271, 226, 25);
        exploreProjectsPanel.add(projectDetails4);
		
		donateBtn = new JButton();
		donateBtn.setIcon(new ImageIcon(root + "donationBtn.png"));
        donateBtn.setBorder(null);
		donateBtn.setBackground(new Color(255,255,255));
		exploreProjectsPanel.add(donateBtn);
		donateBtn.setBounds(251, 258, 82, 36);
		
		donateBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "This is Donation Button 4");
			}
		});
		
		projectName5.setFont(new Font("Inter", Font.BOLD, 16));
        projectName5.setText("Health Campaign");
		projectName5.setBounds(20, 310, 200, 25);
        exploreProjectsPanel.add(projectName5);
        
		projectDetails5.setFont(new Font("Inter", Font.PLAIN, 10));
        projectDetails5.setText("<html>" + "<p>" + "Lorem Ipsum is simply dummy text of the printing and typesetting industry." + "<p>" + "<html>");
		projectDetails5.setBounds(20, 336, 226, 25);
        exploreProjectsPanel.add(projectDetails5);
		
		donateBtn = new JButton();
		donateBtn.setIcon(new ImageIcon(root + "donationBtn.png"));
        donateBtn.setBorder(null);
		donateBtn.setBackground(new Color(255,255,255));
		exploreProjectsPanel.add(donateBtn);
		donateBtn.setBounds(251, 323, 82, 36);
		
		donateBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "This is Donation Button 5");
			}
		});
		
		projectName6.setFont(new Font("Inter", Font.BOLD, 16));
        projectName6.setText("Tree Forestation");
		projectName6.setBounds(20, 375, 200, 25);
        exploreProjectsPanel.add(projectName6);
        
		projectDetails6.setFont(new Font("Inter", Font.PLAIN, 10));
        projectDetails6.setText("<html>" + "<p>" + "Lorem Ipsum is simply dummy text of the printing and typesetting industry." + "<p>" + "<html>");
		projectDetails6.setBounds(20, 401, 226, 25);
        exploreProjectsPanel.add(projectDetails6);
		
		donateBtn = new JButton();
		donateBtn.setIcon(new ImageIcon(root + "donationBtn.png"));
        donateBtn.setBorder(null);
		donateBtn.setBackground(new Color(255,255,255));
		exploreProjectsPanel.add(donateBtn);
		donateBtn.setBounds(251, 388, 82, 36);
		
		donateBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "This is Donation Button 6");
			}
		});
		
		
		
		rightSidePanel.add(exploreProjectsPanel);
		
		
		
		//Update Projects Info
		
		projectsUpdateInfoPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "myProjects.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
		
		
		myProjectsLabel = new JLabel();
        completeProjectsLabel = new JLabel();
        completeProjectAmount = new JLabel();
        pendingProjectsLabel = new JLabel();
        pendingProjectAmount = new JLabel();
		
		projectsUpdateInfoPanel.setLayout(null);
		projectsUpdateInfoPanel.setBounds(36, 505, 350, 223);
		
		myProjectsLabel.setFont(new Font("Inter", Font.BOLD, 20));
        myProjectsLabel.setText("My Project");
        projectsUpdateInfoPanel.add(myProjectsLabel);
		myProjectsLabel.setBounds(20, 10, 200, 30);
		
		completeProjectsLabel.setFont(new Font("Inter", Font.BOLD, 16));
        completeProjectsLabel.setText("Complete Project");
        projectsUpdateInfoPanel.add(completeProjectsLabel);
		completeProjectsLabel.setBounds(20, 110, 200, 30);
		
		completeProjectAmount.setFont(new Font("Inter", Font.BOLD, 26));
        completeProjectAmount.setText("125");
        projectsUpdateInfoPanel.add(completeProjectAmount);
		completeProjectAmount.setBounds(68, 150, 200, 30);
		
		
		pendingProjectsLabel.setFont(new Font("Inter", Font.BOLD, 16));
        pendingProjectsLabel.setText("Pending Project");
        projectsUpdateInfoPanel.add(pendingProjectsLabel);
		pendingProjectsLabel.setBounds(200, 110, 200, 30);
		
		pendingProjectAmount.setFont(new Font("Inter", Font.BOLD, 26));
        pendingProjectAmount.setText("08");
        projectsUpdateInfoPanel.add(pendingProjectAmount);
		pendingProjectAmount.setBounds(250, 150, 200, 30);
		
		
		rightSidePanel.add(projectsUpdateInfoPanel);
		
		add(rightSidePanel);
        

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}