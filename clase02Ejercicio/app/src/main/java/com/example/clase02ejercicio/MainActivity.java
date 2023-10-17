package com.example.clase02ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGuardar= super.findViewById(R.id.btnGuardar);
        View.OnClickListener myListener = new ClickMainActivity(this);
        btnGuardar.setOnClickListener(myListener);
    }
}