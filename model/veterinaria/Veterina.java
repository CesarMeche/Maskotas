package veterinaria;

import java.util.ArrayList;
import java.util.Date;
import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import animales.*;
import personas.Usuario;
import personas.Veterinario;

public class Veterina {
    private String nombre;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Veterinario> veterinarios;
    private ArrayList<Animal> animales;

    public Veterina(String nombre) {
        this.nombre = nombre;
        usuarios = new ArrayList<Usuario>();
        veterinarios = new ArrayList<Veterinario>();
        animales = new ArrayList<Animal>();
    }

    public Veterina(String nombre, ArrayList<Usuario> usuarios, ArrayList<Veterinario> veterinarios,
            ArrayList<Animal> animales) {
        this.nombre = nombre;
        this.usuarios = usuarios;
        this.veterinarios = veterinarios;
        this.animales = animales;
    }

    public void aniadirMascota(String nombre, String genero, Date fechaNacimiento, String especie,
            String duenio) {

        LocalDate fechaNacimientoLocalDate = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        LocalDate fechaActual = LocalDate.now();

        int edad = Period.between(fechaNacimientoLocalDate, fechaActual).getYears();

        switch (especie) {
            case "caballo":
                animales.add(new Caballo(nombre, edad, genero, fechaNacimiento, especie, duenio));
                break;
            case "gato":
                animales.add(new Gato(nombre, edad, genero, fechaNacimiento, especie, duenio));
                break;
            case "oveja":
                animales.add(new Oveja(nombre, edad, genero, fechaNacimiento, especie, duenio));
                break;
            case "pato":
                animales.add(new Pato(nombre, edad, genero, fechaNacimiento, especie, duenio));
                break;
            case "perro":
                animales.add(new Perro(nombre, edad, genero, fechaNacimiento, especie, duenio));
                break;
            case "vaca":
                animales.add(new Vaca(nombre, edad, genero, fechaNacimiento, especie, duenio));
                break;
            default:
                break;
        }
    }

    public boolean validarUsuario(String username, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.getPassword().equals(password)) {
                return true;
            }
        }
        return false;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(ArrayList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public void guardarVeterina(String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(this);
            System.out.println("Veterina guardada correctamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar la Veterina: " + e.getMessage());
        }
    }

    // Método para cargar la instancia de Veterina desde un archivo
    public static Veterina cargarVeterina(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            Veterina veterinaria = (Veterina) ois.readObject();
            System.out.println("Veterina cargada correctamente desde " + nombreArchivo);
            return veterinaria;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar la Veterina: " + e.getMessage());
            return null;
        }

    }
}
