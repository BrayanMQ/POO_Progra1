/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ronny
 */
public class Revista extends Entregable{
    private boolean esCatalogo;
    private String tema;

    public Revista() {
    }

    public boolean isEsCatalogo() {
        return esCatalogo;
    }

    public void setEsCatalogo(boolean esCatalogo) {
        this.esCatalogo = esCatalogo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    
    
}
