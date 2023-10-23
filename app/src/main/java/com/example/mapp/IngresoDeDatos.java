package com.example.mapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class IngresoDeDatos extends AppCompatActivity {
    private EditText Ubicacion1;
    private EditText Ubicacion2;
    private EditText Ubicacion3;

    private Button agregarButon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingresodedatos);

        Ubicacion1 = findViewById(R.id.D1);
        Ubicacion2 = findViewById(R.id.D2);
        Ubicacion3 = findViewById(R.id.D3);
        agregarButon = findViewById(R.id.BtAgregar);

        agregarButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ubi1 = Ubicacion1.getText().toString();
                String ubi2 = Ubicacion2.getText().toString();
                String ubi3 = Ubicacion3.getText().toString();

                Intent intent = new Intent(IngresoDeDatos.this, Mapa.class);

                intent.putExtra("Ubicacion1", ubi1);
                intent.putExtra("Ubicacion2", ubi2);
                intent.putExtra("Ubicacion3", ubi3);
                startActivity(intent);
            }
        });
    }

}
