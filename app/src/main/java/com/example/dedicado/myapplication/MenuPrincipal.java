package com.example.dedicado.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {
    Button calculoMaterias, calendarioEstudiantes, calcularDefinitva, grabarClase ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        calculoMaterias = (Button) findViewById(R.id.calculoMaterias);
        calendarioEstudiantes = (Button) findViewById(R.id.CalendarioEstudiante);
        calcularDefinitva = (Button) findViewById(R.id.calcularDefinitiva);
        grabarClase =(Button) findViewById(R.id.grabarClases);

        calculoMaterias.setOnClickListener(this);
        calendarioEstudiantes.setOnClickListener(this);
        calcularDefinitva.setOnClickListener(this);
        grabarClase.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id== R.id.calculoMaterias){
            Intent intent = new Intent(this, CalculoMinNota.class);
            startActivity(intent);
        }

        if(id== R.id.CalendarioEstudiante){
            Intent intent = new Intent(this, CalendarioEstudiante.class);
            startActivity(intent);
        }

        if(id==R.id.calcularDefinitiva){
            Intent intent = new Intent(this, CalculoDefinitiva.class);
            startActivity(intent);
        }

        if(id==R.id.grabarClases){
            Intent intent = new Intent(this, GrabarClase.class);
            startActivity(intent);
        }

    }
}
