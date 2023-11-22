package presenter;

import java.util.Date;
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
        this.aniadirMascota("Chuco", "masculino", new Date(1990, 2, 3), "perro", "admin");
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
        io.agregarMascota();
    }

    public void agendarCita() {
        io.iniciarAgendarCita();
    }

    public void verCitas() {
        io.verCitas();
    }

    public void verMacotas() {
        io.verMascotas();
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

    public void aniadirMascota(String nombre, String genero, Date fechaNacimiento, String especie,
            String duenio) {

        veterinaria.aniadirMascota(nombre, genero, fechaNacimiento, especie, duenio);
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
