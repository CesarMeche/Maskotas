package view.ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class VentanaCrearUsuario extends Ventana {
    private JPanel panel;
    private JTextField idTextField;
    private JTextField usernameTextField;
    private JPasswordField passwordField;

    public VentanaCrearUsuario(String titulo) {
        super(titulo);
    }

    protected void inicializarContenido() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Crear nuevo usuario");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel formularioPanel = new JPanel();
        formularioPanel.setLayout(new GridLayout(3, 2));

        JLabel idLabel = new JLabel("ID:");
        idTextField = new JTextField();

        JLabel usernameLabel = new JLabel("Username:");
        usernameTextField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        formularioPanel.add(idLabel);
        formularioPanel.add(idTextField);
        formularioPanel.add(usernameLabel);
        formularioPanel.add(usernameTextField);
        formularioPanel.add(passwordLabel);
        formularioPanel.add(passwordField);

        JButton crearUsuarioButton = new JButton("Crear Usuario");
        crearUsuarioButton.setBackground(Color.BLUE);
        crearUsuarioButton.setForeground(Color.WHITE);
        crearUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí debes agregar la lógica para crear el usuario con los datos ingresados
                int id = Integer.parseInt(idTextField.getText());
                String username = usernameTextField.getText();
                String password = new String(passwordField.getPassword());
                // Luego, utiliza estos valores para crear el usuario
            }
        });

        panel.add(label, BorderLayout.NORTH);
        panel.add(formularioPanel, BorderLayout.CENTER);
        panel.add(crearUsuarioButton, BorderLayout.SOUTH);

        getContentPane().add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
