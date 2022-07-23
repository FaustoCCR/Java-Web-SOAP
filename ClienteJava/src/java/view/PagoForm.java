/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Fausto
 */
public class PagoForm extends javax.swing.JFrame {

    public PagoForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOpciones = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbienvenida = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_saldo = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        rb_deposito = new javax.swing.JRadioButton();
        rb_retiro = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jlMensaje = new javax.swing.JLabel();
        btn_reload = new javax.swing.JButton();
        jlcerrarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel2.setText("Realiza tus cálculos");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/zeplin_icon.png"))); // NOI18N

        jlbienvenida.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jlbienvenida.setText("BIENVENIDO ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(6, 0, 0, 10));

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Console", 1, 16)); // NOI18N
        jLabel6.setText("Saldo:");
        jLabel6.setOpaque(true);
        jPanel5.add(jLabel6);

        txt_saldo.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txt_saldo.setForeground(new java.awt.Color(153, 153, 153));
        txt_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_saldoActionPerformed(evt);
            }
        });
        jPanel5.add(txt_saldo);

        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Lucida Console", 1, 16)); // NOI18N
        jLabel7.setText("Seleccione:");
        jLabel7.setOpaque(true);
        jPanel6.add(jLabel7);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridLayout(2, 0));

        rb_deposito.setBackground(new java.awt.Color(255, 255, 255));
        bgOpciones.add(rb_deposito);
        rb_deposito.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        rb_deposito.setText("Depósito");
        jPanel7.add(rb_deposito);

        rb_retiro.setBackground(new java.awt.Color(255, 255, 255));
        bgOpciones.add(rb_retiro);
        rb_retiro.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        rb_retiro.setText("Retiro");
        jPanel7.add(rb_retiro);

        jPanel6.add(jPanel7);

        jPanel1.add(jPanel6);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Console", 1, 16)); // NOI18N
        jLabel5.setText("Valor:");
        jLabel5.setOpaque(true);
        jPanel3.add(jLabel5);

        txt_valor.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txt_valor.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(txt_valor);

        jPanel1.add(jPanel3);

        btn_registrar.setBackground(new java.awt.Color(255, 190, 34));
        btn_registrar.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar);

        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOpaque(true);
        jPanel4.add(jSeparator1);

        jlMensaje.setBackground(new java.awt.Color(255, 255, 255));
        jlMensaje.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jlMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMensaje.setOpaque(true);
        jPanel4.add(jlMensaje);

        jPanel1.add(jPanel4);

        btn_reload.setBackground(new java.awt.Color(241, 241, 240));
        btn_reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icon_reload.png"))); // NOI18N
        jPanel1.add(btn_reload);

        jlcerrarSesion.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jlcerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icon_logout.png"))); // NOI18N
        jlcerrarSesion.setText("SALIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlcerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jlbienvenida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlcerrarSesion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ButtonGroup getBgOpciones() {
        return bgOpciones;
    }

    public void setBgOpciones(ButtonGroup bgOpciones) {
        this.bgOpciones = bgOpciones;
    }

    public JButton getBtn_registrar() {
        return btn_registrar;
    }

    public void setBtn_registrar(JButton btn_registrar) {
        this.btn_registrar = btn_registrar;
    }

    public JLabel getJlMensaje() {
        return jlMensaje;
    }

    public void setJlMensaje(JLabel jlMensaje) {
        this.jlMensaje = jlMensaje;
    }

    public JLabel getJlbienvenida() {
        return jlbienvenida;
    }

    public void setJlbienvenida(JLabel jlbienvenida) {
        this.jlbienvenida = jlbienvenida;
    }

    public JRadioButton getRb_deposito() {
        return rb_deposito;
    }

    public void setRb_deposito(JRadioButton rb_deposito) {
        this.rb_deposito = rb_deposito;
    }

    public JRadioButton getRb_retiro() {
        return rb_retiro;
    }

    public void setRb_retiro(JRadioButton rb_retiro) {
        this.rb_retiro = rb_retiro;
    }

    public JTextField getTxt_saldo() {
        return txt_saldo;
    }

    public void setTxt_saldo(JTextField txt_saldo) {
        this.txt_saldo = txt_saldo;
    }

    public JTextField getTxt_valor() {
        return txt_valor;
    }

    public void setTxt_valor(JTextField txt_valor) {
        this.txt_valor = txt_valor;
    }

    public JButton getBtn_reload() {
        return btn_reload;
    }

    public void setBtn_reload(JButton btn_reload) {
        this.btn_reload = btn_reload;
    }

    public JLabel getJlcerrarSesion() {
        return jlcerrarSesion;
    }

    public void setJlcerrarSesion(JLabel jlcerrarSesion) {
        this.jlcerrarSesion = jlcerrarSesion;
    }
    
    
    
    
    
    
    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_saldoActionPerformed


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
            java.util.logging.Logger.getLogger(PagoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOpciones;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_reload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JLabel jlbienvenida;
    private javax.swing.JLabel jlcerrarSesion;
    private javax.swing.JRadioButton rb_deposito;
    private javax.swing.JRadioButton rb_retiro;
    private javax.swing.JTextField txt_saldo;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
