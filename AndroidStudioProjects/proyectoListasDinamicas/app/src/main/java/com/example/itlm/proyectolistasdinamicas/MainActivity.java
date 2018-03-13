package com.example.itlm.proyectolistasdinamicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> ListaContactos;
    ArrayList<String> ListaNombres;
    ListView listView;
    int tamañolista;

    //TextView tvNumeroRegistros;
    //String datosUsuario = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListaContactos = new ArrayList<Contacto>();
        ListaNombres = new ArrayList<String>();
        listView = (ListView) findViewById(R.id.listView);

        llenaDatos(ListaContactos);
        tamañolista = ListaContactos.size();

        llenarListaNombre();

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ListaNombres);

        listView.setAdapter(adaptador);
        /*tvNumeroRegistros = (TextView)findViewById(R.id.tvNumeroRegistros);

        for(int i=0;i < tamañolista;i++){
            datosUsuario = datosUsuario + " " + ListaContactos.get(i).getNombre() + " " + ListaContactos.get(i).getTelefono() + " " + ListaContactos.get(i).geteMail() + "\n";

        }
        tvNumeroRegistros.setText(datosUsuario);
        */


    }

    void llenaDatos(ArrayList listaContactos){
        ListaContactos.add(new Contacto("Daniel","123123123","danihm95@gmail.com"));
        ListaContactos.add(new Contacto("Oscar","21342134","oscar@gmail.com"));
        ListaContactos.add(new Contacto("Juana","567234236","juana@gmail.com"));
        ListaContactos.add(new Contacto("Hugo","0129831234","hugo@gmail.com"));
        ListaContactos.add(new Contacto("Daniel","123123123","danihm95@gmail.com"));
        ListaContactos.add(new Contacto("Oscar","21342134","oscar@gmail.com"));
        ListaContactos.add(new Contacto("Juana","567234236","juana@gmail.com"));
        ListaContactos.add(new Contacto("Hugo","0129831234","hugo@gmail.com"));
        ListaContactos.add(new Contacto("Daniel","123123123","danihm95@gmail.com"));
        ListaContactos.add(new Contacto("Oscar","21342134","oscar@gmail.com"));
        ListaContactos.add(new Contacto("Juana","567234236","juana@gmail.com"));
        ListaContactos.add(new Contacto("Hugo","0129831234","hugo@gmail.com"));
    }

    void llenarListaNombre(){
        for(int i=0;i<tamañolista;i++){
            ListaNombres.add(ListaContactos.get(i).getNombre());
        }
    }
}
