  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pFiches;

import javax.swing.JOptionPane;
import rdv_medicaux_sutharsan_ranjit.Utilisateurs;

/**
 *
 * @author franjit
 */
public class Faccueil extends javax.swing.JFrame {

    /**
     * Creates new form Faccueil
     */
    private Utilisateurs User= new Utilisateurs("unknown", "unknown", 0, 0,"unknown","unknown");
    private Fconnexion fichconnexion;
    private Finscription fichinscription;
    private Fselection fichselection;
    
    public Faccueil() {
        initComponents();
        fichconnexion = new Fconnexion(this, false,User);
        fichinscription = new Finscription(this, false, User);
        fichselection = new Fselection(this, false, User);
        User.creationPraticien();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rbConnexion = new javax.swing.JRadioButton();
        rbInscription = new javax.swing.JRadioButton();
        rbVisiteur = new javax.swing.JRadioButton();
        bContinuer = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jAide = new javax.swing.JMenuItem();
        jQuitter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Docto rapido");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setText("Le premier site internet vous  facilitant les prises de rendez-vous chez votre medecin traitant");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Mon Praticien");

        rbConnexion.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(rbConnexion);
        rbConnexion.setSelected(true);
        rbConnexion.setText("Connexion");
        rbConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConnexionActionPerformed(evt);
            }
        });

        rbInscription.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(rbInscription);
        rbInscription.setText("Inscription");
        rbInscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInscriptionActionPerformed(evt);
            }
        });

        rbVisiteur.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(rbVisiteur);
        rbVisiteur.setText("Visiteur");

        bContinuer.setBackground(new java.awt.Color(0, 102, 102));
        bContinuer.setText("Continuer");
        bContinuer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bContinuerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbInscription)
                                    .addComponent(rbVisiteur)
                                    .addComponent(rbConnexion))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bContinuer)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(69, 69, 69)
                .addComponent(rbConnexion)
                .addGap(37, 37, 37)
                .addComponent(rbInscription)
                .addGap(45, 45, 45)
                .addComponent(rbVisiteur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(bContinuer)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));

        jMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jMenu1.setText("Help");

        jAide.setText("Aide");
        jAide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAideActionPerformed(evt);
            }
        });
        jMenu1.add(jAide);

        jQuitter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jQuitter.setText("Quitter");
        jQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuitterActionPerformed(evt);
            }
        });
        jMenu1.add(jQuitter);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuitterActionPerformed
        this.dispose();
    }//GEN-LAST:event_jQuitterActionPerformed

    private void bContinuerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bContinuerActionPerformed
        this.setVisible(false);             //on va afficher selon le choix de l'utilisateur la fenêtre souhaitée
        if (rbConnexion.isSelected()){
            fichconnexion.setVisible(true);
        }
        if (rbInscription.isSelected()){
            fichinscription.setVisible(true);
        }
        if(rbVisiteur.isSelected()){
            fichselection.setVisible(true);
        }
            
    }//GEN-LAST:event_bContinuerActionPerformed

    private void jAideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAideActionPerformed
        JOptionPane.showMessageDialog(null, "Veuillez cliquer sur inscrire / connexion / visiteur afin de passer à l'étape suivante sinon veuillez quittez le site en allant dans Aide puis Quitter", "Message d'information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jAideActionPerformed

    private void rbInscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInscriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbInscriptionActionPerformed

    private void rbConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbConnexionActionPerformed

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
            java.util.logging.Logger.getLogger(Faccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faccueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bContinuer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem jAide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem jQuitter;
    private javax.swing.JRadioButton rbConnexion;
    private javax.swing.JRadioButton rbInscription;
    private javax.swing.JRadioButton rbVisiteur;
    // End of variables declaration//GEN-END:variables
}