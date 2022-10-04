import javax.swing.*;
import java.awt.*;

public class GridBagLayoutWindow2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(10, 10, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel(new GridBagLayout());

       panel.add(new JTextArea("Area texto"),
               new GridBagConstraints(
                       0,
                       0,
//                       lo que ocupa de ancho y de alto widht y height
                       2,
                       2,
                       5,
                       1,
                       GridBagConstraints.CENTER,
                       GridBagConstraints.BOTH,
                       new Insets(5,5,5,5),
                       0,
                       0));

        panel.add(
                new JButton("Boton 1"),
                new GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0
                ));

            panel.add(new JButton("Botón 2"),
                    new GridBagConstraints(
                            2,
                            1,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.NORTH,
                            GridBagConstraints.HORIZONTAL,
                            new Insets(5,5,5,5),
                            0,
                            0
                    ));
            panel.add(new JButton("Botón 3"),
                    new GridBagConstraints(
                            0,
                            2,
                            1,
                            1,
                            1.0,
                            0.25,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.HORIZONTAL,
                            new Insets(5,5,5,5),
                            0,
                            0));


        panel.add(new JTextField("Campo texto"),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        4,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0));




        panel.add(new JButton("Botón 4"),
                    new GridBagConstraints(
                            2,
                            2,
                            1,
                            1,
                            1.0,
                            0.25,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.HORIZONTAL,
                            new Insets(5,5,5,5),
                            0,
                            0
                    ));








        frame.setContentPane(panel);
        frame.repaint();
        frame.revalidate();

    }
}