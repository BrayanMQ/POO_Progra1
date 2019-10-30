
package control;

import modelo.Casillero;
import modelo.Entregable;
import modelo.Paquete;
import modelo.Revista;
import modelo.TPaquete;

public class GestorEntregable {
    
    public Paquete crearPaquete(int id, double peso, String pDescripcion, 
            String pRemitente, String pTipoPaquete, 
            boolean pFragil, boolean pContenidoElectronico){
        
        TPaquete Tpaquete;
        
        if (TPaquete.Bolsa.toString().equals(pTipoPaquete)) {
            Tpaquete = TPaquete.Bolsa;
        } else {
            Tpaquete = TPaquete.Caja;
        }
        
        Paquete paquete = new Paquete(Tpaquete, pFragil, 
                pContenidoElectronico, id, peso, pDescripcion, pRemitente);
        
        return paquete;

    }
    
    public void crearSobre(){
    
    }
    
    public Revista crearRevista(boolean pEsCatalogo, String pTema, String pId, String pPeso, String pDescripcion, String pRemitente){
        if (pEsCatalogo) {
            
        }
        Revista revista = new Revista(pEsCatalogo, pTema, Integer.parseInt(pId), Double.parseDouble(pPeso), pDescripcion, pRemitente);
        return revista;
    }
    
    public boolean buscarEntregableEInsertar(Entregable pEntregable, Casillero casillero){
        int index = casillero.getListaEntregables().indexOf((pEntregable));
        
        if (index == -1) {
            casillero.getListaEntregables().add(pEntregable);
            return true;
        }
        
        return false;
        
    }
    
}
