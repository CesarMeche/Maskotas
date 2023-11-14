package view.ventanas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu extends Ventana {
    private JTextField campoUsuario;
    private JTextField campocontrasenia;

    public VentanaMenu(String titulo) {
        super(titulo);
    }

    @Override
    protected void inicializarContenido() {

        JPanel panelDatos = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        JLabel mensajeBienvenida = new JLabel("¡Bienvenido! Por favor, ingrese sus datos de acceso.");
        mensajeBienvenida.setFont(new Font("Open Sans", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 10, 10, 10);
        panelDatos.add(mensajeBienvenida, gbc);

        JLabel labelUsuario = new JLabel("Ingrese su usuario");
        labelUsuario.setFont(new Font("Open Sans", Font.PLAIN, 16));
        campoUsuario = new JTextField(20);

        JLabel labelcontrasenia = new JLabel("Ingrese su contrasenia");
        labelcontrasenia.setFont(new Font("Open Sans", Font.PLAIN, 16));

        campocontrasenia = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panelDatos.add(labelUsuario, gbc);
        gbc.gridx = 1;
        panelDatos.add(campoUsuario, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panelDatos.add(labelcontrasenia, gbc);
        gbc.gridx = 1;
        panelDatos.add(campocontrasenia, gbc);

        JButton botonEnviar = new JButton("Ingresar");
        botonEnviar.setFont(new Font("Open Sans", Font.PLAIN, 16));
        botonEnviar.setBackground(Color.black);
        botonEnviar.setForeground(Color.white);
        botonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(
                        "hola davidaaaa que diga muindo skhdskjhfsdkjfbglskdfhvgolabvoibajnvcoanvkjsdpovjndwsohvp;soadnvojhdafovij");
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panelDatos.add(botonEnviar, gbc);

        JButton botonCrearUsuario = new JButton("Crear Usuario");
        botonCrearUsuario.setFont(new Font("Open Sans", Font.PLAIN, 16));
        botonCrearUsuario.setBackground(Color.black);
        botonCrearUsuario.setForeground(Color.white);
        botonCrearUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaCrearUsuario ventanaCrearUsuario = new VentanaCrearUsuario("Crear Usuario");
                ventanaCrearUsuario.mostrar();
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panelDatos.add(botonCrearUsuario, gbc);

        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panelPrincipal.add(panelDatos, gbc);
        panelDatos.setBackground(Color.yellow);
        panelPrincipal.setBackground(Color.green); // Establecer el color de fondo aquí

        getContentPane().add(panelPrincipal);

        getContentPane().add(panelPrincipal);
    }

}