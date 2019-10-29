
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
    public boolean registrarCliente(String pId, String pNombre, String pCorreo,
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
            
            Casillero casillero = Controlador.getSingletonInstance().getCounter().getListaCasillerosDisponibles().poll();
            casillero.setEstado(true); //Casillero ocupado
            
            Cliente cliente =  new Cliente(Integer.parseInt(pId), pNombre, 
                    pCorreo, Integer.parseInt(pTelefono), pDireccion, pSexo, pFechaNacimiento, casillero);
            
            Controlador.getSingletonInstance().getCounter().getListaCasillerosOcupados().add(casillero);
            Controlador.getSingletonInstance().getCounter().getListaClientes().add(cliente);
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
    
    /**
     * Busca el cliente en la lista de clientes del counter
     * @param pId
     * @return Si encuentra el cliente, retorna el index, de lo contrario retorna -1
     */
    public int buscarCliente(String pId){
        int index = -1;
        if (Controlador.getSingletonInstance().validarDigitos(pId)) {
            int id = Integer.parseInt(pId);
            Cliente cliente = new Cliente(id);
            index = Controlador.getSingletonInstance().getCounter().getListaClientes().indexOf(cliente);
        }
        return index;
    } 
    
    /**
     * Obtiene el cliente de la listaClientes del counter
     * @param pIndex
     * @return Retorna el objeto cliente 
     */
    public Cliente consultarDatosCliente(int pIndex){
        Cliente cliente = Controlador.getSingletonInstance().getCounter().getListaClientes().get(pIndex);
        return cliente;
    }
    
    /**
     * Elimina el cliente de la listaClientes del counter
     * @param pId
     * @return Retorna true si se logró eliminar, de lo contrario retornará false
     */
    public boolean eliminarCliente(String pId){
        int index = buscarCliente(pId);
        if (index >= 0) {
            Cliente cliente = Controlador.getSingletonInstance().getCounter().getListaClientes().remove(index);
            Casillero casillero = cliente.getCasillero();
            casillero.limpiarCasillero();
            Controlador.getSingletonInstance().getCounter().getListaCasillerosOcupados().remove(casillero);
            Controlador.getSingletonInstance().getCounter().getListaCasillerosDisponibles().add(casillero);
            return true;
        } 
        return false;
    }
    
    
}
