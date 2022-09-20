import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cuartoEjercicio {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        JLabel label = new JLabel("Programming language Selected Java");
        label.setForeground(Color.blue);


        JComboBox<String> box = new JComboBox();
        box.setBackground(Color.green);
        box.addItem("C");
        box.addItem("C++");
        box.addItem("C#");
        box.addItem("Java");


        panel.add(label);
        panel.add(box);
        JButton button = new JButton("SHOW");
        button.setBackground(Color.yellow);
        button.setForeground(Color.blue);
//        button.addActionListener(new ActionListener() {
        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String selected = box.getItemAt(box.getSelectedIndex());
//                JOptionPane.showMessageDialog(frame, selected);
                label.setText("Programming language selected: " + selected);
            }
        });
        panel.add(button);


        frame.setContentPane(panel);
        frame.repaint();
        frame.revalidate();
    }
}
