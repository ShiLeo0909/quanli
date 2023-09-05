package drawmenu.menuview;

import drawmenu.menucontroll.MenuExampleCotnroll;

import javax.swing.*;
import java.awt.*;

public class MenuExampleView extends JFrame {
    private JLabel jLabel;

    public MenuExampleView() {
        this.setTitle("Tim Kiem");
        this.setSize(500, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        MenuExampleCotnroll menuExampleCotnroll = new MenuExampleCotnroll(this);
        //Tạo menu cha
        JMenuBar jMenuBar = new JMenuBar();
        //Tạo menu con
        JMenu jMenu_file = new JMenu("File");
        //Tạo item của menu con
        JMenuItem jMenuItem_open = new JMenuItem("Open");
        jMenuItem_open.addActionListener(menuExampleCotnroll);
        JMenuItem jMenu_exit = new JMenuItem("Exit");
        jMenu_exit.addActionListener(menuExampleCotnroll);

        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenu_exit);

        JMenu jMenu_help = new JMenu("Help");
        JMenuItem jMenuItem_welcom = new JMenuItem("Welcom");
        jMenuItem_welcom.addActionListener(menuExampleCotnroll);
        jMenu_help.add(jMenuItem_welcom);

        //Tao Label hien thi
        Font font = new Font("Arial", Font.BOLD, 40);
        jLabel = new JLabel();


        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);

        this.setJMenuBar(jMenuBar);

        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.add(jLabel, BorderLayout.CENTER);

    }

    public void setTextJLabel(String s) {
        this.jLabel.setText(s);
    }
}

