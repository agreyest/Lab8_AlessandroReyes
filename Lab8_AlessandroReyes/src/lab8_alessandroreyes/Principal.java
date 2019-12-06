package lab8_alessandroreyes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        SpinnerNumberModel YY = new SpinnerNumberModel();
        YY.setMinimum(10);
        YY.setValue(10);
        YY.setMaximum(110);
        js_edad.setModel(YY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_listarC = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_agendaC = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btn_agenda_r_ = new javax.swing.JButton();
        jd_crearC = new javax.swing.JDialog();
        btn_crear_r_ = new javax.swing.JButton();
        btn_crearC_ = new javax.swing.JButton();
        tf_nom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        js_edad = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        tf_num = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_correo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        jd_modificarC = new javax.swing.JDialog();
        jd_eliminarC = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_eliC = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btn_eliC_R_ = new javax.swing.JButton();
        btn_eliC = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_acciones = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jmi_agregarC = new javax.swing.JMenuItem();
        jmi_modificarC = new javax.swing.JMenuItem();
        jmi_eliminarC = new javax.swing.JMenuItem();
        jmi_listarC = new javax.swing.JMenuItem();
        jmi_enviarM = new javax.swing.JMenuItem();
        jmi_buzon = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jl_agendaC.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_agendaC);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Agenda de contactos");

        btn_agenda_r_.setText("Regresar");
        btn_agenda_r_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agenda_r_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_listarCLayout = new javax.swing.GroupLayout(jd_listarC.getContentPane());
        jd_listarC.getContentPane().setLayout(jd_listarCLayout);
        jd_listarCLayout.setHorizontalGroup(
            jd_listarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarCLayout.createSequentialGroup()
                .addGroup(jd_listarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_listarCLayout.createSequentialGroup()
                        .addComponent(btn_agenda_r_, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_listarCLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jd_listarCLayout.setVerticalGroup(
            jd_listarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarCLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listarCLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_agenda_r_, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_crear_r_.setText("Regresar");
        btn_crear_r_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crear_r_MouseClicked(evt);
            }
        });

        btn_crearC_.setText("Crear");
        btn_crearC_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearC_MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Nombre del contacto");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Edad del contacto");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Numero Telefonico");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Correo electronico");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Direccion");

        javax.swing.GroupLayout jd_crearCLayout = new javax.swing.GroupLayout(jd_crearC.getContentPane());
        jd_crearC.getContentPane().setLayout(jd_crearCLayout);
        jd_crearCLayout.setHorizontalGroup(
            jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearCLayout.createSequentialGroup()
                .addComponent(btn_crear_r_, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_crearC_, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearCLayout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tf_direccion)
                    .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_correo)
                            .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf_num, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nom)
                                    .addComponent(js_edad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(182, 182, 182))
        );
        jd_crearCLayout.setVerticalGroup(
            jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearCLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(js_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_num, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_crearC_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btn_crear_r_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jd_modificarCLayout = new javax.swing.GroupLayout(jd_modificarC.getContentPane());
        jd_modificarC.getContentPane().setLayout(jd_modificarCLayout);
        jd_modificarCLayout.setHorizontalGroup(
            jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_modificarCLayout.setVerticalGroup(
            jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jl_eliC.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_eliC);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione el contacto que quiere eliminar");

        btn_eliC_R_.setText("Regresar");
        btn_eliC_R_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliC_R_MouseClicked(evt);
            }
        });

        btn_eliC.setText("Eliminar");
        btn_eliC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_eliminarCLayout = new javax.swing.GroupLayout(jd_eliminarC.getContentPane());
        jd_eliminarC.getContentPane().setLayout(jd_eliminarCLayout);
        jd_eliminarCLayout.setHorizontalGroup(
            jd_eliminarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarCLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_eliminarCLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliC_R_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(btn_eliC))
        );
        jd_eliminarCLayout.setVerticalGroup(
            jd_eliminarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_eliminarCLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jd_eliminarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliC)
                    .addComponent(btn_eliC_R_)))
            .addGroup(jd_eliminarCLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jm_acciones.setText("Acciones");

        jMenu1.setText("Contactos");

        jmi_agregarC.setText("Agregar");
        jmi_agregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarCActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_agregarC);

        jmi_modificarC.setText("Modificar");
        jMenu1.add(jmi_modificarC);

        jmi_eliminarC.setText("Eliminar");
        jmi_eliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarCActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_eliminarC);

        jmi_listarC.setText("Agenda");
        jmi_listarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarCActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_listarC);

        jm_acciones.add(jMenu1);

        jmi_enviarM.setText("Enviar Mensaje");
        jm_acciones.add(jmi_enviarM);

        jmi_buzon.setText("Buzon de salida");
        jm_acciones.add(jmi_buzon);

        jMenuItem1.setText("Llamar");
        jm_acciones.add(jMenuItem1);

        jMenuBar1.add(jm_acciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Dba db = new Dba("./Database1.mdb");
        db.conectar();
        try {
            db.query.execute("select Numero,Nombre,Edad,Correo,Direccion from Contactos");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                contactos.add(new Contacto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        
        //----------------------------------------------------------------------------------------------------------------
        db = new Dba("./Database1.mdb");
        db.conectar();
        try {
            db.query.execute("select Emisor,Receptor,Fecha,Contenido from Mensajes");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                mensajes.add(new Mensaje(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        
        //----------------------------------------------------------------------------------------------------------------
        
        db = new Dba("./Database1.mdb");
        db.conectar();
        try {
            int c;
            String n;
            for (int i = 0; i < mensajes.size(); i++) {
                String emisor = mensajes.get(i).getEmisor();
                String receptor = mensajes.get(i).getReceptor();
                Date fecha = mensajes.get(i).getFecha();
                String contenido = mensajes.get(i).getContenido();
                db.query.execute("INSERT INTO Mensajes"
                        + " (Emisor,Receptor,Fecha,Contenido)"
                        + " VALUES ('" + emisor + "', '" + receptor + "', '" + fecha + "', '" + contenido +  "')");// " VALUES (?,?)");
                db.commit();
            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }//GEN-LAST:event_formWindowClosing

    private void jmi_listarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarCActionPerformed
        DefaultListModel modelo = (DefaultListModel) jl_agendaC.getModel();
        for (int i = 0; i < contactos.size(); i++) {
            modelo.addElement(contactos.get(i).toString());
        }
        jl_agendaC.setModel(modelo);
        
        this.setVisible(false);
        jd_listarC.setModal(true);
        jd_listarC.pack();
        jd_listarC.setLocationRelativeTo(this);
        jd_listarC.setVisible(true);
    }//GEN-LAST:event_jmi_listarCActionPerformed

    private void jmi_eliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarCActionPerformed
        DefaultListModel modelo = (DefaultListModel) jl_eliC.getModel();
        for (int i = 0; i < contactos.size(); i++) {
            modelo.addElement(contactos.get(i).toString());
        }
        jl_eliC.setModel(modelo);
        
        this.setVisible(false);
        jd_listarC.setModal(true);
        jd_listarC.pack();
        jd_listarC.setLocationRelativeTo(this);
        jd_listarC.setVisible(true);
    }//GEN-LAST:event_jmi_eliminarCActionPerformed

    private void btn_agenda_r_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agenda_r_MouseClicked
        jd_listarC.setModal(false);
        jd_listarC.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_agenda_r_MouseClicked

    private void btn_eliC_R_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliC_R_MouseClicked
        jd_listarC.setModal(false);
        jd_listarC.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_eliC_R_MouseClicked

    private void btn_eliCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliCMouseClicked

    private void jmi_agregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarCActionPerformed
        this.setVisible(false);
        jd_crearC.setModal(true);
        jd_crearC.pack();
        jd_crearC.setLocationRelativeTo(this);
        jd_crearC.setVisible(true);
    }//GEN-LAST:event_jmi_agregarCActionPerformed

    private void btn_crearC_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearC_MouseClicked
        boolean bande = true;
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNumero() == Integer.parseInt(tf_num.getText())) {
                JOptionPane.showMessageDialog(jd_crearC, "Este numero ya existe en su agenda.");
                bande = false;
            }
        }
        if (tf_num.getText() == null) {
            JOptionPane.showMessageDialog(jd_crearC, "Tiene que ingresar un numero telefonico.");
            bande = false;
        }
        if (tf_nom.getText() == null) {
            JOptionPane.showMessageDialog(jd_crearC, "Tiene que ingresar un nombre.");
            bande = false;
        }
        if (tf_direccion.getText() == null) {
            JOptionPane.showMessageDialog(jd_crearC, "Tiene que ingresar una direccion.");
            bande = false;
        }
        if (tf_correo.getText() == null) {
            JOptionPane.showMessageDialog(jd_crearC, "Tiene que ingresar un correo.");
            bande = false;
        }
        if (bande) {
            contactos.add(new Contacto(Integer.parseInt(tf_num.getText()), tf_nom.getText(), js_edad.getComponentCount(), 
                    tf_correo.getText(), tf_direccion.getText()));
            Dba db = new Dba("./Database1.mdb");
            db.conectar();
            try {
                int c;
                String n;
                int num = Integer.parseInt(tf_num.getText());
                String nom = tf_nom.getText();
                int edad = js_edad.getComponentCount();
                String correo = tf_correo.getText();
                String direccion = tf_direccion.getText();
                db.query.execute("INSERT INTO Contactos"
                        + " (Numero,Nombre,Edad,Correo,Direccion)"
                        + " VALUES ('" + num + "', '" + nom + "', '" + edad + "', '" + correo + "', '" + direccion + "')");// " VALUES (?,?)");
                db.commit();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
            tf_num.setText("");
            tf_nom.setText("");
            js_edad.setValue(10);
            tf_correo.setText("");
            tf_direccion.setText("");
            JOptionPane.showMessageDialog(jd_crearC, "Contacto guardado con exito");
        }
    }//GEN-LAST:event_btn_crearC_MouseClicked

    private void btn_crear_r_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crear_r_MouseClicked
        tf_num.setText("");
        tf_nom.setText("");
        js_edad.setValue(10);
        tf_correo.setText("");
        tf_direccion.setText("");
        jd_crearC.setModal(false);
        jd_crearC.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_crear_r_MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agenda_r_;
    private javax.swing.JButton btn_crearC_;
    private javax.swing.JButton btn_crear_r_;
    private javax.swing.JButton btn_eliC;
    private javax.swing.JButton btn_eliC_R_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_crearC;
    private javax.swing.JDialog jd_eliminarC;
    private javax.swing.JDialog jd_listarC;
    private javax.swing.JDialog jd_modificarC;
    private javax.swing.JList<String> jl_agendaC;
    private javax.swing.JList<String> jl_eliC;
    private javax.swing.JMenu jm_acciones;
    private javax.swing.JMenuItem jmi_agregarC;
    private javax.swing.JMenuItem jmi_buzon;
    private javax.swing.JMenuItem jmi_eliminarC;
    private javax.swing.JMenuItem jmi_enviarM;
    private javax.swing.JMenuItem jmi_listarC;
    private javax.swing.JMenuItem jmi_modificarC;
    private javax.swing.JSpinner js_edad;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_nom;
    private javax.swing.JTextField tf_num;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Contacto> contactos = new ArrayList();
    private ArrayList<Mensaje> mensajes = new ArrayList();
    private ArrayList<Llamada> llamadas = new ArrayList();
}
