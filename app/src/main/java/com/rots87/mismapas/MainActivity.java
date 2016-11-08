package com.rots87.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void irMapa(View v) {
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("Latitud",13.485339061593127);
        i.putExtra("Longitud", -89.31937250563965);
        i.putExtra("Lugar","La Libertad");
        startActivity(i);
    }

    public void irMapa2(View v) {
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("Latitud",13.67926489685312);
        i.putExtra("Longitud", -89.2486198551403);
        i.putExtra("Lugar","MultiPlaza");
        startActivity(i);
    }

    public void irMapa3(View v) {
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("Latitud",13.632706519028284);
        i.putExtra("Longitud", -89.19054885000003);
        i.putExtra("Lugar","Puerta del Diablo");
        startActivity(i);
    }

    public void irMapa4(View v) {
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("Latitud",13.704972203872655);
        i.putExtra("Longitud", -89.21303850000004);
        i.putExtra("Lugar","MetroCentro");
        startActivity(i);
    }

}
