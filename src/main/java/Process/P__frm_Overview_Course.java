/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import View.frm_Overview_Course;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author MINDLUNNY
 */
public class P__frm_Overview_Course {
    
    public static void To_Details_Course (frm_Overview_Course frm_o_c) {
        String str = "Microsoft YaHei UI-Plain-12";
        frm_o_c.getContentPane().setBackground(new java.awt.Color(182,0,230));
        frm_o_c.jPanel_top.setBackground(Color.BLACK);
        frm_o_c.line_left.setBackground(Color.BLACK);
        frm_o_c.line_bottom.setBackground(Color.BLACK);
        frm_o_c.line_right.setBackground(Color.BLACK);
        frm_o_c.btn_exit.setBorder(null);
        frm_o_c.btn_exit.setForeground(Color.WHITE);
        frm_o_c.btn_exit.setBackground(Color.RED);
        frm_o_c.jTextArea_list_courses.setBorder(null);
        frm_o_c.jTextArea_list_courses.setEditable(false);
        frm_o_c.jTextArea_list_courses.setAutoscrolls(true);
        frm_o_c.jTextArea_list_courses.setFont(Font.decode(str));
        frm_o_c.jTextArea_list_courses.setForeground(Color.WHITE);
        frm_o_c.jTextArea_list_courses.setBackground(Color.BLACK);
        frm_o_c.setLocationRelativeTo(null);
        frm_o_c.setResizable(false);
        frm_o_c.setVisible(true);
    }
    
}
