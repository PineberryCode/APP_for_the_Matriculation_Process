/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import View.frm_Overview_Student;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author MINDLUNNY
 */

public class P__frm_Overview_Student {
    
    public static void To_Present_Student (frm_Overview_Student frm_o_s) {
        String str = "Microsoft YaHei UI-Plain-12";
        frm_o_s.getContentPane().setBackground(new java.awt.Color(182,0,230));
        frm_o_s.bloq_top.setBackground(Color.BLACK);
        frm_o_s.line_left.setBackground(Color.BLACK);
        frm_o_s.line_right.setBackground(Color.BLACK);
        frm_o_s.line_bottom.setBackground(Color.BLACK);
        frm_o_s.btn_exit.setBorder(null);
        frm_o_s.btn_exit.setForeground(Color.WHITE);
        frm_o_s.btn_exit.setBackground(Color.RED);
        frm_o_s.jTextArea_list_students.setBorder(null);
        frm_o_s.jTextArea_list_students.setEditable(false);
        frm_o_s.jTextArea_list_students.setAutoscrolls(true);
        frm_o_s.jTextArea_list_students.setFont(Font.decode(str));
        frm_o_s.jTextArea_list_students.setForeground(Color.WHITE);
        frm_o_s.jTextArea_list_students.setBackground(Color.BLACK);
        frm_o_s.setLocationRelativeTo(null);
        frm_o_s.setResizable(false);
        frm_o_s.setVisible(true);
    }
    
}
