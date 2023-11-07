package presenter;

import view.mirador.IoManager;

public class Presentador {
    public static void main(String[] args) {
        System.out.println("Hola, soy el presentador:D quiero pico ugu");
        IoManager io = new IoManager();
        io.iniciarMenu();
    }
}
