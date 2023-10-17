package com.example.clase03ejercicio;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ClickMainActivity implements View.OnClickListener {

    PersonaController pControler;
    public void setController (PersonaController pControler){
        this.pControler=pControler;
    }

    @Override
    public void onClick(View v) {
        //pControler.guardarPersona();
    }


}
