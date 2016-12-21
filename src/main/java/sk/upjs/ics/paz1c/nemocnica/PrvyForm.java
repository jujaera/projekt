package sk.upjs.ics.paz1c.nemocnica;

import javax.swing.JOptionPane;

public class PrvyForm extends javax.swing.JFrame {

   private String prihlasovacieMeno = "";
   private String prihlasovacieHeslo = "";
    
    public PrvyForm() {
       
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prihlasenieLabel = new javax.swing.JLabel();
        prihlasovacieMenoLabel = new javax.swing.JLabel();
        prihlasovacieHesloLabel = new javax.swing.JLabel();
        prihlasovacieMenoTextField = new javax.swing.JTextField();
        prihlasovacieHesloTextField = new javax.swing.JPasswordField();
        prihlasitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 204));

        prihlasenieLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prihlasenieLabel.setText("Zadajte prihlasovacie údaje");

        prihlasovacieMenoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prihlasovacieMenoLabel.setText("Prihlasovacie meno:");

        prihlasovacieHesloLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prihlasovacieHesloLabel.setText("Prihlasovacie heslo:");

        prihlasovacieMenoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prihlasovacieMenoTextFieldActionPerformed(evt);
            }
        });

        prihlasovacieHesloTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prihlasovacieHesloTextFieldActionPerformed(evt);
            }
        });

        prihlasitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prihlasitButton.setText("PRIHLÁSIŤ");
        prihlasitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prihlasitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(prihlasenieLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prihlasovacieMenoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prihlasovacieHesloLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prihlasitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prihlasovacieMenoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prihlasovacieHesloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(prihlasenieLabel)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prihlasovacieMenoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prihlasovacieMenoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prihlasovacieHesloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prihlasovacieHesloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(prihlasitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prihlasovacieMenoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prihlasovacieMenoTextFieldActionPerformed

    }//GEN-LAST:event_prihlasovacieMenoTextFieldActionPerformed

    private void prihlasovacieHesloTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prihlasovacieHesloTextFieldActionPerformed
        
    }//GEN-LAST:event_prihlasovacieHesloTextFieldActionPerformed

    private void prihlasitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prihlasitButtonActionPerformed
        // prihlasenie lekara do systemu na zaklade mena a hesla
        prihlasovacieMeno = prihlasovacieMenoTextField.getText();
        prihlasovacieHeslo  = prihlasovacieHesloTextField.getText();
        String meno = "lekar";
        String heslo = "heslo";
        // overenie ci zadal spravne
        if(prihlasovacieMeno.equals(meno) && prihlasovacieHeslo.equals(heslo)) {
            DruhyForm druhyForm = new DruhyForm();
            druhyForm.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Nesprávne zadané prihlasovacie meno alebo heslo !");
        }
    }//GEN-LAST:event_prihlasitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PrvyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrvyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrvyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrvyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrvyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel prihlasenieLabel;
    private javax.swing.JButton prihlasitButton;
    private javax.swing.JLabel prihlasovacieHesloLabel;
    private javax.swing.JTextField prihlasovacieHesloTextField;
    private javax.swing.JLabel prihlasovacieMenoLabel;
    private javax.swing.JTextField prihlasovacieMenoTextField;
    // End of variables declaration//GEN-END:variables
}
