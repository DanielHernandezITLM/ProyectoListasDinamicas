package com.example.itlm.proyectolistasdinamicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> ListaContactos;
    ArrayList<String> ListaNombres;
    ListView listView;
    int tamañolista;
    String first, second, third;

    //TextView tvNumeroRegistros;
    //String datosUsuario = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListaContactos = new ArrayList<Contacto>();
        ListaNombres = new ArrayList<String>();
        listView = (ListView) findViewById(R.id.listView);

       // llenaDatos(ListaContactos);
        tamañolista = ListaContactos.size();


        //llenarListaNombre();



        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });*/

    }



    /*void llenaDatos(ArrayList listaContactos){

        ListaContactos.add(new Contacto(first,second,third));

    }*/

    void muestraDatos(){
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ListaNombres);

        for(int i=0;i<tamañolista;i++){
            ListaNombres.add(ListaContactos.get(i).getNombre());
        }

        listView.setAdapter(adaptador);
    }

    /*void llenarListaNombre(){
        for(int i=0;i<tamañolista;i++){
            ListaNombres.add(ListaContactos.get(i).getNombre());
        }
    }*/

    public void add(View view) {

        Intent i = new Intent(MainActivity.this, Form.class);
        startActivityForResult(i, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1){
            first = data.getExtras().getString("data1");
            second = data.getExtras().getString("data2");
            third = data.getExtras().getString("data3");

            Toast.makeText(this, first +" añadido", Toast.LENGTH_SHORT).show();
            ListaContactos.add(new Contacto(first,second,third));
            muestraDatos();


        }

    }

}
