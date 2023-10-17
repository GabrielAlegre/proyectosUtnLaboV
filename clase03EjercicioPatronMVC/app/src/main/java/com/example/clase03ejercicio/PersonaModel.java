package com.example.clase03ejercicio;

public class PersonaModel {
    public enum Esexo{
        MASCULINO,
        FEMENINO
    }
    private String apellido;
    private Number dni;
    private PersonaModel.Esexo sexo;
    private String nombre;

    public PersonaModel() {
    }

    public PersonaModel(String apellido, int dni, PersonaModel.Esexo sexo, String nombre) {
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Number getDni() {
        return dni;
    }

    public PersonaModel.Esexo getSexo() {
        return sexo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSexo(PersonaModel.Esexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return " - Nombre: ".concat(this.nombre).concat("\n")
                .concat(" - Apellido: ").concat(this.apellido).concat("\n")
                .concat(" - Dni: ").concat(String.valueOf(this.dni)).concat("\n")
                .concat(" - Sexo: ").concat(this.sexo.toString()).concat("\n");
    }
}
