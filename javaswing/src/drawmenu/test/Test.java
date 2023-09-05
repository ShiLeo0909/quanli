package drawmenu.test;

import com.sun.tools.javac.Main;
import drawmenu.menuview.MenuExampleView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
           try{
               UIManager.setLookAndFeel((UIManager.getSystemLookAndFeelClassName()));
               new MenuExampleView();
           }catch(Exception ex){
               ex.printStackTrace();
           }
    }
}
