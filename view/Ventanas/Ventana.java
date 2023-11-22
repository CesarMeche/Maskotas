package view.ventanas;

import javax.swing.JFrame;

import javax.swing.WindowConstants;

import presenter.Presentador;

public abstract class Ventana extends JFrame {

    public Presentador presentador;

    public Presentador getPresentador() {
        return presentador;
    }

    public Ventana(String titulo, Presentador presentador) {
        super(titulo);
        this.presentador = presentador;
        inicializarVentana();
        inicializarContenido();
    }

    private void inicializarVentana() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
    }

    protected abstract void inicializarContenido();

    public void mostrar() {
        setVisible(true);
    }
}
