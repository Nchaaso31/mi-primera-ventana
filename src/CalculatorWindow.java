import javax.swing.*;
import java.awt.*;

public class CalculatorWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("CALCULADORA");
        frame.setVisible(true);
        frame.setBounds(10,10,500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        panel.setLayout(new BorderLayout(10,10));
        panel.add(panel1, BorderLayout.NORTH);
        JLabel calculadora = new JLabel("Calculadora");
        panel1.add(calculadora);
        JTextField textField = new JTextField(20);
        textField.setBounds(10,10,200,20);
        panel1.add(textField);


        JPanel panel2 = new JPanel();
        panel.add(panel2, BorderLayout.CENTER);
        panel2.setLayout(new GridLayout(5,4,10,10));

        JButton rtc = new JButton("Rtc");
        panel2.add(rtc);
        JButton ce = new JButton("CE");
        panel2.add(ce);
        JButton cl = new JButton("CL");
        panel2.add(cl);
        JButton masMenos = new JButton("+/-");
        panel2.add(masMenos);
        JButton siete = new JButton("7");
        panel2.add(siete);
        JButton ocho = new JButton("8");
        panel2.add(ocho);
        JButton nueve = new JButton("9");
        panel2.add(nueve);
        JButton division = new JButton("/");
        panel2.add(division);
        JButton cuatro = new JButton("4");
        panel2.add(cuatro);
        JButton cinco = new JButton("5");
        panel2.add(cinco);
        JButton seis = new JButton("6");
        panel2.add(seis);
        JButton por = new JButton("X");
        panel2.add(por);
        JButton uno = new JButton("1");
        panel2.add(uno);
        JButton dos = new JButton("2");
        panel2.add(dos);
        JButton tres = new JButton("3");
        panel2.add(tres);
        JButton menos = new JButton("-");
        panel2.add(menos);
        JButton cero = new JButton("0");
        panel2.add(cero);
        JButton punto = new JButton(".");
        panel2.add(punto);
        JButton igual = new JButton("=");
        panel2.add(igual);
        JButton mas = new JButton("+");
        panel2.add(mas);



        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }
}
