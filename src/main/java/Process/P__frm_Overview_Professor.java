/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import View.frm_Overview_Professor;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author MINDLUNNY
 */
public class P__frm_Overview_Professor {
    
    public static void To_present_Professor (frm_Overview_Professor frm_o_p) {
        String str = "Microsoft YaHei UI-Plain-12";
        frm_o_p.getContentPane().setBackground(new java.awt.Color(182,0,230));
        frm_o_p.bloq_top.setBackground(Color.BLACK);
        frm_o_p.line_left.setBackground(Color.BLACK);
        frm_o_p.line_right.setBackground(Color.BLACK);
        frm_o_p.line_bottom.setBackground(Color.BLACK);
        frm_o_p.btn_exit.setBorder(null);
        frm_o_p.btn_exit.setForeground(Color.WHITE);
        frm_o_p.btn_exit.setBackground(Color.RED);
        frm_o_p.jTextArea_list_professors.setBorder(null);
        frm_o_p.jTextArea_list_professors.setEditable(false);
        frm_o_p.jTextArea_list_professors.setAutoscrolls(true);
        frm_o_p.jTextArea_list_professors.setFont(Font.decode(str));
        frm_o_p.jTextArea_list_professors.setForeground(Color.WHITE);
        frm_o_p.jTextArea_list_professors.setBackground(Color.BLACK);
        frm_o_p.setLocationRelativeTo(null);
        frm_o_p.setResizable(false);
        frm_o_p.setVisible(true);
    }
    
}
