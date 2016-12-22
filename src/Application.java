import javax.swing.*;
import java.awt.*;

/**
 * Application.java
 *
 * Main Entry Point
 *
 * @author Brandon Nguyen
 *         Github @ lrbn
 *         Email: lrbn86@gmail.com
 *
 * @version December 22, 2016
 *
 */
public class Application extends JFrame {

    public Application() {
        initUI();
    }

    private void initUI() {

        add(new Board());

        setSize(640, 480);
        setResizable(false);

        setTitle("Great Winter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Application ex = new Application();
                ex.setVisible(true);
            }

        });
    }
}