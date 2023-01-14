/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Format.Image_Format;
import View.frm_Log_In;
import java.awt.Color;
import java.awt.Font;
/**
 *
 * @author MINDLUNNY
 */
public class P__frm_Log_In implements Interface_PlaceHolder{
    
    public static void Clean_Inputs (frm_Log_In frmLogIn){
        frmLogIn.txt_user.setText("");
        frmLogIn.jPassword.setText("");
        frmLogIn.txt_user.requestFocus();
    }
    
    public static void PlaceHolder (frm_Log_In frmLogIn) {
        TextPrompt txt_user = new TextPrompt(input__user, frmLogIn.txt_user, Color.GRAY);
        TextPrompt txt_password = new TextPrompt(input__password, frmLogIn.jPassword, Color.GRAY);
    }
    
    public static void Match_Image_Label (frm_Log_In frmLogIn){
        Image_Format.Set_Size_Image_Label(frmLogIn.jLabel_Image, "src/main/java/Image/Log_In_03.png");
    }
    
    public static void Presentar__frm_Log_In(frm_Log_In frmLogIn){
        String nm = "#D29BFD";
        String str = "Microsoft YaHei UI-Plain-14";
        String str_bold = "Microsoft YaHei UI-Bold-14";
        frmLogIn.getContentPane().setBackground(new java.awt.Color(182,0,230));
        frmLogIn.line_01.setBackground(Color.BLACK);
        frmLogIn.line_top.setBackground(Color.BLACK);
        frmLogIn.line_left.setBackground(Color.BLACK);
        frmLogIn.line_right.setBackground(Color.BLACK);
        frmLogIn.line_bottom.setBackground(Color.BLACK);
        frmLogIn.txt_user.setBorder(null);
        frmLogIn.txt_user.setFont(Font.decode(str));
        frmLogIn.txt_user.setBackground(Color.decode(nm));
        frmLogIn.jPassword.setBorder(null);
        frmLogIn.jPassword.setFont(Font.decode(str));
        frmLogIn.jPassword.setBackground(Color.decode(nm));
        frmLogIn.btn_log_in.setBorder(null);
        frmLogIn.btn_log_in.setFont(Font.decode(str_bold));
        frmLogIn.btn_log_in.setForeground(Color.WHITE);
        frmLogIn.btn_log_in.setBackground(Color.BLACK);
        frmLogIn.btn_exit.setBorder(null);
        frmLogIn.btn_exit.setFont(Font.decode(str_bold));
        frmLogIn.btn_exit.setForeground(Color.WHITE);
        frmLogIn.btn_exit.setBackground(Color.RED);
        frmLogIn.setLocationRelativeTo(null);
        frmLogIn.setResizable(false);
        frmLogIn.setVisible(true);
    }
}
