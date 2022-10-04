import javax.swing.*;
import java.awt.*;

public class GridBagLayoutWindow4 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(10, 10, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());

        panel.add(new JLabel("Full name"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0));


        panel.add(new JLabel("Adress"),
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0));

        panel.add(new JLabel("Phone"),
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0));
        panel.add(new JLabel("Description"),
                new GridBagConstraints(
                        0,
                        4,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0));

        panel.add(new JTextField(8),
                new GridBagConstraints(
                        1,
                        0,
                        3,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0));


        panel.add(new JLabel("Street"),
                new GridBagConstraints(
                        1,
                        1,
                        1,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0));

        panel.add(new JPasswordField(),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0));

        panel.add(new JTextField(),
                new GridBagConstraints(
                        1,
                        3,
                        1,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0));
        panel.add(new JScrollPane(new JTextField()),
                new GridBagConstraints(
                        1,
                        4,
                        3,
                        1,
                        1.0,
                        12,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(5,5,5,5),
                        0,
                        0));



        panel.add(new JLabel("City"),
                new GridBagConstraints(
                        2,
                        1,
                        1,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0));

        panel.add(new JTextField(),
                new GridBagConstraints(
                        2,
                        2,
                        1,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0));


        panel.add(new JLabel("Age"),
                new GridBagConstraints(
                        2,
                        3,
                        1,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0));



        panel.add(new JLabel("Zip Code"),
                new GridBagConstraints(
                        3,
                        1,
                        1,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0));

        panel.add(new JTextField(),
                new GridBagConstraints(
                        3,
                        2,
                        1,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0));


        panel.add(new JTextField(),
                new GridBagConstraints(
                        3,
                        3,
                        1,
                        1,
                        1.0,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0));



        panel.add(new JButton("Submit"),
                new GridBagConstraints(
                        2,
                        5,
                        2,
                        1,
                        1,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(5,5,5,5),
                        0,
                        0));




        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }
}
