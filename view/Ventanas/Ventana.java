package view.Ventanas;

import javax.swing.JFrame;

import javax.swing.WindowConstants;

public abstract class Ventana extends JFrame {

    public Ventana(String titulo) {
        super(titulo);
        inicializarVentana();
        inicializarContenido();
    }

    private void inicializarVentana() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
    }

    protected abstract void inicializarContenido();

    public void mostrar() {
        setVisible(true);
    }
}
