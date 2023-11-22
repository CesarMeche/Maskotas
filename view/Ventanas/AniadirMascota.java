package view.ventanas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Properties;

import org.jdatepicker.DateLabelFormatter;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.UtilDateModel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.SwingConstants;

import org.jdatepicker.DateLabelFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;

import presenter.Presentador;

public class AniadirMascota extends Ventana {
    JPanel main;
    JTextField nombretxt;
    JTextField edadtxt;
    JTextField generotxt;

    public AniadirMascota(String titulo, Presentador presentador) {
        super(titulo, presentador);
    }

    @Override
    protected void inicializarContenido() {
        main = new JPanel(new GridLayout(3, 2));
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
        main.add(genero);
        main.add(generotxt);

        JButton button2 = new JButton("Cancelar");
        JButton button = new JButton("Siguiente");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });
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
        UtilDateModel model = new UtilDateModel();
        Properties properties = new Properties();
        JDatePicker fechaDatePicker = new JDatePickerImpl(new JDatePanelImpl(model, properties),
                new DateLabelFormatter());
        String[] especies = { "Perro", "Gato", "pato", "Oveja", "Vaca", "Caballo" };
        JComboBox<String> combo = new JComboBox<String>(especies);
        main.add(idLabel);
        main.add(combo);
        main.add(idLabel2);
        main.add((Component) fechaDatePicker);

        JButton button2 = new JButton("Cancelar");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(main);
                inicializarContenido();
                dispose();

            }
        });
        JButton button = new JButton("Finalizar");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                getPresentador().aniadirMascota(nombretxt.getText(), generotxt.getText(),
                        (Date) fechaDatePicker.getModel().getValue(),
                        combo.getSelectedItem().toString(),
                        getPresentador().getUsuario().getUsername());
            }
        });
        main.add(button2);
        main.add(button);
        add(main, BorderLayout.CENTER);
        revalidate();
    }
}
