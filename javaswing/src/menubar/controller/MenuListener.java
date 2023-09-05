package menubar.controller;

import menubar.view.MenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListener implements ActionListener {
    private MenuView mv;

    public MenuListener(MenuView mv) {
        this.mv = mv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        System.out.println();
        System.out.println("Bạn đã nhấn nút!" + src);

        if (src.equals("Add")) {
            this.mv.add();
        } else if (src.equals("Delete")) {
            this.mv.delete();
        }
    }
}
