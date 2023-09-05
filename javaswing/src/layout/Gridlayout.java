package bocuc;

import javax.swing.*;
import java.awt.*;

public class Gridlayout extends JFrame {
    public Gridlayout(){
        this.setTitle("cua so 2");
        this.setSize(1000,400);
        //căn cửa sổ vào giữa
        this.setLocationRelativeTo(null);

        // Set layout
        GridLayout gridLayout1 = new GridLayout();
        GridLayout gridLayout2 = new GridLayout(4,4);
        GridLayout gridLayout3 = new GridLayout(4,4,25,25);
        this.setLayout(gridLayout3);

        //Tạo và thêm
        for (int i = 0; i < 17; i++) {
            JButton jButton = new JButton(i + " ");
            this.add(jButton);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Gridlayout();
    }
}
