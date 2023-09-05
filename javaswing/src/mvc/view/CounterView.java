package mvc.view;

import mvc.controller.CounterListener;
import mvc.model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private CounterModel counterModel;
    private JButton jButton_up;
    private JButton jButton_down;
    private JButton jButton_reset;
    private JLabel jLabel_value;

    public CounterView() {
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);

    }
    //Hàm tọa init
    public void init() {
        this.setTitle("BBB");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new CounterListener(this);

        // Tạo nút
        jButton_up = new JButton("Up");
        jButton_up.addActionListener(ac);

        jButton_down = new JButton("Down");
        jButton_down.addActionListener(ac);

        jButton_reset = new JButton("Reset");
        jButton_reset.addActionListener(ac);

        jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);

        //Tạo màu
        // Tạo một màu nền tùy chỉnh
        Color color = new Color(100, 150, 200);

        // Tạo một màu chữ tùy chỉnh
        Color color1 = Color.WHITE;

        jButton_up.setBackground(color);
        jButton_down.setBackground(color);
        jButton_reset.setBackground(color1);
        jLabel_value.setForeground(color);

        // Tùy chỉnh độ lớn nhỏ của chữ
        Font font =  jLabel_value.getFont().deriveFont(20.0f);
        jLabel_value.setFont(font);
        jButton_up.setFont(font);


        //Tạo jPanel chứa Button JLabel
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jLabel_value, BorderLayout.CENTER);
        jPanel.add(jButton_up, BorderLayout.WEST);
        jPanel.add(jButton_down, BorderLayout.EAST);
        jPanel.add(jButton_reset, BorderLayout.SOUTH);

        //set Layout
        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
    }

    public void increment() {
        this.counterModel.incresment();
        this.jLabel_value.setText(this.counterModel.getValue() + "");
    }

    public void decrement() {
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue() + "");
    }
    public void reset(){
        this.counterModel.reset();
        this.jLabel_value.setText(this.counterModel.getValue()+ "");
    }
}
