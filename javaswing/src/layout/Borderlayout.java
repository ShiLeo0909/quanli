package bocuc;

import javax.swing.*;
import java.awt.*;

public class Borderlayout extends JFrame {
    public Borderlayout() {
        this.setTitle("cua so 2");
        this.setSize(1000, 400);
        //căn cửa sổ vào giữa
        this.setLocationRelativeTo(null);

        // Set layout
        BorderLayout borderLayout1 = new BorderLayout();
        BorderLayout borderLayout2 = new BorderLayout(15,15);

        this.setLayout(borderLayout2);
        //Tạo và thêm
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");

        this.add(jButton_1,BorderLayout.NORTH);
        this.add(jButton_2,BorderLayout.SOUTH);
        this.add(jButton_3,BorderLayout.CENTER);
        this.add(jButton_4,BorderLayout.WEST);
        this.add(jButton_5,BorderLayout.EAST);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Borderlayout();
    }
}
