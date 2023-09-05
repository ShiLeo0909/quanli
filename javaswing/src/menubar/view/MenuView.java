package menubar.view;

import menubar.controller.MenuListener;
import menubar.model.MenuModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MenuView extends JFrame {
    private MenuModel mm;
    private JButton Add;
    private JButton Delete;

    public MenuView() {
        this.mm = new MenuModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Quản Lí Sinh Viên");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new MenuListener(this);

        Add = new JButton("App");
        Add.addActionListener(ac);

        Delete = new JButton("Delete");
        Delete.addActionListener(ac);

        //Tạo jPanel chứa Button JLabel
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(Add, BorderLayout.EAST);
        jPanel.add(Delete, BorderLayout.WEST);

        //set Layout
        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
    }

    public void add() {
    }

    public void delete() {

    }
}
