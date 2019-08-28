package com.example.konversi_suhu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    EditText vTxtRea, vTxtFar, vTxtCel, vTxtKel;
    Button konvert;
    float yTxtRea, yTxtFar, yTxtCel, yTxtKel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vTxtCel = (EditText)findViewById(R.id.celcius);
        vTxtFar = (EditText)findViewById(R.id.farenheit);
        vTxtKel = (EditText)findViewById(R.id.kelvin);
        vTxtRea = (EditText)findViewById(R.id.reamur);
        konvert = (Button)findViewById(R.id.btnKonversi);

        konvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yTxtCel = Float.parseFloat(vTxtCel.getText().toString().trim());
                yTxtFar = (yTxtCel*9/5)+32;
                yTxtKel = yTxtCel + 273;
                yTxtRea = (float)(0.8*yTxtCel);

                vTxtFar.setText(yTxtFar+"");
                vTxtKel.setText(yTxtKel+"");
                vTxtRea.setText(yTxtRea+"");

            }
        });



    }

}
