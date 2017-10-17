package com.example.dedicado.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.String;
import java.lang.Integer;


public class CalculoMinNota extends AppCompatActivity implements OnClickListener {
    EditText asignatura1, asig_nota1, asig_nota2;
    Button asig1_calcular;
    TextView asig1_resultado;


    EditText asignatura2, asig2_nota1, asig2_nota2;
    Button asig2_calcular;
    TextView asig2_resultado;

    EditText asignatura3, asig3_nota1, asig3_nota2;
    Button asig3_calcular;
    TextView asig3_resultado;
    final double PORCENTAJE1 = 0.2;
    final double PORCENTAJE2 = 0.3;
    final double PORCENTAJE3 = 0.5;
    final double NOTAMINIMA = 3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_min_nota);
        asignatura1 = (EditText) findViewById(R.id.asig1);
        asig_nota1 = (EditText) findViewById(R.id.asig1_nota1);
        asig_nota2 = (EditText) findViewById(R.id.asig1_nota2);


        asig1_resultado = (TextView) findViewById(R.id.asig1_resultado);
        asig1_calcular = (Button) findViewById(R.id.asig1_calcular);
        asig1_calcular.setOnClickListener(this);


        asignatura2 = (EditText) findViewById(R.id.asig2);
        asig2_nota1 = (EditText) findViewById(R.id.asig2_nota1);
        asig2_nota2 = (EditText) findViewById(R.id.asig2_nota2);


        asig2_resultado = (TextView) findViewById(R.id.asig2_resultado);
        asig2_calcular = (Button) findViewById(R.id.asig2_calcular);
        asig2_calcular.setOnClickListener(this);

        asignatura3 = (EditText) findViewById(R.id.asig3);
        asig3_nota1 = (EditText) findViewById(R.id.asig3_nota1);
        asig3_nota2 = (EditText) findViewById(R.id.asig3_nota2);


        asig3_resultado = (TextView) findViewById(R.id.asig3_resultado);
        asig3_calcular = (Button) findViewById(R.id.asig3_calcular);
        asig3_calcular.setOnClickListener(this);







    }

    @Override
    public void onClick(View v) {

    int id = v.getId();


       // switch (v.getId()){

            if( id==R.id.asig1_calcular) {
                String asignatura = asignatura1.getText().toString();
                if (asignatura.length() > 5 && asignatura.length() < 14) {

                    String nota1 = asig_nota1.getText().toString();
                    String nota2 = asig_nota2.getText().toString();

                    if(!nota1.isEmpty()  && !nota2.isEmpty()){
                        double valor2 = Double.valueOf(nota2);
                        double valor1 = Double.valueOf(nota1);
                        double resultado= -((valor1 * PORCENTAJE1) + (valor2 * PORCENTAJE2)-NOTAMINIMA) /PORCENTAJE3;
                        String resultadofinal = "Nota Minima Es: "+String.valueOf(resultado);
                        asig1_resultado.setText(resultadofinal);
                    }else{
                        Toast.makeText(this,"Ingrese la nota 1 o la nota 2 ",Toast.LENGTH_LONG).show();
                    }


                } else {
                    Toast.makeText(getApplicationContext(), "Porfavor ingrese una asignatura de mas de 5 caracteres", Toast.LENGTH_LONG)
                            .show();
                }

            }
            if(id==R.id.asig2_calcular){
                String asignatura_2 = asignatura2.getText().toString();
                if( asignatura_2.length() > 5 && asignatura_2.length() < 14){
                    String nota1 = asig2_nota1.getText().toString();
                    String nota2 = asig2_nota2.getText().toString();

                    if(!nota1.isEmpty()  && !nota2.isEmpty()){
                        double valor2 = Double.valueOf(nota2);
                        double valor1 = Double.valueOf(nota1);
                        double resultado= -((valor1 * PORCENTAJE1) + (valor2 * PORCENTAJE2)-NOTAMINIMA) /PORCENTAJE3;
                        String resultadofinal = "Nota Minima Es: "+String.valueOf(resultado);
                        asig2_resultado.setText(resultadofinal);
                    }else{
                        Toast.makeText(this,"Ingrese la nota 1 o la nota 2 ",Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Porfavor ingrese una asignatura de mas de 5 caracteres", Toast.LENGTH_LONG)
                            .show();
                }
            }

            if(id==R.id.asig3_calcular){
                String asignatura_3 = asignatura3.getText().toString();
                if( asignatura_3.length() > 5 && asignatura_3.length() < 14){
                    String nota1 = asig3_nota1.getText().toString();
                    String nota2 = asig3_nota2.getText().toString();

                    if(!nota1.isEmpty()  && !nota2.isEmpty()){
                        double valor2 = Double.valueOf(nota2);
                        double valor1 = Double.valueOf(nota1);
                        double resultado= -((valor1 * PORCENTAJE1) + (valor2 * PORCENTAJE2)-NOTAMINIMA) /PORCENTAJE3;
                        String resultadofinal = "Nota Minima Es: "+String.valueOf(resultado);
                        asig3_resultado.setText(resultadofinal);
                    }else{
                        Toast.makeText(this,"Ingrese la nota 1 o la nota 2 ",Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Porfavor ingrese una asignatura de mas de 5 caracteres", Toast.LENGTH_LONG)
                            .show();
                }

            }


               /* break;

            case R.id.asig2_calcular:



                break;

            case R.id.asig3_calcular:



                break;**/

            /*default:
                Toast.makeText(getApplicationContext(), "Porfavor selecione un boton valido", Toast.LENGTH_LONG).show();
                break;*/

    }
}
