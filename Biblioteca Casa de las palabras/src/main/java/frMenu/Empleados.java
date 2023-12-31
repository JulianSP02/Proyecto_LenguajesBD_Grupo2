
package frMenu;

import Conexion.EmpleadosDB;
import javax.swing.JOptionPane;
import Clases.principales.Empleado;


public class Empleados extends javax.swing.JFrame {
    private EmpleadosDB empleadosDB;


    public Empleados() {
        initComponents();
        setTitle("PANEL EMPLEADOS");
        setLocationRelativeTo(null);
        setResizable(false);
        empleadosDB = new EmpleadosDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        ConsultarEmpleados = new javax.swing.JButton();
        EliminarEmpleado = new javax.swing.JButton();
        AgregarEmpleado1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JTextField();
        IdEmpleado = new javax.swing.JTextField();
        SalarioEmpleado = new javax.swing.JTextField();
        FechaContrataciónEmpleado = new javax.swing.JTextField();
        PuestoEmpleadoComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BOTONCATALOGO = new javax.swing.JButton();
        BOTONSOCIOS = new javax.swing.JButton();
        BOTONEMPLEADOS = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setText("X");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        ConsultarEmpleados.setBackground(new java.awt.Color(0, 102, 204));
        ConsultarEmpleados.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        ConsultarEmpleados.setText("CONSULTAR");
        ConsultarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarEmpleadosActionPerformed(evt);
            }
        });

        EliminarEmpleado.setBackground(new java.awt.Color(255, 0, 0));
        EliminarEmpleado.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        EliminarEmpleado.setText("ELIMINAR");
        EliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEmpleadoActionPerformed(evt);
            }
        });

        AgregarEmpleado1.setBackground(new java.awt.Color(102, 255, 102));
        AgregarEmpleado1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        AgregarEmpleado1.setText("AGREGAR");
        AgregarEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarEmpleado1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PANEL EMPLEADOS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/empleado_1.png"))); // NOI18N

        NombreEmpleado.setText("NOMBRE EMPLEADO");
        NombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEmpleadoActionPerformed(evt);
            }
        });

        IdEmpleado.setText("ID EMPLEADO");
        IdEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdEmpleadoActionPerformed(evt);
            }
        });

        SalarioEmpleado.setText("SALARIO EMPLEADO");
        SalarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioEmpleadoActionPerformed(evt);
            }
        });

        FechaContrataciónEmpleado.setText("FECHA DE CONTRATACIÓN");
        FechaContrataciónEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaContrataciónEmpleadoActionPerformed(evt);
            }
        });

        PuestoEmpleadoComboBox.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        PuestoEmpleadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administración", "Contabilidad", "Recepción", "Mantenimiento", "Voluntarios" }));
        PuestoEmpleadoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuestoEmpleadoComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PUESTO EMPLEADO");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/empleado (1).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/tarjeta-de-identificacion.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/cuenta-por-cobrar.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/fecha.png"))); // NOI18N

        BOTONCATALOGO.setBackground(new java.awt.Color(0, 204, 204));
        BOTONCATALOGO.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        BOTONCATALOGO.setForeground(new java.awt.Color(0, 0, 0));
        BOTONCATALOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/buscar.png"))); // NOI18N
        BOTONCATALOGO.setText("CATALOGO");
        BOTONCATALOGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONCATALOGOActionPerformed(evt);
            }
        });

        BOTONSOCIOS.setBackground(new java.awt.Color(0, 204, 204));
        BOTONSOCIOS.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        BOTONSOCIOS.setForeground(new java.awt.Color(0, 0, 0));
        BOTONSOCIOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/socios (1).png"))); // NOI18N
        BOTONSOCIOS.setText("SOCIOS");
        BOTONSOCIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONSOCIOSActionPerformed(evt);
            }
        });

        BOTONEMPLEADOS.setBackground(new java.awt.Color(0, 204, 204));
        BOTONEMPLEADOS.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        BOTONEMPLEADOS.setForeground(new java.awt.Color(0, 0, 0));
        BOTONEMPLEADOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/empleados.png"))); // NOI18N
        BOTONEMPLEADOS.setText("EMPLEADOS");
        BOTONEMPLEADOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONEMPLEADOSActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/Recursos/Prestamo_1.png"))); // NOI18N
        jButton6.setText("PRESTAMOS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(227, 227, 227))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(IdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(NombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaContrataciónEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(BOTONSOCIOS, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BOTONEMPLEADOS)
                        .addGap(12, 12, 12)
                        .addComponent(jButton6)
                        .addGap(16, 16, 16))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AgregarEmpleado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PuestoEmpleadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(ConsultarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(jLabel2))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jLabel1))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton5)
                                .addGap(27, 27, 27)
                                .addComponent(BOTONCATALOGO)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BOTONSOCIOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BOTONCATALOGO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(BOTONEMPLEADOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(NombreEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(SalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaContrataciónEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PuestoEmpleadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EliminarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConsultarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void PuestoEmpleadoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuestoEmpleadoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PuestoEmpleadoComboBoxActionPerformed

    private void SalarioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalarioEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalarioEmpleadoActionPerformed

    private void NombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreEmpleadoActionPerformed

    private void IdEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdEmpleadoActionPerformed

    private void FechaContrataciónEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaContrataciónEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaContrataciónEmpleadoActionPerformed

    private void AgregarEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarEmpleado1ActionPerformed
        // TODO add your handling code here:
        String nombre = NombreEmpleado.getText();
        int idEmpleado = Integer.parseInt(IdEmpleado.getText());
        double salario = Double.parseDouble(SalarioEmpleado.getText());
        String fechaContratacion = FechaContrataciónEmpleado.getText();
        String puesto = PuestoEmpleadoComboBox.getSelectedItem().toString();

        Empleado empleado = new Empleado(idEmpleado, nombre, salario, fechaContratacion, puesto);
        empleadosDB.insertarEmpleado(empleado);

        JOptionPane.showMessageDialog(this, "Empleado agregado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AgregarEmpleado1ActionPerformed

    private void ConsultarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarEmpleadosActionPerformed
        // TODO add your handling code here:
         int idEmpleado = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el ID del empleado a consultar:"));
        Empleado empleado = empleadosDB.consultarEmpleadoPorId(idEmpleado);
    
    if (empleado != null) {
        String mensaje = "Datos del Empleado:\n" +
                "Nombre: " + empleado.getNombre() + "\n" +
                "ID: " + empleado.getId() + "\n" +
                "Salario: " + empleado.getSalario() + "\n" +
                "Fecha de Contratación: " + empleado.getFechaContratacion() + "\n" +
                "Puesto: " + empleado.getPuesto();
        JOptionPane.showMessageDialog(this, mensaje, "Empleado Encontrado", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Empleado no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_ConsultarEmpleadosActionPerformed

    private void EliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEmpleadoActionPerformed
        // TODO add your handling code here:
        int idEmpleado = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el ID del empleado a eliminar:"));
        if (empleadosDB.eliminarEmpleadoPorId(idEmpleado)) {
            JOptionPane.showMessageDialog(this, "Empleado eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar el empleado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EliminarEmpleadoActionPerformed

    private void BOTONSOCIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONSOCIOSActionPerformed
        // TODO add your handling code here:
        frSocios frSociosForm = new frSocios();

        // Mostrar el formulario "Socios"
        frSociosForm.setVisible(true);
        
    }//GEN-LAST:event_BOTONSOCIOSActionPerformed

    private void BOTONCATALOGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONCATALOGOActionPerformed
        // TODO add your handling code here:
        Libros librosForm = new Libros();

        // Mostrar el formulario "Empleados"
        librosForm.setVisible(true);
        
    }//GEN-LAST:event_BOTONCATALOGOActionPerformed

    private void BOTONEMPLEADOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONEMPLEADOSActionPerformed
        // TODO add your handling code here:
        Empleados empleadosForm = new Empleados();

        // Mostrar el formulario "Empleados"
        empleadosForm.setVisible(true);
    }//GEN-LAST:event_BOTONEMPLEADOSActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Prestamos PrestamosForm = new Prestamos();

        // Mostrar el formulario "Prestamos"
        PrestamosForm.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarEmpleado1;
    private javax.swing.JButton BOTONCATALOGO;
    private javax.swing.JButton BOTONEMPLEADOS;
    private javax.swing.JButton BOTONSOCIOS;
    private javax.swing.JButton ConsultarEmpleados;
    private javax.swing.JButton EliminarEmpleado;
    private javax.swing.JTextField FechaContrataciónEmpleado;
    private javax.swing.JTextField IdEmpleado;
    private javax.swing.JTextField NombreEmpleado;
    private javax.swing.JComboBox<String> PuestoEmpleadoComboBox;
    private javax.swing.JTextField SalarioEmpleado;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
