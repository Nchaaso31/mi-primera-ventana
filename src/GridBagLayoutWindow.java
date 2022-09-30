import javax.swing.*;
import java.awt.*;

public class GridBagLayoutWindow {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(10, 10, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.add(
                new JButton("Button 1"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));

        panel.add(new JButton("Button 2"),
                new GridBagConstraints(
                        1,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));panel.add(new JButton("Button 3"),
                new GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        panel.add(new JButton("Long named button 4"),
                new GridBagConstraints(
                        0,
                        1,
                        3,
                        1,
                        1.0,
                        4.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));

        panel.add(new JButton("5"),
                new GridBagConstraints(
                        1,
                        2,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));


        frame.setContentPane(panel);
        frame.repaint();
        frame.revalidate();
    }
}
