import javax.swing.*;
import java.awt.*;

public class Calculator2Wiindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("CALCULADORA");
        frame.setVisible(true);
        frame.setBounds(10, 10, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
//        PAra que no haya espacio entre los paquetes
        panel.setOpaque(false);
        panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.cyan,3,true)));

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.lightGray);
        panel.setLayout(new BorderLayout(10,10));
        panel.add(panel1, BorderLayout.NORTH);
        JLabel label = new JLabel("CALCULADORA");
        panel1.add(label);
        JTextField textField = new JTextField(20);
        textField.setBounds(10, 10, 100, 40);
        panel1.add(textField);


        JPanel panel2 = new JPanel();
        panel2.setOpaque(false);
        panel2.setBackground(Color.lightGray);
        panel.add(panel2, BorderLayout.CENTER);
        panel2.setLayout(new GridLayout(4, 4, 10, 10));


        JButton siete = new JButton("7");
        panel2.add(siete);
        JButton ocho = new JButton("8");
        panel2.add(ocho);
        JButton nueve = new JButton("9");
        panel2.add(nueve);
        JButton del = new JButton("DEL");
        panel2.add(del);
        del.setBackground(Color.blue);
        del.setForeground(Color.white);
        JButton cuatro = new JButton("4");
        panel2.add(cuatro);
        JButton cinco = new JButton("5");
        panel2.add(cinco);
        JButton seis = new JButton("6");
        panel2.add(seis);
        JButton mas = new JButton("+");
        panel2.add(mas);
        JButton uno = new JButton("1");
        panel2.add(uno);
        JButton dos = new JButton("2");
        panel2.add(dos);
        JButton tres = new JButton("3");
        panel2.add(tres);
        JButton menos = new JButton("-");
        panel2.add(menos);
        JButton punto = new JButton(".");
        panel2.add(punto);
        JButton cero = new JButton("0");
        panel2.add(cero);
        JButton division = new JButton("/");
        panel2.add(division);
        JButton multipli = new JButton("X");
        panel2.add(multipli);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.lightGray);
//        Ajustar el tamaño de las areas laterales
        panel3.setOpaque(false);
        panel3.setPreferredSize(new Dimension(0,50));
        panel.add(panel3, BorderLayout.SOUTH);
        panel3.setLayout(new GridLayout(1,2, 10, 10));
        JButton reset = new JButton("RESET");
        panel3.add(reset);
        reset.setBackground(Color.BLUE);
        reset.setForeground(Color.white);
        JButton igual = new JButton("=");
        panel3.add(igual);
        igual.setBackground(Color.ORANGE);
        igual.setForeground(Color.WHITE);



        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }
}


