package animales;

import java.util.Date;

import Vacuna.*;

public abstract class Animal implements getDuenio {
    private String nombre;
    private int edad;
    private String genero;
    private Date fechaNacimiento;
    private String especie;
    private String duenio;

    public Animal(String nombre, int edad, String genero, Date fechaNacimiento, String especie,
            String duenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;

        this.fechaNacimiento = fechaNacimiento;
        this.especie = especie;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

}
