import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class VerifyAccount extends JFrame{
	private String root = "C:\\Users\\Robin\\Desktop\\Java Project\\";
	
    private JTextField Code1txtF;
    private JTextField Code2txtF;
    private JTextField Code3txtF;
    private JTextField Code4txtF;
    private JPanel CodePanel1;
    private JPanel CodePanel2;
    private JPanel CodePanel3;
    private JPanel CodePanel4;
    private JButton SubmitBtn;
    private JLabel verifyAccountLabel;
    private JPanel verifyAccountPanel;

    VerifyAccount(){

		verifyAccountPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("C:\\Users\\Robin\\Desktop\\NIrmul Project\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\Static\\verifyAccount_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        CodePanel1 = new JPanel();
        Code1txtF = new JTextField();
        CodePanel2 = new JPanel();
        Code2txtF = new JTextField();
        CodePanel3 = new JPanel();
        Code3txtF = new JTextField();
        CodePanel4 = new JPanel();
        Code4txtF = new JTextField();
        SubmitBtn = new JButton();
        verifyAccountLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        verifyAccountPanel.setBackground(new Color(204, 204, 204));
        verifyAccountPanel.setLayout(null);

        CodePanel1.setFont(new Font("Inter", 0, 12)); // NOI18N

        Code1txtF.setFont(new Font("Inter", 0, 48)); // NOI18N
        Code1txtF.setBorder(null);

        GroupLayout CodePanel1Layout = new GroupLayout(CodePanel1);
        CodePanel1.setLayout(CodePanel1Layout);
        CodePanel1Layout.setHorizontalGroup(
            CodePanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, CodePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Code1txtF, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        CodePanel1Layout.setVerticalGroup(
            CodePanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, CodePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Code1txtF, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        verifyAccountPanel.add(CodePanel1);
        CodePanel1.setBounds(75, 400, 100, 100);

        Code2txtF.setFont(new Font("Inter", 0, 48)); // NOI18N
        Code2txtF.setBorder(null);

        GroupLayout CodePanel2Layout = new GroupLayout(CodePanel2);
        CodePanel2.setLayout(CodePanel2Layout);
        CodePanel2Layout.setHorizontalGroup(
            CodePanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(CodePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Code2txtF, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        CodePanel2Layout.setVerticalGroup(
            CodePanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, CodePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Code2txtF, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        verifyAccountPanel.add(CodePanel2);
        CodePanel2.setBounds(220, 400, 100, 100);

        Code3txtF.setFont(new Font("Inter", 0, 48)); // NOI18N
        Code3txtF.setBorder(null);
        Code3txtF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //Code3txtFActionPerformed(evt);
            }
        });

        GroupLayout CodePanel3Layout = new GroupLayout(CodePanel3);
        CodePanel3.setLayout(CodePanel3Layout);
        CodePanel3Layout.setHorizontalGroup(
            CodePanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, CodePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Code3txtF, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        CodePanel3Layout.setVerticalGroup(
            CodePanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, CodePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Code3txtF, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        verifyAccountPanel.add(CodePanel3);
        CodePanel3.setBounds(365, 400, 100, 100);

        Code4txtF.setFont(new Font("Inter", 0, 48)); // NOI18N
        Code4txtF.setBorder(null);

        GroupLayout CodePanel4Layout = new GroupLayout(CodePanel4);
        CodePanel4.setLayout(CodePanel4Layout);
        CodePanel4Layout.setHorizontalGroup(
            CodePanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, CodePanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Code4txtF, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        CodePanel4Layout.setVerticalGroup(
            CodePanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(CodePanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Code4txtF, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        verifyAccountPanel.add(CodePanel4);
        CodePanel4.setBounds(510, 400, 100, 100);

        SubmitBtn.setBackground(new Color(46, 204, 113));
        SubmitBtn.setFont(new Font("Inter", 1, 24)); // NOI18N
        SubmitBtn.setForeground(new Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.setBorder(null);
        verifyAccountPanel.add(SubmitBtn);
        SubmitBtn.setBounds(75, 590, 250, 60);

        verifyAccountLabel.setFont(new Font("Inter Light", 1, 14)); // NOI18N
        verifyAccountLabel.setText("We've sent an OTP to to your Email, submit the OTP here to verify your account.");
        verifyAccountPanel.add(verifyAccountLabel);
        verifyAccountLabel.setBounds(75, 340, 660, 18);

        getContentPane().add(verifyAccountPanel);
        verifyAccountPanel.setBounds(0, 0, 1200, 750);

        pack();

		//setLocationRelativeTo(null);
		setTitle("NGO Management System");
		setIconImage(new ImageIcon(root+"Stack\\titleIcon").getImage());
        setVisible(true);
        setResizable(false);
        setSize(1200,750);


        }


        public static void main (String[] args){
            System.setProperty("sun.java2d.uiScale", "1.0");
            new VerifyAccount();

        }


    }
