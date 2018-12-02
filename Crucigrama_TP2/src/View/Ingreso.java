/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import filemanager.ReaderManager;
import java.io.IOException;
import javax.swing.JOptionPane;
import static main.Main.listManager;
import model.User;

/**
 *
 * @author Usuario
 */
public class Ingreso extends javax.swing.JDialog {
   private String [] users;
   private int counter;
    /**
     * Creates new form Ingreso
     */
    public Ingreso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        pfContraseña = new javax.swing.JPasswordField();
        btinscribir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbUsuario.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 14)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lbUsuario.setText("Usuario");

        lbContraseña.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 14)); // NOI18N
        lbContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lbContraseña.setText("Contraseña");

        tfUsuario.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 14)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(0, 0, 0));
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        tfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsuarioKeyTyped(evt);
            }
        });

        pfContraseña.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 14)); // NOI18N
        pfContraseña.setForeground(new java.awt.Color(0, 0, 0));
        pfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfContraseñaActionPerformed(evt);
            }
        });
        pfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfContraseñaKeyTyped(evt);
            }
        });

        btinscribir.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 14)); // NOI18N
        btinscribir.setForeground(new java.awt.Color(0, 0, 0));
        btinscribir.setText("Inscribir");
        btinscribir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btinscribirMouseClicked(evt);
            }
        });
        btinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinscribirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btinscribir)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUsuario)
                            .addComponent(lbContraseña))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfUsuario)
                            .addComponent(pfContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addContainerGap(69, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContraseña)
                    .addComponent(pfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btinscribir)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void pfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfContraseñaActionPerformed

    private void btinscribirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btinscribirMouseClicked
       String user= new String(tfUsuario.getText());
       String pass= new String (pfContraseña.getPassword());
        if (user.length()<4 || pass.length()<3) {
            JOptionPane.showMessageDialog(null, "Invalido "+"\n"+" Por favor ingrese un USUARIO de al menos 4 caracteres y una CONTRASEÑA de al menos 3 caracteres ");
        }
    }//GEN-LAST:event_btinscribirMouseClicked

    private void btinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinscribirActionPerformed
         ReaderManager reader = new ReaderManager();
        try {
            reader.open("userFile.ser");
            listManager = reader.read();
            reader.close(); 
            
            System.out.println("Lectura exitosa");
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
           
        } catch (ClassNotFoundException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
           
        }
        int size = listManager.getSize();
        for (int i = size; i < size + 5; i++) {
            listManager.addUser(new User (" " + i, " "+ i));
            
        }
       
        dispose();
    }//GEN-LAST:event_btinscribirActionPerformed

    private void tfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsuarioKeyTyped
               
    }//GEN-LAST:event_tfUsuarioKeyTyped

    private void pfContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfContraseñaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pfContraseñaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btinscribir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField pfContraseña;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
