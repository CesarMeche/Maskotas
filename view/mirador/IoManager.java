package view.mirador;

import view.ventanas.AniadirMascota;
import view.ventanas.VentanaMenu;

public class IoManager {
    public void iniciarMenu() {
        VentanaMenu vM;
        vM = new VentanaMenu("Menu");
        vM.mostrar();
    }

    public void agregarMascota(String titulo) {
        AniadirMascota aM;
        aM = new AniadirMascota(titulo);
        aM.mostrar();
    }
}
