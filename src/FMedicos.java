
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class FMedicos extends javax.swing.JFrame {

    Conexion2 cnx;
    String todo = "SELECT * FROM medicos";
    ImageIcon foto;
    String archivoFoto;   // ruta de la foto elegida (null = no se eligió una nueva)

    public FMedicos() {
        initComponents();
        setLocationRelativeTo(null);
        TConsultas.setRowHeight(100);

        cnx = new Conexion2();
        if (cnx.conectar("localhost", "simitel", "root", "") == 1) {
            cnx.entablar(todo, TConsultas);
        } else {
            JOptionPane.showMessageDialog(this, "Sin conexion a la BD");
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BInsertar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();
        BLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TEspecialidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CBSexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CBEstado = new javax.swing.JComboBox<>();
        LFoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE MÉDICOS - Procedimientos almacenados (simitel)");
        setPreferredSize(new java.awt.Dimension(830, 680));
        setResizable(false);
        getContentPane().setLayout(null);

        BInsertar.setText("INSERTAR");
        BInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(BInsertar);
        BInsertar.setBounds(20, 15, 120, 40);

        BActualizar.setText("ACTUALIZAR");
        BActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BActualizar);
        BActualizar.setBounds(150, 15, 120, 40);

        BBorrar.setText("BORRAR");
        BBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(BBorrar);
        BBorrar.setBounds(280, 15, 120, 40);

        BLimpiar.setText("LIMPIAR");
        BLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BLimpiar);
        BLimpiar.setBounds(410, 15, 120, 40);

        jLabel1.setText("CÉDULA:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 75, 115, 25);
        getContentPane().add(TCedula);
        TCedula.setBounds(140, 75, 200, 25);

        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 110, 115, 25);
        getContentPane().add(TNombre);
        TNombre.setBounds(140, 110, 340, 25);

        jLabel3.setText("ESPECIALIDAD:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 145, 115, 25);
        getContentPane().add(TEspecialidad);
        TEspecialidad.setBounds(140, 145, 340, 25);

        jLabel4.setText("SEXO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 115, 25);

        CBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otros" }));
        getContentPane().add(CBSexo);
        CBSexo.setBounds(140, 180, 200, 25);

        jLabel5.setText("FECHA NAC.:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 215, 115, 25);
        getContentPane().add(TFecha);
        TFecha.setBounds(140, 215, 200, 25);

        jLabel6.setText("(AAAA-MM-DD)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 215, 120, 25);

        jLabel7.setText("ESTADO:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 250, 115, 25);

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        getContentPane().add(CBEstado);
        CBEstado.setBounds(140, 250, 200, 25);

        LFoto.setBackground(new java.awt.Color(0, 102, 102));
        LFoto.setForeground(new java.awt.Color(255, 255, 255));
        LFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFoto.setText("FOTO");
        LFoto.setToolTipText("Clic para elegir la foto");
        LFoto.setOpaque(true);
        LFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LFotoMousePressed(evt);
            }
        });
        getContentPane().add(LFoto);
        LFoto.setBounds(600, 75, 120, 150);

        TConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T1", "T2", "T3", "T4", "T5", "T6", "T7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TConsultasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 300, 770, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInsertarActionPerformed
        if (!camposValidos()) {
            return;
        }
        try {
            // foto_m es NOT NULL: si no se eligió foto se manda un arreglo vacío
            byte[] bytesFoto = (archivoFoto == null) ? new byte[0] : Files.readAllBytes(Path.of(archivoFoto));
            ejecutar(new Object[]{
                "INSERT",
                TCedula.getText().trim(),
                TNombre.getText().trim(),
                TEspecialidad.getText().trim(),
                CBSexo.getSelectedItem().toString(),
                TFecha.getText().trim(),
                CBEstado.getSelectedItem().toString(),
                bytesFoto
            });
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen");
        }
    }//GEN-LAST:event_BInsertarActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        if (!camposValidos()) {
            return;
        }
        try {
            byte[] bytesFoto = (archivoFoto == null) ? null : Files.readAllBytes(Path.of(archivoFoto));
            ejecutar(new Object[]{
                "UPDATE",
                TCedula.getText().trim(),
                TNombre.getText().trim(),
                TEspecialidad.getText().trim(),
                CBSexo.getSelectedItem().toString(),
                TFecha.getText().trim(),
                CBEstado.getSelectedItem().toString(),
                bytesFoto
            });
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen");
        }
    }//GEN-LAST:event_BActualizarActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        if (TCedula.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecciona un médico de la tabla o escribe su cédula");
            return;
        }
        int r = JOptionPane.showConfirmDialog(this,
                "¿Borrar al médico " + TCedula.getText().trim() + "?", "Confirmar",
                JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            ejecutar(new Object[]{
                "DELETE", TCedula.getText().trim(), null, null, null, null, null, null
            });
        }
    }//GEN-LAST:event_BBorrarActionPerformed

    private void BLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_BLimpiarActionPerformed

    private void LFotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LFotoMousePressed
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir") + "/imagenes/");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            archivoFoto = fc.getSelectedFile().getPath();
            foto = new ImageIcon(archivoFoto);
            ponerFoto(foto);
        }
    }//GEN-LAST:event_LFotoMousePressed

    private void TConsultasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultasMousePressed
        int f = TConsultas.rowAtPoint(evt.getPoint());
        if (f < 0) {
            return;
        }
        TCedula.setText(String.valueOf(TConsultas.getValueAt(f, 0)));
        TNombre.setText(String.valueOf(TConsultas.getValueAt(f, 1)));
        TEspecialidad.setText(String.valueOf(TConsultas.getValueAt(f, 2)));
        CBSexo.setSelectedItem(String.valueOf(TConsultas.getValueAt(f, 3)));

        String fecha = String.valueOf(TConsultas.getValueAt(f, 4));
        TFecha.setText(fecha.length() >= 10 ? fecha.substring(0, 10) : fecha);

        CBEstado.setSelectedItem(String.valueOf(TConsultas.getValueAt(f, 5)));

        Object fotoTabla = TConsultas.getValueAt(f, 6);
        ponerFoto(fotoTabla instanceof ImageIcon ? (ImageIcon) fotoTabla : null);
        archivoFoto = null;   // así, al actualizar sin elegir foto, se conserva la anterior
    }//GEN-LAST:event_TConsultasMousePressed

    // ------------------------------------------------------------ AUXILIARES
    // Muestra una foto escalada en la etiqueta (o la deja vacía)
    private void ponerFoto(ImageIcon icono) {
        if (icono != null && icono.getIconWidth() > 0) {
            LFoto.setIcon(new ImageIcon(Conexion2.escalarImagen(icono.getImage(), LFoto.getWidth(), LFoto.getHeight())));
            LFoto.setText("");
        } else {
            LFoto.setIcon(null);
            LFoto.setText("FOTO");
        }
    }

    private void limpiar() {
        TCedula.setText("");
        TNombre.setText("");
        TEspecialidad.setText("");
        TFecha.setText("");
        CBSexo.setSelectedIndex(0);
        CBEstado.setSelectedIndex(0);
        archivoFoto = null;
        ponerFoto(null);
    }

    private boolean camposValidos() {
        if (TCedula.getText().trim().isEmpty() || TNombre.getText().trim().isEmpty()
                || TEspecialidad.getText().trim().isEmpty() || TFecha.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llena todos los campos");
            return false;
        }
        if (!TFecha.getText().trim().matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "La fecha debe tener el formato AAAA-MM-DD");
            return false;
        }
        return true;
    }

    // Llama al procedimiento almacenado y muestra el resultado
    private void ejecutar(Object[] valores) {
        Object[] res = cnx.ejecutarCRUD("gestionar_medico", valores);
        JOptionPane.showMessageDialog(this, "Estado:" + res[0] + "\n Mensaje: " + res[1]);
        if (Integer.parseInt(res[0].toString()) == 1) {
            cnx.entablar(todo, TConsultas);
            limpiar();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMedicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BInsertar;
    private javax.swing.JButton BLimpiar;
    private javax.swing.JComboBox<String> CBEstado;
    private javax.swing.JComboBox<String> CBSexo;
    private javax.swing.JLabel LFoto;
    private javax.swing.JTextField TCedula;
    private javax.swing.JTable TConsultas;
    private javax.swing.JTextField TEspecialidad;
    private javax.swing.JTextField TFecha;
    private javax.swing.JTextField TNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
