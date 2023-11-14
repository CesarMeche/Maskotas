package view.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class AniadirMascota extends Ventana {
    JPanel main;

    public AniadirMascota(String titulo) {
        super(titulo);
    }

    @Override
    protected void inicializarContenido() {
        main = new JPanel(new GridLayout(4, 2));
        JLabel label = new JLabel("Añadir Mascota");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel nombre = new JLabel("Nombre:");
        nombre.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField nombretxt = new JTextField();

        JLabel edad = new JLabel("Edad:");
        edad.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField edadtxt = new JTextField();

        JLabel genero = new JLabel("Genero:");
        genero.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField generotxt = new JTextField();
        main.add(label);
        main.add(nombre);
        main.add(nombretxt);
        main.add(edad);
        main.add(edadtxt);
        main.add(genero);
        main.add(generotxt);

        JButton button2 = new JButton("Cancelar");
        JButton button = new JButton("Siguiente");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevoPanel();

            }
        });
        main.add(button2);
        main.add(button);
        add(label, BorderLayout.NORTH);
        add(main, BorderLayout.CENTER);

    }

    private void nuevoPanel() {
        remove(main);
        main = new JPanel(new GridLayout(3, 2));

        JLabel idLabel = new JLabel("Especie:");
        idLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel idLabel2 = new JLabel("Fecha de nacimiento:");
        idLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField idTextField = new JTextField();
        String[] especies = { "Perro", "Gato", "pato", "Oveja", "Vaca",
                "Caballo" };
        JComboBox<String> combo = new JComboBox<String>(especies);
        main.add(idLabel);
        main.add(combo);
        main.add(idLabel2);
        main.add(idTextField);

        JButton button2 = new JButton("Cancelar");
        JButton button = new JButton("Finalizar");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviareDatos();
            }
        });
        main.add(button2);
        main.add(button);
        add(main, BorderLayout.CENTER);
        revalidate();
    }

    private void enviareDatos() {
        System.out.println("Tenemos que implentar esto jjsjsjsfddsfgasd");
        dispose();
    }
}
