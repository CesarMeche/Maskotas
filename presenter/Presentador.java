package presenter;

import view.mirador.IoManager;

public class Presentador {
    IoManager io;

    public void init() {
        io = new IoManager();
        io.iniciarMenu();
    }

}
