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
public class Sobre extends Entregable{
    private TSobre tipo;
    private boolean tieneDocumnetos;

    public Sobre(TSobre tipo, boolean tieneDocumnetos, int id, double peso, String descripcion, String remitente) {
        super(id, peso, descripcion, remitente);
        this.tipo = tipo;
        this.tieneDocumnetos = tieneDocumnetos;
    }

    public TSobre getTipo() {
        return tipo;
    }

    public void setTipo(TSobre tipo) {
        this.tipo = tipo;
    }

    public boolean isTieneDocumnetos() {
        return tieneDocumnetos;
    }

    public void setTieneDocumnetos(boolean tieneDocumnetos) {
        this.tieneDocumnetos = tieneDocumnetos;
    }
    
}
