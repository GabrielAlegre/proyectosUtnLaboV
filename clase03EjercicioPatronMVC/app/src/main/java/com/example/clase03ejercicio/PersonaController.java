package com.example.clase03ejercicio;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PersonaController implements View.OnClickListener {
    private PersonaView pView;
    private PersonaModel pModel;
    public PersonaController(PersonaView view, PersonaModel model) {
         pView = view;
         pModel = model;
    }

   /* public void guardarPersona(){
        this.pView.cargarElementos();
        this.pView.cargarModel(this.radioSeleccionado());
        if(this.validadDatos())
        {
            Log.d("Guardo", "Se guardo la siguiente persona:\n"+pModel.toString());
        }
        else{
            Log.d("noGuardo", "Verifique los datos ingresados!");
        }
    }*/

    private boolean validadDatos(){
        if((this.pModel.getNombre().toString().isEmpty()||this.pModel.getNombre()==null)
                || (this.pModel.getApellido().toString().isEmpty()||this.pModel.getApellido()==null)
                || (this.pModel.getDni().intValue()==-1))
        {
            return false;
        }
        else{
            return true;
        }
    }

    public PersonaModel.Esexo radioSeleccionado() {
        if (this.pView.rdbGroup.getCheckedRadioButtonId() == R.id.rdbHombre) {
            return PersonaModel.Esexo.MASCULINO;
        } else {
            return PersonaModel.Esexo.FEMENINO;
        }
    }

    public static int hacerCasteoStringIntSinError(String stringQueSeConvertira){
        int valorDelCasteo = -1;
        if(!stringQueSeConvertira.isEmpty() && stringQueSeConvertira!=null)
        {
            valorDelCasteo = Integer.parseInt(stringQueSeConvertira);
        }
        return valorDelCasteo;
    }

    @Override
    public void onClick(View v) {
        this.pView.cargarElementos();
        this.pView.cargarModel();
        if(this.validadDatos())
        {
            Log.d("Guardo", "Se guardo la siguiente persona:\n"+pModel.toString());
        }
        else{
            Log.d("noGuardo", "Verifique los datos ingresados!");
        }
    }
}

