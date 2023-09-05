package jscrollpane;

import javax.swing.*;

public class VdJscrollPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane Example");
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        for (int i = 1; i <= 60; i++) {
            contentPanel.add(new JLabel("Label " + i));
        }

        JScrollPane scrollPane = new JScrollPane(contentPanel);

        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
