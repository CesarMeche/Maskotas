package view.mirador;

import presenter.Presentador;
import view.ventanas.*;

public class IoManager {
    private Presentador presentador;
    private VentanaMenuPrincipal vMP;
    private VentanaAgendarCita vAC;
    private VentanaMenu vM;
    private AniadirMascota aM;
    private VerMascotas VerMascotas;

    public IoManager(Presentador presentador) {
        this.presentador = presentador;
    }

    public void iniciarMenu(String user) {
        vMP = new VentanaMenuPrincipal("Maskotas", presentador, user);
        vMP.mostrar();
    }

    public void iniciarAgendarCita() {
        vAC = new VentanaAgendarCita(presentador);
        vAC.mostrar();
    }

    public void iniciarLogin() {
        vM = new VentanaMenu("Maskotas", presentador);
        vM.mostrar();
    }

    public void agregarMascota() {
        aM = new AniadirMascota("Maskotas", presentador);
        aM.mostrar();
    }

    public void verMascotas() {
        VerMascotas = new VerMascotas("Maskotas", presentador);
        VerMascotas.mostrar();
    }

    public void verCitas() {
    }

    public Presentador getPresentador() {
        return presentador;
    }

    public void setPresentador(Presentador presentador) {
        this.presentador = presentador;
    }

    public VentanaMenuPrincipal getvMP() {
        return vMP;
    }

    public void setvMP(VentanaMenuPrincipal vMP) {
        this.vMP = vMP;
    }

    public VentanaMenu getvM() {
        return vM;
    }

    public void setvM(VentanaMenu vM) {
        this.vM = vM;
    }

    public AniadirMascota getaM() {
        return aM;
    }

    public void setaM(AniadirMascota aM) {
        this.aM = aM;
    }

}
