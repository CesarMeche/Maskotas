package view.ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaCrearUsuario extends Ventana {
    private JTextField idTextField;
    private JTextField usernameTextField;
    private JPasswordField passwordField;

    public VentanaCrearUsuario(String titulo) {
        super(titulo);
    }

    protected void inicializarContenido() {
        JPanel panelDatos = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel label = new JLabel("Crear nuevo usuario");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Open Sans", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 10, 10, 10);
        panelDatos.add(label, gbc);

        JPanel formularioPanel = new JPanel();
        formularioPanel.setLayout(new GridBagLayout());

        JLabel idLabel = new JLabel("ID:");
        idTextField = new JTextField(20);
        addComponent(formularioPanel, idLabel, gbc, 0, 0);
        addComponent(formularioPanel, idTextField, gbc, 1, 0);

        JLabel usernameLabel = new JLabel("Username:");
        usernameTextField = new JTextField(20);
        addComponent(formularioPanel, usernameLabel, gbc, 0, 1);
        addComponent(formularioPanel, usernameTextField, gbc, 1, 1);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        addComponent(formularioPanel, passwordLabel, gbc, 0, 2);
        addComponent(formularioPanel, passwordField, gbc, 1, 2);

        JButton crearUsuarioButton = new JButton("Crear Usuario");
        crearUsuarioButton.setBackground(Color.BLUE);
        crearUsuarioButton.setForeground(Color.WHITE);
        crearUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tenemos que implementar esto también ;3");
                dispose();
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        formularioPanel.add(crearUsuarioButton, gbc);

        panelDatos.add(formularioPanel, gbc);

        getContentPane().add(panelDatos);
        panelDatos.setBackground(Color.cyan);
    }

    private void addComponent(JPanel panel, JLabel label, GridBagConstraints gbc, int column, int row) {
        gbc.gridx = column;
        gbc.gridy = row;
        panel.add(label, gbc);
    }

    private void addComponent(JPanel panel, JTextField textField, GridBagConstraints gbc, int column, int row) {
        gbc.gridx = column;
        gbc.gridy = row;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textField, gbc);
    }
}
