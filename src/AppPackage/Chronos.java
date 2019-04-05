/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;
import javax.swing.Timer;
import java.awt.event.*;

/**
 *
 * @author Alex
 */
public class Chronos extends javax.swing.JFrame {


    
    public Chronos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    
    int secondes = 0;
    int minutes = 0;
    int millisecondes = 0;
    
    /*Le chronomètre se met à jour à toutes les 8 millisecondes. Après 125 mises à jour,
    une seconde est écoulée. Cela donne un aspect dynamique au chronomètre. On peut modifier
    la vitesse de mise à jour afin "d'accélérer" le temps, et permettre d'observer
    la congestion sur une longue période de temps plus rapidement.
    */
    Timer T = new Timer(8, new ActionListener()
    {
        public void actionPerformed (ActionEvent e)
        {
            millisecondes+=8;
            
                    Bt_Millis.setText(""+millisecondes);
                    if (millisecondes==1000)  //Une seconde écoulée
                    {
                        millisecondes = 0;
                        Bt_Millis.setText(""+0);
                        secondes++;
                        Bt_Secs.setText(""+ secondes+"s");
                     
                    }
                    if(secondes==60) //Une minute écoulée
                    {
                         secondes = 0;
                         Bt_Secs.setText(""+ 0);
                         minutes++;
                         Bt_Mins.setText(""+ minutes+"m");
                    }
        }
    });
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bt_Mins = new javax.swing.JLabel();
        Bt_Millis = new javax.swing.JLabel();
        Bt_Secs = new javax.swing.JLabel();
        Btn_Start = new javax.swing.JButton();
        Btn_Stop = new javax.swing.JButton();
        Btn_Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(new java.awt.Dimension(300, 152));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bt_Mins.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        Bt_Mins.setText("00 :");
        getContentPane().add(Bt_Mins, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 34, 74, 42));

        Bt_Millis.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Bt_Millis.setText("0000");
        getContentPane().add(Bt_Millis, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 37, 74, 42));

        Bt_Secs.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        Bt_Secs.setText("00 :");
        getContentPane().add(Bt_Secs, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 34, 74, 42));

        Btn_Start.setText("Lancer");
        Btn_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_StartActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 94, -1, 40));

        Btn_Stop.setText("Arrêter");
        Btn_Stop.setMaximumSize(new java.awt.Dimension(71, 23));
        Btn_Stop.setMinimumSize(new java.awt.Dimension(71, 23));
        Btn_Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_StopActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 94, -1, 40));

        Btn_Reset.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        Btn_Reset.setText("Recommencer");
        Btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 111, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Bouton pour recommencer le chronomètre.
    private void Btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ResetActionPerformed
        T.stop();
        millisecondes = 0;
        minutes = 0;
        secondes = 0;
        Bt_Millis.setText(""+millisecondes);
        Bt_Mins.setText(""+minutes);
        Bt_Secs.setText(""+secondes);
    }//GEN-LAST:event_Btn_ResetActionPerformed
    //Bouton pour lancer le chronomètre, ou le reprendre d'un arrêt.
    private void Btn_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_StartActionPerformed
      T.start();
      
 
    }//GEN-LAST:event_Btn_StartActionPerformed
    //Bouton pour arrêter le chronomètre.
    private void Btn_StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_StopActionPerformed
        // TODO add your handling code here:
         T.stop();
    }//GEN-LAST:event_Btn_StopActionPerformed


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
            java.util.logging.Logger.getLogger(Chronos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chronos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chronos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chronos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chronos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bt_Millis;
    private javax.swing.JLabel Bt_Mins;
    private javax.swing.JLabel Bt_Secs;
    private javax.swing.JButton Btn_Reset;
    private javax.swing.JButton Btn_Start;
    private javax.swing.JButton Btn_Stop;
    // End of variables declaration//GEN-END:variables
}
