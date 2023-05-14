package edu.aiub.UIComponents;

import edu.aiub.database.Notice;

import javax.swing.*;

public class NoticeAddForm extends JFrame {
    public NoticeAddForm() {
        super("Add Notice");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
//        panel.setBorder(new EmptyBorder(50, 50, 50, 50));
        panel.setLayout(null);

        JLabel noticeTitleLabel = new JLabel("Notice Title");
        noticeTitleLabel.setBounds(40, 50, getWidth()-100, 50);

        JTextField noticeTitleField = new JTextField();
        noticeTitleField.setBounds(40, 90, ((getWidth()-100)), 50);

        JLabel noticeDescriptionLabel = new JLabel("Notice Description");
        noticeDescriptionLabel.setBounds(40, 150, (getWidth()-100), 50);

        JTextArea noticeDescriptionArea = new JTextArea();
        noticeDescriptionArea.setBounds(40, 200, (getWidth()-100), 150);

        JButton addNoticeButton = new JButton("Add Notice");
        addNoticeButton.addActionListener(e -> {
            Notice notice = new Notice();
            notice.add(new Object[]{
                    noticeTitleField.getText(),
                    noticeDescriptionArea.getText()
            });
            dispose();
        });
        addNoticeButton.setBounds(40, 400, (getWidth()-100), 50);

        panel.add(Box.createVerticalStrut(50));
        panel.add(noticeTitleLabel);
        panel.add(noticeTitleField);
        panel.add(noticeDescriptionLabel);
        panel.add(noticeDescriptionArea);
        panel.add(addNoticeButton);
        panel.add(Box.createVerticalStrut(50));

        add(panel);
        setResizable(false);
        setVisible(true);
    }
}
