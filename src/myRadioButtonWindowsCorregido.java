import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class    myRadioButtonWindowsCorregido {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setBounds(10, 10, 300, 400);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        ButtonGroup osGB = new ButtonGroup();

        JRadioButton f = new JRadioButton("LINUX");
        f.setActionCommand("LINUX");
        JRadioButton g = new JRadioButton("WINDOWS");
        g.setActionCommand("WINDOWS");

        JRadioButton h = new JRadioButton("MANCITOSH");
        h.setActionCommand("MANCITOSH");

        osGB.add(f);
        osGB.add(g);
        osGB.add(h);

        mainPanel.add(f);
        mainPanel.add(g);
        mainPanel.add(h);

        JLabel linux = new JLabel();

            linux.setIcon(new ImageIcon("LINUX.jpg"));

        mainPanel.add(linux);


        JButton n = new JButton("OK");

        //Sirve para que elusuario vea que ha realizadola acción de pulsar el boton
        n.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Sirve para que una vez pulsado el botón te salga una ventana emergente de lo que has seleccionado

                String selected = osGB.getSelection().getActionCommand();
                JOptionPane.showMessageDialog(f, "Has seleccionado " + selected);
                linux.setIcon(new ImageIcon(selected + ".jpg"));

//               if (f.isSelected()){
//
//                   JOptionPane.showMessageDialog(j,"Has seleccionado Linux");
//               }else if (g.isSelected()){
//                   JOptionPane.showMessageDialog(j,"Has seleccionado Windows");
//               } else if (h.isSelected()) {
//                   JOptionPane.showMessageDialog(j,"Has seleccionado Mancitosh");
//
//               }

            }
        });
        mainPanel.add(n);


        j.setContentPane(mainPanel);
        j.repaint();
        j.revalidate();


    }
}
