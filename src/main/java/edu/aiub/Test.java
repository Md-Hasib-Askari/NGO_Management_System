package edu.aiub;

import javax.swing.*;

public class Test extends JFrame {
    public Test() {
        super("Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        JScrollPane scrollPane = new JScrollPane();
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (int i = 0; i < 100; i++) {
            panel.add(new JButton("Button " + i));
        }
        scrollPane.setViewportView(panel);
        add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }
}
