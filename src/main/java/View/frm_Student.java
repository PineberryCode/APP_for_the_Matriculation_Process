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
public class frm_Student extends javax.swing.JFrame {

    /**
     * Creates new form frm_Matrícula
     */
    public frm_Student() {
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

        btn_Group_Activo = new javax.swing.ButtonGroup();
        jLabel_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_student = new javax.swing.JTable();
        btn_come_back = new javax.swing.JButton();
        line_top = new javax.swing.JPanel();
        line_left = new javax.swing.JPanel();
        line_bottom = new javax.swing.JPanel();
        line_right = new javax.swing.JPanel();
        btn_register = new javax.swing.JButton();
        btn_modify = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        rb_yes = new javax.swing.JRadioButton();
        txt_emergency_cel_01 = new javax.swing.JTextField();
        jLabel_sección = new javax.swing.JLabel();
        txt_DNI = new javax.swing.JTextField();
        cmbx_sección = new javax.swing.JComboBox<>();
        txt_name = new javax.swing.JTextField();
        jLabel_active = new javax.swing.JLabel();
        txt_emergency_cel_02 = new javax.swing.JTextField();
        rb_no = new javax.swing.JRadioButton();
        txt_lastname = new javax.swing.JTextField();
        jFormatted_birthday = new com.toedter.calendar.JDateChooser();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu_windows = new javax.swing.JMenu();
        jMenuItem_matrícula_del_alumno = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_title.setText("REGISTRATION STUDENT DATA");
        getContentPane().add(jLabel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jTable_student.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_student);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 386, 752, 100));
        getContentPane().add(btn_come_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 40, 40));

        javax.swing.GroupLayout line_topLayout = new javax.swing.GroupLayout(line_top);
        line_top.setLayout(line_topLayout);
        line_topLayout.setHorizontalGroup(
            line_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        line_topLayout.setVerticalGroup(
            line_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(line_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 10));

        javax.swing.GroupLayout line_leftLayout = new javax.swing.GroupLayout(line_left);
        line_left.setLayout(line_leftLayout);
        line_leftLayout.setHorizontalGroup(
            line_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        line_leftLayout.setVerticalGroup(
            line_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(line_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 570));

        javax.swing.GroupLayout line_bottomLayout = new javax.swing.GroupLayout(line_bottom);
        line_bottom.setLayout(line_bottomLayout);
        line_bottomLayout.setHorizontalGroup(
            line_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        line_bottomLayout.setVerticalGroup(
            line_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(line_bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 810, 10));

        javax.swing.GroupLayout line_rightLayout = new javax.swing.GroupLayout(line_right);
        line_right.setLayout(line_rightLayout);
        line_rightLayout.setHorizontalGroup(
            line_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        line_rightLayout.setVerticalGroup(
            line_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(line_right, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 10, 570));

        btn_register.setText("REGISTER");
        getContentPane().add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 90, 40));

        btn_modify.setText("MODIFY");
        getContentPane().add(btn_modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 90, 40));

        btn_search.setText("SEARCH");
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 90, 40));

        rb_yes.setText("Yes");
        getContentPane().add(rb_yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 50, 30));
        getContentPane().add(txt_emergency_cel_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 150, 30));

        jLabel_sección.setText("SECCIÓN");
        getContentPane().add(jLabel_sección, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));
        getContentPane().add(txt_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 80, 30));

        cmbx_sección.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbx_sección, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 90, 30));

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 150, 30));

        jLabel_active.setText("ACTIVE");
        getContentPane().add(jLabel_active, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, 20));
        getContentPane().add(txt_emergency_cel_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 150, 30));

        rb_no.setText("No");
        getContentPane().add(rb_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 50, 30));
        getContentPane().add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 150, 30));

        jFormatted_birthday.setBackground(new java.awt.Color(0, 0, 0));
        jFormatted_birthday.setToolTipText("");
        jFormatted_birthday.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(jFormatted_birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 140, 30));

        jMenu_windows.setText("Windows");

        jMenuItem_matrícula_del_alumno.setText("Matrícula student");
        jMenu_windows.add(jMenuItem_matrícula_del_alumno);

        jMenuBar.add(jMenu_windows);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup btn_Group_Activo;
    public javax.swing.JButton btn_come_back;
    public javax.swing.JButton btn_modify;
    public javax.swing.JButton btn_register;
    public javax.swing.JButton btn_search;
    public javax.swing.JComboBox<String> cmbx_sección;
    public com.toedter.calendar.JDateChooser jFormatted_birthday;
    public javax.swing.JLabel jLabel_active;
    public javax.swing.JLabel jLabel_sección;
    public javax.swing.JLabel jLabel_title;
    public javax.swing.JMenuBar jMenuBar;
    public javax.swing.JMenuItem jMenuItem_matrícula_del_alumno;
    public javax.swing.JMenu jMenu_windows;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable_student;
    public javax.swing.JPanel line_bottom;
    public javax.swing.JPanel line_left;
    public javax.swing.JPanel line_right;
    public javax.swing.JPanel line_top;
    public javax.swing.JRadioButton rb_no;
    public javax.swing.JRadioButton rb_yes;
    public javax.swing.JTextField txt_DNI;
    public javax.swing.JTextField txt_emergency_cel_01;
    public javax.swing.JTextField txt_emergency_cel_02;
    public javax.swing.JTextField txt_lastname;
    public javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
