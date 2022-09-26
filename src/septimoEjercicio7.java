import javax.swing.*;
import java.awt.*;

public class septimoEjercicio7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 550, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setBackground(Color.blue);
        panel.setLayout(new BorderLayout(10,10));

        JButton northBorder = new JButton("Hidde North Border");
        JButton westBorder = new JButton("Hidde West Border");
        JButton centerBorder = new JButton("Hidde Center Border");
        JButton eastBorder = new JButton("Hidde East Border");
        JButton southBorder = new JButton("Hidde South Border");

        panel.add(northBorder, BorderLayout.NORTH);
        panel.add(westBorder, BorderLayout.WEST);
        panel.add(centerBorder, BorderLayout.CENTER);
        panel.add(eastBorder, BorderLayout.EAST);
        panel.add(southBorder, BorderLayout.SOUTH);

        frame.setContentPane(panel);
        frame.repaint();
        frame.revalidate();
    }
}
