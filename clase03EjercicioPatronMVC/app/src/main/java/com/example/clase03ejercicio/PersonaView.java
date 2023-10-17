package com.example.clase03ejercicio;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.text.NumberFormat;

public class PersonaView {
    Button btnGuardar;
    PersonaModel pModel;
    Activity ac;
    EditText editNombre;
    EditText editApellido;
    EditText editDni;
    RadioGroup rdbGroup;
    PersonaController pController;
    PersonaView(Activity ac, PersonaModel pModel){
        this.ac=ac;
        this.pModel=pModel;
    }

    public void setControlador(PersonaController pController){
        this.pController=pController;
        this.btnGuardar = ac.findViewById(R.id.btnGuardar);
        this.btnGuardar.setOnClickListener(pController);
    }
    public void cargarElementos(){
        if(this.editNombre==null){
            this.editNombre=this.ac.findViewById(R.id.edNombre);
        }
        if(this.editApellido==null){
            this.editApellido=this.ac.findViewById(R.id.edApellido);
        }
        if(this.editDni==null){
            this.editDni=this.ac.findViewById(R.id.edDni);
        }
        if(this.rdbGroup==null){
            this.rdbGroup=this.ac.findViewById(R.id.rdbGroup);
        }
    }
    public void cargarModel(){
        this.pModel.setNombre(this.editNombre.getText().toString());
        this.pModel.setApellido(this.editApellido.getText().toString());
        this.pModel.setDni(PersonaController.hacerCasteoStringIntSinError(this.editDni.getText().toString()));
        this.pModel.setSexo(pController.radioSeleccionado());
    }

    public void mostrarModel(){
        editNombre.setText(this.pModel.getNombre());
        editApellido.setText(this.pModel.getApellido());
        editDni.setText(this.pModel.getDni().toString());
        rdbGroup.check(this.pModel.getSexo() == PersonaModel.Esexo.FEMENINO?R.id.rdbMujer:R.id.rdbHombre);
    }
}
