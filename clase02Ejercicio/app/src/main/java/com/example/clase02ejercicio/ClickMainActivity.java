package com.example.clase02ejercicio;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class ClickMainActivity implements View.OnClickListener {

    Activity ac;
    EditText editNombre;
    EditText editApellido;
    EditText editDni;
    RadioButton rdbHombre;
    RadioButton rdbMujer;
    ClickMainActivity(Activity ac){
        this.ac=ac;
    }
    @Override
    public void onClick(View v) {
        if(editNombre==null){
            this.editNombre=this.ac.findViewById(R.id.edNombre);
        }
        if(editApellido==null){
            this.editApellido=this.ac.findViewById(R.id.edApellido);
        }
        if(editDni==null){
            this.editDni=this.ac.findViewById(R.id.edDni);
        }
        if(rdbHombre==null){
            this.rdbHombre=this.ac.findViewById(R.id.rdbHombre);
        }
        if(rdbMujer==null){
            this.rdbMujer=this.ac.findViewById(R.id.rdbMujer);
        }

        if(this.editApellido.getText().toString().isEmpty()
                || this.editApellido.getText().toString().isEmpty()
                || this.editDni.getText().toString().isEmpty())
        {
            Toast.makeText(this.ac,"Falta rellenar algun campo, verifique por favor", Toast.LENGTH_SHORT).show();
        }
        else{
            Persona personaCreada=new Persona(this.editNombre.getText().toString(), this.editApellido.getText().toString(), Integer.parseInt(this.editDni.getText().toString()), this.radioSeleccionado());
            Log.d("Guardo", "Se guardo la siguiente persona:\n"+personaCreada.toString());
            Toast.makeText(this.ac,"Se guardo correctamente", Toast.LENGTH_SHORT).show();
        }
    }

    public String radioSeleccionado() {
        if (this.rdbHombre.isChecked()) {
            return rdbHombre.getText().toString();
        } else {
            return rdbMujer.getText().toString();
        }
    }
}
