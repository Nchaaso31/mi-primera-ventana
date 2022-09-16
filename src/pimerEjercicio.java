import javax.swing.*;
import java.awt.*;

public class pimerEjercicio {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10,10,500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();



        mainpanel.setBackground(Color.BLUE);

        JLabel label= new JLabel("USUARIO:");
        label.setForeground(Color.yellow);
        mainpanel.add(label);
        f.setContentPane(mainpanel);

        // Sirve para crear una cajita de texto
        JTextField Field= new JTextField(16);
        mainpanel.add(Field);
        Field.repaint();
        Field.revalidate();


        // JButton sire para crear un botón de enviar
        JButton button = new JButton("ACEPTAR");
        mainpanel.add(button);
        button.repaint();
        button.revalidate();

    }
}
