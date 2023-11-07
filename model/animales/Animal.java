package animales;

import java.util.Date;

import vacuna.Vacuna;

public abstract class Animal {
    private String nombre;
    private int edad;
    private String genero;
    private Date fechaRegistro;
    private Date fechaNacimiento;
    private String especie;
    private Vacuna[] vacunas;
    private String[] enfermedades;
    private String duenio;

    public Animal(String nombre, int edad, String genero, Date fechaRegistro, Date fechaNacimiento, String especie,
            Vacuna[] vacunas) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.fechaNacimiento = fechaNacimiento;
        this.especie = especie;
        this.vacunas = vacunas;
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

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
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

    public Vacuna[] getVacunas() {
        return vacunas;
    }

    public void setVacunas(Vacuna[] vacunas) {
        this.vacunas = vacunas;
    }

}
