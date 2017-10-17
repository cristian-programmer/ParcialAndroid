package com.example.dedicado.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CalendarioEstudiante extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendario_estudiante);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, CalculoMinNota.class);
        startActivity(intent);

    }
}
