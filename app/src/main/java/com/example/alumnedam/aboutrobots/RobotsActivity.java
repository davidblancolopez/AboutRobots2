package com.example.alumnedam.aboutrobots;

import android.content.pm.ActivityInfo;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class RobotsActivity extends AppCompatActivity implements View.OnClickListener {
    private int contador = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robots);

        Button buttonnotocar = (Button) findViewById(R.id.buttonnotocar);
        //Creación del botón (buttonnotocar).
        buttonnotocar.setOnClickListener(this);
        //Assignación de un OnClickListener en este botón.

        ImageButton imageButtonSalir = (ImageButton) findViewById(R.id.imageButtonSalir);
        imageButtonSalir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //View v és el boton que se ha pulsado.
        if(v.getId() == R.id.buttonnotocar){
            //comprobación para detectar que el boton pulsado és el que inicia este metodo.
            if(contador == 0) {
                Button buttonnotocar = (Button) v;

                buttonnotocar.setText(R.string.textoBoton2);

                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(R.string.textoMensaje2);
                contador ++;
            }else if (contador > 0){

                Button buttonnotocar = (Button) v;
                buttonnotocar.setVisibility(View.INVISIBLE);
                ImageView imagen = (ImageView) findViewById(R.id.imagen);
                imagen.setImageResource(R.drawable.explosion);

            }else if(v.getId() == R.id.imageButtonSalir){
                finish();
            }
        }
    }

}


