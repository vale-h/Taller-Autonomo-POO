import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VeentanaSaludo {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("App de Saludo ICC490");
        ventana.setSize(600,800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(50,30,200,25);

        JButton botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(270,30,100,25);

        JLabel etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(50,80,300,25);

        botonSaludar.addActionListener(e -> {
            String nombre = campoTexto.getText();
            if ( nombre.trim () . isEmpty () ) {
                JOptionPane.showMessageDialog (null , " Por favor ingresa tu nombre.") ;
            } else {
                etiquetaSaludo.setText (" Hola! " + nombre + " :)") ;
            }
        });

        campoTexto.addKeyListener(new KeyAdapter() {
            public void keyPressed ( KeyEvent e ) {
                if ( e . getKeyCode () == KeyEvent . VK_ENTER ) {
                    botonSaludar . doClick () ;
                    }
            }
                });

        ventana.add(botonSaludar);
        ventana.add(etiquetaSaludo);
        ventana.add(campoTexto);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        ventana.setBackground(Color.blue);
        botonSaludar.setBackground(Color.magenta);
        campoTexto.setBackground(Color.pink);
        campoTexto.setFont(new Font("Times New Roman", Font.BOLD, 20));
    }
}
