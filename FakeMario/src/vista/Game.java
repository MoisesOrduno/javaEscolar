package vista;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Cope
 */
public class Game extends javax.swing.JFrame {

    int x, y;
    int level = 0;
    public Game() {
        initComponents();
        this.setSize(530,235);
        Mario.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Mario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mario_frente.png"))); // NOI18N
        Mario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MarioKeyReleased(evt);
            }
        });
        jPanel1.add(Mario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 20, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/level1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 530, 239));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MarioKeyPressed
        // TODO add your handling code here:
        x = Mario.getX();
        y = Mario.getY();
        System.out.println("Location:" + x + " - "+ y);
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_LEFT:
                Mario.setIcon(new ImageIcon(getClass().getResource("/recursos/mario_izq1.png")));
                Mario.setLocation(x - 2, y);
                if(Mario.getX()<=0){
                    Mario.setLocation(0, y);
                }
                break;
            case KeyEvent.VK_RIGHT:
                Mario.setIcon(new ImageIcon(getClass().getResource("/recursos/mario_der1.png")));
                Mario.setLocation(x + 2, y);
                if(Mario.getX()>=510){
                    Mario.setLocation(510, y);
                }
                break;
            case KeyEvent.VK_UP:
                Mario.setIcon(new ImageIcon(getClass().getResource("/recursos/mario_espalda.png")));
                Mario.setLocation(x, y - 2);
                if(Mario.getY()<=152){
                    Mario.setLocation(x, y);
                }
                break;
            case KeyEvent.VK_DOWN:
                Mario.setIcon(new ImageIcon(getClass().getResource("/recursos/mario_frente.png")));
                Mario.setLocation(x, y + 2);
                if(Mario.getX()>=190){
                    Mario.setLocation(x, y);
                }
                break;
        }
    }//GEN-LAST:event_MarioKeyPressed

    private void MarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MarioKeyReleased
        Mario.setIcon(new ImageIcon(getClass().getResource("/recursos/mario_frente.png")));
    }//GEN-LAST:event_MarioKeyReleased

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
