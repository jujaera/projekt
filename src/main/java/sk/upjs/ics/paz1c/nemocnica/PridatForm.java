package sk.upjs.ics.paz1c.nemocnica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PridatForm extends javax.swing.JFrame {
    
    private ZaznamListModel zaznamListModel;
    private LekarZaznamuComboBoxModel lekarZaznamuComboBoxModel;

    public PridatForm() {
        zaznamListModel = new ZaznamListModel();
        lekarZaznamuComboBoxModel = new LekarZaznamuComboBoxModel(); 
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

        pridatZaznamjLabel = new javax.swing.JLabel();
        lekarjLabel = new javax.swing.JLabel();
        pacientjLabel = new javax.swing.JLabel();
        menoPacientajLabel = new javax.swing.JLabel();
        priezviskoPacientajLabel = new javax.swing.JLabel();
        vekjLabel = new javax.swing.JLabel();
        menoPacientajTextField = new javax.swing.JTextField();
        priezviskoPacientajTextField = new javax.swing.JTextField();
        pridatZaznamjButton = new javax.swing.JButton();
        vekjSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        diagnozaNazovjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        liekNazovjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menoLekarjTextField = new javax.swing.JTextField();
        priezviskoLekarjTextField = new javax.swing.JTextField();
        specializaciajTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pridatZaznamjLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pridatZaznamjLabel.setText("Pridať záznam");

        lekarjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lekarjLabel.setText("LEKÁR");

        pacientjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pacientjLabel.setText("PACIENT");

        menoPacientajLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menoPacientajLabel.setText("Meno:");

        priezviskoPacientajLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priezviskoPacientajLabel.setText("Priezvisko");

        vekjLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vekjLabel.setText("Vek");

        pridatZaznamjButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pridatZaznamjButton.setText("OK");
        pridatZaznamjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatZaznamjButtonActionPerformed(evt);
            }
        });

        vekjSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DIAGNÓZA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Názov");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("LIEK");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Názov");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Meno");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Priezvisko");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Špecializácia");

        jLabel8.setText("Je povinné vyplniť všetky polia!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pridatZaznamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lekarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(menoPacientajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priezviskoPacientajLabel)
                            .addComponent(vekjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(priezviskoLekarjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menoLekarjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(specializaciajTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menoPacientajTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priezviskoPacientajTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vekjSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(diagnozaNazovjTextField)
                            .addComponent(liekNazovjTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pacientjLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(pridatZaznamjLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pridatZaznamjLabel)
                .addGap(36, 36, 36)
                .addComponent(lekarjLabel)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(menoLekarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priezviskoLekarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(specializaciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(pacientjLabel)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menoPacientajLabel)
                    .addComponent(menoPacientajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priezviskoPacientajLabel)
                    .addComponent(priezviskoPacientajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vekjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vekjLabel))
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(diagnozaNazovjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(liekNazovjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(pridatZaznamjButton)
                .addGap(30, 30, 30)
                .addComponent(jLabel8))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void pridatZaznamjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatZaznamjButtonActionPerformed
        //validácia null pre každú entitu
        if(menoLekarjTextField.getText().equals("") || priezviskoLekarjTextField.getText().equals("") ||
           specializaciajTextField.getText().equals("") || menoPacientajTextField.getText().equals("") ||
                priezviskoPacientajTextField.getText().equals("")||
                diagnozaNazovjTextField.getText().equals("") || liekNazovjTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Musíte vyplniť všetky okná");
            return;
        } 
        
        // vytvorenie noveho zaznamu a nastavenie jeho parametrov
        Zaznam zaznam = new Zaznam();
        
        Lekar lekar = new Lekar();
        lekar.setMeno(menoLekarjTextField.getText());
        lekar.setPriezvisko(priezviskoLekarjTextField.getText());
        lekar.setSpecializacia(specializaciajTextField.getText());
        
        // overenie ci uz lekar existuje, ak nie vytvorime ho, ak existuje vytiahneme len jeho id
        List<Lekar> lekari = DaoFactory.INSTANCE.getLekarDao().dajLekarov();
        int idxLekara = 0;
        for(Lekar l: lekari){
            if(l.getMeno().equals(lekar.getMeno()) && (l.getPriezvisko().equals(lekar.getPriezvisko()))
                    && (l.getSpecializacia().equals(lekar.getSpecializacia()))){
                idxLekara = l.getId();
                lekar = l;
            }
        }
        if(idxLekara==0){
            DaoFactory.INSTANCE.getLekarDao().pridajLekara(lekar);
        }
        
        // overenie ci uz pacient existuje, ak nie vytvorime ho, ak existuje vytiahneme len jeho id
        Pacient pacient = new Pacient();
        pacient.setMeno(menoPacientajTextField.getText());
        pacient.setPriezvisko(priezviskoPacientajTextField.getText());
        pacient.setVek((int)vekjSpinner.getValue());
        List<Pacient> pacienti = DaoFactory.INSTANCE.getPacientDao().dajPacietov();
        int idxPacienta = 0;
        for(Pacient p: pacienti){
            if(p.getMeno().equals(pacient.getMeno()) && (p.getPriezvisko().equals(pacient.getPriezvisko()))
                    && (p.getVek() == pacient.getVek())){
                idxPacienta = p.getId();
                pacient = p;
            }
        }
        if(idxPacienta==0){
            DaoFactory.INSTANCE.getPacientDao().pridajPacienta(pacient);
        }
     
        // overenie ci uz diagnoza existuje, ak nie vytvorime ho, ak existuje vytiahneme len jeho id
        Diagnoza diagnoza = new Diagnoza();
        diagnoza.setNazov(diagnozaNazovjTextField.getText());
        List<Diagnoza> diagnozy = DaoFactory.INSTANCE.getDiagnozaDao().dajDiagnozy();
        int idxDiagnozy = 0;
        for(Diagnoza d: diagnozy){
            if(d.getNazov().equals(diagnoza.getNazov())){
                idxDiagnozy = d.getId();
                diagnoza = d;
            }
        }
        if(idxDiagnozy==0){
            DaoFactory.INSTANCE.getDiagnozaDao().pridajDiagnozu(diagnoza);
        }
 
        // overenie ci uz liek existuje, ak nie vytvorime ho, ak existuje vytiahneme len jeho id
        Liek liek = new Liek();
        liek.setNazov(liekNazovjTextField.getText());
        List<Liek> lieky = DaoFactory.INSTANCE.getLiekDao().dajLieky();
        int idxLieku = 0;
        for(Liek l: lieky){
            if(l.getNazov().equals(liek.getNazov())){
                idxDiagnozy = l.getId();
                liek = l;
            }
        }
        if(idxLieku==0){
            DaoFactory.INSTANCE.getLiekDao().pridajLiek(liek);
        }
        
        // nastavenie parametrov
        zaznam.setLekar(lekar);
        zaznam.setPacient(pacient);
        zaznam.setDiagnoza(diagnoza);
        zaznam.setLiek(liek);
        // pridanie do zoznamu
        zaznamListModel.pridajZaznam(zaznam);
        
        dispose();
    }//GEN-LAST:event_pridatZaznamjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PridatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PridatForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diagnozaNazovjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lekarjLabel;
    private javax.swing.JTextField liekNazovjTextField;
    private javax.swing.JTextField menoLekarjTextField;
    private javax.swing.JLabel menoPacientajLabel;
    private javax.swing.JTextField menoPacientajTextField;
    private javax.swing.JLabel pacientjLabel;
    private javax.swing.JButton pridatZaznamjButton;
    private javax.swing.JLabel pridatZaznamjLabel;
    private javax.swing.JTextField priezviskoLekarjTextField;
    private javax.swing.JLabel priezviskoPacientajLabel;
    private javax.swing.JTextField priezviskoPacientajTextField;
    private javax.swing.JTextField specializaciajTextField;
    private javax.swing.JLabel vekjLabel;
    private javax.swing.JSpinner vekjSpinner;
    // End of variables declaration//GEN-END:variables

    private void bolopridane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
