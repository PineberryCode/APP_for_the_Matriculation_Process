/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author MINDLUNNY
 */
public class frm_Menú extends javax.swing.JFrame {

    /**
     * Creates new form frm_Menú
     */
    public frm_Menú() {
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

        jMenu1 = new javax.swing.JMenu();
        btn_change_user = new javax.swing.JButton();
        btn_student = new javax.swing.JButton();
        btn_professor = new javax.swing.JButton();
        btn_course = new javax.swing.JButton();
        line_left = new javax.swing.JPanel();
        line_top = new javax.swing.JPanel();
        btn_exit = new javax.swing.JButton();
        line_right = new javax.swing.JPanel();
        line_bottom = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("PropSheet.selectionBackground"));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_change_user.setText("CHANGE USER");
        getContentPane().add(btn_change_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 120, 30));

        btn_student.setText("STUDENT");
        btn_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 126, 46));

        btn_professor.setText("PROFESSOR");
        getContentPane().add(btn_professor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 126, 47));

        btn_course.setText("COURSE");
        getContentPane().add(btn_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 126, 47));

        javax.swing.GroupLayout line_leftLayout = new javax.swing.GroupLayout(line_left);
        line_left.setLayout(line_leftLayout);
        line_leftLayout.setHorizontalGroup(
            line_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        line_leftLayout.setVerticalGroup(
            line_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        getContentPane().add(line_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 200));

        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout line_topLayout = new javax.swing.GroupLayout(line_top);
        line_top.setLayout(line_topLayout);
        line_topLayout.setHorizontalGroup(
            line_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, line_topLayout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        line_topLayout.setVerticalGroup(
            line_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(line_topLayout.createSequentialGroup()
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(line_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        javax.swing.GroupLayout line_rightLayout = new javax.swing.GroupLayout(line_right);
        line_right.setLayout(line_rightLayout);
        line_rightLayout.setHorizontalGroup(
            line_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        line_rightLayout.setVerticalGroup(
            line_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        getContentPane().add(line_right, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 10, 200));

        javax.swing.GroupLayout line_bottomLayout = new javax.swing.GroupLayout(line_bottom);
        line_bottom.setLayout(line_bottomLayout);
        line_bottomLayout.setHorizontalGroup(
            line_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        line_bottomLayout.setVerticalGroup(
            line_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(line_bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 530, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_studentActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_change_user;
    public javax.swing.JButton btn_course;
    public javax.swing.JButton btn_exit;
    public javax.swing.JButton btn_professor;
    public javax.swing.JButton btn_student;
    private javax.swing.JMenu jMenu1;
    public javax.swing.JPanel line_bottom;
    public javax.swing.JPanel line_left;
    public javax.swing.JPanel line_right;
    public javax.swing.JPanel line_top;
    // End of variables declaration//GEN-END:variables
}
