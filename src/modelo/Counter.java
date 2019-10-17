/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Ronny
 */
public class Counter {
    private String nombre;
    private int cedulaJuridica;
    private String direccion;
    private int cantCasilleros;
    private ArrayList <Casillero> listaCasilleros;

    public Counter() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(int cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantCasilleros() {
        return cantCasilleros;
    }

    public void setCantCasilleros(int cantCasilleros) {
        this.cantCasilleros = cantCasilleros;
    }

    public ArrayList<Casillero> getListaCasilleros() {
        return listaCasilleros;
    }

    public void setListaCasilleros(ArrayList<Casillero> listaCasilleros) {
        this.listaCasilleros = listaCasilleros;
    }
    
    
}
