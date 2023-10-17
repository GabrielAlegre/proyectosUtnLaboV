package com.example.clase03ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Modelo
        PersonaModel pModel = new PersonaModel();
        //View
        PersonaView pView = new PersonaView(this, pModel);
        //Controler
        PersonaController pController = new PersonaController(pView, pModel);
        pView.setControlador(pController);
    }
}