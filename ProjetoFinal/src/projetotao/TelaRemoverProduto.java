/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotao;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 *
 * @author guiarrd
 */
public class TelaRemoverProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaRemoverProduto
     */
    public TelaRemoverProduto() {
        initComponents();
        setLocationRelativeTo(null);

        JB_Remover.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "remover");
        //Se for a letra "A", coloca uma ação de clique no botão e executa o que está no método actionPerformed
        JB_Remover.getActionMap().put("remover", new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent a) {

                remover();

            }
        });
        
        JB_Cancelar.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "cancelar");
        //Se for a letra "A", coloca uma ação de clique no botão e executa o que está no método actionPerformed
        JB_Cancelar.getActionMap().put("cancelar", new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent a) {

                dispose();
                
            }
        });

        listarProdutos();

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
        JCB_Produto = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        JB_Remover = new javax.swing.JButton();
        JB_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Remover Produto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Produto:");

        JB_Remover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JB_Remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotao/check.png"))); // NOI18N
        JB_Remover.setText("Remover");
        JB_Remover.setToolTipText("Pressione DEL para REMOVER");
        JB_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RemoverActionPerformed(evt);
            }
        });

        JB_Cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JB_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotao/delete.png"))); // NOI18N
        JB_Cancelar.setText("Cancelar");
        JB_Cancelar.setToolTipText("Pressione ESC para CANCELAR");
        JB_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JCB_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JB_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCB_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_Remover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RemoverActionPerformed

        remover();
        
    }//GEN-LAST:event_JB_RemoverActionPerformed

    private void JB_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CancelarActionPerformed

        dispose();

    }//GEN-LAST:event_JB_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRemoverProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Cancelar;
    private javax.swing.JButton JB_Remover;
    private javax.swing.JComboBox JCB_Produto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    Produto prod;

    private void listarProdutos() {

        Produto p = new Produto(1);
        String[][] lista_produtos = new String[2000][];

        try {
            lista_produtos = p.getListaProdutos();
        } catch (ProjetoException erp) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao obter a lista de produtos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        for (int cont = 0; cont < lista_produtos.length; cont++) {

            JCB_Produto.addItem(new ComboItem(lista_produtos[cont][0], lista_produtos[cont][1]));

        }

    }

    public void remover() {

        ComboItem item_selecionado;
        item_selecionado = (ComboItem) JCB_Produto.getSelectedItem();
        prod = new Produto(Integer.parseInt(item_selecionado.codigo));
        CoreSql c = new CoreSql();
        String sql = "DELETE FROM b_produtos WHERE descricao like '" + prod.descricao + "';";
        c.executarQuery(sql, false, null);
        JOptionPane.showMessageDialog(null, "Produto removido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        JCB_Produto.removeAllItems();
        listarProdutos();

    }
}