package jtable;

import javax.swing.*;

public class VDJtable {
    JFrame f;

    VDJtable() {
        f = new JFrame();
        String data[][] = {{"101", "Phung Huu Uy", "6000"},
                {"102", "Dương", "8000"},
                {"103", "Tần", "7000"}};
        String column[] = {"ID", "NAME", "SALARY"};

        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);

        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new VDJtable();
    }
}
