import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sextoEjercicio6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 550, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setBackground(Color.blue);
        panel.setLayout(new FlowLayout());

        JButton boton1 = new JButton("Button1");
        JButton boton2 = new JButton("Button2");
        JButton boton3 = new JButton("Button3");
        JButton long_name_button4 = new JButton("long-name-button4");
        JButton boton5 = new JButton("5");

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton radioButton = new JRadioButton("left to ritgh");
        radioButton.setSelected(true);
        buttonGroup.add(radioButton);
        panel.add(radioButton);
        JRadioButton radioButton2 = new JRadioButton("rith to left");
        radioButton2.setSelected(true);
        buttonGroup.add(radioButton2);
        panel.add(radioButton2);
        JButton boton6 = new JButton("APPLY ORIENTATION");
        panel.add(boton6);

        boton6.addActionListener(
                e -> {
                    FlowLayout flowLayout = (FlowLayout) panel.getLayout();
                    if (radioButton.isSelected()) {
                        flowLayout.setAlignment(FlowLayout.LEFT);
                    } else {
                        flowLayout.setAlignment(FlowLayout.RIGHT);
                    }
                    panel.repaint();
                    panel.revalidate();
                }
        );

        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(long_name_button4);
        panel.add(boton5);
        panel.add(boton6);


        frame.setContentPane(panel);
        frame.repaint();
        frame.revalidate();
    }
}
