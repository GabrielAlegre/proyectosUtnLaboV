package com.example.clase02ejercicio;

import androidx.annotation.NonNull;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private String sexo;

    Persona(String nombre, String apellido, int dni, String sexo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.sexo=sexo;
    }

    @NonNull
    @Override
    public String toString() {
        return " - Nombre: ".concat(this.nombre).concat("\n")
                .concat(" - Apellido: ").concat(this.apellido).concat("\n")
                .concat(" - Dni: ").concat(String.valueOf(this.dni)).concat("\n")
                .concat(" - Sexo: ").concat(this.sexo).concat("\n");
    }
}
