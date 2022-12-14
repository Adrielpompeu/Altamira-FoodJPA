/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.TelaCadastroController;
import Model.DAO.FuncionarioDAO;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author W
 */
public class TelaCadastro extends javax.swing.JFrame {

    private final TelaCadastroController controller;

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        controller = new TelaCadastroController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_salvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nascimento = new javax.swing.JFormattedTextField();
        tf_telefone = new javax.swing.JFormattedTextField();
        tf_cpf = new javax.swing.JFormattedTextField();
        sexo = new javax.swing.JComboBox<>();
        tf_senha = new javax.swing.JPasswordField();
        tf_email = new javax.swing.JTextField();
        tf_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_endereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_salvar.setBackground(new java.awt.Color(153, 255, 153));
        btn_salvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_salvar.setText("SALVAR");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 710, 490, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("SENHA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("NOME:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 90, -1));

        try {
            tf_nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tf_nascimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tf_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 240, 30));

        try {
            tf_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tf_telefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tf_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 240, 30));

        try {
            tf_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tf_cpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tf_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 240, 30));

        sexo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 240, 30));

        tf_senha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_senha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(tf_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 240, 30));

        tf_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_emailActionPerformed(evt);
            }
        });
        getContentPane().add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 240, 30));

        tf_nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(tf_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 240, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CADASTRO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        tf_endereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_enderecoActionPerformed(evt);
            }
        });
        getContentPane().add(tf_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 240, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("SEXO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("CPF:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 90, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("NASCIMENTO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 160, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("TELEFONE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("EMAIL:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 90, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("ENDERE?O:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 160, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\W\\Desktop\\View\\tela_login3.png")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_enderecoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        
        try {
            controller.salvaFuncionario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeActionPerformed

    private void tf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emailActionPerformed

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JFormattedTextField tf_cpf;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_endereco;
    private javax.swing.JFormattedTextField tf_nascimento;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JPasswordField tf_senha;
    private javax.swing.JFormattedTextField tf_telefone;
    // End of variables declaration//GEN-END:variables



    public JTextField getTf_email() {
        return tf_email;
    }

    public void setTf_email(JTextField tf_email) {
        this.tf_email = tf_email;
    }

    public JTextField getTf_endereco() {
        return tf_endereco;
    }

    public void setTf_endereco(JTextField tf_endereco) {
        this.tf_endereco = tf_endereco;
    }



    public JTextField getTf_nome() {
        return tf_nome;
    }

    public void setTf_nome(JTextField tf_nome1) {
        this.tf_nome = tf_nome;
    }

    public JPasswordField getTf_senha() {
        return tf_senha;
    }

    public void setTf_senha(JPasswordField tf_senha) {
        this.tf_senha = tf_senha;
    }

    public JComboBox<String> getSexo() {
        return sexo;
    }

    public void setSexo(JComboBox<String> sexo) {
        this.sexo = sexo;
    }

    public JFormattedTextField getTf_cpf() {
        return tf_cpf;
    }

    public void setTf_cpf(JFormattedTextField tf_cpf) {
        this.tf_cpf = tf_cpf;
    }

    public JFormattedTextField getTf_nascimento() {
        return tf_nascimento;
    }

    public void setTf_nascimento(JFormattedTextField tf_nascimento) {
        this.tf_nascimento = tf_nascimento;
    }

    public JFormattedTextField getTf_telefone() {
        return tf_telefone;
    }

    public void setTf_telefone(JFormattedTextField tf_telefone) {
        this.tf_telefone = tf_telefone;
    }

    
 
    
}
