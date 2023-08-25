package frMenu;

import Conexion.Prestamo;
import Conexion.PrestamosDB;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Prestamos extends javax.swing.JFrame {
    private final PrestamosDB prestamosDB;

    public Prestamos() {
        initComponents();
        setTitle("Panel Prestamos");
        setLocationRelativeTo(null);
        setResizable(false);

        prestamosDB = new PrestamosDB();
        mostrarPrestamosEnTabla();
    }
    private void mostrarPrestamosEnTabla() {
        try {
            DefaultTableModel model = (DefaultTableModel) TablaPrestamos.getModel();
            model.setRowCount(0); 
            
            List<Prestamo> prestamos = prestamosDB.obtenerTodosLosPrestamos();
            for (Prestamo prestamo : prestamos) {
                Object[] rowData = {
                    prestamo.getIdPrestamo(),
                    prestamo.getIdLibro(),
                    prestamo.getFechaPrestamo(),
                    prestamo.getFechaDevolucion(),
                    prestamo.getIdUsuario(),
                    prestamo.getEstado()
                };
                model.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al obtener los préstamos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GenerarPrestamo = new javax.swing.JButton();
        DesactivarPrestamo = new javax.swing.JButton();
        ConsultarPrestamo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPrestamos = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        btnSocios = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        EliminarPrestamo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        GenerarPrestamo.setBackground(new java.awt.Color(51, 255, 51));
        GenerarPrestamo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        GenerarPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        GenerarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/nuevo-documento.png"))); // NOI18N
        GenerarPrestamo.setText("GENERAR");
        GenerarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarPrestamoActionPerformed(evt);
            }
        });

        DesactivarPrestamo.setBackground(new java.awt.Color(255, 153, 153));
        DesactivarPrestamo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        DesactivarPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        DesactivarPrestamo.setText("DESACTIVAR / ACTIVAR");
        DesactivarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesactivarPrestamoActionPerformed(evt);
            }
        });

        ConsultarPrestamo.setBackground(new java.awt.Color(153, 255, 204));
        ConsultarPrestamo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        ConsultarPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        ConsultarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/buscar.png"))); // NOI18N
        ConsultarPrestamo.setText("CONSULTAR");
        ConsultarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarPrestamoActionPerformed(evt);
            }
        });

        TablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PRESTAMO", "ID_LIBRO", "FECHA_PRESTAMO", "FECHA_DEVOLUCION", "ID_USUARIO", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(TablaPrestamos);

        btnCerrar.setBackground(new java.awt.Color(255, 0, 51));
        btnCerrar.setText("X");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnCatalogo.setBackground(new java.awt.Color(0, 204, 204));
        btnCatalogo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCatalogo.setForeground(new java.awt.Color(0, 0, 0));
        btnCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/buscar.png"))); // NOI18N
        btnCatalogo.setText("CATALOGO");
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });

        btnSocios.setBackground(new java.awt.Color(0, 204, 204));
        btnSocios.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSocios.setForeground(new java.awt.Color(0, 0, 0));
        btnSocios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/socios (1).png"))); // NOI18N
        btnSocios.setText("SOCIOS");
        btnSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSociosActionPerformed(evt);
            }
        });

        btnEmpleados.setBackground(new java.awt.Color(0, 204, 204));
        btnEmpleados.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/empleados.png"))); // NOI18N
        btnEmpleados.setText("EMPLEADOS");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/Prestamo_1.png"))); // NOI18N
        jButton5.setText("PRESTAMOS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        EliminarPrestamo.setBackground(new java.awt.Color(255, 51, 51));
        EliminarPrestamo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        EliminarPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        EliminarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/borrar.png"))); // NOI18N
        EliminarPrestamo.setText("ELIMINAR");
        EliminarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPrestamoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PANEL PRESTAMOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(GenerarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ConsultarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(DesactivarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(EliminarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCerrar)
                                .addGap(48, 48, 48)
                                .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(217, 217, 217))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(DesactivarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenerarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        // TODO add your handling code here:
        Libros librosForm = new Libros();

        // Mostrar el formulario "Empleados"
        librosForm.setVisible(true);
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSociosActionPerformed
        // TODO add your handling code here:
        frSocios frSociosForm = new frSocios();

        // Mostrar el formulario "Socios"
        frSociosForm.setVisible(true);
    }//GEN-LAST:event_btnSociosActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
        Empleados empleadosForm = new Empleados();

        // Mostrar el formulario "Empleados"
        empleadosForm.setVisible(true);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void GenerarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarPrestamoActionPerformed
        GenerarPrestamo generarPrestamoForm = new GenerarPrestamo(prestamosDB);
        generarPrestamoForm.setVisible(true);
        
    }//GEN-LAST:event_GenerarPrestamoActionPerformed

    private void ConsultarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarPrestamoActionPerformed
       String idPrestamo = JOptionPane.showInputDialog(this, "Ingrese ID de Prestamo:", "Consultar Prestamo", JOptionPane.QUESTION_MESSAGE);
        
        if (idPrestamo != null && !idPrestamo.isEmpty()) {
            try {
                String prestamoInfo = prestamosDB.consultarPrestamo(idPrestamo);
                if (prestamoInfo != null) {
                    JOptionPane.showMessageDialog(this, prestamoInfo, "Prestamo Encontrado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró el prestamo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error al consultar el prestamo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_ConsultarPrestamoActionPerformed

    private void DesactivarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesactivarPrestamoActionPerformed
         String idPrestamo = JOptionPane.showInputDialog(this, "Ingrese ID de Prestamo:", "Desactivar/Activar Prestamo", JOptionPane.QUESTION_MESSAGE);
    
    if (idPrestamo != null && !idPrestamo.isEmpty()) {
        try {
            String estadoActual = prestamosDB.obtenerEstadoPrestamo(idPrestamo);
            if (estadoActual != null) {
                String nuevoEstado = estadoActual.equals("activo") ? "inactivo" : "activo";

                boolean success = prestamosDB.desactivarActivarPrestamo(idPrestamo, nuevoEstado);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Prestamo cambiado a estado " + nuevoEstado + " exitosamente.", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo actualizar el estado del prestamo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el prestamo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al actualizar el estado del prestamo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }//GEN-LAST:event_DesactivarPrestamoActionPerformed

    private void EliminarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPrestamoActionPerformed
        String idPrestamo = JOptionPane.showInputDialog(this, "Ingrese ID de Prestamo:", "Eliminar Prestamo", JOptionPane.QUESTION_MESSAGE);
        
        if (idPrestamo != null && !idPrestamo.isEmpty()) {
            int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar el prestamo?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    boolean success = prestamosDB.eliminarPrestamo(idPrestamo);
                    if (success) {
                        JOptionPane.showMessageDialog(this, "Prestamo eliminado exitosamente.", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo eliminar el prestamo.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Error al eliminar el prestamo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_EliminarPrestamoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Prestamos PrestamosForm = new Prestamos();

        // Mostrar el formulario "Prestamos"
        PrestamosForm.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed


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
            java.util.logging.Logger.getLogger(Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarPrestamo;
    private javax.swing.JButton DesactivarPrestamo;
    private javax.swing.JButton EliminarPrestamo;
    private javax.swing.JButton GenerarPrestamo;
    private javax.swing.JTable TablaPrestamos;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnSocios;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
