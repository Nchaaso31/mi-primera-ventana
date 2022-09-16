package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        // JFRAME sirve para crear la ventana
        JFrame f = new JFrame();

        // Para añadir las medidas de la ventana
        f.setBounds(10,10,200,300);

        // Que sea visible la ventana
        f.setVisible(true);

        // Para que aparezca la pestaña de cerrar
        // y tambien para que se cierre el proceso
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // JPanel sirve para crear el panel donde escribiremos el contenido de dentro de la ventana
        // Este es el panel principal
        // Con esto creamos el panel donde escribiremos nuestro texto
        JPanel mainpanel = new JPanel();

        // Setbackground
        // Añadiremos un color al fondo del panel
        mainpanel.setBackground(Color.green);

        // Este es un componente de tipo etiqueta
        // AÑADIMOS EL CONTENIDO DENTRO DEL PANEL
        JLabel label= new JLabel("HOLA MUNDO");

        // SetForeground
        //Esto nos permite cambiar el color de las letras
        label.setForeground(Color.yellow);

        //Añadimos la etiqueta al panel (Lo juntamos todo)
        mainpanel.add(label);

        // Hacemos que dentro del panel aparezcala etiqueta
        // Con esto se mostrará finalmente el contenido dentro del panel
        f.setContentPane(mainpanel);

    }

}
