/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexa
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonS = new javax.swing.JButton();
        jButtonP1 = new javax.swing.JButton();
        jButtonP2 = new javax.swing.JButton();
        jButtonP3 = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonS.setBackground(new java.awt.Color(255, 255, 0));
        jButtonS.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        jButtonS.setForeground(new java.awt.Color(0, 0, 204));
        jButtonS.setText("SALIR");
        jButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jButtonP1.setBackground(new java.awt.Color(255, 255, 0));
        jButtonP1.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        jButtonP1.setForeground(new java.awt.Color(0, 0, 204));
        jButtonP1.setText("COMPRAR UN EQUIPO");
        jButtonP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 230, -1));

        jButtonP2.setBackground(new java.awt.Color(255, 255, 0));
        jButtonP2.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        jButtonP2.setForeground(new java.awt.Color(51, 0, 204));
        jButtonP2.setText("SOPORTE TECNICO");
        jButtonP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jButtonP3.setBackground(new java.awt.Color(255, 255, 0));
        jButtonP3.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        jButtonP3.setForeground(new java.awt.Color(0, 0, 204));
        jButtonP3.setText("AYUDA CON SU CUENTA ADMINISTRATIVA");
        jButtonP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jButtonC.setBackground(new java.awt.Color(255, 255, 0));
        jButtonC.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        jButtonC.setForeground(new java.awt.Color(0, 0, 204));
        jButtonC.setText("OPERADORES");
        jButtonC.setToolTipText("");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ticket-icon---3d-blue-button-png_109658.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 230, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/700_FO50288433_5d804b2d0dc5a76b4c827ac32124267c.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSActionPerformed

    private void jButtonP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP1ActionPerformed
        programa1 obj1 = new programa1();;
        obj1.setVisible(true);
        this.setVisible (false );
    }//GEN-LAST:event_jButtonP1ActionPerformed

    private void jButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP2ActionPerformed
        programa2 obj1 = new programa2();;
        obj1.setVisible(true);
        this.setVisible (false );
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonP2ActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        creditos obj1 = new creditos();;
        obj1.setVisible(true);
        this.setVisible (false );
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP3ActionPerformed
        programa3 obj1 = new programa3();;
        obj1.setVisible(true);
        this.setVisible (false );
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonP3ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      System.out.println("hola");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        System.out.println("hola");
        try {
             Document doc = new Document();
             PdfWriter pdf =PdfWriter.getInstance(doc,new FileOutputStream("ticket.pdf"));
            
             doc.open();
          
             PdfContentByte cb=pdf.getDirectContent();
            
             BaseFont bf= BaseFont.createFont(BaseFont.COURIER_BOLD,BaseFont.CP1252,BaseFont.NOT_EMBEDDED);
          
             cb.setFontAndSize(bf,45);
             cb.beginText();
             
             cb.setTextMatrix(100,805);
             cb.showText("TICKET");
             cb.setTextMatrix(210,770);
             cb.showText("CALL CENTER"); 
             
             cb.endText();
             doc.close();
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(venta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(venta.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         try {
            Desktop.getDesktop().open(new File("ticket.pdf"));
        } catch (IOException ex) {
            System.out.println("Error:"+ex);
        }
    }//GEN-LAST:event_jLabel2MousePressed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonP1;
    private javax.swing.JButton jButtonP2;
    private javax.swing.JButton jButtonP3;
    private javax.swing.JButton jButtonS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
