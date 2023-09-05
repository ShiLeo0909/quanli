package jtextarea.view;

import jtextarea.controll.TimKiemListener;
import jtextarea.model.TimKiemModel;

import javax.swing.*;
import java.awt.*;

public class TimKiemView extends JFrame {

    private TimKiemModel timKiemModel;
    private JTextField jTextField_tuKhoa;
    private JTextArea jTextArea_vanBan;
    private JLabel jLabel_ketQua;

    public TimKiemView() throws HeadlessException {
        this.timKiemModel = new TimKiemModel();
        this.init();
        this.setVisible(true);

    }

    private void init() {
        this.setTitle("Tim Kiem");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 40);

        JLabel jLabel_vanBan = new JLabel("Văn Bản");
        jLabel_vanBan.setFont(font);
        jTextArea_vanBan = new JTextArea(100, 100);
        jTextArea_vanBan.setFont(font);


        //Center
        JPanel jPanel_center = new JPanel();
        jPanel_center.setLayout(new GridLayout(2, 1, 20, 10));
        jPanel_center.add(jLabel_vanBan);
        jPanel_center.add(jTextArea_vanBan);

        //Footer
        TimKiemListener timKiemListener = new TimKiemListener(this);

        JLabel jLabel_tuKhoa = new JLabel("Từ Khóa");
        jLabel_tuKhoa.setFont(font);
        jTextField_tuKhoa = new JTextField();
        jTextField_tuKhoa.setFont(font);

        jLabel_ketQua = new JLabel();
        jLabel_ketQua.setForeground(Color.RED);
        jLabel_ketQua.setFont(font);

        JButton jButton_thongKe = new JButton("Thống Kê");
        jButton_thongKe.setFont(font);
        jButton_thongKe.addActionListener(timKiemListener);
        jButton_thongKe.setBackground(Color.GREEN);
        jButton_thongKe.setBorderPainted(false);
        jButton_thongKe.setOpaque(true);


        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2, 2, 20, 20));
        jPanel_footer.add(jLabel_tuKhoa);
        jPanel_footer.add(jTextField_tuKhoa);
        jPanel_footer.add(jButton_thongKe);
        jPanel_footer.add(jLabel_ketQua);




        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan, BorderLayout.NORTH);
        this.add(jPanel_center, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);

    }
    public void timKiem(){
        this.timKiemModel.setAnBan(jTextArea_vanBan.getText());
        this.timKiemModel.setTuKhoa(jTextField_tuKhoa.getText());
        this.timKiemModel.timKiem();
        this.jLabel_ketQua.setText(this.timKiemModel.getKetQua());
    }
}