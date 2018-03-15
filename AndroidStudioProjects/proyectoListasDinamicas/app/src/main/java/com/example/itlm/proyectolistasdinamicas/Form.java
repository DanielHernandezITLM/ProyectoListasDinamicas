package com.example.itlm.proyectolistasdinamicas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Form extends AppCompatActivity {
    EditText nombre, telefono, correo;
    String nombreMandar,telefonoMandar, correoMandar, todo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        nombre = (EditText) findViewById(R.id.editText);
        telefono = (EditText) findViewById(R.id.editText2);
        correo = (EditText) findViewById(R.id.editText3);



    }


    public void cancel(View view) {

        Intent i = new Intent(Form.this, MainActivity.class);
        startActivity(i);

    }

    public void addContact(View view) {
        nombreMandar = String.valueOf(nombre.getText());
        telefonoMandar = String.valueOf(telefono.getText());
        correoMandar = String.valueOf(correo.getText());

        Intent addF = getIntent();
        addF.putExtra("data1",nombreMandar);
        addF.putExtra("data2",telefonoMandar);
        addF.putExtra("data3",correoMandar);
        setResult(RESULT_OK,addF);
        finish();

    }
}
