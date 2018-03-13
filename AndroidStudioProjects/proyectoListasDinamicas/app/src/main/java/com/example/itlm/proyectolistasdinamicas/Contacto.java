package com.example.itlm.proyectolistasdinamicas;

/**
 * Created by ITLM on 12/03/2018.
 */

public class Contacto {
    private String nombre;
    private String telefono;
    private String eMail;

    public  Contacto(){
        nombre="";
        telefono="";
        eMail="";
    }

    public Contacto(String n,String t,String e){
        nombre = n;
        telefono = t;
        eMail = e;
    }

    public void setNombre(String n){
        nombre=n;
    }
    public void setTelefono(String t){
        telefono=t;
    }
    public void seteMail(String e){
        eMail=e;
    }

    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public String geteMail(){
        return eMail;
    }
}
