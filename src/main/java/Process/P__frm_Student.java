/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Format.Image_Format;
import Model.Student;
import Model.Data_CMBX;
import View.frm_Student;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

/**
 *
 * @author MINDLUNNY
 */
public class P__frm_Student implements Data_CMBX, Interface_PlaceHolder{
    
    public static void ImageFrame(frm_Student frm_student) {
        Image_Format.Set_Size_Image_Button(frm_student.btn_come_back, "src/main/java/Image/arrow_back.png");
    }
    
    public static void Clean_Input(frm_Student frm_student){
        frm_student.txt_DNI.setText("");
        frm_student.txt_name.setText("");
        frm_student.txt_lastname.setText("");
        frm_student.jFormatted_birthday.setCalendar(null);
        frm_student.cmbx_sección.setSelectedIndex(0);
        frm_student.txt_emergency_cel_01.setText("");
        frm_student.txt_emergency_cel_02.setText("");
        frm_student.btn_Group_Activo.clearSelection();
        frm_student.txt_DNI.requestFocus();
    }
    
    public static void Bloq_Init (frm_Student frm_student) {
        frm_student.btn_register.setEnabled(true);
        frm_student.btn_search.setEnabled(true);
        frm_student.btn_modify.setEnabled(false);
    }
    
    public static void Bloq_Second (frm_Student frm_student) {
        frm_student.btn_register.setEnabled(false);
        frm_student.btn_search.setEnabled(true);
        frm_student.btn_modify.setEnabled(true);
    }
    
    public static void Complete_CMBX (frm_Student frm_student) {
        frm_student.cmbx_sección.removeAllItems();
        
        for (int i=0;i<LIST_SECCIÓN.length;i++){
            frm_student.cmbx_sección.addItem(LIST_SECCIÓN[i]);
        }
    }
    
    public static Student Read_Input(frm_Student frm_student){
        Student student = new Student();
        student.setDni(Integer.parseInt(frm_student.txt_DNI.getText()));
        student.setName(frm_student.txt_name.getText());
        student.setLastname(frm_student.txt_lastname.getText());
        student.setBirthday( (Date) frm_student.jFormatted_birthday.getDate());
        student.setSección(frm_student.cmbx_sección.getSelectedItem().toString());
        student.setEmergency_cel_01(Integer.parseInt(frm_student.txt_emergency_cel_01.getText()));
        student.setEmergency_cel_02(Integer.parseInt(frm_student.txt_emergency_cel_02.getText()));
        
        if (frm_student.rb_yes.isSelected()){student.setActive(true);}
        else if (frm_student.rb_no.isSelected()){student.setActive(false);}
        
        Clean_Input(frm_student);
        return student;
    }
    
    public static void PlaceHolder (frm_Student frm_student) {
        TextPrompt txt_dni = new TextPrompt(input__frm_student__dni, frm_student.txt_DNI, Color.GRAY);
        TextPrompt txt_name = new TextPrompt(input__frm_student__name, frm_student.txt_name, Color.GRAY);
        TextPrompt txt_lastname = new TextPrompt(input__frm_student__lastname, frm_student.txt_lastname, Color.GRAY);
        TextPrompt txt_emergency_cel_01 = new TextPrompt(input__frm_student__emergency_cel_01, frm_student.txt_emergency_cel_01, Color.GRAY);
        TextPrompt txt_emergency_cel_02 = new TextPrompt(input__frm_student__emergency_cel_02, frm_student.txt_emergency_cel_02, Color.GRAY);
    }
    
    public static void Presentar_frm_Student(frm_Student frm_student){
        String str = "Microsoft YaHei UI-Plain-14";
        String str_bold = "Microsoft YaHei UI-Bold-14";
        frm_student.getContentPane().setBackground(new java.awt.Color(182,0,230));
        frm_student.jMenuBar.setBorder(null);
        frm_student.jMenuBar.setBackground(Color.BLACK);
        frm_student.jMenu_windows.setForeground(Color.WHITE);
        frm_student.jMenuItem_matrícula_del_alumno.setBorder(null);
        frm_student.jMenuItem_matrícula_del_alumno.setForeground(Color.WHITE);
        frm_student.jMenuItem_matrícula_del_alumno.setBackground(Color.BLACK);
        frm_student.line_top.setBackground(Color.BLACK);
        frm_student.line_left.setBackground(Color.BLACK);
        frm_student.line_right.setBackground(Color.BLACK);
        frm_student.line_bottom.setBackground(Color.BLACK);
        frm_student.jLabel_title.setFont(Font.decode(str_bold));
        frm_student.jLabel_title.setForeground(Color.BLACK);
        frm_student.jLabel_sección.setFont(Font.decode(str));
        frm_student.jLabel_sección.setForeground(Color.BLACK);
        frm_student.jLabel_active.setFont(Font.decode(str));
        frm_student.jLabel_active.setForeground(Color.BLACK);
        frm_student.txt_DNI.setBorder(null);
        frm_student.txt_DNI.setFont(Font.decode(str));
        frm_student.txt_DNI.setForeground(Color.WHITE);
        frm_student.txt_DNI.setBackground(Color.BLACK);
        frm_student.txt_name.setBorder(null);
        frm_student.txt_name.setFont(Font.decode(str));
        frm_student.txt_name.setForeground(Color.WHITE);
        frm_student.txt_name.setBackground(Color.BLACK);
        frm_student.txt_lastname.setBorder(null);
        frm_student.txt_lastname.setFont(Font.decode(str));
        frm_student.txt_lastname.setForeground(Color.WHITE);
        frm_student.txt_lastname.setBackground(Color.BLACK);
        frm_student.jFormatted_birthday.setDateFormatString("yyyy-MM-dd");
        frm_student.jFormatted_birthday.validate();
        frm_student.jFormatted_birthday.setBackground(Color.BLACK);
        frm_student.jFormatted_birthday.setFont(Font.decode(str));
        frm_student.cmbx_sección.setForeground(Color.WHITE);
        frm_student.cmbx_sección.setBackground(Color.BLACK);
        frm_student.cmbx_sección.setFont(Font.decode(str_bold));
        frm_student.txt_emergency_cel_01.setBorder(null);
        frm_student.txt_emergency_cel_01.setFont(Font.decode(str));
        frm_student.txt_emergency_cel_01.setForeground(Color.WHITE);
        frm_student.txt_emergency_cel_01.setBackground(Color.BLACK);
        frm_student.txt_emergency_cel_02.setBorder(null);
        frm_student.txt_emergency_cel_02.setFont(Font.decode(str));
        frm_student.txt_emergency_cel_02.setForeground(Color.WHITE);
        frm_student.txt_emergency_cel_02.setBackground(Color.BLACK);
        frm_student.rb_yes.setBorder(null);
        frm_student.rb_yes.setFont(Font.decode(str_bold));
        frm_student.rb_yes.setForeground(Color.BLACK);
        frm_student.rb_yes.setBackground(null);
        frm_student.rb_no.setBorder(null);
        frm_student.rb_no.setFont(Font.decode(str_bold));
        frm_student.rb_no.setForeground(Color.BLACK);
        frm_student.rb_no.setBackground(null);
        frm_student.btn_register.setBorder(null);
        frm_student.btn_register.setFont(Font.decode(str_bold));
        frm_student.btn_register.setForeground(Color.WHITE);
        frm_student.btn_register.setBackground(Color.BLACK);
        frm_student.btn_search.setBorder(null);
        frm_student.btn_search.setFont(Font.decode(str_bold));
        frm_student.btn_search.setForeground(Color.WHITE);
        frm_student.btn_search.setBackground(Color.BLACK);
        frm_student.btn_modify.setBorder(null);
        frm_student.btn_modify.setFont(Font.decode(str_bold));
        frm_student.btn_modify.setForeground(Color.WHITE);
        frm_student.btn_modify.setBackground(Color.BLACK);
        frm_student.btn_come_back.setBorder(null);
        frm_student.btn_come_back.setForeground(Color.WHITE);
        frm_student.btn_come_back.setBackground(Color.BLUE);
        frm_student.jTable_student.setBorder(null);
        frm_student.jTable_student.setFont(Font.decode(str_bold));
        frm_student.jTable_student.setForeground(Color.WHITE);
        frm_student.jTable_student.setBackground(Color.BLACK);
        frm_student.setLocationRelativeTo(null);
        frm_student.setResizable(false);
        frm_student.setVisible(true);
    }
}
