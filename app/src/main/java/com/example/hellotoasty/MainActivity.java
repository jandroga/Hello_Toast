package com.example.hellotoasty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int Contador = 0;
    private Button buttonCounting;//Declaram nou botó
    private Button buttonReset;
    private TextView txv;//TextView on hi ha el "0" inicial que després canviam

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCounting = (Button) findViewById(R.id.countButton);
        buttonReset = (Button) findViewById(R.id.toastButton);
        txv = (TextView) findViewById(R.id.vistaContador);

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contador = 0;//Contador a 0
                txv.setText(Integer.toString(Contador));
            }
        });

        buttonCounting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contador ++;//Suma 1 al contador
                txv.setText(Integer.toString(Contador));

            }
        });
    }
}