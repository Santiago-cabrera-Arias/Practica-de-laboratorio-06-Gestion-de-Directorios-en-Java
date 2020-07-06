/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controladorDirectorio.ControladorDirectorio;
import java.io.File;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorDirectorio controladorDirectorio;

    public VentanaPrincipal() {
        initComponents();

        controladorDirectorio = new ControladorDirectorio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaDatosPq = new javax.swing.JTextArea();
        btnMostrarInformacion = new javax.swing.JButton();
        btnListarDirectorio = new javax.swing.JButton();
        btnListarArchivosOcultos = new javax.swing.JButton();
        btnListarDirectoriosOcultos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuGestionarDirectorio = new javax.swing.JMenu();
        menuCrear = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        menuRenombrar = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionar Directorios");

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Ruta");

        txtRuta.setBackground(new java.awt.Color(204, 255, 204));

        AreaDatosPq.setEditable(false);
        AreaDatosPq.setColumns(20);
        AreaDatosPq.setRows(5);
        jScrollPane1.setViewportView(AreaDatosPq);

        btnMostrarInformacion.setBackground(new java.awt.Color(102, 255, 153));
        btnMostrarInformacion.setText("Mostrar Informacion");
        btnMostrarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInformacionActionPerformed(evt);
            }
        });

        btnListarDirectorio.setBackground(new java.awt.Color(204, 255, 204));
        btnListarDirectorio.setText("Listar Directorios");
        btnListarDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectorioActionPerformed(evt);
            }
        });

        btnListarArchivosOcultos.setBackground(new java.awt.Color(204, 255, 204));
        btnListarArchivosOcultos.setText("Listar Archivos Ocultos");
        btnListarArchivosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarArchivosOcultosActionPerformed(evt);
            }
        });

        btnListarDirectoriosOcultos.setBackground(new java.awt.Color(204, 255, 204));
        btnListarDirectoriosOcultos.setText("Listar Directorios Ocultos");
        btnListarDirectoriosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectoriosOcultosActionPerformed(evt);
            }
        });

        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lista);

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Directorios");

        btnLimpiar.setBackground(new java.awt.Color(204, 255, 204));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        MenuGestionarDirectorio.setText("Gestionar Directorio");

        menuCrear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuCrear.setText(" Crear");
        menuCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrearActionPerformed(evt);
            }
        });
        MenuGestionarDirectorio.add(menuCrear);

        menuEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuEliminar.setText("Eliminar");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        MenuGestionarDirectorio.add(menuEliminar);

        menuRenombrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuRenombrar.setText("Renombrar");
        menuRenombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRenombrarActionPerformed(evt);
            }
        });
        MenuGestionarDirectorio.add(menuRenombrar);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_MASK));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        MenuGestionarDirectorio.add(menuSalir);

        jMenuBar1.add(MenuGestionarDirectorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarDirectorio)
                .addGap(9, 9, 9)
                .addComponent(btnListarArchivosOcultos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarDirectoriosOcultos)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnMostrarInformacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarDirectorio)
                    .addComponent(btnListarArchivosOcultos)
                    .addComponent(btnListarDirectoriosOcultos)
                    .addComponent(btnLimpiar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarInformacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void lista(List<String> listaDeArchivos) {
        int aux = 0;
        String vector[] = new String[listaDeArchivos.size()];
        for (String archivo : listaDeArchivos) {
            vector[aux] = archivo;
            aux = aux + 1;
        }
        lista.setListData(vector);

    }

    public void llenarLista(List<String> directorio) {
        DefaultListModel modelo = new DefaultListModel();
        modelo.clear();

        for (String nombre : directorio) {
            modelo.addElement(nombre);
        }
        lista.setModel(modelo);
        AreaDatosPq.setText("");
        btnMostrarInformacion.setEnabled(false);
    }


    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed

        System.exit(0);

    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrearActionPerformed

        String ruta = JOptionPane.showInputDialog("Ingrese la ruta del repositorio a crear");

        String crearRepositorio = JOptionPane.showInputDialog("Ingrese el nombre del repositorio a crear");

        if (crearRepositorio.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Campo Vacio");

        } else {

            controladorDirectorio.crearDirectorio(ruta, crearRepositorio);

            JOptionPane.showMessageDialog(this, "Carpeta creada con exito");

        }

    }//GEN-LAST:event_menuCrearActionPerformed

    private void menuRenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRenombrarActionPerformed

        int opcion = 0;
        if (opcion == 0) {
            String dato = JOptionPane.showInputDialog("Ingrese nuevo nombre");
            if (dato.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo se encuentra vacio");
            } else {
                String nombreActual = txtRuta.getText() + "/" + lista.getSelectedValue();
                String nuevoNombre = txtRuta.getText() + "/" + dato;
                controladorDirectorio.renombrar(nombreActual, nuevoNombre);

                File ruta = new File(txtRuta.getText());
                if (ruta.isDirectory()) {
                    lista(controladorDirectorio.listarDirectorios(ruta));
                } else {
                    lista(controladorDirectorio.listarArchivos(ruta));
                }
            }
        }

    }//GEN-LAST:event_menuRenombrarActionPerformed

    //Esto es para seleccionar el item dentro del jText

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked

        String nombre = lista.getSelectedValue();//Seleccionamos el item
        btnMostrarInformacion.setEnabled(true);
        System.out.println(nombre);


    }//GEN-LAST:event_listaMouseClicked

    private void btnListarDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectorioActionPerformed

        if (txtRuta.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Ingrese la ruta");

        } else {

            String url = txtRuta.getText();
            File obtenerDirectorio = new File(url);
            lista(controladorDirectorio.listarDirectorios(obtenerDirectorio));

        }
    }//GEN-LAST:event_btnListarDirectorioActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed

        int opcion = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar esta carpeta?");
        if (opcion == 0) {
            String ruta = txtRuta.getText() + "/" + lista.getSelectedValue();
            controladorDirectorio.eliminar(ruta);
            File rutas = new File(txtRuta.getText());
            if (rutas.isDirectory()) {
                lista(controladorDirectorio.listarDirectorios(new File(txtRuta.getText())));
            } else {
                lista(controladorDirectorio.listarArchivos(new File(txtRuta.getText())));
            }
        }

    }//GEN-LAST:event_menuEliminarActionPerformed

    private void btnMostrarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInformacionActionPerformed

        if(!lista.isSelectionEmpty()){
            
            String nombre = lista.getSelectedValue();
            String ruta = txtRuta.getText();
            
            String texto = controladorDirectorio.mostrarInformacion(ruta,nombre);
            
            AreaDatosPq.setText(texto);
            
        }
        
    
        
    }//GEN-LAST:event_btnMostrarInformacionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiar();


    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnListarArchivosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarArchivosOcultosActionPerformed

        if (txtRuta.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Ingrese la ruta");

        }

        String url = txtRuta.getText();
        File archivoOculto = new File(url);
        lista(controladorDirectorio.listarArchivosOcultos(archivoOculto));


    }//GEN-LAST:event_btnListarArchivosOcultosActionPerformed

    private void btnListarDirectoriosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectoriosOcultosActionPerformed

        if (txtRuta.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Ingrese la ruta");

        }

        String url = txtRuta.getText();
        File directorioOculto = new File(url);
        lista(controladorDirectorio.listarDirectoriosOcultos(directorioOculto));

    }//GEN-LAST:event_btnListarDirectoriosOcultosActionPerformed

    public void limpiar() {

        txtRuta.setText("");
        AreaDatosPq.setText("");

    }

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDatosPq;
    private javax.swing.JMenu MenuGestionarDirectorio;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListarArchivosOcultos;
    private javax.swing.JButton btnListarDirectorio;
    private javax.swing.JButton btnListarDirectoriosOcultos;
    private javax.swing.JButton btnMostrarInformacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lista;
    private javax.swing.JMenuItem menuCrear;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuRenombrar;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
