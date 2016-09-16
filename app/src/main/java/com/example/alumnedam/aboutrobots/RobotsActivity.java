package com.example.alumnedam.aboutrobots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RobotsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robots);

        Button buttonnotocar = (Button) findViewById(R.id.buttonnotocar);
        buttonnotocar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        //View v és el boton que se ha pulsado.
        int contador = 0;
        if(v.getId() == R.id.buttonnotocar){
            //comprobación para detectar que el boton pulsado és el que inicia este metodo.
            if(contador == 0) {
                Button buttonnotocar = (Button) v;
                buttonnotocar.setText("Que no me toques!!!");

                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Parece que los humanos no són muy inteligntes.");
                contador ++;
            }
            if(contador == 2){
                Button buttonnotocar = (Button) v;
                buttonnotocar.setVisibility(View.INVISIBLE);
                contador ++;
            }
        }


    }
}
