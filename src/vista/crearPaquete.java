/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Controlador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Casillero;
import modelo.Paquete;

/**
 *
 * @author dark1
 */
public class crearPaquete extends javax.swing.JDialog {
    private static Casillero casillero;
    /**
     * Creates new form crearPaquete
     */
    public crearPaquete(java.awt.Frame parent, boolean modal, Casillero casillero) {
        super(parent, modal);
        this.casillero = casillero;
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

        txt_id = new javax.swing.JTextField();
        txt_peso = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        txt_remitente = new javax.swing.JTextField();
        lbl_id = new javax.swing.JLabel();
        lbl_peso = new javax.swing.JLabel();
        lbl_descripcion = new javax.swing.JLabel();
        lbl_remitente = new javax.swing.JLabel();
        btn_crearPaquete = new javax.swing.JButton();
        lbl_error = new javax.swing.JLabel();
        lbl_tipoPaquete = new javax.swing.JLabel();
        cb_tipoPaquete = new javax.swing.JComboBox<>();
        lbl_fragil = new javax.swing.JLabel();
        checkB_fragil = new javax.swing.JCheckBox();
        lbl_contElectronico = new javax.swing.JLabel();
        checkB_contElectronico = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionActionPerformed(evt);
            }
        });

        lbl_id.setText("Id:");

        lbl_peso.setText("Peso:");

        lbl_descripcion.setText("Descripción:");

        lbl_remitente.setText("Remitente:");

        btn_crearPaquete.setText("Crear paquete");
        btn_crearPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearPaqueteActionPerformed(evt);
            }
        });

        lbl_tipoPaquete.setText("Tipo de paquete:");

        cb_tipoPaquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caja", "Bolsa" }));
        cb_tipoPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipoPaqueteActionPerformed(evt);
            }
        });

        lbl_fragil.setText("Frágil:");

        lbl_contElectronico.setText("Contenido electrónico:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_error, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_fragil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_peso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_descripcion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_remitente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tipoPaquete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_contElectronico, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkB_contElectronico)
                                    .addComponent(checkB_fragil))
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_descripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_remitente)
                                    .addComponent(txt_peso)
                                    .addComponent(cb_tipoPaquete, 0, 105, Short.MAX_VALUE))))))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_crearPaquete)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_peso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_descripcion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_remitente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipoPaquete)
                    .addComponent(cb_tipoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkB_fragil)
                    .addComponent(lbl_fragil))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkB_contElectronico)
                    .addComponent(lbl_contElectronico))
                .addGap(18, 18, 18)
                .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_crearPaquete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionActionPerformed

    private void cb_tipoPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipoPaqueteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tipoPaqueteActionPerformed

    private void btn_crearPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearPaqueteActionPerformed
        boolean error = false;
        String mensajeError = "";
        lbl_error.setText("");
        ArrayList<String> listaDatos = new ArrayList<>();
        listaDatos.add(txt_id.getText());
        listaDatos.add(txt_peso.getText());
        listaDatos.add(txt_descripcion.getText());
        listaDatos.add(txt_remitente.getText());
        
        if (!Controlador.getSingletonInstance().getGestorCliente().validarDatoVacio(listaDatos)) {
            if (Controlador.getSingletonInstance().validarDigitosEnteros(txt_id.getText())) {
                if (Controlador.getSingletonInstance().validarDigitosDobles(txt_peso.getText())) {
                    
                    Paquete paquete = Controlador.getSingletonInstance().getGestorEntregable().crearPaquete(Integer.parseInt(txt_id.getText()), 
                            Double.parseDouble(txt_peso.getText()), 
                            txt_descripcion.getText(), txt_remitente.getText(), 
                            (String)cb_tipoPaquete.getSelectedItem(), 
                            checkB_fragil.isSelected(), checkB_contElectronico.isSelected());
                    
                    boolean insertado = Controlador.getSingletonInstance()
                            .getGestorEntregable().buscarEntregableEInsertar(paquete, casillero);
                    
                    if (!insertado) { //Si no lo insertó
                        lbl_error.setText("Ya existe un paquete con el mismo id.");
                    }
                    
                    JOptionPane.showMessageDialog(this, "Se registró el paquete con éxito", "Paquete registrado", JOptionPane.INFORMATION_MESSAGE);
                    
                }
                 mensajeError = mensajeError  + "El peso debe ser un número.\n";
            }
            mensajeError = mensajeError  + "El id debe ser un número entero.\n";
        }
            mensajeError = mensajeError  + "No se debe dejar espacios en blanco.\n";
            
        lbl_error.setText(mensajeError);
        
    }//GEN-LAST:event_btn_crearPaqueteActionPerformed

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
            java.util.logging.Logger.getLogger(crearPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                crearPaquete dialog = new crearPaquete(new javax.swing.JFrame(), true, casillero);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crearPaquete;
    private javax.swing.JComboBox<String> cb_tipoPaquete;
    private javax.swing.JCheckBox checkB_contElectronico;
    private javax.swing.JCheckBox checkB_fragil;
    private javax.swing.JLabel lbl_contElectronico;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JLabel lbl_fragil;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_peso;
    private javax.swing.JLabel lbl_remitente;
    private javax.swing.JLabel lbl_tipoPaquete;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_remitente;
    // End of variables declaration//GEN-END:variables
}
