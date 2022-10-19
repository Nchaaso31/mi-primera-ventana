import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyCustomForm extends JFrame {
    private JPanel mainPanel;

    private JPanel labelWest;

    private JPanel butonspanell;

    private JButton buttonOption1;

    private JButton buttonOption2;

    private JButton buttonOption3;

    private JButton buttonOptionSave;

    private JPanel panel3;

    private JLabel labelOption1;

    private JLabel labelOption2;

    private JLabel labelOption3;

    private JLabel labelOption4;

    private JLabel labelOption5;

    private JCheckBox checkbocxName;

    private JCheckBox checkbocxAdress;

    private JLabel labelCity;

    private JCheckBox checkbocxDescription;

    private JTextField textfields1;

    private JTextField textfields2;

    private JTextField textfields3;


    private JTextArea textArea1;

    private JComboBox<String> comboBox1;

    private JRadioButton radioActive;

    private JRadioButton radioInactive;

    private JScrollPane scrollArea;
    private ButtonGroup buttonGrou;

    public MyCustomForm() {

        setBounds(
                10, 10, 600, 300
        );
        setTitle("My Custom Form");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(createMainPanel());
        repaint();
        revalidate();
    }


    private JPanel createMainPanel() {
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(createButtons(), BorderLayout.NORTH);
        mainPanel.add(createJLabelWest(), BorderLayout.WEST);
        mainPanel.add(panelCentral(), BorderLayout.CENTER);
        return mainPanel;
    }


    private JComboBox<String> createCombox() {
        comboBox1 = new JComboBox<>();
        comboBox1.setBackground(Color.green);
        comboBox1.addItem("Spain");
        comboBox1.addItem("France");
        comboBox1.addItem("UK");
        comboBox1.addItem("EEUU");
        comboBox1.addItem("Portugal");
        comboBox1.setEnabled(false);
        return comboBox1;
    }


    private JTextArea createArea1() {
        textArea1 = new JTextArea();
        textArea1.add(scrollArea1());
        textArea1.setText("DESCRIPTION");
        textArea1.setEnabled(false);
        return textArea1;
    }

    private JScrollPane scrollArea1() {
        scrollArea = new JScrollPane();
        return scrollArea;
    }


    private JTextField createTextfiel3() {
        textfields3 = new JTextField(20);
        textfields3.setHorizontalAlignment(SwingConstants.LEFT);
        textfields3.setBounds(10, 10, 80, 20);
        textfields3.setText("CITY");
        return textfields3;
    }

    private JTextField createTextfield2() {
        textfields2 = new JTextField(20);
        textfields2.setHorizontalAlignment(SwingConstants.LEFT);
        textfields2.setBounds(10, 10, 80, 20);
        textfields2.setText("ADDRESS");
        textfields2.setEnabled(false);
        return textfields2;
    }

    private JTextField createTextfiel1() {
        textfields1 = new JTextField(20);
        textfields1.setHorizontalAlignment(SwingConstants.LEFT);
        textfields1.setBounds(10, 10, 80, 20);
        textfields1.setText("NAME");
        textfields1.setEnabled(false);
        return textfields1;
    }


    private JPanel panelCentral() {
        panel3 = new JPanel(new GridBagLayout());
        panel3.add(createChekboxname(), addOnPositionCenter(0, 0, 1, 1));
        panel3.add(createChekboxAddress(), addOnPositionCenter(0, 1, 1, 1));
        panel3.add(labelCity(), addOnPositionCenter(0, 2, 5, 1));
        panel3.add(createChekboxDescription(), addOnPositionCenter(0, 3, 1, 1));
        panel3.add(createTextfiel1(), addOnPositionCenter(1, 0, 6, 1));
        panel3.add(createTextfield2(), addOnPositionCenter(1, 1, 6, 1));
        panel3.add(createTextfiel3(), addOnPositionCenter(1, 2, 5, 1));
        panel3.add(createArea1(), addOnPositionCenter(1, 3, 6, 3));
        panel3.add(createCombox(), addOnPositionCenter(6, 2, 1, 1)); //el problema es este tengo que poner 6 pero no me lo posiciona bien
        panel3.add(createButtonOptionSave(), addOnPositionCenter(6, 7, 1, 1));
        panel3.add(radioButtonActive(), addOnPositionCenter(1, 6, 1, 1));
        panel3.add(radioButtonInactive(), addOnPositionCenter(6, 6, 1, 1));


        return panel3;
    }


    private JCheckBox createChekboxDescription() {
        checkbocxDescription = new JCheckBox("Description");
        checkbocxDescription.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (checkbocxDescription.isSelected()){
                    textArea1.setEnabled(true);
                }else{
                    textArea1.setEnabled(false);
                }

            }
        });
        return checkbocxDescription;
    }

    private JLabel labelCity() {
        labelCity = new JLabel("City");
        return labelCity;
    }

    private JCheckBox createChekboxAddress() {
        checkbocxAdress = new JCheckBox("Address");
        checkbocxAdress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkbocxAdress.isSelected()){
                    textfields2.setEnabled(true);
                }else {
                    textfields2.setEnabled(false);
                }
            }
        });

        return checkbocxAdress;
    }

    private JCheckBox createChekboxname() {
        checkbocxName = new JCheckBox("Name");
        checkbocxName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkbocxName.isSelected()){
                    textfields1.setEnabled(true);
                }else {
                    textfields1.setEnabled(false);
                }
            }
        });
        return checkbocxName;
    }


    private JPanel createButtons() {
        butonspanell = new JPanel(new FlowLayout(FlowLayout.LEFT,20,10));
        butonspanell.setBackground(Color.BLUE);
        butonspanell.add(createButtonOption1(), addOnPosition(0, 0, 1));
        butonspanell.add(createButtonOption2(), addOnPosition(1, 0, 1));
        butonspanell.add(createButtonOption3(), addOnPosition(2, 0, 1));
        return butonspanell;
    }

    private JButton createButtonOptionSave() {
        buttonOptionSave = creaButton("Save");
        return buttonOptionSave;
    }

    private JButton createButtonOption1() {
        buttonOption1 = creaButton("Option1");
        return buttonOption1;

    }

    private JButton createButtonOption2() {
        buttonOption2 = creaButton("Option2");
        return buttonOption2;


    }

    private JButton createButtonOption3() {
        buttonOption3 = creaButton("Option3");
        return buttonOption3;

    }


    private JPanel createJLabelWest() {
        labelWest = new JPanel(new GridBagLayout());
        labelWest.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true), "Submenu"));
        labelWest.setPreferredSize(new Dimension(85, 10));
        labelWest.setBackground(Color.BLUE);
        labelWest.add(creaLabelOption1(), addOnPositionWest(0, 1, 1));
        labelWest.add(creaLabelOption2(), addOnPositionWest(0, 2, 1));
        labelWest.add(creaLabelOption3(), addOnPositionWest(0, 3, 1));
        labelWest.add(creaLabelOption4(), addOnPositionWest(0, 4, 1));
        labelWest.add(creaLabelOption5(), addOnPositionWest(0, 5, 1));

        return labelWest;
    }

    private JLabel creaLabelOption5() {
        labelOption5 = new JLabel("Option5");
        labelOption5.setForeground(Color.black);
        labelOption5.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                labelOption5.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                labelOption5.setForeground(Color.black);
            }
        });
        return labelOption5;

    }

    private JLabel creaLabelOption4() {
        labelOption4 = new JLabel("Option4");
        labelOption4.setForeground(Color.black);
        labelOption4.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                labelOption4.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                labelOption4.setForeground(Color.black);
            }
        });
        return labelOption4;

    }

    private JLabel creaLabelOption3() {
        labelOption3 = new JLabel("Option3");
        labelOption3.setForeground(Color.black);
        labelOption3.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                labelOption3.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                labelOption3.setForeground(Color.black);
            }
        });
        return labelOption3;
    }


    private JLabel creaLabelOption2() {
        labelOption2 = new JLabel("Option2");
        labelOption2.setForeground(Color.black);
        labelOption2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                labelOption2.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                labelOption2.setForeground(Color.black);
            }
        });
        return labelOption2;
    }

    private JLabel creaLabelOption1() {
        labelOption1 = new JLabel("Option1");
        labelOption1.setForeground(Color.black);
        labelOption1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                labelOption1.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                labelOption1.setForeground(Color.black);
            }
        });
        return labelOption1;
    }


    private GridBagConstraints addOnPosition(int x, int y, int width) {
        return new GridBagConstraints(
                x,
                y,
                width,
                1,
                1,
                1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1),
                0,
                0
        );
    }

    private GridBagConstraints addOnPositionCenter(int x, int y, int width, int height) {
        return new GridBagConstraints(
                x,
                y,
                width,
                height,
                1,
                1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1),
                0,
                0
        );
    }

    private GridBagConstraints addOnPositionWest(int x, int y, int width) {
        return new GridBagConstraints(
                x,
                y,
                width,
                1,
                1,
                1,
                GridBagConstraints.CENTER,
                GridBagConstraints.CENTER,
                new Insets(1, 8, 1, 1),
                0,
                0
        );
    }

    private JButton creaButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(Color.LIGHT_GRAY);
        return button;
    }


    private ButtonGroup buttonGroups(){
        buttonGrou = new ButtonGroup();
        buttonGrou.add(radioActive);
        buttonGrou.add(radioInactive);
        return buttonGrou;
    }
    private JRadioButton radioButtonActive() {
        radioActive = new JRadioButton("Active");
        radioActive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   comboBox1.setEnabled(true);
            }
        });
        return radioActive;

    }


    private JRadioButton radioButtonInactive() {
        radioInactive = new JRadioButton("Inactive");
        radioInactive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 comboBox1.setEnabled(false);
            }
        });
        return radioInactive;
    }



    public static void main(String[] args) {
        MyCustomForm frame = new MyCustomForm();
    }
}


