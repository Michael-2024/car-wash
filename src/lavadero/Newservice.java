/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lavadero;

/**
 *
 * @author crani
 */
public class Newservice extends javax.swing.JFrame {

    /**
     * Creates new form Newservice
     */
    public Newservice() {
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

        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JTextField();
        Placa = new javax.swing.JTextField();
        Tipovehiculo = new javax.swing.JComboBox<>();
        Telefono = new javax.swing.JTextField();
        Tipolavado = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(28, 0), new java.awt.Dimension(28, 0), new java.awt.Dimension(28, 32767));
        Añadir = new javax.swing.JButton();
        Atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(9, 0, 0, 7));

        Nombre.setText("Nombre del cliente");
        jPanel1.add(Nombre);

        Placa.setText("Placa del vehiculo");
        jPanel1.add(Placa);

        Tipovehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de vehiculo", "Moto", "Carro", " ", " " }));
        Tipovehiculo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TipovehiculoComponentAdded(evt);
            }
        });
        Tipovehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipovehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(Tipovehiculo);

        Telefono.setText("Telefono");
        jPanel1.add(Telefono);

        Tipolavado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de lavado", "Lavado sencillo (solo tapas)", "Lavado especial (Cojineria y tapas)", "Lavado con polichado (Cojineria y encerado)", " " }));
        Tipolavado.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TipolavadoComponentAdded(evt);
            }
        });
        Tipolavado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipolavadoActionPerformed(evt);
            }
        });
        jPanel1.add(Tipolavado);
        jPanel1.add(filler1);

        Añadir.setBackground(new java.awt.Color(0, 153, 0));
        Añadir.setText("Añadir");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        jPanel1.add(Añadir);

        Atras.setBackground(new java.awt.Color(255, 153, 0));
        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(Atras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        menu m= new menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    private void TipolavadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipolavadoActionPerformed
                                // TODO add your handling code here:
    }//GEN-LAST:event_TipolavadoActionPerformed

    private void TipolavadoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TipolavadoComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TipolavadoComponentAdded

    private void TipovehiculoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TipovehiculoComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TipovehiculoComponentAdded

    private void TipovehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipovehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipovehiculoActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
       
        Reportservice r= new Reportservice();
        Reportservice.o[0]= Nomservicie.getText().trim();
        o[1]= Nombre.getText().trim();
        o[2]= Telefono.getText().trim();
        o[3]= Placa.getText().trim();
        o[4]= Tipovehiculo.getText().trim();
        o[5]= Tipolavado.getText().trim();
        
        inf.addRow(o);
    }//GEN-LAST:event_AñadirActionPerformed

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
            java.util.logging.Logger.getLogger(Newservice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Newservice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Newservice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Newservice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Newservice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Atras;
    public javax.swing.JButton Añadir;
    public javax.swing.JTextField Nombre;
    public javax.swing.JTextField Placa;
    public javax.swing.JTextField Telefono;
    public javax.swing.JComboBox<String> Tipolavado;
    public javax.swing.JComboBox<String> Tipovehiculo;
    private javax.swing.Box.Filler filler1;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
