
package vista;

import control.Controlador;

public class Counter extends javax.swing.JFrame {

    public Counter() {
        Controlador.getSingletonInstance();
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

        txt_nombre = new javax.swing.JTextField();
        txt_cedulaJuridica = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_cantidadCasilleros = new javax.swing.JTextField();
        lbl_creacionCounter = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_cedulaJuridica = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_cantidadCasilleros = new javax.swing.JLabel();
        btn_crear = new javax.swing.JButton();
        lbl_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        txt_cedulaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaJuridicaActionPerformed(evt);
            }
        });

        txt_cantidadCasilleros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadCasillerosActionPerformed(evt);
            }
        });

        lbl_creacionCounter.setText("Creación del counter");

        lbl_nombre.setText("Nombre:");

        lbl_cedulaJuridica.setText("Cédula Jurídica:");

        lbl_direccion.setText("Dirección:");

        lbl_cantidadCasilleros.setText("Cantidad de casilleros:");

        btn_crear.setText("Crear");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        lbl_error.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lbl_creacionCounter))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btn_crear)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_error, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_cantidadCasilleros)
                                    .addComponent(lbl_cedulaJuridica))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_cantidadCasilleros)
                                    .addComponent(txt_direccion)
                                    .addComponent(txt_cedulaJuridica)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_creacionCounter)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedulaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cedulaJuridica))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_direccion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cantidadCasilleros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidadCasilleros))
                .addGap(26, 26, 26)
                .addComponent(lbl_error, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_crear)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_cantidadCasillerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadCasillerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadCasillerosActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        boolean cedulaJuridicaValida = true;
        boolean cantidadCasillerosValida = true;
        String mensajeError = "";
        lbl_error.setText("");
        if (!Controlador.getSingletonInstance().validarDigitos(txt_cedulaJuridica.getText())) {
            mensajeError += "La cédula jurídica debe ser un dígito mayor a 0.\n";
            lbl_error.setText(mensajeError);
            cedulaJuridicaValida = false;
        }
        if (!Controlador.getSingletonInstance().validarDigitos(txt_cantidadCasilleros.getText())) {
            mensajeError += "La cantidad de casilleros debe ser un dígito mayor a 0.";
            lbl_error.setText(mensajeError);
            cantidadCasillerosValida = false;
        }
        
        if (cedulaJuridicaValida && cantidadCasillerosValida) {
            Controlador.getSingletonInstance().crearCounter(txt_nombre.getText(), txt_cedulaJuridica.getText(), txt_direccion.getText(), txt_cantidadCasilleros.getText());
        }
        
    }//GEN-LAST:event_btn_crearActionPerformed

    private void txt_cedulaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaJuridicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaJuridicaActionPerformed

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
            java.util.logging.Logger.getLogger(Counter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Counter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Counter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Counter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Counter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JLabel lbl_cantidadCasilleros;
    private javax.swing.JLabel lbl_cedulaJuridica;
    private javax.swing.JLabel lbl_creacionCounter;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JTextField txt_cantidadCasilleros;
    private javax.swing.JTextField txt_cedulaJuridica;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
