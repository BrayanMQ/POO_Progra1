/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.WebService;

/**
 *
 * @author efrai
 */
public class NewMain {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    //Web Service
    Cambio TipoCambio = new Cambio();
    //Obtiene el valor del precio de compra USD
    System.out.println(TipoCambio.getCompra());
    //Obtiene el valor del precio de venta USD
    System.out.println(TipoCambio.getVenta());
    
    
  }
}
