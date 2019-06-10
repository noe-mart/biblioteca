/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.*;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noé
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    ConeccionDB con = new ConeccionDB();
    Connection cn = con.establecerConeccion();
    DefaultTableModel modelo;

    public Administrador() throws SQLException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        String cabecera[] = {"Id", "ISBN", "Titulo", "Editorial", "Pais"};
        String datos[][] = {};
        modelo = new DefaultTableModel(datos, cabecera);
        jTable1.setModel(modelo);
        txtCodigo.setEditable(false);
        txtNombre.requestFocus();
        con.establecerConeccion();
        mostrarPaises();
        mostrarEditorial();
        mostrarAutores();
        mostrarCategorias();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbEditorial = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAccion = new javax.swing.JButton();
        btnAgregarPais = new javax.swing.JButton();
        btnAgregarEditorial = new javax.swing.JButton();
        cmbMostrarOpciones = new javax.swing.JComboBox<>();
        btnMostrarLibros = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnAgregarAutor = new javax.swing.JButton();
        cmbAutor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbCategorias = new javax.swing.JComboBox<>();
        btnAgregarCategoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel2.setText("Codigo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 70, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel3.setText("Nombre Libro:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 350, -1));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel4.setText("ISBN:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        getContentPane().add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 180, -1));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel5.setText("Editorial:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));
        getContentPane().add(cmbEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 270, -1));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("País:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 40, -1));

        getContentPane().add(cmbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 650, 150));

        btnAccion.setText("OK");
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        btnAgregarPais.setText("Agregar País");
        btnAgregarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPaisActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 110, -1));

        btnAgregarEditorial.setText("Agregar Editorial");
        btnAgregarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEditorialActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        cmbMostrarOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agregar Libro", "Eliminar Libro" }));
        cmbMostrarOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbMostrarOpcionesMouseClicked(evt);
            }
        });
        cmbMostrarOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMostrarOpcionesActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMostrarOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, -1));

        btnMostrarLibros.setText("Mostrar Libros");
        btnMostrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLibrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, -1, -1));

        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, -1, -1));

        btnAgregarAutor.setText("Agregar Autor");
        btnAgregarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 110, -1));

        getContentPane().add(cmbAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 270, -1));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setText("Autor:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel8.setText("Categoria:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        getContentPane().add(cmbCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, -1));

        btnAgregarCategoria.setText("Agregar Categoria");
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bestbooks.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarPaises() {
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM paises ");
            while (rs.next()) {
                cmbPais.addItem(rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void mostrarEditorial() {
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM editoriales ");
            while (rs.next()) {
                cmbEditorial.addItem(rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void mostrarAutores() {
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM autores ");
            while (rs.next()) {
                cmbAutor.addItem(rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void mostrarCategorias() {
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM categoria ");
            while (rs.next()) {
                cmbCategorias.addItem(rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void mostrarLibros() {
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM libros ");
            while (rs.next()) {
                String datos[] = new String[5];
                for (int i = 0; i < datos.length; i++) {
                    datos[i] = rs.getString(i + 1);
                    System.out.println(rs.getString(i + 1));
                }
                modelo.addRow(datos);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void btnAgregarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPaisActionPerformed
        String pais = JOptionPane.showInputDialog("Ingrese el nombre del país");
        String sql = "INSERT INTO paises (pais) VALUES ('" + pais + "')";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            ResultSet rs = st.executeQuery("SELECT * FROM paises WHERE pais='" + pais + "'");
            if (rs.next()) {
                cmbPais.addItem(rs.getString(2));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnAgregarPaisActionPerformed

    private void cmbMostrarOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMostrarOpcionesMouseClicked

    }//GEN-LAST:event_cmbMostrarOpcionesMouseClicked

    private void cmbMostrarOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMostrarOpcionesActionPerformed
        if (cmbMostrarOpciones.getSelectedItem().equals("Agregar Libro")) {
            txtCodigo.setEditable(false);
            txtNombre.setEditable(true);
            txtISBN.setEditable(true);
            txtNombre.requestFocus();
            cmbEditorial.setEnabled(true);
            cmbPais.setEnabled(true);

        } else if (cmbMostrarOpciones.getSelectedItem().equals("Eliminar Libro")) {
            txtCodigo.setEditable(true);
            txtNombre.setEditable(false);
            txtISBN.setEditable(false);
            cmbPais.setEnabled(false);
            cmbEditorial.setEnabled(false);
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_cmbMostrarOpcionesActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        FormularioInicial form = new FormularioInicial();
        form.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAgregarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEditorialActionPerformed
        String editorial = JOptionPane.showInputDialog("Ingrese el nombre de la Editorial");
        String sql = "INSERT INTO editoriales (editorial) VALUES ('" + editorial + "')";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            ResultSet rs = st.executeQuery("SELECT * FROM paises WHERE pais='" + editorial + "'");
            if (rs.next()) {
                cmbEditorial.addItem(rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnAgregarEditorialActionPerformed

    private void btnAgregarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutorActionPerformed
        String autor = JOptionPane.showInputDialog("Ingrese el nombre del Autor");
        String sql = "INSERT INTO autores (autor) VALUES ('" + autor + "')";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            ResultSet rs = st.executeQuery("SELECT * FROM autores WHERE autor='" + autor + "'");
            if (rs.next()) {
                cmbAutor.addItem(rs.getString(2));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnAgregarAutorActionPerformed

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        if (cmbMostrarOpciones.getSelectedIndex() == 0) {
            String sql = "INSERT INTO libros(id_libro, isbn, titulo, editoriales_id_editorial, paises_id_pais) VALUES ('" + 0 + "', '" + txtISBN.getText() + "', '" + txtNombre.getText() + "', '" + (cmbEditorial.getSelectedIndex() + 1) + "', '" + (cmbPais.getSelectedIndex() + 1) + "')";
            try {
                Statement st = cn.createStatement();
                st.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("error: " + e);
            }
        } else {

        }
    }//GEN-LAST:event_btnAccionActionPerformed

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
        String categoria = JOptionPane.showInputDialog("Ingrese el nombre de la categoria");
        String sql = "INSERT INTO categoria(categoria) VALUES ('" + categoria + "')";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            ResultSet rs = st.executeQuery("SELECT * FROM categoria WHERE categoria='" + categoria + "'");
            if (rs.next()) {
                cmbCategorias.addItem(rs.getString(2));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    private void btnMostrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLibrosActionPerformed
        mostrarLibros();
    }//GEN-LAST:event_btnMostrarLibrosActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Administrador().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnAgregarAutor;
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnAgregarEditorial;
    private javax.swing.JButton btnAgregarPais;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMostrarLibros;
    private javax.swing.JComboBox<String> cmbAutor;
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.JComboBox<String> cmbEditorial;
    private javax.swing.JComboBox<String> cmbMostrarOpciones;
    private javax.swing.JComboBox<String> cmbPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
