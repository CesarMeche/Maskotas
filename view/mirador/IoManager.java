package view.mirador;

import view.ventanas.VentanaMenu;

public class IoManager {
    public void iniciarMenu() {
        VentanaMenu vM;
        vM = new VentanaMenu("Menu");
        vM.mostrar();
    }
}
