import javax.swing.*;
import java.awt.*;

public class CalculatorNoMainWindow extends JFrame {

    private JPanel mainPanel;
    private JPanel textFieldPanel;
    private JPanel buttonsPanel;

    private JTextField numbersTextField;

    private JButton buttonDot;
    private JButton buttonDiv;
    private JButton buttonMult;
    private JButton buttonSubs;
    private JButton buttonSum;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;

    private JButton button8;
    private JButton button9;

    private JButton buttonDel;

    private JButton buttonReset;

    private JButton buttonEquals;

    public CalculatorNoMainWindow() {
        setBounds(
                10, 10, 500, 300
        );
        setTitle("Calculadora");

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(createMainPanel());
        repaint();
        revalidate();
    }

    private JPanel createMainPanel() {
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(createTextFieldPanel(), BorderLayout.NORTH);
        mainPanel.add(createButtonsPanel(), BorderLayout.CENTER);
        return mainPanel;
    }

    private JPanel createTextFieldPanel() {
        textFieldPanel = new JPanel();
        textFieldPanel.add(createNumbersTextField());
        return textFieldPanel;
    }

    private JTextField createNumbersTextField() {
        numbersTextField = new JTextField(20);
        numbersTextField.setText("0");
        numbersTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        return numbersTextField;
    }

    private JPanel createButtonsPanel() {
        buttonsPanel = new JPanel(new GridBagLayout());
        buttonsPanel.setBackground(Color.GRAY);
        buttonsPanel.add(createButton0(), addOnPosition(1, 3, 1));
        buttonsPanel.add(createButton1(), addOnPosition(0, 2, 1));
        buttonsPanel.add(createButton2(), addOnPosition(1, 2, 1));
        buttonsPanel.add(createButton3(), addOnPosition(2, 2, 1));
        buttonsPanel.add(createButton4(), addOnPosition(0, 1, 1));
        buttonsPanel.add(createButton5(), addOnPosition(1, 1, 1));
        buttonsPanel.add(createButton6(), addOnPosition(2, 1, 1));
        buttonsPanel.add(createButton7(), addOnPosition(0, 0, 1));
        buttonsPanel.add(createButton8(), addOnPosition(1, 0, 1));
        buttonsPanel.add(createButton9(), addOnPosition(2, 0, 1));

        buttonsPanel.add(createButtonSum(), addOnPosition(3, 1, 1));
        buttonsPanel.add(createButtonSubs(), addOnPosition(3, 2, 1));
        buttonsPanel.add(createButtonDot(), addOnPosition(0, 3, 1));
        buttonsPanel.add(createButtonDiv(), addOnPosition(2, 3, 1));
        buttonsPanel.add(createButtonMult(), addOnPosition(3, 3, 1));

        buttonsPanel.add(createButtonDel(), addOnPosition(3, 0, 1));
        buttonsPanel.add(createButtonReset(), addOnPosition(0, 4, 2));
        buttonsPanel.add(createButtonEquals(), addOnPosition(2, 4, 2));

        return buttonsPanel;
    }

    private JButton createButtonReset() {
        buttonReset = createButton("RESET");
        buttonReset.setBackground(Color.GREEN);
        return buttonReset;
    }

    private JButton createButtonEquals() {
        buttonEquals = createButton("=");
        buttonEquals.setBackground(Color.ORANGE);
        return buttonEquals;
    }

    private JButton createButtonDel() {
        buttonDel = createButton("DEL");
        buttonDel.setBackground(Color.GREEN);
        return buttonDel;
    }

    private JButton createButtonSum() {
        buttonSum = createButton("+");

        return buttonSum;
    }

    private JButton createButtonSubs() {
        buttonSubs = createButton("-");

        return buttonSubs;
    }

    private JButton createButtonDot() {
        buttonDot = createButton(".");

        return buttonDot;
    }

    private JButton createButtonDiv() {
        buttonDiv = createButton("/");

        return buttonDiv;
    }

    private JButton createButtonMult() {
        buttonMult = createButton("*");

        return buttonMult;
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
                new Insets(5, 5, 5, 5),
                0,
                0
        );
    }

    private JButton createButton0() {
        button0 = createButton("0");
        return button0;
    }

    private JButton createButton1() {
        button1 = createButton("1");
        return button1;
    }

    private JButton createButton2() {
        button2 = createButton("2");
        return button2;
    }

    private JButton createButton3() {
        button3 = createButton("3");
        return button3;
    }

    private JButton createButton4() {
        button4 = createButton("4");
        return button4;
    }

    private JButton createButton5() {
        button5 = createButton("5");
        return button5;
    }

    private JButton createButton6() {
        button6 = createButton("6");
        return button6;
    }

    private JButton createButton7() {
        button7 = createButton("7");
        return button7;
    }

    private JButton createButton8() {
        button8 = createButton("8");
        return button8;
    }

    private JButton createButton9() {
        button9 = createButton("9");
        return button9;
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(Color.LIGHT_GRAY);
        return button;
    }


    public static void main(String[] args) {

        CalculatorNoMainWindow frame = new CalculatorNoMainWindow();
    }
}


