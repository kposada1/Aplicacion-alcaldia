package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }
    public void Siguiente (View view) {
        Intent siguiente = new Intent(this, graciasPorParticipar.class);
        startActivity(siguiente);
        Toast.makeText(this, "Datos ingresados correctamente", Toast.LENGTH_SHORT ).show();
    }
}