package view.ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import presenter.Presentador;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu extends Ventana {
    private JTextField campoUsuario;
    private JTextField campocontrasenia;

    public VentanaMenu(String titulo, Presentador presentador) {
        super(titulo, presentador);
    }

    @Override
    protected void inicializarContenido() {

        JPanel panelDatos = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        JLabel mensajeBienvenida = new JLabel("Ingresa tus datos de acceso.");
        mensajeBienvenida.setFont(new Font("Imprima", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 10, 10, 10);
        panelDatos.add(mensajeBienvenida, gbc);

        JLabel labelUsuario = new JLabel("Ingrese su usuario");
        labelUsuario.setFont(new Font("Bold", Font.PLAIN, 11));
        campoUsuario = new JTextField(20);

        JLabel labelcontrasenia = new JLabel("Ingrese su contrasenia");
        labelcontrasenia.setFont(new Font("Bold", Font.PLAIN, 11));

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
        botonEnviar.setFont(new Font("Inter", Font.PLAIN, 12));
        botonEnviar.setBackground(Color.decode("#FDBF85"));
        botonEnviar.setForeground(Color.black);
        botonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getPresentador().login(campoUsuario.getText(), campocontrasenia.getText());

            }
        });

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panelDatos.add(botonEnviar, gbc);

        JButton botonCrearUsuario = new JButton("Crear Usuario");
        botonCrearUsuario.setFont(new Font("Inter", Font.PLAIN, 12));
        botonCrearUsuario.setBackground(Color.decode("#FDBF85"));
        botonCrearUsuario.setForeground(Color.black);
        botonCrearUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaCrearUsuario ventanaCrearUsuario = new VentanaCrearUsuario("Crear Usuario", getPresentador());
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
        panelDatos.setBackground(Color.white);
        panelPrincipal.setBackground(Color.decode("#94C8F8")); // Establecer el color de fondo aquí

        getContentPane().add(panelPrincipal);

        getContentPane().add(panelPrincipal);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

}