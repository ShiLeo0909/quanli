package imageicon;
import javax.swing.*;
import java.awt.*;

public class ImageIconExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("ImageIcon Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo một ImageIcon từ một tệp hình ảnh
        ImageIcon icon = new ImageIcon("D:\\java\\javaswing\\src\\imageicon\\Ảnh chụp màn hình 2023-06-13 214426.png");

        // Tạo một JLabel để hiển thị ImageIcon
        JLabel label = new JLabel(icon);

        // Thêm JLabel vào JFrame
        frame.getContentPane().add(label, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
