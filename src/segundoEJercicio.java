import javax.swing.*;
import java.awt.*;

public class segundoEJercicio {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 2000, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();
        mainpanel.setBackground(Color.white);
        mainpanel.setLayout(null);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 100, 100);
        panel1.setBackground(Color.black);


        JPanel panel2 = new JPanel();
        panel2.setBounds(200, 0, 100, 100);
        panel2.setBackground(Color.yellow);


        mainpanel.add(panel1);
        mainpanel.add(panel2);

        frame.setContentPane(mainpanel);
        frame.revalidate();
        frame.repaint();

    }

}
