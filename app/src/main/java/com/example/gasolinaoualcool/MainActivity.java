package com.example.gasolinaoualcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    EditText editGas;
    EditText editAlcool;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);
        editGas = findViewById(R.id.editGas);
        editAlcool   = findViewById(R.id.editAlcool);

        }
    public void calcular(View v){

        double gasosa =Double.parseDouble(editGas.getText().toString());
        double alcool = Double.parseDouble(editAlcool.getText().toString());
        double result = gasosa / alcool;
        if( result <= 0.7){
            txtResultado.setText("É melhor Alcool!");
        }else txtResultado.setText("É melhor Gasolina!");

        }

    }

