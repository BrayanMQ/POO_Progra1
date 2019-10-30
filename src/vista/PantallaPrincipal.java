
package vista;

import control.Controlador;
import javax.swing.JOptionPane;
import modelo.Casillero;
import modelo.Cliente;
import modelo.IConstants;
import modelo.TSexo;
import vista.modificarCliente;

public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_menuPrincipal = new javax.swing.JMenuBar();
        subMenu_clientes = new javax.swing.JMenu();
        menuItem_registrarCliente = new javax.swing.JMenuItem();
        menuItem_modificarCliente = new javax.swing.JMenuItem();
        menuItem_consultarCliente = new javax.swing.JMenuItem();
        menuItem_eliminarCliente = new javax.swing.JMenuItem();
        subMenu_articulos = new javax.swing.JMenu();
        menuItem_recepcionArticulos = new javax.swing.JMenuItem();
        menuItem_retiroArticulos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subMenu_clientes.setText("Clientes");

        menuItem_registrarCliente.setText("Registrar cliente");
        menuItem_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_registrarClienteActionPerformed(evt);
            }
        });
        subMenu_clientes.add(menuItem_registrarCliente);

        menuItem_modificarCliente.setText("Modificar cliente");
        menuItem_modificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_modificarClienteActionPerformed(evt);
            }
        });
        subMenu_clientes.add(menuItem_modificarCliente);

        menuItem_consultarCliente.setText("Consultar cliente");
        menuItem_consultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_consultarClienteActionPerformed(evt);
            }
        });
        subMenu_clientes.add(menuItem_consultarCliente);

        menuItem_eliminarCliente.setText("Eliminar cliente");
        menuItem_eliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_eliminarClienteActionPerformed(evt);
            }
        });
        subMenu_clientes.add(menuItem_eliminarCliente);

        menu_menuPrincipal.add(subMenu_clientes);

        subMenu_articulos.setText("Artículos");

        menuItem_recepcionArticulos.setText("Recepción de artículos");
        menuItem_recepcionArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_recepcionArticulosActionPerformed(evt);
            }
        });
        subMenu_articulos.add(menuItem_recepcionArticulos);

        menuItem_retiroArticulos.setText("Retiro de artículos");
        menuItem_retiroArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_retiroArticulosActionPerformed(evt);
            }
        });
        subMenu_articulos.add(menuItem_retiroArticulos);

        menu_menuPrincipal.add(subMenu_articulos);

        setJMenuBar(menu_menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem_modificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_modificarClienteActionPerformed
        String id = JOptionPane.showInputDialog(this, "Indique el identificador de la persona que desea modificar.", "Modificar cliente", JOptionPane.QUESTION_MESSAGE);
        
        if (id != null ) {//Si no le da al botón cancelar
             int index = Controlador.getSingletonInstance().getGestorCliente().buscarCliente(id);
        
            if (index >= 0) {
                Cliente cliente = Controlador.getSingletonInstance().getGestorCliente().consultarDatosCliente(index);
                new modificarCliente(this, rootPaneCheckingEnabled, cliente).setVisible(true);
            } else {

            JOptionPane.showMessageDialog(this, "No se ha encontrado el cliente con id " + id + ".", "Modificar cliente", JOptionPane.INFORMATION_MESSAGE);

            }
        }
        
    }//GEN-LAST:event_menuItem_modificarClienteActionPerformed

    private void menuItem_consultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_consultarClienteActionPerformed
        String id = JOptionPane.showInputDialog(this, "Indique el identificador de la persona que desea consultar.", "Consultar cliente", JOptionPane.QUESTION_MESSAGE);
        
        if (id != null ) {//Si no le da al botón cancelar
            
            int index = Controlador.getSingletonInstance().getGestorCliente().buscarCliente(id);

            if (index >= 0) {
                Cliente cliente = Controlador.getSingletonInstance().getGestorCliente().consultarDatosCliente(index);
                JOptionPane.showMessageDialog(this, "Identificador: " + cliente.getId()+ "\n" + 
                        "Nombre: " + cliente.getNombre() + "\n" + 
                        "Correo: " + cliente.getCorreo()+ "\n" + 
                        "Teléfono: " + cliente.getTelefono() + "\n" +
                        "Dirección: " + cliente.getDireccion()+ "\n" +
                        "Sexo: " + cliente.getSexo().toString()+ "\n" +
                        "Fecha de nacimiento: " + cliente.getFechaNacimiento(), "Consultar cliente", JOptionPane.QUESTION_MESSAGE);
            } else {

            JOptionPane.showMessageDialog(this, "No se ha encontrado el cliente con id " + id + ".", "Consultar cliente", JOptionPane.INFORMATION_MESSAGE);

            }
        
        }
        
    }//GEN-LAST:event_menuItem_consultarClienteActionPerformed

    private void menuItem_eliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_eliminarClienteActionPerformed
        String id = JOptionPane.showInputDialog(this, "Indique el identificador de la persona que desea eliminar.", "Eliminar cliente", JOptionPane.QUESTION_MESSAGE);
        
        if (id != null ) {//Si no le da al botón cancelar

            int index = Controlador.getSingletonInstance().getGestorCliente().buscarCliente(id);

            if (index >= 0) {
                Controlador.getSingletonInstance().getGestorCliente().eliminarCliente(id);

            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado el cliente con id " + id + ".", "Eliminar cliente", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }

        
    }//GEN-LAST:event_menuItem_eliminarClienteActionPerformed

    private void menuItem_recepcionArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_recepcionArticulosActionPerformed
        String idDasillero = JOptionPane.showInputDialog(this, 
                "Digite el número de casillero que desea buscar.", 
                "Registrar artículos", JOptionPane.QUESTION_MESSAGE);

        if (idDasillero != null) {//Si no le da al botón cancelar
            
            //Obtenermos el casillero
            Casillero casillero  = Controlador.getSingletonInstance().getGestorCasillero().buscarCasillero(idDasillero);
            
            if (casillero != null) { //Si el casillero no es nulo
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona un tipo "
                + "de paquete", "Elegir tipo de paquete",
                JOptionPane.QUESTION_MESSAGE,null,
                IConstants.TIPOS_ENTREGABLE_COMBOBOX, 
                IConstants.TIPOS_ENTREGABLE_COMBOBOX[0]);
            
                if (opcion != null) { //Si no le da al botón cancelar

                    if (opcion.toString().equalsIgnoreCase("Sobre")) {
                        new crearSobre(this, rootPaneCheckingEnabled, casillero).setVisible(true);
                    } else if (opcion.toString().equalsIgnoreCase("Paquete")) {
                        new crearPaquete(this, rootPaneCheckingEnabled, casillero).setVisible(true);
                    } else if (opcion.toString().equalsIgnoreCase("Revista")) {
                        new crearRevista(this, rootPaneCheckingEnabled, casillero).setVisible(true);
                    } 
                }
            }
        }
    }//GEN-LAST:event_menuItem_recepcionArticulosActionPerformed

    private void menuItem_retiroArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_retiroArticulosActionPerformed
        String idCasillero = JOptionPane.showInputDialog(this, 
                "Digite el casillero que desea buscar.", 
                "Retirar artículos", JOptionPane.QUESTION_MESSAGE);

    }//GEN-LAST:event_menuItem_retiroArticulosActionPerformed

    private void menuItem_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_registrarClienteActionPerformed
        new registrarCliente(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItem_registrarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem menuItem_consultarCliente;
    private javax.swing.JMenuItem menuItem_eliminarCliente;
    private javax.swing.JMenuItem menuItem_modificarCliente;
    private javax.swing.JMenuItem menuItem_recepcionArticulos;
    private javax.swing.JMenuItem menuItem_registrarCliente;
    private javax.swing.JMenuItem menuItem_retiroArticulos;
    private javax.swing.JMenuBar menu_menuPrincipal;
    private javax.swing.JMenu subMenu_articulos;
    private javax.swing.JMenu subMenu_clientes;
    // End of variables declaration//GEN-END:variables
}
