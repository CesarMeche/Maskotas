package veterinaria;

import animales.Animal;
import personas.Usuario;
import personas.Veterinario;

public class Veterina {
    private String nombre;
    private Usuario[] usuarios;
    private Veterinario[] veterinarios;
    private Animal[] animales;

    public Veterina(String nombre, Usuario[] usuarios, Veterinario[] veterinarios, Animal[] animales) {
        this.nombre = nombre;
        this.usuarios = usuarios;
        this.veterinarios = veterinarios;
        this.animales = animales;
    }

    public void registarUsuario(Usuario usuario) {
        Usuario[] usuarios = getUsuarios();
        Usuario[] newUsuarios = new Usuario[usuarios.length + 1];
        for (int i = 0; i < usuarios.length; i++) {
            newUsuarios[i] = usuarios[i];
        }
        newUsuarios[newUsuarios.length - 1] = usuario;
        setUsuarios(newUsuarios);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public Veterinario[] getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(Veterinario[] veterinarios) {
        this.veterinarios = veterinarios;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

}
