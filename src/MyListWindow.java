import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class MyListWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 500, 300
        );
        f.setTitle("GridBagWindow");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel labelPanel = new JPanel();
        JLabel jListLabel = new JLabel("JList", SwingConstants.CENTER);
        jListLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
        jListLabel.setPreferredSize(new Dimension(200, 80));
        jListLabel.setBorder(BorderFactory.createLoweredBevelBorder());
        labelPanel.add(jListLabel);
        jListLabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                jListLabel.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                jListLabel.setForeground(Color.black);
            }
        });


        mainPanel.add(labelPanel, BorderLayout.NORTH);

        DefaultListModel<String> peopleModel = new DefaultListModel<>();
        peopleModel.addElement("Christian David");
        peopleModel.addElement("Ana Milena");


        JPanel listPanel = new JPanel(new BorderLayout());
        JPanel addOptionPanel = new JPanel();
        JTextField addPersonTextField = new JTextField(20);
        addOptionPanel.add(addPersonTextField);

        JButton addButton = new JButton("Agregar");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String person = addPersonTextField.getText();
                if (person.isBlank()) {
                    JOptionPane.showMessageDialog(f,
                            "Debe introducir un nombre de persona"
                    );
                } else {
                    peopleModel.addElement(person);
                    addPersonTextField.setText("");
                }

            }
        });

        addOptionPanel.add(addButton);

        listPanel.add(addOptionPanel, BorderLayout.NORTH);
        JList<String> peopleList = new JList<>();

        peopleList.setModel(peopleModel);

        listPanel.add(new JScrollPane(peopleList), BorderLayout.CENTER);

        mainPanel.add(listPanel, BorderLayout.CENTER);
        JPanel buttonsPanel = new JPanel();
        JButton deleteButton = new JButton("Eliminar");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selected = peopleList.getSelectedIndex();
                peopleModel.removeElementAt(selected);
            }
        });
        buttonsPanel.add(deleteButton);
        JButton clearButton = new JButton("Borrar lista");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                peopleModel.clear();
            }
        });
        buttonsPanel.add(clearButton);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);


        JPanel panl2 = new JPanel();
        JLabel labelAñadir = new JLabel();
        labelAñadir.setFont(new Font("Calibri", Font.PLAIN, 6));
        labelAñadir.setPreferredSize(new Dimension(100, 40));
        labelAñadir.setBorder(BorderFactory.createLoweredBevelBorder());
//        labelAñadir.
        panl2.add(labelAñadir);
        labelPanel.add(panl2);

        peopleList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                String valor = peopleList.getSelectedValue();
                labelAñadir.setText("Se ha agregado un nuevo elemento: " + valor);
            }
        });


        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }
}
