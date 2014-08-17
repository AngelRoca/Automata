package Mensaje;
import Automata.automataMensajes;
import PanelFondo.panelFondo;
public class mensajeScreen extends javax.swing.JFrame {

    /**
     * Creates new form mensajeScreen
     */
    public mensajeScreen() {
        this.setContentPane(new panelFondo("/image/bg.jpg"));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        deLabel = new javax.swing.JLabel();
        paraLabel = new javax.swing.JLabel();
        asuntoLabel = new javax.swing.JLabel();
        deInput = new javax.swing.JTextField();
        paraInput = new javax.swing.JTextField();
        asuntoPara = new javax.swing.JTextField();
        body3 = new javax.swing.JPanel();
        mensajeLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        mensajeInput3 = new javax.swing.JTextArea();
        enviarButton = new javax.swing.JButton();

        setTitle("MENSAJE");
        setMinimumSize(new java.awt.Dimension(440, 580));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(null);

        header.setBackground(new java.awt.Color(204, 204, 255));
        header.setMinimumSize(new java.awt.Dimension(410, 150));
        header.setOpaque(false);

        deLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deLabel.setForeground(new java.awt.Color(255, 255, 255));
        deLabel.setText("De:");

        paraLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        paraLabel.setForeground(new java.awt.Color(255, 255, 255));
        paraLabel.setText("Para:");

        asuntoLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asuntoLabel.setForeground(new java.awt.Color(255, 255, 255));
        asuntoLabel.setText("Asunto:");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deLabel)
                    .addComponent(paraLabel)
                    .addComponent(asuntoLabel))
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deInput)
                            .addComponent(paraInput)))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(asuntoPara, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)))
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deLabel)
                    .addComponent(deInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paraLabel)
                    .addComponent(paraInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asuntoLabel)
                    .addComponent(asuntoPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(header);
        header.setBounds(10, 10, 410, 110);

        body3.setBackground(new java.awt.Color(204, 255, 204));
        body3.setOpaque(false);

        mensajeLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mensajeLabel3.setForeground(new java.awt.Color(255, 255, 255));
        mensajeLabel3.setText("Mensaje:");

        jScrollPane4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jScrollPane4.setHorizontalScrollBar(null);

        mensajeInput3.setColumns(20);
        mensajeInput3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mensajeInput3.setLineWrap(true);
        mensajeInput3.setRows(5);
        jScrollPane4.setViewportView(mensajeInput3);

        javax.swing.GroupLayout body3Layout = new javax.swing.GroupLayout(body3);
        body3.setLayout(body3Layout);
        body3Layout.setHorizontalGroup(
            body3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(body3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(body3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addGroup(body3Layout.createSequentialGroup()
                        .addComponent(mensajeLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        body3Layout.setVerticalGroup(
            body3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(body3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(body3);
        body3.setBounds(10, 130, 410, 370);

        enviarButton.setBackground(new java.awt.Color(255, 255, 255));
        enviarButton.setText("Enviar");
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(enviarButton);
        enviarButton.setBounds(320, 500, 94, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        this.dispose();
    }//GEN-LAST:event_formComponentHidden

    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
        automataMensajes auto=new automataMensajes(this.deInput.getText(),this.paraInput.getText(),this.asuntoPara.getText(),this.mensajeInput3.getText());
        this.deInput.setText("");this.paraInput.setText("");this.asuntoPara.setText("");this.mensajeInput3.setText("");
    }//GEN-LAST:event_enviarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mensajeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mensajeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mensajeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mensajeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mensajeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asuntoLabel;
    private javax.swing.JTextField asuntoPara;
    private javax.swing.JPanel body3;
    private javax.swing.JTextField deInput;
    private javax.swing.JLabel deLabel;
    private javax.swing.JButton enviarButton;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea mensajeInput3;
    private javax.swing.JLabel mensajeLabel3;
    private javax.swing.JTextField paraInput;
    private javax.swing.JLabel paraLabel;
    // End of variables declaration//GEN-END:variables
}
