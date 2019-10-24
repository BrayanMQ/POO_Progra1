
package control;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modelo.Casillero;
import modelo.Cliente;
import static modelo.IConstants.CASILLERO_MIL;
import modelo.TSexo;

/**
 *
 * @author Ronny, Brayan, Isaac
 */
public class GestorCliente {
   
    /**
     * Crea un cliente junto con su respectivo casillero y los añade a las listas clientes/casilleros de la clase Counter
     * @param pId 
     * @param pNombre
     * @param pCorreo
     * @param pTelefono
     * @param pDireccion
     * @param pSexo
     * @param pFechaNacimiento
     * @return Retorna true si existe un error al crear un cliente, caso contrario retornará false
     */
    public boolean crearCliente(String pId, String pNombre, String pCorreo,
            String pTelefono, String pDireccion, TSexo pSexo, Date pFechaNacimiento){
        
        boolean error = false;
        
        if (validarTelefono(pTelefono)) {
            error = true;
        }
        if (validarIdClienteExistente(pId)) {
            error = true;
        }
        if (validarCorreo(pCorreo)) {
            error = true;
        }
        
        if (error) {
            int idCasillero = Controlador.getSingletonInstance().getCounter().getListaCasilleros().size() + CASILLERO_MIL;
            
            Casillero casillero = new Casillero(idCasillero);
            
            Cliente cliente =  new Cliente(Integer.parseInt(pId), pNombre, 
                    pCorreo, Integer.parseInt(pTelefono), pDireccion, pSexo, pFechaNacimiento, casillero);
            
            Controlador.getSingletonInstance().getCounter().getListaClientes().add(cliente);
            
            Controlador.getSingletonInstance().getCounter().getListaCasilleros().add(casillero);
        }
        
        return error;
    }
    
    /**
     * Valida que el teléfono tenga 8 dígitos
     * @param pTelefono
     * @return Retornará true si el teléfono es válido, caso contrario retornará false
     */
    public boolean validarTelefono(String pTelefono){
        if (pTelefono.matches("\\d8")) {
            return true;
        }
        return false;
    }
    
    /**
     * Valida si ya existe un cliente con el id que se recibe
     * @param pId
     * @return Retornará true si no existe un cliente con ese id, caso contrario retornará false 
     */
    public boolean validarIdClienteExistente(String pId){
        if (!Controlador.getSingletonInstance().getCounter().getListaClientes().equals(Integer.parseInt(pId))) {
            return true;
        }
        return false;
    }
    
    /**
     * Valida que el correo tenga una estructura válida
     * @param pCorreo
     * @return Retornará true si el correo es válido, caso contrario retornará false
     */
    public boolean validarCorreo(String pCorreo){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pCorreo);
        return matcher.matches();
    }
    
    
}
