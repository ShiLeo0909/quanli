package bocuc;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Flowlayout extends JFrame {
    public Flowlayout(){
        this.setTitle("cua so 2");
        this.setSize(1000,400);
        //căn cửa sổ vào giữa
        this.setLocationRelativeTo(null);

        // String layout
        FlowLayout flowlayout = new FlowLayout();
        this.setLayout(flowlayout);

        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");

        //Thêm thành phần
        this.add(jButton_1);
        this.add(jButton_2);
        this.add(jButton_3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Flowlayout();
    }
}
