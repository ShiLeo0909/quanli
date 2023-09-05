package drawmenu.menucontroll;

import drawmenu.menuview.MenuExampleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExampleCotnroll implements ActionListener {
    private MenuExampleView menuExampleView;

    public MenuExampleCotnroll(MenuExampleView menuExampleView) {
        this.menuExampleView = menuExampleView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if(button.equals("Open")){
            this.menuExampleView.setTextJLabel("Bạn đã nhấn Open");
        }else if(button.equals("Welcom")){
            this.menuExampleView.setTextJLabel("Bạn đã nhấn Welcom");
        }else if(button.equals("Exit")){
            System.exit(0);
        }
    }
}
