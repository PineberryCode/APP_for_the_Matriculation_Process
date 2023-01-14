/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Format.Image_Format;
import Model.Professor;
import View.frm_Professor;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
/**
 *
 * @author MINDLUNNY
 */
public class P__frm_Professor implements Interface_PlaceHolder {
    
    public static void ImageFrame(frm_Professor frm_professor) {
        Image_Format.Set_Size_Image_Button(frm_professor.btn_come_back, "src/main/java/Image/arrow_back.png");
    }
    
    public static void Clean_Input(frm_Professor frm_professor){
        frm_professor.txt_DNI.setText("");
        frm_professor.txt_name.setText("");
        frm_professor.txt_lastname.setText("");
        frm_professor.jFormatted_birthday.setCalendar(null);
        frm_professor.txt_cel.setText("");
        frm_professor.txt_email.setText("");
        frm_professor.btn_Group_Activo.clearSelection();
        frm_professor.txt_DNI.requestFocus();
    }
    
    public static Professor Read_Input(frm_Professor frm_professor){
        
        Professor professor = new Professor();
        professor.setDni(Integer.parseInt(frm_professor.txt_DNI.getText()));
        professor.setName(frm_professor.txt_name.getText());
        professor.setLastname(frm_professor.txt_lastname.getText());
        professor.setBirthday( (Date) frm_professor.jFormatted_birthday.getDate());
        professor.setCelphone(Integer.parseInt(frm_professor.txt_cel.getText()));
        professor.setE_mail(frm_professor.txt_email.getText());
        
        if (frm_professor.rb_yes.isSelected()){professor.setActive(true);}
        else if (frm_professor.rb_no.isSelected()){professor.setActive(false);};
        
        
        Clean_Input(frm_professor);
        return professor;
    }
    
    public static void Init_Bloq_Components(frm_Professor frm_professor){
        frm_professor.btn_register.setEnabled(true);
        frm_professor.btn_search.setEnabled(true);
        frm_professor.btn_modify.setEnabled(false);
    }
    
    public static void Second_Bloq_Components(frm_Professor frm_professor){
        frm_professor.btn_register.setEnabled(false);
        frm_professor.btn_search.setEnabled(true);
        frm_professor.btn_modify.setEnabled(true);
    }
    
    public static void PlaceHolder (frm_Professor frm_professor) {
        TextPrompt txt_dni = new TextPrompt(input__frm_professor__dni, frm_professor.txt_DNI, Color.GRAY);
        TextPrompt txt_name = new TextPrompt(input__frm_professor__name, frm_professor.txt_name, Color.GRAY);
        TextPrompt txt_lastname = new TextPrompt(input__frm_professor__lastname, frm_professor.txt_lastname, Color.GRAY);
        TextPrompt txt_cel = new TextPrompt(input__frm_professor__celphone, frm_professor.txt_cel, Color.GRAY);
        TextPrompt txt_email = new TextPrompt(input__frm_professor__e_mail, frm_professor.txt_email, Color.GRAY);
    }
    
    public static void Presentar_frm_Professor(frm_Professor frm_professor){
        String str = "Microsoft YaHei UI-Plain-14";
        String str_bold = "Microsoft YaHei UI-Bold-14";
        frm_professor.getContentPane().setBackground(new java.awt.Color(182,0,230));
        frm_professor.line_top.setBackground(Color.BLACK);
        frm_professor.line_left.setBackground(Color.BLACK);
        frm_professor.line_right.setBackground(Color.BLACK);
        frm_professor.line_bottom.setBackground(Color.BLACK);
        frm_professor.jLabel_title.setFont(Font.decode(str_bold));
        frm_professor.jLabel_active.setFont(Font.decode(str));
        frm_professor.txt_DNI.setBorder(null);
        frm_professor.txt_DNI.setFont(Font.decode(str));
        frm_professor.txt_DNI.setForeground(Color.WHITE);
        frm_professor.txt_DNI.setBackground(Color.BLACK);
        frm_professor.txt_name.setBorder(null);
        frm_professor.txt_name.setFont(Font.decode(str));
        frm_professor.txt_name.setForeground(Color.WHITE);
        frm_professor.txt_name.setBackground(Color.BLACK);
        frm_professor.txt_lastname.setBorder(null);
        frm_professor.txt_lastname.setFont(Font.decode(str));
        frm_professor.txt_lastname.setForeground(Color.WHITE);
        frm_professor.txt_lastname.setBackground(Color.BLACK);
        frm_professor.jFormatted_birthday.setDateFormatString("yyyy-MM-dd");
        frm_professor.jFormatted_birthday.setFont(Font.decode(str));
        frm_professor.txt_cel.setBorder(null);
        frm_professor.txt_cel.setFont(Font.decode(str));
        frm_professor.txt_cel.setForeground(Color.WHITE);
        frm_professor.txt_cel.setBackground(Color.BLACK);
        frm_professor.txt_email.setBorder(null);
        frm_professor.txt_email.setFont(Font.decode(str));
        frm_professor.txt_email.setForeground(Color.WHITE);
        frm_professor.txt_email.setBackground(Color.BLACK);
        frm_professor.rb_yes.setBorder(null);
        frm_professor.rb_yes.setFont(Font.decode(str));
        frm_professor.rb_yes.setBackground(null);
        frm_professor.rb_no.setBorder(null);
        frm_professor.rb_no.setFont(Font.decode(str));
        frm_professor.rb_no.setBackground(null);
        frm_professor.btn_register.setBorder(null);
        frm_professor.btn_register.setFont(Font.decode(str_bold));
        frm_professor.btn_register.setForeground(Color.WHITE);
        frm_professor.btn_register.setBackground(Color.BLACK);
        frm_professor.btn_search.setBorder(null);
        frm_professor.btn_search.setFont(Font.decode(str_bold));
        frm_professor.btn_search.setForeground(Color.WHITE);
        frm_professor.btn_search.setBackground(Color.BLACK);
        frm_professor.btn_modify.setBorder(null);
        frm_professor.btn_modify.setFont(Font.decode(str_bold));
        frm_professor.btn_modify.setForeground(Color.WHITE);
        frm_professor.btn_modify.setBackground(Color.BLACK);
        frm_professor.btn_come_back.setBorder(null);
        frm_professor.btn_come_back.setBackground(Color.BLUE);
        frm_professor.jTable_professor.setBorder(null);
        frm_professor.jTable_professor.setFont(Font.decode(str_bold));
        frm_professor.jTable_professor.setForeground(Color.WHITE);
        frm_professor.jTable_professor.setBackground(Color.BLACK);
        frm_professor.setLocationRelativeTo(null);
        frm_professor.setResizable(false);
        frm_professor.setVisible(true);
    }
}
