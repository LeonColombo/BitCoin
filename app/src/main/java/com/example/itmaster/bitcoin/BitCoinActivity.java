package com.example.itmaster.bitcoin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BitCoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void calcular(View view) {
        double cotizacion = 220000;
        EditText pesos = findViewById(R.id.pesos);
        double valorPesos = Double.valueOf(pesos.getText().toString());
        double resultado = valorPesos/cotizacion;
        String mensaje = "Podes comprar " + resultado + " BitCoins";

        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();


    }
}
