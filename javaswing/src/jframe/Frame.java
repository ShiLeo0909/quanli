package jframe;

import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("frame đầu tiên");
        jf.setSize(600,400);

        // THoát ra khỏi chương trình khi đóng cửa sổ
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Cho phép hiển thị(để cuối cùng)
        jf.setVisible(true);
    }
}
