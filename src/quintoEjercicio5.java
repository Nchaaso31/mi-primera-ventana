import javax.swing.*;
import java.awt.*;

public class quintoEjercicio5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);

        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.green,1,true), "SEACH"));
//        panel1.setBorder(BorderFactory.createTitledBorder("Seach"));
        panel1.setBounds(50, 50, 200, 300);


        JRadioButton button = new JRadioButton("By name");
        button.setBounds(50, 60, 100, 30);

        JRadioButton button2 = new JRadioButton("By ID");
        button2.setBounds(50, 90, 100, 30);


        panel.add(panel1);
        panel1.add(button);
        panel1.add(button2);


        panel.setLayout(null);
        panel1.setLayout(null);
        frame.setContentPane(panel);
        frame.repaint();
        frame.revalidate();

    }
}
