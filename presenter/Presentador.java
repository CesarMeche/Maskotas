package presenter;

import java.util.List;

import personas.Usuario;
import veterinaria.Veterina;
import view.mirador.IoManager;

public class Presentador {
    private IoManager io;
    private Veterina veterinaria;
    private List citas;
    private Usuario usuario;

    public void init() {
        io = new IoManager(this);
        veterinaria = new Veterina("Maskotas");
        io.iniciarLogin();
        usuario = new Usuario();
        this.aniadirMascota("1", "2", "3", "4", "5");
        this.crearUsuario("11", "admin", "admin");
        this.CargarVeterina();

    }

    public void login(String user, String password) {

        if (veterinaria.validarUsuario(user, password)) {
            usuario.setUsername(user);
            io.iniciarMenu(user);
        } else {
            io.getvM().mostrarMensaje("Usuario o contraseña incorrectos");
        }
    }

    public void aniadirMacota() {

    }

    public void agendarCita() {

    }

    public void verCitas() {
    }

    public void verMacotas() {
        io.verMascotas("Maskotas");
    }

    public void crearUsuario(String cedula, String user, String password) {
        veterinaria.getUsuarios().add(new Usuario(Integer.parseInt(cedula), user, password));
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public IoManager getIo() {
        return io;
    }

    public Veterina getVeterinaria() {
        return veterinaria;
    }

    public List getCitas() {
        return citas;
    }

    public void aniadirMascota(String nombre, String edad, String genero, String string, String text4) {

    }

    public void GuardarVeterina(Veterina veterinaria) {
        veterinaria.guardarVeterina("veterina.dat");
    }

    public void CargarVeterina() {
        veterinaria.cargarVeterina("veterina.dat");
    }

    public void mascotasUsuario(String[] mascotas) {

    }

}
