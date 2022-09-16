import javax.swing.*;
import java.awt.*;

public class tercerEJercicio {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();

        mainpanel.setBackground(Color.blue);
//        mainpanel.setLayout(null);


        JRadioButton button = new JRadioButton("HOMBRE");
        button.setBounds(75, 50, 100, 30);
        JRadioButton button2 = new JRadioButton("MUJER");
        button2.setBounds(190, 50, 100, 30);

        JRadioButton button3 = new JRadioButton("NIÑO");
        button3.setBounds(305, 50, 100, 30);


        ButtonGroup group = new ButtonGroup();
        group.add(button);
        group.add(button2);
        group.add(button3);

        mainpanel.add(button);
        mainpanel.add(button2);
        mainpanel.add(button3);

        f.setLayout(null);
        f.setContentPane(mainpanel);

        JButton boton = new JButton("Aceptar");
        mainpanel.add(boton);

        boton.repaint();
        boton.revalidate();
    }
}
