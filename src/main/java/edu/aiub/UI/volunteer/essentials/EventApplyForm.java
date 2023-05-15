package edu.aiub.UI.volunteer.essentials;

import edu.aiub.Static;
import edu.aiub.essentials.SendMail;
import org.bson.Document;

import javax.print.Doc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventApplyForm{
    private String root = Static.VOLUNTEER_ROOT;
    public EventApplyForm(Document event) {
        JDialog prApplyDialog = new JDialog();


        JPanel prApplyDialogPanel = new JPanel();
        prApplyDialogPanel.setSize(1060,900);
        JLabel prApplyDialogLabel = new JLabel(new ImageIcon(root + "project_applyBG.png"));
        prApplyDialogLabel.setSize(1060,900);


//        JLabel prAdLabel = new JLabel(new ImageIcon(root + "applicationAd.png"));
//        prAdLabel.setBounds(40,30,979,332);
//        prApplyDialogLabel.add(prAdLabel);

        JLabel prTitleLabel = new JLabel();
        prTitleLabel.setFont(new Font("Inter", Font.BOLD, 18));
        prTitleLabel.setText(event.getString("event"));
        prTitleLabel.setBounds(40, 40, 500, 35);
        prTitleLabel.setForeground(new Color(65,65,65));
        prApplyDialogLabel.add(prTitleLabel);

        JLabel prDetailsLabel = new JLabel();
        prDetailsLabel.setFont(new Font("Inter", Font.PLAIN, 15));
        prDetailsLabel.setText("<html>" + "<p>" + "As you know, every year the winter comes with cold waves and as a disaster for the needy/poor people in Bangladesh. With your generous donation, Nirmul Foundation distributes thousands of winter clothes including blankets to help those who are greatly in need of warm cloth to survive the winter season. " + "We normally distribute in remote areas where not many relief activities can be observed. As usual, Ankur international is taking this opportunity to help these people with your generous donation. only a few dollars (the price of a burger) can help save one’s life from the cruel impact of cold waves. " + "You can decide how many lives you want to touch through this effort. This year it is much severe than previous years. Some areas of North Bengal still has flood water. Please come forward and contribute generously as you have done for the last several years. We humbly request everyone to donate generously for this good cause." + "<p>" + "<html>");
        prDetailsLabel.setBounds(40, 70, 979, 150);
        prDetailsLabel.setForeground(new Color(65,65,65));
        prApplyDialogLabel.add(prDetailsLabel);

        JLabel prConditionTitleLabel = new JLabel();
        prConditionTitleLabel.setFont(new Font("Inter", Font.BOLD, 18));
        prConditionTitleLabel.setText("Condition to participate on this Project");
        prConditionTitleLabel.setBounds(40, 230, 500, 35);
        prConditionTitleLabel.setForeground(new Color(65,65,65));
        prApplyDialogLabel.add(prConditionTitleLabel);

        JLabel prCondition1Label = new JLabel();
        prCondition1Label.setFont(new Font("Inter", Font.PLAIN, 15));
        prCondition1Label.setText("Must be present on first and last day.");
        prCondition1Label.setBounds(40, 260, 500, 35);
        prCondition1Label.setForeground(new Color(250,65,65));
        prApplyDialogLabel.add(prCondition1Label);

        JLabel prCondition2Label = new JLabel();
        prCondition2Label.setFont(new Font("Inter", Font.PLAIN, 15));
        prCondition2Label.setText("Must be present on time.");
        prCondition2Label.setBounds(40, 280, 500, 35);
        prCondition2Label.setForeground(new Color(65,65,65));
        prApplyDialogLabel.add(prCondition2Label);

        JLabel prCondition3Label = new JLabel();
        prCondition3Label.setFont(new Font("Inter", Font.PLAIN, 15));
        prCondition3Label.setText("try to timely attend on this project.");
        prCondition3Label.setBounds(40, 300, 500, 35);
        prCondition3Label.setForeground(new Color(65,65,65));
        prApplyDialogLabel.add(prCondition3Label);

        JLabel prCondition4Label = new JLabel();
        prCondition4Label.setFont(new Font("Inter", Font.PLAIN, 15));
        prCondition4Label.setText("Must be present on time.");
        prCondition4Label.setBounds(40, 320, 500, 35);
        prCondition4Label.setForeground(new Color(65,65,65));
        prApplyDialogLabel.add(prCondition4Label);


        int y = 350;
        int y1 = 847;
        int y2 = y1-y;

        JLabel prInformationTitleLabel = new JLabel();
        prInformationTitleLabel.setFont(new Font("Inter", Font.BOLD, 20));
        prInformationTitleLabel.setText("Fill Information");
        prInformationTitleLabel.setBounds(350, 847-y2, 200, 35);
        prInformationTitleLabel.setForeground(new Color(65,65,65));
        prApplyDialogLabel.add(prInformationTitleLabel);


        JLabel nameLable = new JLabel();
        nameLable.setFont(new Font("Inter", Font.PLAIN, 15));
        nameLable.setText("Your Full Name");
        nameLable.setBounds(40, 925-y2, 100, 35);
        nameLable.setForeground(new Color(65,65,65));
        prApplyDialogLabel.add(nameLable);

        JTextField name = new JTextField() {

            public void paintComponent(Graphics g) {
                int w = getWidth();
                int h = getHeight();
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                g.setColor(getBackground());
                g.fillRoundRect(0, 0, w - 1, h - 1, 25, 25);
                g2.setColor(new Color(65, 65, 65));
                g2.drawRoundRect(0, 0, w - 1, h - 1, 25, 25);
                super.paintComponent(g);
            }
        };
        //name.setText("Your Full Name");
        name.setFont(new Font("Inter", Font.PLAIN, 18));
        name.setForeground(new Color(65,65,65));
        name.setBounds(40, 960-y2, 446, 60);
        name.setOpaque(false);
        name.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));

        prApplyDialogLabel.add(name);


        JLabel emailLable = new JLabel();
        emailLable.setFont(new Font("Inter", Font.PLAIN, 15));
        emailLable.setText("E-mail");
        emailLable.setBounds(574, 925-y2, 100, 35);
        emailLable.setForeground(new Color(65,65,65));
        prApplyDialogLabel.add(emailLable);

        JTextField email = new JTextField() {

            public void paintComponent(Graphics g) {
                int w = getWidth();
                int h = getHeight();
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                g.setColor(getBackground());
                g.fillRoundRect(0, 0, w - 1, h - 1, 25, 25);
                g2.setColor(new Color(65, 65, 65));
                g2.drawRoundRect(0, 0, w - 1, h - 1, 25, 25);
                super.paintComponent(g);
            }
        };
        //email.setText(" ");
        email.setFont(new Font("Inter", Font.PLAIN, 18));
        email.setForeground(new Color(65,65,65));
        email.setBounds(574, 960-y2, 446, 60);
        email.setOpaque(false);
        email.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));

        prApplyDialogLabel.add(email);


        JLabel addressLable = new JLabel();
        addressLable.setFont(new Font("Inter", Font.PLAIN, 15));
        addressLable.setText("Your Address ");
        addressLable.setBounds(40, 1040-y2, 100, 35);
        addressLable.setForeground(new Color(65,65,65));
        prApplyDialogLabel.add(addressLable);

        JTextField address = new JTextField() {

            public void paintComponent(Graphics g) {
                int w = getWidth();
                int h = getHeight();
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                g.setColor(getBackground());
                g.fillRoundRect(0, 0, w - 1, h - 1, 25, 25);
                g2.setColor(new Color(65, 65, 65));
                g2.drawRoundRect(0, 0, w - 1, h - 1, 25, 25);
                super.paintComponent(g);
            }
        };
        //address.setText(" ");
        address.setFont(new Font("Inter", Font.PLAIN, 18));
        address.setForeground(new Color(65,65,65));
        address.setBounds(40, 1075-y2, 446, 60);
        address.setOpaque(false);
        address.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));

        prApplyDialogLabel.add(address);


        JLabel workPlaceLable = new JLabel();
        workPlaceLable.setFont(new Font("Inter", Font.PLAIN, 15));
        workPlaceLable.setText("Interested Workplace");
        workPlaceLable.setBounds(574, 1040-y2, 200, 35);
        workPlaceLable.setForeground(new Color(65,65,65));
        prApplyDialogLabel.add(workPlaceLable);

        JTextField workplace = new JTextField()
        {

            public void paintComponent(Graphics g)
            {
                int w = getWidth();
                int h = getHeight();
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                g.setColor(getBackground());
                g.fillRoundRect(0, 0, w-1, h-1, 25, 25);
                g2.setColor(new Color(65,65,65));
                g2.drawRoundRect(0, 0, w-1, h-1, 25, 25);
                super.paintComponent(g);
            }
        };
        //workplace.setText(" ");
        workplace.setFont(new Font("Inter", Font.PLAIN, 18));
        workplace.setForeground(new Color(65,65,65));
        workplace.setBounds(574, 1075-y2, 446, 60);
        workplace.setOpaque(false);
        workplace.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));

        prApplyDialogLabel.add(workplace);


        JLabel phoneLable = new JLabel();
        phoneLable.setFont(new Font("Inter", Font.PLAIN, 15));
        phoneLable.setText("Phone Number");
        phoneLable.setBounds(40, 1155-y2, 200, 35);
        phoneLable.setForeground(new Color(65,65,65));
        prApplyDialogLabel.add(phoneLable);

        JTextField phone = new JTextField()
        {

            public void paintComponent(Graphics g)
            {
                int w = getWidth();
                int h = getHeight();
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                g.setColor(getBackground());
                g.fillRoundRect(0, 0, w-1, h-1, 25, 25);
                g2.setColor(new Color(65,65,65));
                g2.drawRoundRect(0, 0, w-1, h-1, 25, 25);
                super.paintComponent(g);
            }
        };
        //phone.setText(" ");
        phone.setFont(new Font("Inter", Font.PLAIN, 18));
        phone.setForeground(new Color(65,65,65));
        phone.setBounds(40, 1190-y2, 446, 60);
        phone.setOpaque(false);
        phone.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));

        prApplyDialogLabel.add(phone);


        JButton prapplyBtn = new JButton(new ImageIcon(root + "prApplyBtn.png"));
        prapplyBtn.setBorder(null);
        prapplyBtn.setBounds(415, 1280-y2, 209, 51);
        //prapplyBtn.setBackground(new Color(172,203,255));

        prapplyBtn.setOpaque(false);
        prapplyBtn.setFocusPainted(false);
        prapplyBtn.setBorderPainted(false);
        prapplyBtn.setContentAreaFilled(false);
        prapplyBtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));


        prApplyDialogLabel.add(prapplyBtn);

        prapplyBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String getName = name.getText();
                String getEmail = email.getText();
                String getAddress = address.getText();
                String getWorkplace = workplace.getText();
                String getPhone = phone.getText();

                if(getName.equals("") || getEmail.equals("") || getAddress.equals("") || getWorkplace.equals("") || getPhone.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please ensure all information is filled in!", "Warning Message", JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    prApplyDialog.dispose();
                    SendMail.sendMail(getEmail, "Next Project Application",
                            "Dear " + getName + ",\n\nThank you for applying to "+ event.getString("title") +". We will get back to you as soon as possible.\n\nRegards,\nNirmul Foundation." +
                                    "\n\nYour Information:\n\nName: " + getName + "\nEmail: " + getEmail + "\nAddress: " + getAddress + "\nInterested Workplace: " + getWorkplace + "\nPhone Number: " + getPhone);
                }
            }
        });


        prApplyDialogPanel.add(prApplyDialogLabel);

//        JScrollPane applyScroll = new JScrollPane(prApplyDialogPanel);



        prApplyDialog.setTitle("Next Project Application");
        prApplyDialog.setVisible(true);
        prApplyDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        prApplyDialog.setSize(1106,900);
        prApplyDialog.setLocationRelativeTo(null);
        prApplyDialog.add(prApplyDialogPanel);

    }
}
