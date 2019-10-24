/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Counter;

/**
 *
 * @author Ronny
 */
public class Controlador {
    private static Controlador controlador;
    private Counter counter;
    
    public static Controlador getSingletonInstance() {
        if (controlador == null){
            controlador = new Controlador();
        }
        return controlador;
    }
    
    public void crearCounter(String pNombre, String pCedulaJuridica, String direccion, String pCantidadCasilleros){
        counter = new Counter(pNombre, Integer.parseInt(pCedulaJuridica), direccion, Integer.parseInt(pCantidadCasilleros));
    }

    public Counter getCounter() {
        return counter;
    }
}
