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
public class frm_Matrícula extends javax.swing.JFrame {

    /**
     * Creates new form frm_Matrícula
     */
    public frm_Matrícula() {
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

        jLabel_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Matriculados = new javax.swing.JTable();
        btn_come_back = new javax.swing.JButton();
        txt_código_matrícula = new javax.swing.JTextField();
        txt_id_curso = new javax.swing.JTextField();
        txt_student_dni = new javax.swing.JTextField();
        jDateChooser_Register = new com.toedter.calendar.JDateChooser();
        btn_register = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_modify = new javax.swing.JButton();
        line_left = new javax.swing.JPanel();
        line_top = new javax.swing.JPanel();
        line_right = new javax.swing.JPanel();
        line_bottom = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItem_course = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_student = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_file_matrícula = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 430));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_title.setText("REGISTER MATRÍCULA");
        getContentPane().add(jLabel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jTable_Matriculados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Matriculados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 630, 93));
        getContentPane().add(btn_come_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 40, 40));
        getContentPane().add(txt_código_matrícula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 130, 30));

        txt_id_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_cursoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, 30));
        getContentPane().add(txt_student_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 100, 30));
        getContentPane().add(jDateChooser_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 130, 30));

        btn_register.setText("REGISTER");
        getContentPane().add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 100, 30));

        btn_search.setText("SEARCH");
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 100, 30));

        btn_modify.setText("MODIFY");
        getContentPane().add(btn_modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 100, 30));
        getContentPane().add(line_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));
        getContentPane().add(line_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));
        getContentPane().add(line_right, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 10, 430));
        getContentPane().add(line_bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 700, 10));

        jMenuBar.setPreferredSize(new java.awt.Dimension(430, 22));

        jMenu.setText("Details");

        jMenuItem_course.setText("Course");
        jMenu.add(jMenuItem_course);
        jMenu.add(jSeparator1);

        jMenuItem_student.setText("Student");
        jMenu.add(jMenuItem_student);
        jMenu.add(jSeparator2);

        jMenuItem_file_matrícula.setText("File Matrícula");
        jMenu.add(jMenuItem_file_matrícula);

        jMenuBar.add(jMenu);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_cursoActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Matrícula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Matrícula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Matrícula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Matrícula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Matrícula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_come_back;
    public javax.swing.JButton btn_modify;
    public javax.swing.JButton btn_register;
    public javax.swing.JButton btn_search;
    public com.toedter.calendar.JDateChooser jDateChooser_Register;
    public javax.swing.JLabel jLabel_title;
    public javax.swing.JMenu jMenu;
    public javax.swing.JMenuBar jMenuBar;
    public javax.swing.JMenuItem jMenuItem_course;
    public javax.swing.JMenuItem jMenuItem_file_matrícula;
    public javax.swing.JMenuItem jMenuItem_student;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public javax.swing.JTable jTable_Matriculados;
    public javax.swing.JPanel line_bottom;
    public javax.swing.JPanel line_left;
    public javax.swing.JPanel line_right;
    public javax.swing.JPanel line_top;
    public javax.swing.JTextField txt_código_matrícula;
    public javax.swing.JTextField txt_id_curso;
    public javax.swing.JTextField txt_student_dni;
    // End of variables declaration//GEN-END:variables
}
