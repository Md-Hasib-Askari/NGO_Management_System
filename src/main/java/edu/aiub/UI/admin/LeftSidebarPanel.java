package edu.aiub.UI.admin;

import edu.aiub.Static;
import edu.aiub.UI.authentication.Signin;
import edu.aiub.essentials.ButtonHighlighter;
import edu.aiub.essentials.ContactDialog;
import edu.aiub.essentials.Pair;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class LeftSidebarPanel extends JPanel {
    private JButton dashboardBtn;
    private JButton userBtn;
    private JButton taskBtn;
    private JButton inventoryBtn;
    private JButton vehicleBtn;
    private JButton bankBtn;
    private JButton noticeBtn;
    private JButton settingsBtn;
    private JButton contactBtn;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon(Static.ADMIN_ROOT+"leftSidebar_bg.png").getImage(), 10, 20, getWidth()-20, getHeight()-40, null);
    }

    public LeftSidebarPanel(JPanel centerCardPanel, CardLayout centerCardLayout, JButton[] leftSidebarBtnList, int centerCardIndex, DefaultTableModel noticeTableModel) {
        dashboardBtn = leftSidebarBtnList[0];
        userBtn = leftSidebarBtnList[1];
        taskBtn = leftSidebarBtnList[2];
        inventoryBtn = leftSidebarBtnList[3];
        vehicleBtn = leftSidebarBtnList[4];
        bankBtn = leftSidebarBtnList[5];
        noticeBtn = leftSidebarBtnList[6];
        settingsBtn = leftSidebarBtnList[7];
        contactBtn = new JButton();

        setBackground(new Color(236, 240, 241));
        setMinimumSize(new Dimension(220, 790));
        setPreferredSize(new Dimension(220, 790));
        setLayout(null);

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
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(LeftSidebarPanel.this);
                frame.dispose();
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

        add(dashboardBtn);

        add(userBtn);

        add(taskBtn);

        add(inventoryBtn);

        add(vehicleBtn);

        add(bankBtn);

        add(noticeBtn);

        add(settingsBtn);
//      Left Side Panel Button Sequencing End

        add(contactBtn);
        contactBtn.setBounds(51, 640, 138, 34);

    }
}
