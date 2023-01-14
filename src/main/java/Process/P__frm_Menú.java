/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Format.Image_Format;
import View.frm_Menú;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author MINDLUNNY
 */
public class P__frm_Menú {
    
    public static void Image_Frame (frm_Menú menú) {
        Image_Format.Set_Size_Image_Button(menú.btn_exit, "src/main/java/Image/close.png");
    }
    
    public static void Presentar__frm_Menú (frm_Menú menú){
        String str_bold = "Microsoft YaHei UI-Bold-14";
        menú.getContentPane().setBackground(new java.awt.Color(182,0,230));
        menú.line_top.setBackground(Color.BLACK);
        menú.line_left.setBackground(Color.BLACK);
        menú.line_right.setBackground(Color.BLACK);
        menú.line_bottom.setBackground(Color.BLACK);
        menú.btn_change_user.setBorder(null);
        menú.btn_change_user.setFont(Font.decode(str_bold));
        menú.btn_change_user.setForeground(Color.WHITE);
        menú.btn_change_user.setBackground(Color.BLUE);
        menú.btn_exit.setBorder(null);
        menú.btn_exit.setBackground(Color.RED);
        menú.btn_student.setBorder(null);
        menú.btn_student.setFont(Font.decode(str_bold));
        menú.btn_student.setForeground(Color.WHITE);
        menú.btn_student.setBackground(Color.BLACK);
        menú.btn_professor.setBorder(null);
        menú.btn_professor.setFont(Font.decode(str_bold));
        menú.btn_professor.setForeground(Color.WHITE);
        menú.btn_professor.setBackground(Color.BLACK);
        menú.btn_course.setBorder(null);
        menú.btn_course.setFont(Font.decode(str_bold));
        menú.btn_course.setForeground(Color.WHITE);
        menú.btn_course.setBackground(Color.BLACK);
        menú.setLocationRelativeTo(null);
        menú.setResizable(false);
        menú.setVisible(true);
    }
}
